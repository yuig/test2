package jg1;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f75993a;

    /* renamed from: b, reason: collision with root package name */
    public EGLDisplay f75994b;

    /* renamed from: c, reason: collision with root package name */
    public EGLContext f75995c;

    /* renamed from: d, reason: collision with root package name */
    public EGLSurface f75996d;

    public f(Surface surface, EGLContext eGLContext) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f75993a = surface;
        this.f75994b = EGL14.EGL_NO_DISPLAY;
        this.f75995c = EGL14.EGL_NO_CONTEXT;
        this.f75996d = EGL14.EGL_NO_SURFACE;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f75994b = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.f75994b = null;
            throw new RuntimeException("Unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f75994b, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("Unable to find RGB888+recordable ES2 EGL config");
        }
        this.f75995c = EGL14.eglCreateContext(this.f75994b, eGLConfigArr[0], eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext, new int[]{12440, 2, 12344}, 0);
        gi2.b.P("eglCreateContext");
        if (this.f75995c == null) {
            throw new RuntimeException("null context");
        }
        this.f75996d = EGL14.eglCreateWindowSurface(this.f75994b, eGLConfigArr[0], surface, new int[]{12344}, 0);
        gi2.b.P("eglCreateWindowSurface");
        if (this.f75996d == null) {
            throw new RuntimeException("surface was null");
        }
    }

    public final void a() {
        EGLDisplay eGLDisplay = this.f75994b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, this.f75996d);
            EGL14.eglDestroyContext(this.f75994b, this.f75995c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f75994b);
        }
        this.f75993a.release();
        this.f75994b = EGL14.EGL_NO_DISPLAY;
        this.f75995c = EGL14.EGL_NO_CONTEXT;
        this.f75996d = EGL14.EGL_NO_SURFACE;
    }
}
