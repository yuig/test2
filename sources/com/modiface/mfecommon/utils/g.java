package com.modiface.mfecommon.utils;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class g extends p {

    /* renamed from: l */
    private static final String f34303l = "MFEGLThread";

    /* renamed from: d */
    private EGLDisplay f34304d;

    /* renamed from: e */
    private EGLContext f34305e;

    /* renamed from: f */
    private EGLConfig f34306f;

    /* renamed from: g */
    private EGLSurface f34307g;

    /* renamed from: h */
    private EGLSurface f34308h;

    /* renamed from: i */
    private boolean f34309i;

    /* renamed from: j */
    private final boolean f34310j;

    /* renamed from: k */
    protected boolean f34311k;

    public g(String str, EGLContext eGLContext, boolean z13) {
        super(str);
        this.f34304d = EGL14.EGL_NO_DISPLAY;
        this.f34305e = EGL14.EGL_NO_CONTEXT;
        this.f34306f = null;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.f34307g = eGLSurface;
        this.f34308h = eGLSurface;
        this.f34309i = true;
        this.f34311k = false;
        this.f34310j = z13;
        this.f34360b.postAtFrontOfQueue(new b0(this, eGLContext));
    }

    public void e() {
        EGLSurface eGLSurface;
        if (!this.f34311k || (eGLSurface = this.f34308h) == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
            return;
        }
        EGL14.eglSwapBuffers(this.f34304d, eGLSurface);
    }

    public void c(Runnable runnable) {
        b((Runnable) new d0(this, runnable), true);
    }

    public boolean d() {
        return this.f34311k;
    }

    public void b(EGLContext eGLContext) {
        Handler handler = this.f34360b;
        if (handler != null) {
            handler.postAtFrontOfQueue(new e0(this, eGLContext));
        }
    }

    public boolean c(Runnable runnable, boolean z13) {
        return a(runnable, null, z13);
    }

    public boolean d(Runnable runnable) {
        return a(runnable, null, false);
    }

    public boolean e(Runnable runnable) {
        if (runnable != null) {
            h0 h0Var = new h0(this, runnable, null);
            return b(h0Var) && h0Var.f34321a;
        }
        throw new IllegalArgumentException("cannot run null runnable in runOnGLThreadSync in MFEGLThread");
    }

    @Override // com.modiface.mfecommon.utils.p
    public void a() {
        b(new c0(this));
        super.a();
    }

    public void c() {
        this.f34311k = false;
        EGLDisplay eGLDisplay = this.f34304d;
        if (eGLDisplay == null || eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
        this.f34308h = eGLSurface2;
        this.f34309i = true;
        EGLSurface eGLSurface3 = this.f34307g;
        if (eGLSurface3 != null && eGLSurface3 != eGLSurface2) {
            EGL14.eglDestroySurface(this.f34304d, eGLSurface3);
            this.f34307g = EGL14.EGL_NO_SURFACE;
        }
        EGLContext eGLContext = this.f34305e;
        if (eGLContext != null && eGLContext != EGL14.EGL_NO_CONTEXT) {
            if (!EGL14.eglDestroyContext(this.f34304d, eGLContext)) {
                Log.e(f34303l, "eglDestroyContext failed with error: " + EGL14.eglGetError() + ", display:" + this.f34304d + ", context: " + this.f34305e);
            }
            this.f34305e = EGL14.EGL_NO_CONTEXT;
        }
        EGL14.eglTerminate(this.f34304d);
        this.f34304d = EGL14.EGL_NO_DISPLAY;
    }

    public boolean a(Object obj, ArrayList<Throwable> arrayList) {
        if (obj != null && !(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalArgumentException("cannot set surface with an non-null surface that is not instance of android.view.Surface or android.graphics.SurfaceTexture in MFEGLThread");
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b(new f0(this, arrayList, obj, atomicBoolean));
        return atomicBoolean.get();
    }

    public boolean a(EGLSurface eGLSurface, boolean z13) {
        boolean z14;
        EGLContext eGLContext;
        if (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
            eGLSurface = this.f34307g;
            z13 = true;
            z14 = true;
        } else {
            z14 = false;
        }
        EGLDisplay eGLDisplay = this.f34304d;
        if (eGLDisplay == null || eGLDisplay == EGL14.EGL_NO_DISPLAY || (eGLContext = this.f34305e) == null || eGLContext == EGL14.EGL_NO_CONTEXT) {
            return false;
        }
        if (this.f34308h == eGLSurface) {
            return !z14;
        }
        boolean eglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        this.f34311k = eglMakeCurrent;
        if (!eglMakeCurrent) {
            Log.e(f34303l, "failed to make current in makeCurrent() in MFEGLThread");
            this.f34308h = EGL14.EGL_NO_SURFACE;
            this.f34309i = true;
            return false;
        }
        this.f34308h = eGLSurface;
        this.f34309i = z13;
        return !z14;
    }

    public void a(long j13) {
        EGLSurface eGLSurface = this.f34308h;
        if (eGLSurface == EGL14.EGL_NO_SURFACE || this.f34309i) {
            return;
        }
        EGLExt.eglPresentationTimeANDROID(this.f34304d, eGLSurface, j13);
    }

    public boolean a(Runnable runnable, Runnable runnable2) {
        return a(runnable, runnable2, false);
    }

    public boolean a(Runnable runnable, Runnable runnable2, boolean z13) {
        if (runnable != null) {
            return a(new g0(this, runnable, runnable2), z13);
        }
        throw new IllegalArgumentException("cannot run null runnable in runOnGLThreadAsync in MFEGLThread");
    }

    public void a(EGLContext eGLContext) {
        if (this.f34311k) {
            return;
        }
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f34304d = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            Log.e(f34303l, "failed to initialize gl thread: eglGetDisplay failed");
            return;
        }
        if (!EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0)) {
            Log.e(f34303l, "failed to initialize gl thread: eglInitialize failed");
            return;
        }
        int[] iArr = {12352, 4, 12339, 1, 12322, 8, 12323, 8, 12324, 8, 12344};
        if (this.f34310j) {
            iArr = new int[]{12352, 4, 12339, 1, 12322, 8, 12323, 8, 12324, 8, 12610, 1, 12344};
        }
        int[] iArr2 = iArr;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f34304d, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            Log.e(f34303l, "failed to initialize gl thread: eglChooseConfig failed");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f34306f = eGLConfig;
        int[] iArr3 = {12440, 2, 12344};
        EGLDisplay eGLDisplay = this.f34304d;
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr3, 0);
        this.f34305e = eglCreateContext;
        if (eglCreateContext != null && eglCreateContext != EGL14.EGL_NO_CONTEXT) {
            try {
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f34304d, this.f34306f, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f34307g = eglCreatePbufferSurface;
                if (eglCreatePbufferSurface != null && eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                    boolean eglMakeCurrent = EGL14.eglMakeCurrent(this.f34304d, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f34305e);
                    this.f34311k = eglMakeCurrent;
                    if (!eglMakeCurrent) {
                        Log.e(f34303l, "failed to initialize gl thread: eglMakeCurrent failed");
                        this.f34308h = EGL14.EGL_NO_SURFACE;
                        this.f34309i = true;
                        return;
                    } else {
                        this.f34308h = this.f34307g;
                        this.f34309i = true;
                        return;
                    }
                }
                Log.e(f34303l, "failed to initialize gl thread, createWindowSurface failed with error: " + EGL14.eglGetError());
                return;
            } catch (IllegalArgumentException e13) {
                Log.e(f34303l, "failed to initialize gl thread, eglCreatePbufferSurface failed with exception: ", e13);
                return;
            }
        }
        Log.e(f34303l, "failed to initialize gl thread: eglCreateContext failed");
    }
}
