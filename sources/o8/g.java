package o8;

import android.opengl.GLES20;
import android.util.Log;
import androidx.camera.core.impl.r1;
import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f93434i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f93435j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f93436k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f93437a;

    /* renamed from: b, reason: collision with root package name */
    public g.i f93438b;

    /* renamed from: c, reason: collision with root package name */
    public r1 f93439c;

    /* renamed from: d, reason: collision with root package name */
    public int f93440d;

    /* renamed from: e, reason: collision with root package name */
    public int f93441e;

    /* renamed from: f, reason: collision with root package name */
    public int f93442f;

    /* renamed from: g, reason: collision with root package name */
    public int f93443g;

    /* renamed from: h, reason: collision with root package name */
    public int f93444h;

    public static boolean b(f fVar) {
        g.i[] iVarArr = fVar.f93430a.f93429a;
        if (iVarArr.length != 1 || iVarArr[0].f63178a != 0) {
            return false;
        }
        g.i[] iVarArr2 = fVar.f93431b.f93429a;
        return iVarArr2.length == 1 && iVarArr2[0].f63178a == 0;
    }

    public final void a() {
        try {
            r1 r1Var = new r1("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f93439c = r1Var;
            this.f93440d = GLES20.glGetUniformLocation(r1Var.f16957a, "uMvpMatrix");
            this.f93441e = GLES20.glGetUniformLocation(this.f93439c.f16957a, "uTexMatrix");
            this.f93442f = this.f93439c.g("aPosition");
            this.f93443g = this.f93439c.g("aTexCoords");
            this.f93444h = GLES20.glGetUniformLocation(this.f93439c.f16957a, "uTexture");
        } catch (GlUtil$GlException e13) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e13);
        }
    }
}
