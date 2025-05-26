package com.modiface.mfecommon.utils;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.Log;
import java.util.HashSet;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f34345e = "MFESharedEGLContext";

    /* renamed from: a, reason: collision with root package name */
    private EGLDisplay f34346a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b, reason: collision with root package name */
    private EGLContext f34347b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Object f34348c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private HashSet<g> f34349d = new HashSet<>();

    public EGLContext a(g gVar) {
        EGLContext eGLContext;
        if (gVar == null) {
            throw new IllegalArgumentException("cannot have null calling thread in getContext() of SharedEGLContext");
        }
        synchronized (this.f34348c) {
            try {
                EGLContext eGLContext2 = this.f34347b;
                if (eGLContext2 != null) {
                    if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                    }
                    this.f34349d.add(gVar);
                    eGLContext = this.f34347b;
                }
                this.f34349d.clear();
                a();
                this.f34349d.add(gVar);
                eGLContext = this.f34347b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return eGLContext;
    }

    public void b(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("cannot have null calling thread in onThreadContextReleased() of SharedEGLContext");
        }
        synchronized (this.f34348c) {
            try {
                this.f34349d.remove(gVar);
                if (this.f34349d.isEmpty()) {
                    b();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void finalize() {
        synchronized (this.f34348c) {
            this.f34349d.clear();
            b();
        }
        super.finalize();
    }

    private void b() {
        EGLDisplay eGLDisplay = this.f34346a;
        EGLContext eGLContext = this.f34347b;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        this.f34346a = eGLDisplay2;
        this.f34347b = null;
        if (eGLDisplay == null || eGLDisplay == eGLDisplay2) {
            return;
        }
        if (eGLContext != null && eGLContext != EGL14.EGL_NO_CONTEXT && !EGL14.eglDestroyContext(eGLDisplay, eGLContext)) {
            Log.e(f34345e, "eglDestroyContext failed with error: " + EGL14.eglGetError() + ", display:" + eGLDisplay + ", context: " + eGLContext);
        }
        EGL14.eglTerminate(eGLDisplay);
    }

    private void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f34346a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            Log.e(f34345e, "failed to initialize gl context: eglGetDisplay failed");
            return;
        }
        if (!EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0)) {
            Log.e(f34345e, "failed to initialize gl context: eglInitialize failed");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f34346a, new int[]{12352, 4, 12339, 1, 12322, 8, 12323, 8, 12324, 8, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            Log.e(f34345e, "failed to initialize shared gl context: eglChooseConfig failed");
            return;
        }
        this.f34347b = EGL14.eglCreateContext(this.f34346a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
    }
}
