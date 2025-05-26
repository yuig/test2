package dn0;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.pinterest.feature.boardpreview.export.render.RendererException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final FloatBuffer f55599a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f55600b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f55601c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55602d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f55603e;

    /* renamed from: f, reason: collision with root package name */
    public float f55604f;

    /* renamed from: g, reason: collision with root package name */
    public float f55605g;

    /* renamed from: h, reason: collision with root package name */
    public float f55606h;

    /* renamed from: i, reason: collision with root package name */
    public float f55607i;

    /* renamed from: j, reason: collision with root package name */
    public int f55608j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f55609k;

    public a(String fragmentShader) {
        Intrinsics.checkNotNullParameter("#version 310 es\n                layout (location = 0) in vec3 aPosition;\n                layout (location = 1) in vec2 aTextureCoord;\n                uniform mat4 uMVPMatrix;\n                uniform mat4 uSTMatrix;\n                \n                out vec2 vTextureCoord;\n                \n                void main() {\n                  vec4 texturePosition = vec4(aTextureCoord, 0.0, 1.0);\n                  vTextureCoord = (uSTMatrix * texturePosition).xy;\n                  \n                  vec4 vertexPosition = vec4(aPosition, 1.0);\n                  gl_Position = uMVPMatrix * vertexPosition;\n                }\n            ", "vertexShader");
        Intrinsics.checkNotNullParameter(fragmentShader, "fragmentShader");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i13 = 0;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Intrinsics.checkNotNullExpressionValue(asFloatBuffer, "apply(...)");
        this.f55599a = asFloatBuffer;
        this.f55603e = new LinkedHashMap();
        k3.m0();
        int glCreateProgram = GLES20.glCreateProgram();
        k3.n0("glCreateProgram");
        int e13 = e(35633, "#version 310 es\n                layout (location = 0) in vec3 aPosition;\n                layout (location = 1) in vec2 aTextureCoord;\n                uniform mat4 uMVPMatrix;\n                uniform mat4 uSTMatrix;\n                \n                out vec2 vTextureCoord;\n                \n                void main() {\n                  vec4 texturePosition = vec4(aTextureCoord, 0.0, 1.0);\n                  vTextureCoord = (uSTMatrix * texturePosition).xy;\n                  \n                  vec4 vertexPosition = vec4(aPosition, 1.0);\n                  gl_Position = uMVPMatrix * vertexPosition;\n                }\n            ");
        int e14 = e(35632, fragmentShader);
        k3.m0();
        GLES20.glAttachShader(glCreateProgram, e13);
        Unit unit = Unit.f80348a;
        k3.n0("glAttachShader");
        k3.m0();
        GLES20.glAttachShader(glCreateProgram, e14);
        k3.n0("glAttachShader");
        k3.m0();
        GLES20.glLinkProgram(glCreateProgram);
        k3.n0("glLinkProgram");
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(glCreateProgram);
        } else {
            k3.m0();
            GLES20.glDeleteShader(e13);
            k3.n0("glDeleteShader");
            k3.m0();
            GLES20.glDeleteShader(e14);
            k3.n0("glDeleteShader");
            i13 = glCreateProgram;
        }
        this.f55602d = i13;
        this.f55606h = 1.0f;
        this.f55607i = 1.0f;
    }

    public static int e(int i13, String str) {
        int glCreateShader = GLES20.glCreateShader(i13);
        k3.m0();
        GLES20.glShaderSource(glCreateShader, str);
        Unit unit = Unit.f80348a;
        k3.n0("glShaderSource");
        k3.m0();
        GLES20.glCompileShader(glCreateShader);
        k3.n0("glCompileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    @Override // dn0.h
    public final void a() {
        k3.m0();
        GLES20.glDeleteProgram(this.f55602d);
        Unit unit = Unit.f80348a;
        k3.n0("glDeleteProgram");
    }

    @Override // dn0.h
    public final void apply() {
        k3.m0();
        GLES20.glUseProgram(this.f55602d);
        Unit unit = Unit.f80348a;
        k3.n0("glUseProgram");
        FloatBuffer floatBuffer = this.f55599a;
        c(floatBuffer, 0, "aPosition", 3);
        c(floatBuffer, 3, "aTextureCoord", 2);
        d("uMVPMatrix", g());
        float[] fArr = this.f55601c;
        if (fArr != null) {
            d("uSTMatrix", fArr);
        } else {
            Intrinsics.r("texTransformMatrix");
            throw null;
        }
    }

    @Override // dn0.h
    public final void b(float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] copyOf = Arrays.copyOf(matrix, matrix.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.f55601c = copyOf;
    }

    public final void c(FloatBuffer floatBuffer, int i13, String str, int i14) {
        int f13 = f(str);
        if (f13 == -1) {
            throw new RendererException("Could not get attrib location for ".concat(str));
        }
        floatBuffer.position(i13);
        k3.m0();
        GLES20.glVertexAttribPointer(f13, i14, 5126, false, 20, (Buffer) floatBuffer);
        Unit unit = Unit.f80348a;
        k3.n0("glVertexAttribPointer");
        k3.m0();
        GLES20.glEnableVertexAttribArray(f13);
        k3.n0("glEnableVertexAttribArray");
    }

    public final void d(String str, float[] fArr) {
        int f13 = f(str);
        if (f13 == -1) {
            throw new RendererException("Could not get uniform location for ".concat(str));
        }
        k3.m0();
        GLES20.glUniformMatrix4fv(f13, 1, false, fArr, 0);
        Unit unit = Unit.f80348a;
        k3.n0("glUniformMatrix4fv");
    }

    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashMap linkedHashMap = this.f55603e;
        Integer num = (Integer) linkedHashMap.get(name);
        if (num != null) {
            return num.intValue();
        }
        String concat = "glGetAttribLocation: ".concat(name);
        k3.m0();
        int i13 = this.f55602d;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i13, name);
        k3.n0(concat);
        if (glGetAttribLocation == -1) {
            String concat2 = "glGetUniformLocation: ".concat(name);
            k3.m0();
            int glGetUniformLocation = GLES20.glGetUniformLocation(i13, name);
            k3.n0(concat2);
            glGetAttribLocation = glGetUniformLocation;
        }
        if (glGetAttribLocation == -1) {
            throw new IllegalStateException("Could not get attrib or uniform location for ".concat(name).toString());
        }
        linkedHashMap.put(name, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }

    public final float[] g() {
        float[] fArr = this.f55600b;
        if (fArr != null) {
            return fArr;
        }
        Intrinsics.r("mvpMatrix");
        throw null;
    }

    public final void h(int i13, boolean z13) {
        this.f55608j = i13;
        this.f55609k = z13;
        float[] fArr = new float[16];
        Intrinsics.checkNotNullParameter(fArr, "<set-?>");
        this.f55600b = fArr;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        float f13 = -1;
        float f14 = this.f55606h;
        float f15 = f13 / f14;
        float f16 = 1;
        float f17 = f16 / f14;
        float f18 = this.f55607i;
        Matrix.orthoM(fArr2, 0, f15, f17, f13 / f18, f16 / f18, -1.0f, 1.0f);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        double d2 = (i13 / 180.0d) * 3.141592653589793d;
        float[] fArr4 = {(float) Math.sin(d2), (float) Math.cos(d2)};
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, fArr4[0], fArr4[1], 0.0f);
        Matrix.setIdentityM(g(), 0);
        Matrix.multiplyMM(g(), 0, fArr2, 0, fArr3, 0);
        Matrix.translateM(g(), 0, this.f55604f, this.f55605g, 0.0f);
        if (z13) {
            Matrix.scaleM(g(), 0, 1.0f, -1.0f, 1.0f);
        }
    }
}
