package wm;

import com.google.android.gms.internal.measurement.x;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f130218a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(xm.b bVar, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15 += 2) {
            int i16 = i13 - i15;
            int i17 = i16;
            while (true) {
                int i18 = i13 + i15;
                if (i17 <= i18) {
                    bVar.b(i17, i16);
                    bVar.b(i17, i18);
                    bVar.b(i16, i17);
                    bVar.b(i18, i17);
                    i17++;
                }
            }
        }
        int i19 = i13 - i14;
        bVar.b(i19, i19);
        int i23 = i19 + 1;
        bVar.b(i23, i19);
        bVar.b(i19, i23);
        int i24 = i13 + i14;
        bVar.b(i24, i19);
        bVar.b(i24, i23);
        bVar.b(i24, i24 - 1);
    }

    public static xm.a b(xm.a aVar, int i13, int i14) {
        ym.a aVar2;
        int i15 = aVar.f135344b / i14;
        if (i14 == 4) {
            aVar2 = ym.a.f139386j;
        } else if (i14 == 6) {
            aVar2 = ym.a.f139385i;
        } else if (i14 == 8) {
            aVar2 = ym.a.f139388l;
        } else if (i14 == 10) {
            aVar2 = ym.a.f139384h;
        } else {
            if (i14 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i14)));
            }
            aVar2 = ym.a.f139383g;
        }
        x xVar = new x(aVar2);
        int i16 = i13 / i14;
        int[] iArr = new int[i16];
        int i17 = aVar.f135344b / i14;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = 0;
            for (int i23 = 0; i23 < i14; i23++) {
                i19 |= aVar.g((i18 * i14) + i23) ? 1 << ((i14 - i23) - 1) : 0;
            }
            iArr[i18] = i19;
        }
        xVar.m(iArr, i16 - i15);
        xm.a aVar3 = new xm.a();
        aVar3.b(0, i13 % i14);
        for (int i24 = 0; i24 < i16; i24++) {
            aVar3.b(iArr[i24], i14);
        }
        return aVar3;
    }

    public static xm.a c(int i13, xm.a aVar) {
        xm.a aVar2 = new xm.a();
        int i14 = aVar.f135344b;
        int i15 = (1 << i13) - 2;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                int i19 = i16 + i18;
                if (i19 >= i14 || aVar.g(i19)) {
                    i17 |= 1 << ((i13 - 1) - i18);
                }
            }
            int i23 = i17 & i15;
            if (i23 == i15) {
                aVar2.b(i23, i13);
            } else if (i23 == 0) {
                aVar2.b(i17 | 1, i13);
            } else {
                aVar2.b(i17, i13);
                i16 += i13;
            }
            i16--;
            i16 += i13;
        }
        return aVar2;
    }
}
