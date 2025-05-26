package n8;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import d7.n0;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class j extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public d7.k f89839a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f89840b;

    /* renamed from: c, reason: collision with root package name */
    public Error f89841c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f89842d;

    /* renamed from: e, reason: collision with root package name */
    public PlaceholderSurface f89843e;

    public final void a(int i13) {
        EGLSurface eglCreatePbufferSurface;
        this.f89839a.getClass();
        d7.k kVar = this.f89839a;
        kVar.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        d7.n.e("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        d7.n.e("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        kVar.f53842c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, d7.k.f53839g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z13 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i14 = n0.f53866a;
        d7.n.e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z13);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(kVar.f53842c, eGLConfig, EGL14.EGL_NO_CONTEXT, i13 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        d7.n.e("eglCreateContext failed", eglCreateContext != null);
        kVar.f53843d = eglCreateContext;
        EGLDisplay eGLDisplay = kVar.f53842c;
        if (i13 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i13 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            d7.n.e("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        d7.n.e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        kVar.f53844e = eglCreatePbufferSurface;
        int[] iArr3 = kVar.f53841b;
        GLES20.glGenTextures(1, iArr3, 0);
        d7.n.d();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        kVar.f53845f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(kVar);
        SurfaceTexture surfaceTexture2 = this.f89839a.f53845f;
        surfaceTexture2.getClass();
        this.f89843e = new PlaceholderSurface(this, surfaceTexture2, i13 != 0);
    }

    public final void b() {
        this.f89839a.getClass();
        d7.k kVar = this.f89839a;
        kVar.f53840a.removeCallbacks(kVar);
        try {
            SurfaceTexture surfaceTexture = kVar.f53845f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, kVar.f53841b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = kVar.f53842c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = kVar.f53842c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = kVar.f53844e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(kVar.f53842c, kVar.f53844e);
            }
            EGLContext eGLContext = kVar.f53843d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(kVar.f53842c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = kVar.f53842c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(kVar.f53842c);
            }
            kVar.f53842c = null;
            kVar.f53843d = null;
            kVar.f53844e = null;
            kVar.f53845f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i13 = message.what;
        try {
            if (i13 != 1) {
                if (i13 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (GlUtil$GlException e13) {
                d7.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                this.f89842d = new IllegalStateException(e13);
                synchronized (this) {
                    notify();
                }
            } catch (Error e14) {
                d7.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e14);
                this.f89841c = e14;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e15) {
                d7.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e15);
                this.f89842d = e15;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
