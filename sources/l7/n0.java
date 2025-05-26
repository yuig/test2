package l7;

import android.opengl.Matrix;
import java.util.Arrays;
import java.util.List;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f81833a = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};

    public static v2 a(v2 v2Var) {
        bf.b.h("A polygon must have at least 3 vertices.", v2Var.size() >= 3);
        pk.x0 x0Var = new pk.x0();
        x0Var.c(v2Var);
        float[][] fArr = f81833a;
        int i13 = 0;
        while (i13 < 6) {
            float[] fArr2 = fArr[i13];
            v2 i14 = x0Var.i();
            pk.x0 x0Var2 = new pk.x0();
            for (int i15 = 0; i15 < i14.size(); i15++) {
                float[] fArr3 = (float[]) i14.get(i15);
                float[] fArr4 = (float[]) i14.get(((i14.size() + i15) - 1) % i14.size());
                if (d(fArr3, fArr2)) {
                    if (!d(fArr4, fArr2)) {
                        float[] b13 = b(fArr2, fArr2, fArr4, fArr3);
                        if (!Arrays.equals(fArr3, b13)) {
                            x0Var2.g(b13);
                        }
                    }
                    x0Var2.g(fArr3);
                } else if (d(fArr4, fArr2)) {
                    float[] b14 = b(fArr2, fArr2, fArr4, fArr3);
                    if (!Arrays.equals(fArr4, b14)) {
                        x0Var2.g(b14);
                    }
                }
            }
            i13++;
            x0Var = x0Var2;
        }
        return x0Var.i();
    }

    public static float[] b(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        bf.b.h("Expecting 4 plane parameters", fArr2.length == 4);
        float f13 = fArr[0];
        float f14 = fArr3[0];
        float f15 = fArr2[0];
        float f16 = fArr[1];
        float f17 = fArr3[1];
        float f18 = fArr2[1];
        float f19 = fArr[2];
        float f23 = fArr3[2];
        float f24 = fArr2[2];
        float f25 = ((f19 - f23) * f24) + ((f16 - f17) * f18) + ((f13 - f14) * f15);
        float f26 = fArr4[0] - f14;
        float f27 = fArr4[1] - f17;
        float f28 = fArr4[2] - f23;
        float f29 = f25 / ((f24 * f28) + ((f18 * f27) + (f15 * f26)));
        return new float[]{(f26 * f29) + f14, (f27 * f29) + f17, (f28 * f29) + f23, 1.0f};
    }

    public static d7.f0 c(int i13, int i14, List list) {
        bf.b.h("inputWidth must be positive", i13 > 0);
        bf.b.h("inputHeight must be positive", i14 > 0);
        d7.f0 f0Var = new d7.f0(i13, i14);
        for (int i15 = 0; i15 < list.size(); i15++) {
            f0Var = ((m0) list.get(i15)).e(f0Var.f53821a, f0Var.f53822b);
        }
        return f0Var;
    }

    public static boolean d(float[] fArr, float[] fArr2) {
        bf.b.h("Expecting 4 plane parameters", fArr2.length == 4);
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    public static v2 e(float[] fArr, c1 c1Var) {
        pk.x0 x0Var = new pk.x0();
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            float[] fArr2 = new float[4];
            Matrix.multiplyMV(fArr2, 0, fArr, 0, (float[]) c1Var.get(i13), 0);
            float f13 = fArr2[0];
            float f14 = fArr2[3];
            fArr2[0] = f13 / f14;
            fArr2[1] = fArr2[1] / f14;
            fArr2[2] = fArr2[2] / f14;
            fArr2[3] = 1.0f;
            x0Var.g(fArr2);
        }
        return x0Var.i();
    }
}
