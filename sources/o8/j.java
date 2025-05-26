package o8;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import d7.j0;
import d7.n;
import d7.u;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import s7.z;

/* loaded from: classes3.dex */
public final class j implements GLSurfaceView.Renderer, c {

    /* renamed from: a, reason: collision with root package name */
    public final i f93458a;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f93461d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f93462e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f93463f;

    /* renamed from: g, reason: collision with root package name */
    public float f93464g;

    /* renamed from: h, reason: collision with root package name */
    public float f93465h;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SphericalGLSurfaceView f93468k;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f93459b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f93460c = new float[16];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f93466i = new float[16];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f93467j = new float[16];

    public j(SphericalGLSurfaceView sphericalGLSurfaceView, i iVar) {
        this.f93468k = sphericalGLSurfaceView;
        float[] fArr = new float[16];
        this.f93461d = fArr;
        float[] fArr2 = new float[16];
        this.f93462e = fArr2;
        float[] fArr3 = new float[16];
        this.f93463f = fArr3;
        this.f93458a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f93465h = 3.1415927f;
    }

    @Override // o8.c
    public final synchronized void a(float f13, float[] fArr) {
        float[] fArr2 = this.f93461d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f14 = -f13;
        this.f93465h = f14;
        Matrix.setRotateM(this.f93462e, 0, -this.f93464g, (float) Math.cos(f14), (float) Math.sin(this.f93465h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object g13;
        float[] fArr;
        synchronized (this) {
            Matrix.multiplyMM(this.f93467j, 0, this.f93461d, 0, this.f93463f, 0);
            Matrix.multiplyMM(this.f93466i, 0, this.f93462e, 0, this.f93467j, 0);
        }
        Matrix.multiplyMM(this.f93460c, 0, this.f93459b, 0, this.f93466i, 0);
        i iVar = this.f93458a;
        float[] fArr2 = this.f93460c;
        iVar.getClass();
        GLES20.glClear(16384);
        try {
            n.d();
        } catch (GlUtil$GlException e13) {
            u.d("SceneRenderer", "Failed to draw a frame", e13);
        }
        if (iVar.f93446a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.f93455j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                n.d();
            } catch (GlUtil$GlException e14) {
                u.d("SceneRenderer", "Failed to draw a frame", e14);
            }
            if (iVar.f93447b.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.f93452g, 0);
            }
            long timestamp = iVar.f93455j.getTimestamp();
            j0 j0Var = iVar.f93450e;
            synchronized (j0Var) {
                g13 = j0Var.g(timestamp, false);
            }
            Long l13 = (Long) g13;
            if (l13 != null) {
                z zVar = iVar.f93449d;
                float[] fArr3 = iVar.f93452g;
                float[] fArr4 = (float[]) ((j0) zVar.f111348d).i(l13.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) zVar.f111347c;
                    float f13 = fArr4[0];
                    float f14 = -fArr4[1];
                    float f15 = -fArr4[2];
                    float length = Matrix.length(f13, f14, f15);
                    if (length != 0.0f) {
                        fArr = fArr3;
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f13 / length, f14 / length, f15 / length);
                    } else {
                        fArr = fArr3;
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!zVar.f111345a) {
                        z.b((float[]) zVar.f111346b, (float[]) zVar.f111347c);
                        zVar.f111345a = true;
                    }
                    Matrix.multiplyMM(fArr, 0, (float[]) zVar.f111346b, 0, (float[]) zVar.f111347c, 0);
                }
            }
            f fVar = (f) iVar.f93451f.i(timestamp);
            if (fVar != null) {
                g gVar = iVar.f93448c;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.f93437a = fVar.f93432c;
                    gVar.f93438b = new g.i(fVar.f93430a.f93429a[0]);
                    if (!fVar.f93433d) {
                        g.i iVar2 = fVar.f93431b.f93429a[0];
                        Object obj = iVar2.f63180c;
                        int length2 = ((float[]) obj).length;
                        n.h((float[]) obj);
                        n.h((float[]) iVar2.f63181d);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.f93453h, 0, fArr2, 0, iVar.f93452g, 0);
        g gVar2 = iVar.f93448c;
        int i13 = iVar.f93454i;
        float[] fArr6 = iVar.f93453h;
        g.i iVar3 = gVar2.f93438b;
        if (iVar3 == null) {
            return;
        }
        int i14 = gVar2.f93437a;
        GLES20.glUniformMatrix3fv(gVar2.f93441e, 1, false, i14 == 1 ? g.f93435j : i14 == 2 ? g.f93436k : g.f93434i, 0);
        GLES20.glUniformMatrix4fv(gVar2.f93440d, 1, false, fArr6, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i13);
        GLES20.glUniform1i(gVar2.f93444h, 0);
        try {
            n.d();
        } catch (GlUtil$GlException e15) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e15);
        }
        GLES20.glVertexAttribPointer(gVar2.f93442f, 3, 5126, false, 12, (Buffer) iVar3.f63180c);
        try {
            n.d();
        } catch (GlUtil$GlException e16) {
            Log.e("ProjectionRenderer", "Failed to load position data", e16);
        }
        GLES20.glVertexAttribPointer(gVar2.f93443g, 2, 5126, false, 8, (Buffer) iVar3.f63181d);
        try {
            n.d();
        } catch (GlUtil$GlException e17) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e17);
        }
        GLES20.glDrawArrays(iVar3.f63179b, 0, iVar3.f63178a);
        try {
            n.d();
        } catch (GlUtil$GlException e18) {
            Log.e("ProjectionRenderer", "Failed to render", e18);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i13, int i14) {
        GLES20.glViewport(0, 0, i13, i14);
        float f13 = i13 / i14;
        Matrix.perspectiveM(this.f93459b, 0, f13 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f13)) * 2.0d) : 90.0f, f13, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.f93468k;
        sphericalGLSurfaceView.f18862e.post(new w2.c(29, sphericalGLSurfaceView, this.f93458a.b()));
    }
}
