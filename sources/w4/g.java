package w4;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import kh2.c3;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public t4.g f127928a;

    /* renamed from: b, reason: collision with root package name */
    public String f127929b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f127930c = new ArrayList();

    public static g c(String str) {
        if (str.startsWith("CUSTOM")) {
            d dVar = new d();
            dVar.f127926d = new float[1];
            return dVar;
        }
        switch (str) {
            case "rotationX":
                return new c(3);
            case "rotationY":
                return new c(4);
            case "translationX":
                return new c(7);
            case "translationY":
                return new c(8);
            case "translationZ":
                return new c(9);
            case "progress":
                f fVar = new f();
                fVar.f127927d = false;
                return fVar;
            case "scaleX":
                return new c(5);
            case "scaleY":
                return new c(6);
            case "waveVariesBy":
                return new c(0);
            case "rotation":
                return new c(2);
            case "elevation":
                return new c(1);
            case "transitionPathRotate":
                return new e();
            case "alpha":
                return new c(0);
            case "waveOffset":
                return new c(0);
            default:
                return null;
        }
    }

    public final float a(float f13) {
        t4.g gVar = this.f127928a;
        c3 c3Var = gVar.f116361g;
        if (c3Var != null) {
            c3Var.G(f13, gVar.f116362h);
        } else {
            double[] dArr = gVar.f116362h;
            dArr[0] = gVar.f116359e[0];
            dArr[1] = gVar.f116360f[0];
            dArr[2] = gVar.f116356b[0];
        }
        double[] dArr2 = gVar.f116362h;
        return (float) ((gVar.f116355a.c(f13, dArr2[1]) * gVar.f116362h[2]) + dArr2[0]);
    }

    public final float b(float f13) {
        double d2;
        double d13;
        double signum;
        double d14;
        t4.g gVar = this.f127928a;
        c3 c3Var = gVar.f116361g;
        double d15 = 0.0d;
        if (c3Var != null) {
            double d16 = f13;
            c3Var.J(d16, gVar.f116363i);
            gVar.f116361g.G(d16, gVar.f116362h);
        } else {
            double[] dArr = gVar.f116363i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d17 = f13;
        double d18 = gVar.f116362h[1];
        t4.j jVar = gVar.f116355a;
        double c13 = jVar.c(d17, d18);
        double d19 = gVar.f116362h[1];
        double d23 = gVar.f116363i[1];
        double b13 = jVar.b(d17) + d19;
        if (d17 <= 0.0d) {
            d17 = 1.0E-5d;
        } else if (d17 >= 1.0d) {
            d17 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(jVar.f116372b, d17);
        if (binarySearch <= 0) {
            if (binarySearch != 0) {
                int i13 = -binarySearch;
                int i14 = i13 - 1;
                float[] fArr = jVar.f116371a;
                float f14 = fArr[i14];
                int i15 = i13 - 2;
                float f15 = fArr[i15];
                double d24 = f14 - f15;
                double[] dArr2 = jVar.f116372b;
                double d25 = dArr2[i14];
                double d26 = dArr2[i15];
                double d27 = d24 / (d25 - d26);
                d15 = (f15 - (d27 * d26)) + (d17 * d27);
            } else {
                d15 = 0.0d;
            }
        }
        double d28 = d15 + d23;
        double d29 = 2.0d;
        switch (jVar.f116374d) {
            case 1:
                d2 = 0.0d;
                double[] dArr3 = gVar.f116363i;
                return (float) ((d2 * gVar.f116362h[2]) + (c13 * dArr3[2]) + dArr3[0]);
            case 2:
                d13 = d28 * 4.0d;
                signum = Math.signum((((b13 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                d2 = d13 * signum;
                double[] dArr32 = gVar.f116363i;
                return (float) ((d2 * gVar.f116362h[2]) + (c13 * dArr32[2]) + dArr32[0]);
            case 3:
                d2 = d28 * 2.0d;
                double[] dArr322 = gVar.f116363i;
                return (float) ((d2 * gVar.f116362h[2]) + (c13 * dArr322[2]) + dArr322[0]);
            case 4:
                d14 = -d28;
                d2 = d14 * d29;
                double[] dArr3222 = gVar.f116363i;
                return (float) ((d2 * gVar.f116362h[2]) + (c13 * dArr3222[2]) + dArr3222[0]);
            case 5:
                d29 = (-6.283185307179586d) * d28;
                d14 = Math.sin(6.283185307179586d * b13);
                d2 = d14 * d29;
                double[] dArr32222 = gVar.f116363i;
                return (float) ((d2 * gVar.f116362h[2]) + (c13 * dArr32222[2]) + dArr32222[0]);
            case 6:
                d13 = d28 * 4.0d;
                signum = (((b13 * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                d2 = d13 * signum;
                double[] dArr322222 = gVar.f116363i;
                return (float) ((d2 * gVar.f116362h[2]) + (c13 * dArr322222[2]) + dArr322222[0]);
            case 7:
                throw null;
            default:
                d13 = d28 * 6.283185307179586d;
                signum = Math.cos(6.283185307179586d * b13);
                d2 = d13 * signum;
                double[] dArr3222222 = gVar.f116363i;
                return (float) ((d2 * gVar.f116362h[2]) + (c13 * dArr3222222[2]) + dArr3222222[0]);
        }
    }

    public abstract void d(View view, float f13);

    public final void e() {
        int i13;
        int size = this.f127930c.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f127930c, new s4.g(this, 1));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        t4.g gVar = new t4.g();
        t4.j jVar = new t4.j();
        jVar.f116371a = new float[0];
        jVar.f116372b = new double[0];
        gVar.f116355a = jVar;
        jVar.f116374d = 0;
        gVar.f116356b = new float[size];
        gVar.f116357c = new double[size];
        gVar.f116358d = new float[size];
        gVar.f116359e = new float[size];
        gVar.f116360f = new float[size];
        float[] fArr = new float[size];
        this.f127928a = gVar;
        Iterator it = this.f127930c.iterator();
        if (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
        t4.g gVar2 = this.f127928a;
        double[] dArr3 = gVar2.f116357c;
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, dArr3.length, 3);
        float[] fArr2 = gVar2.f116356b;
        gVar2.f116362h = new double[fArr2.length + 2];
        gVar2.f116363i = new double[fArr2.length + 2];
        double d2 = dArr3[0];
        float[] fArr3 = gVar2.f116358d;
        t4.j jVar2 = gVar2.f116355a;
        if (d2 > 0.0d) {
            jVar2.a(0.0d, fArr3[0]);
        }
        int length = dArr3.length - 1;
        if (dArr3[length] < 1.0d) {
            jVar2.a(1.0d, fArr3[length]);
        }
        int i14 = 0;
        while (i14 < dArr4.length) {
            double[] dArr5 = dArr4[i14];
            float[] fArr4 = fArr3;
            dArr5[0] = gVar2.f116359e[i14];
            dArr5[1] = gVar2.f116360f[i14];
            dArr5[2] = fArr2[i14];
            jVar2.a(dArr3[i14], fArr4[i14]);
            i14++;
            fArr3 = fArr4;
        }
        int i15 = 0;
        double d13 = 0.0d;
        while (true) {
            if (i15 >= jVar2.f116371a.length) {
                break;
            }
            d13 += r12[i15];
            i15++;
        }
        int i16 = 1;
        double d14 = 0.0d;
        while (true) {
            float[] fArr5 = jVar2.f116371a;
            if (i16 >= fArr5.length) {
                break;
            }
            int i17 = i16 - 1;
            float f13 = (fArr5[i17] + fArr5[i16]) / 2.0f;
            double[] dArr6 = jVar2.f116372b;
            d14 = ((dArr6[i16] - dArr6[i17]) * f13) + d14;
            i16++;
            d13 = d13;
        }
        double d15 = d13;
        int i18 = 0;
        while (true) {
            float[] fArr6 = jVar2.f116371a;
            if (i18 >= fArr6.length) {
                break;
            }
            fArr6[i18] = (float) ((d15 / d14) * fArr6[i18]);
            i18++;
        }
        jVar2.f116373c[0] = 0.0d;
        int i19 = 1;
        while (true) {
            float[] fArr7 = jVar2.f116371a;
            if (i19 >= fArr7.length) {
                break;
            }
            int i23 = i19 - 1;
            float f14 = (fArr7[i23] + fArr7[i19]) / 2.0f;
            double[] dArr7 = jVar2.f116372b;
            double d16 = dArr7[i19] - dArr7[i23];
            double[] dArr8 = jVar2.f116373c;
            dArr8[i19] = (d16 * f14) + dArr8[i23];
            i19++;
        }
        if (dArr3.length > 1) {
            i13 = 0;
            gVar2.f116361g = c3.x(0, dArr3, dArr4);
        } else {
            i13 = 0;
            gVar2.f116361g = null;
        }
        c3.x(i13, dArr, dArr2);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String str = this.f127929b;
        new DecimalFormat("##.##");
        Iterator it = this.f127930c.iterator();
        if (!it.hasNext()) {
            return str;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("[0 , ");
        throw null;
    }
}
