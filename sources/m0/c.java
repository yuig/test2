package m0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import c0.f1;
import c0.p0;
import c0.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kh2.m0;
import l0.l;
import l0.t;
import n0.h;
import n0.i;
import n0.j;

/* loaded from: classes2.dex */
public final class c extends l {

    /* renamed from: n, reason: collision with root package name */
    public int f85253n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f85254o = -1;

    /* renamed from: p, reason: collision with root package name */
    public final p0 f85255p;

    /* renamed from: q, reason: collision with root package name */
    public final p0 f85256q;

    public c(p0 p0Var, p0 p0Var2) {
        this.f85255p = p0Var;
        this.f85256q = p0Var2;
    }

    @Override // l0.l
    public final n0.b e(z zVar, Map map) {
        n0.b e13 = super.e(zVar, map);
        this.f85253n = j.h();
        this.f85254o = j.h();
        return e13;
    }

    public final void l() {
        if (this.f81237a.getAndSet(false)) {
            j.c(this.f81239c);
            h();
        }
        this.f85253n = -1;
        this.f85254o = -1;
    }

    public final void m(long j13, Surface surface, f1 f1Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        j.d(this.f81237a, true);
        j.c(this.f81239c);
        HashMap hashMap = this.f81238b;
        com.bumptech.glide.d.v("The surface is not registered.", hashMap.containsKey(surface));
        n0.d dVar = (n0.d) hashMap.get(surface);
        Objects.requireNonNull(dVar);
        if (dVar == j.f88761j) {
            dVar = b(surface);
            if (dVar == null) {
                return;
            } else {
                hashMap.put(surface, dVar);
            }
        }
        Surface surface2 = this.f81245i;
        EGLSurface eGLSurface = dVar.f88741a;
        if (surface != surface2) {
            f(eGLSurface);
            this.f81245i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        n0.d dVar2 = dVar;
        n(dVar2, f1Var, surfaceTexture, this.f85255p, this.f85253n);
        n(dVar2, f1Var, surfaceTexture2, this.f85256q, this.f85254o);
        EGLExt.eglPresentationTimeANDROID(this.f81240d, eGLSurface, j13);
        if (EGL14.eglSwapBuffers(this.f81240d, eGLSurface)) {
            return;
        }
        m0.X0("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        i(surface, false);
    }

    public final void n(n0.d dVar, f1 f1Var, SurfaceTexture surfaceTexture, p0 p0Var, int i13) {
        k(i13);
        int i14 = dVar.f88742b;
        int i15 = dVar.f88743c;
        GLES20.glViewport(0, 0, i14, i15);
        GLES20.glScissor(0, 0, i14, i15);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, ((t) f1Var).f81286e, 0);
        h hVar = this.f81247k;
        hVar.getClass();
        if (hVar instanceof i) {
            GLES20.glUniformMatrix4fv(((i) hVar).f88750f, 1, false, fArr2, 0);
            j.b("glUniformMatrix4fv");
        }
        int i16 = (int) (i14 * p0Var.f24296d);
        float f13 = p0Var.f24297e;
        Size size = new Size(i16, (int) (i15 * f13));
        Size size2 = new Size(i14, i15);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, p0Var.f24294b / p0Var.f24296d, p0Var.f24295c / f13, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(hVar.f88746b, 1, false, fArr5, 0);
        j.b("glUniformMatrix4fv");
        GLES20.glUniform1f(hVar.f88747c, p0Var.f24293a);
        j.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        j.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
