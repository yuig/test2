package n8;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.camera.core.impl.r1;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class t implements GLSurfaceView.Renderer {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f89896g = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: h, reason: collision with root package name */
    public static final FloatBuffer f89897h = d7.n.h(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: a, reason: collision with root package name */
    public final int[] f89898a = new int[3];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f89899b = new int[3];

    /* renamed from: c, reason: collision with root package name */
    public final int[] f89900c = new int[3];

    /* renamed from: d, reason: collision with root package name */
    public final int[] f89901d = new int[3];

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f89902e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public r1 f89903f;

    public t() {
        for (int i13 = 0; i13 < 3; i13++) {
            int[] iArr = this.f89900c;
            this.f89901d[i13] = -1;
            iArr[i13] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.f89898a;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i13 = 0; i13 < 3; i13++) {
                r1 r1Var = this.f89903f;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(r1Var.f16957a, f89896g[i13]), i13);
                GLES20.glActiveTexture(33984 + i13);
                d7.n.b(3553, iArr[i13], 9729);
            }
            d7.n.d();
        } catch (GlUtil$GlException e13) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e13);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f89902e.getAndSet(null));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i13, int i14) {
        GLES20.glViewport(0, 0, i13, i14);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f89899b;
        try {
            r1 r1Var = new r1("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f89903f = r1Var;
            GLES20.glVertexAttribPointer(r1Var.g("in_pos"), 2, 5126, false, 0, (Buffer) f89897h);
            iArr[0] = this.f89903f.g("in_tc_y");
            iArr[1] = this.f89903f.g("in_tc_u");
            iArr[2] = this.f89903f.g("in_tc_v");
            GLES20.glGetUniformLocation(this.f89903f.f16957a, "mColorConversion");
            d7.n.d();
            a();
            d7.n.d();
        } catch (GlUtil$GlException e13) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e13);
        }
    }
}
