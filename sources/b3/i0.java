package b3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21330a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j13, float[] fArr) {
        float d2 = a3.c.d(j13);
        float e13 = a3.c.e(j13);
        float f13 = 1 / (((fArr[7] * e13) + (fArr[3] * d2)) + fArr[15]);
        if (Float.isInfinite(f13) || Float.isNaN(f13)) {
            f13 = 0.0f;
        }
        return com.bumptech.glide.c.d(((fArr[4] * e13) + (fArr[0] * d2) + fArr[12]) * f13, ((fArr[5] * e13) + (fArr[1] * d2) + fArr[13]) * f13);
    }

    public static final void c(float[] fArr, a3.b bVar) {
        long b13 = b(com.bumptech.glide.c.d(bVar.f478a, bVar.f479b), fArr);
        long b14 = b(com.bumptech.glide.c.d(bVar.f478a, bVar.f481d), fArr);
        long b15 = b(com.bumptech.glide.c.d(bVar.f480c, bVar.f479b), fArr);
        long b16 = b(com.bumptech.glide.c.d(bVar.f480c, bVar.f481d), fArr);
        bVar.f478a = Math.min(Math.min(a3.c.d(b13), a3.c.d(b14)), Math.min(a3.c.d(b15), a3.c.d(b16)));
        bVar.f479b = Math.min(Math.min(a3.c.e(b13), a3.c.e(b14)), Math.min(a3.c.e(b15), a3.c.e(b16)));
        bVar.f480c = Math.max(Math.max(a3.c.d(b13), a3.c.d(b14)), Math.max(a3.c.d(b15), a3.c.d(b16)));
        bVar.f481d = Math.max(Math.max(a3.c.e(b13), a3.c.e(b14)), Math.max(a3.c.e(b15), a3.c.e(b16)));
    }

    public static final void d(float[] fArr) {
        int i13 = 0;
        while (i13 < 4) {
            int i14 = 0;
            while (i14 < 4) {
                fArr[(i14 * 4) + i13] = i13 == i14 ? 1.0f : 0.0f;
                i14++;
            }
            i13++;
        }
    }

    public static final void e(float f13, float[] fArr) {
        double d2 = (f13 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f14 = fArr[0];
        float f15 = fArr[4];
        float f16 = (sin * f15) + (cos * f14);
        float f17 = -sin;
        float f18 = fArr[1];
        float f19 = fArr[5];
        float f23 = (sin * f19) + (cos * f18);
        float f24 = fArr[2];
        float f25 = fArr[6];
        float f26 = (sin * f25) + (cos * f24);
        float f27 = fArr[3];
        float f28 = fArr[7];
        fArr[0] = f16;
        fArr[1] = f23;
        fArr[2] = f26;
        fArr[3] = (sin * f28) + (cos * f27);
        fArr[4] = (f15 * cos) + (f14 * f17);
        fArr[5] = (f19 * cos) + (f18 * f17);
        fArr[6] = (f25 * cos) + (f24 * f17);
        fArr[7] = (cos * f28) + (f17 * f27);
    }

    public static final void f(float[] fArr, float f13, float f14, float f15) {
        fArr[0] = fArr[0] * f13;
        fArr[1] = fArr[1] * f13;
        fArr[2] = fArr[2] * f13;
        fArr[3] = fArr[3] * f13;
        fArr[4] = fArr[4] * f14;
        fArr[5] = fArr[5] * f14;
        fArr[6] = fArr[6] * f14;
        fArr[7] = fArr[7] * f14;
        fArr[8] = fArr[8] * f15;
        fArr[9] = fArr[9] * f15;
        fArr[10] = fArr[10] * f15;
        fArr[11] = fArr[11] * f15;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float j13 = androidx.compose.ui.graphics.a.j(0, 0, fArr, fArr2);
        float j14 = androidx.compose.ui.graphics.a.j(0, 1, fArr, fArr2);
        float j15 = androidx.compose.ui.graphics.a.j(0, 2, fArr, fArr2);
        float j16 = androidx.compose.ui.graphics.a.j(0, 3, fArr, fArr2);
        float j17 = androidx.compose.ui.graphics.a.j(1, 0, fArr, fArr2);
        float j18 = androidx.compose.ui.graphics.a.j(1, 1, fArr, fArr2);
        float j19 = androidx.compose.ui.graphics.a.j(1, 2, fArr, fArr2);
        float j23 = androidx.compose.ui.graphics.a.j(1, 3, fArr, fArr2);
        float j24 = androidx.compose.ui.graphics.a.j(2, 0, fArr, fArr2);
        float j25 = androidx.compose.ui.graphics.a.j(2, 1, fArr, fArr2);
        float j26 = androidx.compose.ui.graphics.a.j(2, 2, fArr, fArr2);
        float j27 = androidx.compose.ui.graphics.a.j(2, 3, fArr, fArr2);
        float j28 = androidx.compose.ui.graphics.a.j(3, 0, fArr, fArr2);
        float j29 = androidx.compose.ui.graphics.a.j(3, 1, fArr, fArr2);
        float j33 = androidx.compose.ui.graphics.a.j(3, 2, fArr, fArr2);
        float j34 = androidx.compose.ui.graphics.a.j(3, 3, fArr, fArr2);
        fArr[0] = j13;
        fArr[1] = j14;
        fArr[2] = j15;
        fArr[3] = j16;
        fArr[4] = j17;
        fArr[5] = j18;
        fArr[6] = j19;
        fArr[7] = j23;
        fArr[8] = j24;
        fArr[9] = j25;
        fArr[10] = j26;
        fArr[11] = j27;
        fArr[12] = j28;
        fArr[13] = j29;
        fArr[14] = j33;
        fArr[15] = j34;
    }

    public static final void h(float[] fArr, float f13, float f14, float f15) {
        float f16 = (fArr[8] * f15) + (fArr[4] * f14) + (fArr[0] * f13) + fArr[12];
        float f17 = (fArr[9] * f15) + (fArr[5] * f14) + (fArr[1] * f13) + fArr[13];
        float f18 = (fArr[10] * f15) + (fArr[6] * f14) + (fArr[2] * f13) + fArr[14];
        float f19 = (fArr[11] * f15) + (fArr[7] * f14) + (fArr[3] * f13) + fArr[15];
        fArr[12] = f16;
        fArr[13] = f17;
        fArr[14] = f18;
        fArr[15] = f19;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            return Intrinsics.d(this.f21330a, ((i0) obj).f21330a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21330a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("\n            |");
        float[] fArr = this.f21330a;
        sb3.append(fArr[0]);
        sb3.append(' ');
        sb3.append(fArr[1]);
        sb3.append(' ');
        sb3.append(fArr[2]);
        sb3.append(' ');
        sb3.append(fArr[3]);
        sb3.append("|\n            |");
        sb3.append(fArr[4]);
        sb3.append(' ');
        sb3.append(fArr[5]);
        sb3.append(' ');
        sb3.append(fArr[6]);
        sb3.append(' ');
        sb3.append(fArr[7]);
        sb3.append("|\n            |");
        sb3.append(fArr[8]);
        sb3.append(' ');
        sb3.append(fArr[9]);
        sb3.append(' ');
        sb3.append(fArr[10]);
        sb3.append(' ');
        sb3.append(fArr[11]);
        sb3.append("|\n            |");
        sb3.append(fArr[12]);
        sb3.append(' ');
        sb3.append(fArr[13]);
        sb3.append(' ');
        sb3.append(fArr[14]);
        sb3.append(' ');
        sb3.append(fArr[15]);
        sb3.append("|\n        ");
        return kotlin.text.t.b(sb3.toString());
    }
}
