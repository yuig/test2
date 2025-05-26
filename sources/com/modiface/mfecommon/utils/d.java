package com.modiface.mfecommon.utils;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final String f34288c = "MFEEGLSurface";

    /* renamed from: a, reason: collision with root package name */
    private EGLDisplay f34289a;

    /* renamed from: b, reason: collision with root package name */
    private EGLSurface f34290b;

    public d() {
        this(null);
    }

    public void a() {
        EGLDisplay eGLDisplay = this.f34289a;
        if (eGLDisplay == null || eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            return;
        }
        EGLSurface eGLSurface = this.f34290b;
        if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            this.f34290b = EGL14.EGL_NO_SURFACE;
        }
        EGL14.eglTerminate(this.f34289a);
        this.f34289a = EGL14.EGL_NO_DISPLAY;
    }

    public EGLSurface b() {
        return this.f34290b;
    }

    public void finalize() {
        a();
        super.finalize();
    }

    public d(Object obj) {
        this(obj, false);
    }

    public d(Object obj, boolean z13) {
        this.f34289a = EGL14.EGL_NO_DISPLAY;
        this.f34290b = EGL14.EGL_NO_SURFACE;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f34289a = eglGetDisplay;
        if (eglGetDisplay != null && eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            if (!EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0)) {
                Log.e(f34288c, "failed to initialize egl surface: eglInitialize failed");
                return;
            }
            int[] iArr = z13 ? new int[]{12352, 4, 12339, 1, 12322, 8, 12323, 8, 12324, 8, 12610, 1, 12344} : new int[]{12352, 4, 12339, 1, 12322, 8, 12323, 8, 12324, 8, 12344};
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(this.f34289a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                Log.e(f34288c, "failed to initialize egl surface: eglChooseConfig failed");
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (obj != null) {
                try {
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f34289a, eGLConfig, obj, new int[]{12344}, 0);
                    this.f34290b = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                        Log.e(f34288c, "failed to initialize egl surface: eglCreateWindowSurface failed with error: " + EGL14.eglGetError());
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e13) {
                    Log.e(f34288c, "failed to initialize egl surface: eglCreateWindowSurface failed ", e13);
                    return;
                }
            }
            try {
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f34289a, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f34290b = eglCreatePbufferSurface;
                if (eglCreatePbufferSurface == null || eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                    Log.e(f34288c, "failed to initialize egl surface: eglCreatePbufferSurface failed with error: " + EGL14.eglGetError());
                    return;
                }
                return;
            } catch (IllegalArgumentException e14) {
                Log.e(f34288c, "failed to initialize egl surface: eglCreatePbufferSurface failed", e14);
                return;
            }
        }
        Log.e(f34288c, "failed to initialize egl surface: eglGetDisplay failed");
    }
}
