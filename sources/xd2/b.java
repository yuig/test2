package xd2;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import e0.t;
import et1.r0;
import kotlin.jvm.internal.Intrinsics;
import px0.g;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final EGLDisplay f134641a;

    static {
        int[] iArr = {0, 0};
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (!(!Intrinsics.d(eglGetDisplay, EGL14.EGL_NO_DISPLAY))) {
            throw new IllegalStateException("eglGetDisplay couldn't return any display handle".toString());
        }
        t.n(new r0(25, eglGetDisplay, iArr), "eglInitialize (display)");
        Intrinsics.checkNotNullExpressionValue(eglGetDisplay, "run(...)");
        f134641a = eglGetDisplay;
    }

    public static EGLConfig a(a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        int i13 = config.f134638a;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        t.n(new g(new int[]{12352, 4, 12324, i13, 12323, i13, 12322, i13, 12321, i13, 12325, config.f134639b, 12326, config.f134640c, 12344}, eGLConfigArr, new int[]{0}, 26), "eglChooseConfig");
        EGLConfig eGLConfig = eGLConfigArr[0];
        Intrinsics.f(eGLConfig);
        return eGLConfig;
    }

    public static g01.a b(Surface surface, a config) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(config, "config");
        EGLSurface eGLSurface = (EGLSurface) t.n(new r0(24, a(config), surface), "eglCreateWindowSurface");
        Intrinsics.f(eGLSurface);
        return new g01.a(f134641a, eGLSurface);
    }
}
