package dn0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.pinterest.feature.boardpreview.export.render.RendererException;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public EGLDisplay f55611a;

    /* renamed from: b, reason: collision with root package name */
    public EGLContext f55612b;

    /* renamed from: c, reason: collision with root package name */
    public EGLConfig f55613c;

    public d() {
        EGLContext sharedContext = EGL14.EGL_NO_CONTEXT;
        Intrinsics.checkNotNullExpressionValue(sharedContext, "EGL_NO_CONTEXT");
        Intrinsics.checkNotNullParameter(sharedContext, "sharedContext");
        this.f55611a = EGL14.EGL_NO_DISPLAY;
        this.f55612b = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f55611a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            Intrinsics.checkNotNullParameter("unable to get EGL14 display", "message");
            throw new RendererException("unable to get EGL14 display");
        }
        if (!EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0)) {
            this.f55611a = null;
            Intrinsics.checkNotNullParameter("unable to initialize EGL14", "message");
            throw new RendererException("unable to initialize EGL14");
        }
        c cVar = new c();
        if (this.f55612b == EGL14.EGL_NO_CONTEXT) {
            a(cVar, sharedContext, 2, false);
        }
    }

    public final void a(c cVar, EGLContext eGLContext, int i13, boolean z13) {
        EGLDisplay display = this.f55611a;
        Intrinsics.f(display);
        Intrinsics.checkNotNullParameter(display, "display");
        int i14 = i13 >= 3 ? 68 : 4;
        int[] iArr = new int[15];
        iArr[0] = 12324;
        iArr[1] = 8;
        iArr[2] = 12323;
        iArr[3] = 8;
        iArr[4] = 12322;
        iArr[5] = 8;
        iArr[6] = 12321;
        iArr[7] = 8;
        iArr[8] = 12339;
        iArr[9] = 5;
        iArr[10] = 12352;
        iArr[11] = i14;
        iArr[12] = z13 ? 12610 : 12344;
        iArr[13] = z13 ? 1 : 0;
        iArr[14] = 12344;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGLConfig eGLConfig = !EGL14.eglChooseConfig(display, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0) ? null : eGLConfigArr[0];
        if (eGLConfig == null) {
            Intrinsics.checkNotNullParameter("Unable to find a suitable EGLConfig", "message");
            throw new RendererException("Unable to find a suitable EGLConfig");
        }
        k3.m0();
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f55611a, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        k3.n0("eglCreateContext(" + i13 + ")");
        this.f55613c = eGLConfig;
        this.f55612b = eglCreateContext;
    }

    public final void b() {
        EGLDisplay eGLDisplay = this.f55611a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f55611a, this.f55612b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f55611a);
        }
        this.f55611a = EGL14.EGL_NO_DISPLAY;
        this.f55612b = EGL14.EGL_NO_CONTEXT;
        this.f55613c = null;
    }
}
