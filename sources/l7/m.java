package l7;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.camera.core.impl.r1;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public final class m extends a implements x, q0 {

    /* renamed from: s, reason: collision with root package name */
    public static final v2 f81817s;

    /* renamed from: t, reason: collision with root package name */
    public static final float[] f81818t;

    /* renamed from: u, reason: collision with root package name */
    public static final float[] f81819u;

    /* renamed from: h, reason: collision with root package name */
    public final r1 f81820h;

    /* renamed from: i, reason: collision with root package name */
    public final c1 f81821i;

    /* renamed from: j, reason: collision with root package name */
    public final c1 f81822j;

    /* renamed from: k, reason: collision with root package name */
    public final float[][] f81823k;

    /* renamed from: l, reason: collision with root package name */
    public final float[][] f81824l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f81825m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f81826n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f81827o;

    /* renamed from: p, reason: collision with root package name */
    public final int f81828p;

    /* renamed from: q, reason: collision with root package name */
    public v2 f81829q;

    /* renamed from: r, reason: collision with root package name */
    public final int f81830r;

    static {
        pk.y0 y0Var = c1.f100372b;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        bs1.c.v(4, objArr);
        f81817s = c1.l(4, objArr);
        f81818t = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
        f81819u = new float[]{1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    }

    public m(r1 r1Var, c1 c1Var, c1 c1Var2, boolean z13) {
        super(z13);
        this.f81820h = r1Var;
        this.f81821i = c1Var;
        this.f81822j = c1Var2;
        int[] iArr = {c1Var.size(), 16};
        Class cls = Float.TYPE;
        this.f81823k = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.f81824l = (float[][]) Array.newInstance((Class<?>) cls, c1Var2.size(), 16);
        this.f81825m = d7.n.g();
        this.f81826n = d7.n.g();
        this.f81827o = new float[16];
        this.f81829q = f81817s;
        this.f81830r = -1;
        int i13 = 9729;
        for (int i14 = 0; i14 < c1Var.size(); i14++) {
            i13 = Math.max(i13, ((m0) c1Var.get(i14)).d());
        }
        this.f81828p = i13;
    }

    public static m i(Context context, v2 v2Var, v2 v2Var2, boolean z13) {
        return new m(k(context, "shaders/vertex_shader_transformation_es2.glsl", v2Var2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), c1.r(v2Var), c1.r(v2Var2), z13);
    }

    public static m j(Context context, v2 v2Var, List list, a7.j jVar, int i13) {
        boolean g13 = a7.j.g(jVar);
        boolean z13 = i13 == 2;
        r1 k13 = k(context, g13 ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", g13 ? "shaders/fragment_shader_oetf_es3.glsl" : z13 ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i14 = jVar.f1084c;
        if (g13) {
            bf.b.i(i14 == 7 || i14 == 6);
            k13.n(i14, "uOutputColorTransfer");
        } else if (z13) {
            bf.b.i(i14 == 3 || i14 == 10);
            k13.n(i14, "uOutputColorTransfer");
        }
        return new m(k13, c1.r(v2Var), c1.r(list), g13);
    }

    public static r1 k(Context context, String str, String str2) {
        try {
            r1 r1Var = new r1(d7.n0.V(context, str), d7.n0.V(context, str2));
            r1Var.l("uTexTransformationMatrix", d7.n.g());
            return r1Var;
        } catch (GlUtil$GlException | IOException e13) {
            throw new VideoFrameProcessingException(e13);
        }
    }

    public static m l(r1 r1Var, a7.j jVar, a7.j jVar2, int i13, v2 v2Var) {
        boolean g13 = a7.j.g(jVar);
        int i14 = jVar.f1082a;
        boolean z13 = (i14 == 1 || i14 == 2) && jVar2.f1082a == 6;
        int i15 = jVar2.f1084c;
        if (g13) {
            if (i15 == 3) {
                i15 = 10;
            }
            bf.b.i(i15 == 1 || i15 == 10 || i15 == 6 || i15 == 7);
            r1Var.n(i15, "uOutputColorTransfer");
        } else if (z13) {
            bf.b.i(i15 == 1 || i15 == 6 || i15 == 7);
            r1Var.n(i15, "uOutputColorTransfer");
        } else {
            r1Var.n(i13, "uSdrWorkingColorSpace");
            bf.b.i(i15 == 3 || i15 == 1);
            r1Var.n(i15, "uOutputColorTransfer");
        }
        return new m(r1Var, v2Var, v2.f100502e, g13 || z13);
    }

    public static boolean n(float[][] fArr, float[][] fArr2) {
        boolean z13 = false;
        for (int i13 = 0; i13 < fArr.length; i13++) {
            float[] fArr3 = fArr[i13];
            float[] fArr4 = fArr2[i13];
            if (!Arrays.equals(fArr3, fArr4)) {
                bf.b.s("A 4x4 transformation matrix must have 16 elements", fArr4.length == 16);
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z13 = true;
            }
        }
        return z13;
    }

    @Override // l7.i0
    public final void a() {
        try {
            this.f81702a.b();
            try {
                GLES20.glDeleteProgram(this.f81820h.f16957a);
                d7.n.d();
                int i13 = this.f81830r;
                if (i13 != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i13}, 0);
                    d7.n.d();
                }
            } catch (GlUtil$GlException e13) {
                throw new VideoFrameProcessingException((Throwable) e13);
            }
        } catch (GlUtil$GlException e14) {
            throw new VideoFrameProcessingException((Throwable) e14);
        }
    }

    @Override // l7.a
    public final void h(int i13, long j13) {
        r1 r1Var = this.f81820h;
        c1 c1Var = this.f81822j;
        int[] iArr = {c1Var.size(), 16};
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        if (c1Var.size() > 0) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(c1Var.get(0));
            throw null;
        }
        boolean n13 = n(this.f81824l, fArr);
        float[] fArr2 = this.f81826n;
        if (n13) {
            d7.n.r(fArr2);
            if (c1Var.size() > 0) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(c1Var.get(0));
                throw null;
            }
        }
        c1 c1Var2 = this.f81821i;
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, c1Var2.size(), 16);
        for (int i14 = 0; i14 < c1Var2.size(); i14++) {
            fArr3[i14] = ((m0) c1Var2.get(i14)).c(j13);
        }
        float[][] fArr4 = this.f81823k;
        boolean n14 = n(fArr4, fArr3);
        float[] fArr5 = this.f81825m;
        if (n14) {
            d7.n.r(fArr5);
            this.f81829q = f81817s;
            int length = fArr4.length;
            int i15 = 0;
            while (true) {
                float[] fArr6 = this.f81827o;
                if (i15 >= length) {
                    Matrix.invertM(fArr6, 0, fArr5, 0);
                    this.f81829q = n0.e(fArr6, this.f81829q);
                    break;
                }
                float[] fArr7 = fArr4[i15];
                Matrix.multiplyMM(fArr6, 0, fArr7, 0, this.f81825m, 0);
                System.arraycopy(fArr6, 0, fArr5, 0, fArr6.length);
                v2 a13 = n0.a(n0.e(fArr7, this.f81829q));
                this.f81829q = a13;
                if (a13.size() < 3) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (this.f81829q.size() < 3) {
            return;
        }
        try {
            r1Var.q();
            m();
            r1Var.o(i13, this.f81828p);
            r1Var.l("uTransformationMatrix", fArr5);
            r1Var.m(fArr2);
            r1Var.k(d7.n.k(this.f81829q));
            r1Var.d();
            GLES20.glDrawArrays(6, 0, this.f81829q.size());
            d7.n.d();
        } catch (GlUtil$GlException e13) {
            throw new VideoFrameProcessingException(e13);
        }
    }

    public final void m() {
    }
}
