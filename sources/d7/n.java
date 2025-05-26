package d7;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import pk.v2;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a */
    public static final int[] f53861a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b */
    public static final int[] f53862b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c */
    public static final int[] f53863c = {12445, 13120, 12344, 12344};

    /* renamed from: d */
    public static final int[] f53864d = {12445, 13632, 12344, 12344};

    /* renamed from: e */
    public static final int[] f53865e = {12344};

    public static void a(int i13, int i14) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i15 = iArr[0];
        bf.b.s("Create a OpenGL context first or run the GL methods on an OpenGL thread.", i15 > 0);
        if (i13 < 0 || i14 < 0) {
            throw new GlUtil$GlException("width or height is less than 0");
        }
        if (i13 > i15 || i14 > i15) {
            throw new GlUtil$GlException(a.a.d("width or height is greater than GL_MAX_TEXTURE_SIZE ", i15));
        }
    }

    public static void b(int i13, int i14, int i15) {
        GLES20.glBindTexture(i13, i14);
        d();
        GLES20.glTexParameteri(i13, 10240, i15);
        d();
        GLES20.glTexParameteri(i13, 10241, i15);
        d();
        GLES20.glTexParameteri(i13, 10242, 33071);
        d();
        GLES20.glTexParameteri(i13, 10243, 33071);
        d();
    }

    public static void c(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder D = ep.b.D(str, ", error code: 0x");
        D.append(Integer.toHexString(eglGetError));
        throw new GlUtil$GlException(D.toString());
    }

    public static void d() {
        StringBuilder sb3 = new StringBuilder();
        boolean z13 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z13) {
                sb3.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb3.append("glError: ");
            sb3.append(gluErrorString);
            z13 = true;
        }
        if (z13) {
            throw new GlUtil$GlException(sb3.toString());
        }
    }

    public static void e(String str, boolean z13) {
        if (!z13) {
            throw new GlUtil$GlException(str);
        }
    }

    public static void f() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        d();
    }

    public static float[] g() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer h(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static EGLContext i(EGLContext eGLContext, EGLDisplay eGLDisplay, int i13, int[] iArr) {
        boolean z13 = true;
        bf.b.i(Arrays.equals(iArr, f53861a) || Arrays.equals(iArr, f53862b));
        if (i13 != 2 && i13 != 3) {
            z13 = false;
        }
        bf.b.i(z13);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, p(eGLDisplay, iArr), eGLContext, new int[]{12440, i13, 12344}, 0);
        if (eglCreateContext == null || eglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new GlUtil$GlException(a.a.d("eglCreateContext() failed to create a valid context. The device may not support EGL version ", i13));
        }
        d();
        return eglCreateContext;
    }

    public static EGLSurface j(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        EGLSurface eglCreatePbufferSurface;
        int[] iArr = f53861a;
        if (q("EGL_KHR_surfaceless_context")) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, p(eGLDisplay, iArr), new int[]{12375, 1, 12374, 1, 12344}, 0);
            c("Error creating a new EGL Pbuffer surface");
        }
        EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext);
        c("Error making context current");
        n(0, 1, 1);
        return eglCreatePbufferSurface;
    }

    public static float[] k(v2 v2Var) {
        float[] fArr = new float[v2Var.f100504d * 4];
        for (int i13 = 0; i13 < v2Var.f100504d; i13++) {
            System.arraycopy(v2Var.get(i13), 0, fArr, i13 * 4, 4);
        }
        return fArr;
    }

    public static void l(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        c("Error releasing context");
        if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            c("Error destroying context");
        }
        EGL14.eglReleaseThread();
        c("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        c("Error terminating display");
    }

    public static void m(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        c("Error destroying surface");
    }

    public static void n(int i13, int i14, int i15) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i13) {
            GLES20.glBindFramebuffer(36160, i13);
        }
        d();
        GLES20.glViewport(0, 0, i14, i15);
        d();
    }

    public static EGLDisplay o() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        e("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        e("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        d();
        return eglGetDisplay;
    }

    public static EGLConfig p(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlUtil$GlException("eglChooseConfig failed.");
    }

    public static boolean q(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static void r(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }
}
