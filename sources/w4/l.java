package w4;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import kh2.c3;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public c3 f127935a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f127936b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    public float[] f127937c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    public int f127938d;

    /* renamed from: e, reason: collision with root package name */
    public String f127939e;

    public final float a(float f13) {
        return (float) this.f127935a.F(f13);
    }

    public void b(int i13, float f13) {
        int[] iArr = this.f127936b;
        if (iArr.length < this.f127938d + 1) {
            this.f127936b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f127937c;
            this.f127937c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f127936b;
        int i14 = this.f127938d;
        iArr2[i14] = i13;
        this.f127937c[i14] = f13;
        this.f127938d = i14 + 1;
    }

    public abstract void c(View view, float f13);

    public void d(int i13) {
        int i14;
        int i15 = this.f127938d;
        if (i15 == 0) {
            return;
        }
        int[] iArr = this.f127936b;
        float[] fArr = this.f127937c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i15 - 1;
        iArr2[1] = 0;
        int i16 = 2;
        while (i16 > 0) {
            int i17 = i16 - 1;
            int i18 = iArr2[i17];
            int i19 = i16 - 2;
            int i23 = iArr2[i19];
            if (i18 < i23) {
                int i24 = iArr[i23];
                int i25 = i18;
                int i26 = i25;
                while (i25 < i23) {
                    int i27 = iArr[i25];
                    if (i27 <= i24) {
                        int i28 = iArr[i26];
                        iArr[i26] = i27;
                        iArr[i25] = i28;
                        float f13 = fArr[i26];
                        fArr[i26] = fArr[i25];
                        fArr[i25] = f13;
                        i26++;
                    }
                    i25++;
                }
                int i29 = iArr[i26];
                iArr[i26] = iArr[i23];
                iArr[i23] = i29;
                float f14 = fArr[i26];
                fArr[i26] = fArr[i23];
                fArr[i23] = f14;
                iArr2[i19] = i26 - 1;
                iArr2[i17] = i18;
                int i33 = i16 + 1;
                iArr2[i16] = i23;
                i16 += 2;
                iArr2[i33] = i26 + 1;
            } else {
                i16 = i19;
            }
        }
        int i34 = 1;
        for (int i35 = 1; i35 < this.f127938d; i35++) {
            int[] iArr3 = this.f127936b;
            if (iArr3[i35 - 1] != iArr3[i35]) {
                i34++;
            }
        }
        double[] dArr = new double[i34];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i34, 1);
        int i36 = 0;
        for (0; i14 < this.f127938d; i14 + 1) {
            if (i14 > 0) {
                int[] iArr4 = this.f127936b;
                i14 = iArr4[i14] == iArr4[i14 - 1] ? i14 + 1 : 0;
            }
            dArr[i36] = this.f127936b[i14] * 0.01d;
            dArr2[i36][0] = this.f127937c[i14];
            i36++;
        }
        this.f127935a = c3.x(i13, dArr, dArr2);
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String str = this.f127939e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i13 = 0; i13 < this.f127938d; i13++) {
            StringBuilder D = ep.b.D(str, "[");
            D.append(this.f127936b[i13]);
            D.append(" , ");
            D.append(decimalFormat.format(this.f127937c[i13]));
            D.append("] ");
            str = D.toString();
        }
        return str;
    }
}
