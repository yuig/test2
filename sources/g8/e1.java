package g8;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f64238a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f64239b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f64240c;

    public e1(Random random) {
        this(new int[0], random);
    }

    public final e1 a(int i13, int i14) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int i15 = 0;
        while (true) {
            iArr = this.f64239b;
            random = this.f64238a;
            if (i15 >= i14) {
                break;
            }
            iArr2[i15] = random.nextInt(iArr.length + 1);
            int i16 = i15 + 1;
            int nextInt = random.nextInt(i16);
            iArr3[i15] = iArr3[nextInt];
            iArr3[nextInt] = i15 + i13;
            i15 = i16;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i14];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < iArr.length + i14; i19++) {
            if (i17 >= i14 || i18 != iArr2[i17]) {
                int i23 = i18 + 1;
                int i24 = iArr[i18];
                iArr4[i19] = i24;
                if (i24 >= i13) {
                    iArr4[i19] = i24 + i14;
                }
                i18 = i23;
            } else {
                iArr4[i19] = iArr3[i17];
                i17++;
            }
        }
        return new e1(iArr4, new Random(random.nextLong()));
    }

    public e1() {
        this(new Random());
    }

    public e1(int[] iArr, Random random) {
        this.f64239b = iArr;
        this.f64238a = random;
        this.f64240c = new int[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f64240c[iArr[i13]] = i13;
        }
    }
}
