package kg1;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.pinterest.api.model.dk;
import com.pinterest.api.model.ek;
import com.pinterest.api.model.fr;
import com.pinterest.api.model.hn;
import com.pinterest.api.model.pw0;
import com.pinterest.api.model.qw0;
import com.pinterest.api.model.rw0;
import com.pinterest.api.model.uk;
import com.pinterest.api.model.vk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.b0;
import kh2.g3;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tb0.g;
import tb0.h;
import tb0.p;
import vb0.j;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f79388a;

    /* renamed from: b, reason: collision with root package name */
    public final List f79389b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f79390c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f79391d;

    /* renamed from: e, reason: collision with root package name */
    public final float f79392e;

    /* renamed from: f, reason: collision with root package name */
    public final float f79393f;

    /* renamed from: g, reason: collision with root package name */
    public final float f79394g;

    /* renamed from: h, reason: collision with root package name */
    public final float f79395h;

    /* renamed from: i, reason: collision with root package name */
    public int f79396i;

    /* renamed from: j, reason: collision with root package name */
    public int f79397j;

    /* renamed from: k, reason: collision with root package name */
    public int f79398k;

    /* renamed from: l, reason: collision with root package name */
    public int f79399l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f79400m;

    /* renamed from: n, reason: collision with root package name */
    public int f79401n;

    /* renamed from: o, reason: collision with root package name */
    public long f79402o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f79403p;

    public /* synthetic */ b(int i13, List list, float f13, int i14) {
        this(i13, (i14 & 2) != 0 ? null : list, new float[16], new float[16], (16 & i14) != 0 ? 1.0f : f13, new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f)), 0.0f);
    }

    public final void a(int i13, float[] mvpMatrix, float[] stMatrix, Long l13, float f13) {
        dw0.a aVar;
        Bitmap bitmap;
        dw0.a aVar2;
        Intrinsics.checkNotNullParameter(mvpMatrix, "mvpMatrix");
        Intrinsics.checkNotNullParameter(stMatrix, "stMatrix");
        GLES20.glUseProgram(this.f79396i);
        GLES20.glUniformMatrix4fv(d("uMVPMatrix"), 1, false, mvpMatrix, 0);
        GLES20.glUniformMatrix4fv(d("uSTMatrix"), 1, false, stMatrix, 0);
        GLES20.glUniform1f(d("uCRatio"), 1.0f);
        if (this.f79403p) {
            GLES20.glUniform1f(d("uAlpha"), f13);
        } else {
            j.f125466a.R(f13 == 1.0f, "Alpha not supported by this shader", p.IDEA_PINS_CREATION, new Object[0]);
        }
        GLES20.glBindBuffer(34962, this.f79399l);
        GLES20.glEnableVertexAttribArray(d("aPosition"));
        GLES20.glVertexAttribPointer(d("aPosition"), 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(d("aTextureCoord"));
        GLES20.glVertexAttribPointer(d("aTextureCoord"), 2, 5126, false, 20, 12);
        GLES20.glActiveTexture(33984);
        int i14 = this.f79388a;
        GLES20.glBindTexture(i14, i13);
        GLES20.glUniform1i(d("sTexture"), 0);
        float f14 = 9729;
        GLES20.glTexParameterf(i14, 10240, f14);
        GLES20.glTexParameterf(i14, 10241, f14);
        GLES20.glTexParameteri(i14, 10242, 33071);
        GLES20.glTexParameteri(i14, 10243, 33071);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        List list = this.f79389b;
        if (l13 != null) {
            if (this.f79402o == 0) {
                this.f79402o = l13.longValue();
            }
            if ((l13.longValue() - this.f79402o) / 1000 >= ((list == null || (aVar2 = (dw0.a) list.get(this.f79401n)) == null) ? 0 : aVar2.f56410b)) {
                this.f79402o = l13.longValue();
                int size = list != null ? list.size() : 0;
                int i15 = this.f79401n + 1;
                if (i15 >= size) {
                    this.f79401n = 0;
                } else {
                    this.f79401n = i15;
                }
            }
        }
        if (list != null && (aVar = (dw0.a) list.get(this.f79401n)) != null && (bitmap = aVar.f56409a) != null) {
            try {
                GLUtils.texImage2D(3553, 0, 6408, bitmap, 0);
            } catch (IllegalArgumentException e13) {
                String message = e13.getMessage();
                if (message != null && StringsKt.E(message, "invalid Bitmap format", true)) {
                    HashSet hashSet = h.f117076w;
                    g.f117075a.h("Invalid Bitmap Format: " + bitmap.getConfig());
                }
                throw e13;
            }
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(d("aPosition"));
        GLES20.glDisableVertexAttribArray(d("aTextureCoord"));
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindTexture(i14, 0);
    }

    public final void c(int i13, long j13, fr frVar) {
        ek ekVar;
        vk vkVar;
        long j14 = frVar != null ? frVar.f37759e : 0L;
        long j15 = frVar != null ? frVar.f37760f : 0L;
        if (j14 == 0 && j15 == 0) {
            a(i13, this.f79390c, this.f79391d, Long.valueOf(j13), 1.0f);
            return;
        }
        if (j14 > j13 || j13 > j15) {
            return;
        }
        if (frVar == null || (ekVar = frVar.f37761g) == null) {
            ekVar = dk.Instant;
        }
        ek ekVar2 = ekVar;
        if (frVar == null || (vkVar = frVar.f37762h) == null) {
            vkVar = uk.Instant;
        }
        vk vkVar2 = vkVar;
        rw0 o23 = g3.o2(j13, j14, j15, 250000L);
        hn hnVar = new hn(this.f79390c, this.f79394g, this.f79395h, this.f79393f);
        if (o23 instanceof pw0) {
            ekVar2.glTransformations(hnVar, (pw0) o23, new a(this, i13, j13, 0));
        } else if (o23 instanceof qw0) {
            vkVar2.glTransformations(hnVar, (qw0) o23, new a(this, i13, j13, 1));
        } else {
            a(i13, this.f79390c, this.f79391d, Long.valueOf(j13), 1.0f);
        }
    }

    public final int d(String str) {
        LinkedHashMap linkedHashMap = this.f79400m;
        Integer num = (Integer) linkedHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f79396i, str);
        if (glGetAttribLocation == -1) {
            glGetAttribLocation = GLES20.glGetUniformLocation(this.f79396i, str);
        }
        if (glGetAttribLocation == -1) {
            throw new IllegalStateException("Could not get attrib or uniform location for ".concat(str).toString());
        }
        linkedHashMap.put(str, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }

    public final void e() {
        GLES20.glDeleteProgram(this.f79396i);
        this.f79396i = 0;
        GLES20.glDeleteShader(this.f79397j);
        this.f79397j = 0;
        GLES20.glDeleteShader(this.f79398k);
        this.f79398k = 0;
        GLES20.glDeleteBuffers(1, new int[]{this.f79399l}, 0);
        this.f79399l = 0;
        this.f79400m.clear();
    }

    public final void f() {
        int F1;
        e();
        this.f79397j = b0.F1(35633, "\n            uniform mat4 uMVPMatrix;\n            uniform mat4 uSTMatrix;\n            uniform float uCRatio;\n            attribute vec4 aPosition;\n            attribute vec4 aTextureCoord;\n            varying highp vec2 vTextureCoord;\n            void main() {\n                vec4 scaledPos = aPosition;\n                scaledPos.x = scaledPos.x * uCRatio;\n                gl_Position = uMVPMatrix * scaledPos;\n                vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n            }\n        ");
        int i13 = this.f79388a;
        if (i13 == 3553) {
            this.f79403p = true;
            F1 = b0.F1(35632, "\n            precision mediump float;\n            varying highp vec2 vTextureCoord;\n            uniform lowp sampler2D sTexture;\n            uniform float uAlpha;\n            void main() {\n                vec4 texVal = texture2D(sTexture, vTextureCoord);\n                gl_FragColor = vec4(texVal.rgb, texVal.a * uAlpha);\n            }\n        ");
        } else {
            if (i13 != 36197) {
                throw new IllegalArgumentException(a.a.e("Texture target ", i13, " not supported!"));
            }
            this.f79403p = false;
            F1 = b0.F1(35632, "\n            #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n            varying highp vec2 vTextureCoord;\n            uniform lowp samplerExternalOES sTexture;\n            void main() {\n                gl_FragColor = texture2D(sTexture, vTextureCoord);\n            }\n        ");
        }
        this.f79398k = F1;
        int i14 = this.f79397j;
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            throw new RuntimeException("Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, i14);
        GLES20.glAttachShader(glCreateProgram, F1);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException("Could not link program");
        }
        this.f79396i = glCreateProgram;
        float f13 = this.f79392e;
        float f14 = -f13;
        float[] data = {f14, 1.0f, 0.0f, 0.0f, 1.0f, f13, 1.0f, 0.0f, 1.0f, 1.0f, f14, -1.0f, 0.0f, 0.0f, 0.0f, f13, -1.0f, 0.0f, 1.0f, 0.0f};
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "data");
        FloatBuffer data2 = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        data2.put(data).position(0);
        Intrinsics.checkNotNullParameter(data2, "data");
        int[] iArr2 = new int[1];
        GLES20.glGenBuffers(1, iArr2, 0);
        int i15 = iArr2[0];
        Intrinsics.checkNotNullParameter(data2, "data");
        GLES20.glBindBuffer(34962, i15);
        GLES20.glBufferData(34962, data2.capacity() * 4, data2, 35044);
        GLES20.glBindBuffer(34962, 0);
        this.f79399l = iArr2[0];
        d("aPosition");
        d("aTextureCoord");
        d("sTexture");
        d("uMVPMatrix");
        d("uSTMatrix");
        if (this.f79403p) {
            d("uAlpha");
        }
    }

    public b(int i13, List list, float[] mvpMatrix, float[] textureMatrix, float f13, Pair coordSystemDimensions, float f14) {
        Intrinsics.checkNotNullParameter(mvpMatrix, "mvpMatrix");
        Intrinsics.checkNotNullParameter(textureMatrix, "textureMatrix");
        Intrinsics.checkNotNullParameter(coordSystemDimensions, "coordSystemDimensions");
        this.f79388a = i13;
        this.f79389b = list;
        this.f79390c = mvpMatrix;
        this.f79391d = textureMatrix;
        this.f79392e = f13;
        this.f79393f = f14;
        float f15 = 2;
        this.f79394g = (f13 * f15) / ((Number) coordSystemDimensions.f80346a).floatValue();
        this.f79395h = f15 / ((Number) coordSystemDimensions.f80347b).floatValue();
        this.f79400m = new LinkedHashMap();
    }
}
