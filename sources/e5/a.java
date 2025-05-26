package e5;

import a.cb;
import android.graphics.Color;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f57203a;

    /* renamed from: b, reason: collision with root package name */
    public float f57204b;

    /* renamed from: c, reason: collision with root package name */
    public float f57205c;

    /* renamed from: d, reason: collision with root package name */
    public float f57206d;

    /* renamed from: e, reason: collision with root package name */
    public float f57207e;

    /* renamed from: f, reason: collision with root package name */
    public float f57208f;

    public a(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f57203a = f13;
        this.f57204b = f14;
        this.f57205c = f15;
        this.f57206d = f16;
        this.f57207e = f17;
        this.f57208f = f18;
    }

    public static a b(int i13) {
        o oVar = o.f57246k;
        float b13 = b.b(Color.red(i13));
        float b14 = b.b(Color.green(i13));
        float b15 = b.b(Color.blue(i13));
        float[][] fArr = b.f57212d;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * b15) + (fArr2[1] * b14) + (fArr2[0] * b13);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * b15) + (fArr3[1] * b14) + (fArr3[0] * b13);
        float[] fArr4 = fArr[2];
        float f15 = (b15 * fArr4[2]) + (b14 * fArr4[1]) + (b13 * fArr4[0]);
        float[][] fArr5 = b.f57209a;
        float[] fArr6 = fArr5[0];
        float f16 = (fArr6[2] * f15) + (fArr6[1] * f14) + (fArr6[0] * f13);
        float[] fArr7 = fArr5[1];
        float f17 = (fArr7[2] * f15) + (fArr7[1] * f14) + (fArr7[0] * f13);
        float[] fArr8 = fArr5[2];
        float f18 = (f15 * fArr8[2]) + (f14 * fArr8[1]) + (f13 * fArr8[0]);
        float[] fArr9 = oVar.f57253g;
        float f19 = fArr9[0] * f16;
        float f23 = fArr9[1] * f17;
        float f24 = fArr9[2] * f18;
        float abs = Math.abs(f19);
        float f25 = oVar.f57254h;
        float pow = (float) Math.pow((abs * f25) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f23) * f25) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f24) * f25) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f23) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f24) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum3;
        float f26 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f27 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f28 = signum2 * 20.0f;
        float f29 = ((21.0f * signum3) + ((signum * 20.0f) + f28)) / 20.0f;
        float f33 = (((signum * 40.0f) + f28) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f27, f26)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f34 = atan2;
        float f35 = (3.1415927f * f34) / 180.0f;
        float f36 = f33 * oVar.f57248b;
        float f37 = oVar.f57247a;
        float f38 = oVar.f57250d;
        float pow4 = ((float) Math.pow(f36 / f37, oVar.f57256j * f38)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f39 = f37 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.f57252f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f34) < 20.14d ? 360.0f + f34 : f34) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.f57251e) * oVar.f57249c) * ((float) Math.sqrt((f27 * f27) + (f26 * f26)))) / (f29 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f41 = oVar.f57255i * pow5;
        Math.sqrt((r3 * f38) / f39);
        float f43 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f41 * 0.0228f) + 1.0f)) * 43.85965f;
        double d13 = f35;
        return new a(f34, pow5, pow4, f43, log * ((float) Math.cos(d13)), log * ((float) Math.sin(d13)));
    }

    public static a c(float f13, float f14, float f15) {
        o oVar = o.f57246k;
        float f16 = oVar.f57250d;
        Math.sqrt(f13 / 100.0d);
        float f17 = oVar.f57247a + 4.0f;
        float f18 = oVar.f57255i * f14;
        Math.sqrt(((f14 / ((float) Math.sqrt(r1))) * oVar.f57250d) / f17);
        float f19 = (1.7f * f13) / ((0.007f * f13) + 1.0f);
        float log = ((float) Math.log((f18 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f15) / 180.0f;
        return new a(f15, f14, f13, f19, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public void a(float f13, float f14, int i13, int i14, float[] fArr) {
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = (f14 - 0.5f) * 2.0f;
        float f18 = f15 + this.f57205c;
        float f19 = f16 + this.f57206d;
        float f23 = (this.f57203a * (f13 - 0.5f) * 2.0f) + f18;
        float f24 = (this.f57204b * f17) + f19;
        float radians = (float) Math.toRadians(this.f57208f);
        float radians2 = (float) Math.toRadians(this.f57207e);
        double d2 = radians;
        double d13 = i14 * f17;
        float sin = (((float) ((Math.sin(d2) * ((-i13) * r7)) - (Math.cos(d2) * d13))) * radians2) + f23;
        float cos = (radians2 * ((float) ((Math.cos(d2) * (i13 * r7)) - (Math.sin(d2) * d13)))) + f24;
        fArr[0] = sin;
        fArr[1] = cos;
    }

    public int d(o oVar) {
        float f13;
        float f14 = this.f57204b;
        double d2 = f14;
        float f15 = this.f57205c;
        if (d2 != 0.0d) {
            double d13 = f15;
            if (d13 != 0.0d) {
                f13 = f14 / ((float) Math.sqrt(d13 / 100.0d));
                float pow = (float) Math.pow(f13 / Math.pow(1.64d - Math.pow(0.29d, oVar.f57252f), 0.73d), 1.1111111111111112d);
                double d14 = (this.f57203a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d14) + 3.8d)) * 0.25f;
                float pow2 = oVar.f57247a * ((float) Math.pow(f15 / 100.0d, (1.0d / oVar.f57250d) / oVar.f57256j));
                float f16 = cos * 3846.1538f * oVar.f57251e * oVar.f57249c;
                float f17 = pow2 / oVar.f57248b;
                float sin = (float) Math.sin(d14);
                float cos2 = (float) Math.cos(d14);
                float f18 = (((0.305f + f17) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f16 * 23.0f)));
                float f19 = cos2 * f18;
                float f23 = f18 * sin;
                float f24 = f17 * 460.0f;
                float f25 = ((288.0f * f23) + ((451.0f * f19) + f24)) / 1403.0f;
                float a13 = cb.a(f23, 261.0f, f24 - (891.0f * f19), 1403.0f);
                float a14 = cb.a(f23, 6300.0f, f24 - (f19 * 220.0f), 1403.0f);
                float max = (float) Math.max(0.0d, (Math.abs(f25) * 27.13d) / (400.0d - Math.abs(f25)));
                float signum = Math.signum(f25);
                float f26 = 100.0f / oVar.f57254h;
                float pow3 = signum * f26 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(a13) * f26 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(a13) * 27.13d) / (400.0d - Math.abs(a13))), 2.380952380952381d));
                float signum3 = Math.signum(a14) * f26 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(a14) * 27.13d) / (400.0d - Math.abs(a14))), 2.380952380952381d));
                float[] fArr = oVar.f57253g;
                float f27 = pow3 / fArr[0];
                float f28 = signum2 / fArr[1];
                float f29 = signum3 / fArr[2];
                float[][] fArr2 = b.f57210b;
                float[] fArr3 = fArr2[0];
                float f33 = (fArr3[2] * f29) + (fArr3[1] * f28) + (fArr3[0] * f27);
                float[] fArr4 = fArr2[1];
                float f34 = (fArr4[2] * f29) + (fArr4[1] * f28) + (fArr4[0] * f27);
                float[] fArr5 = fArr2[2];
                return f5.c.b(f33, f34, (f29 * fArr5[2]) + (f28 * fArr5[1]) + (f27 * fArr5[0]));
            }
        }
        f13 = 0.0f;
        float pow4 = (float) Math.pow(f13 / Math.pow(1.64d - Math.pow(0.29d, oVar.f57252f), 0.73d), 1.1111111111111112d);
        double d142 = (this.f57203a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d142) + 3.8d)) * 0.25f;
        float pow22 = oVar.f57247a * ((float) Math.pow(f15 / 100.0d, (1.0d / oVar.f57250d) / oVar.f57256j));
        float f162 = cos3 * 3846.1538f * oVar.f57251e * oVar.f57249c;
        float f172 = pow22 / oVar.f57248b;
        float sin2 = (float) Math.sin(d142);
        float cos22 = (float) Math.cos(d142);
        float f182 = (((0.305f + f172) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f162 * 23.0f)));
        float f192 = cos22 * f182;
        float f232 = f182 * sin2;
        float f242 = f172 * 460.0f;
        float f252 = ((288.0f * f232) + ((451.0f * f192) + f242)) / 1403.0f;
        float a132 = cb.a(f232, 261.0f, f242 - (891.0f * f192), 1403.0f);
        float a142 = cb.a(f232, 6300.0f, f242 - (f192 * 220.0f), 1403.0f);
        float max2 = (float) Math.max(0.0d, (Math.abs(f252) * 27.13d) / (400.0d - Math.abs(f252)));
        float signum4 = Math.signum(f252);
        float f262 = 100.0f / oVar.f57254h;
        float pow32 = signum4 * f262 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(a132) * f262 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(a132) * 27.13d) / (400.0d - Math.abs(a132))), 2.380952380952381d));
        float signum32 = Math.signum(a142) * f262 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(a142) * 27.13d) / (400.0d - Math.abs(a142))), 2.380952380952381d));
        float[] fArr6 = oVar.f57253g;
        float f272 = pow32 / fArr6[0];
        float f282 = signum22 / fArr6[1];
        float f292 = signum32 / fArr6[2];
        float[][] fArr22 = b.f57210b;
        float[] fArr32 = fArr22[0];
        float f332 = (fArr32[2] * f292) + (fArr32[1] * f282) + (fArr32[0] * f272);
        float[] fArr42 = fArr22[1];
        float f342 = (fArr42[2] * f292) + (fArr42[1] * f282) + (fArr42[0] * f272);
        float[] fArr52 = fArr22[2];
        return f5.c.b(f332, f342, (f292 * fArr52[2]) + (f282 * fArr52[1]) + (f272 * fArr52[0]));
    }
}
