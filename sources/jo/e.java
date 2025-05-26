package jo;

import c2.n2;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final int[][][] f77133b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f77134c = Pattern.compile("^\\d{4,8}$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f77135d = Pattern.compile("^(\\d{1,4})([\\s/\\\\_.-])(\\d{1,2})\\2(\\d{1,4})$");

    static {
        int[][][] iArr = new int[9][][];
        f77133b = iArr;
        iArr[4] = new int[][]{new int[]{1, 2}, new int[]{2, 3}};
        iArr[5] = new int[][]{new int[]{1, 3}, new int[]{2, 3}};
        iArr[6] = new int[][]{new int[]{1, 2}, new int[]{2, 4}, new int[]{4, 5}};
        iArr[7] = new int[][]{new int[]{1, 3}, new int[]{2, 3}, new int[]{4, 5}, new int[]{4, 6}};
        iArr[8] = new int[][]{new int[]{2, 4}, new int[]{4, 6}};
    }

    public static n2 c(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        for (int i13 = 0; i13 < copyOf.length / 2; i13++) {
            int i14 = copyOf[i13];
            copyOf[i13] = copyOf[(copyOf.length - 1) - i13];
            copyOf[(copyOf.length - 1) - i13] = i14;
        }
        int[][] iArr2 = {iArr, copyOf};
        for (int i15 = 0; i15 < 2; i15++) {
            int[] iArr3 = iArr2[i15];
            int i16 = iArr3[0];
            int i17 = iArr3[1];
            if (1 <= i16 && i16 <= 31 && 1 <= i17 && i17 <= 12) {
                return new n2(i16, i17);
            }
        }
        return null;
    }

    public static d d(int[] iArr) {
        int i13;
        d dVar;
        if (iArr.length == 0 || 1 > (i13 = iArr[1]) || i13 > 31) {
            return null;
        }
        for (int i14 : iArr) {
            if ((99 < i14 && i14 < 1000) || i14 > 2050) {
                return null;
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 : iArr) {
            if (i18 > 31) {
                i15++;
            }
            if (i18 > 12) {
                i16++;
            }
            if (i18 <= 0) {
                i17++;
            }
        }
        if (i15 >= 2 || i16 == 3 || i17 >= 2) {
            return null;
        }
        int i19 = iArr[2];
        int i23 = iArr[0];
        int i24 = iArr[1];
        int[][] iArr2 = {new int[]{i19, i23, i24}, new int[]{i23, i24, i19}};
        int i25 = 0;
        while (true) {
            if (i25 >= 2) {
                break;
            }
            int[] iArr3 = iArr2[i25];
            int i26 = iArr3[0];
            if (1000 > i26 || i26 > 2050) {
                i25++;
            } else {
                n2 c13 = c(new int[]{iArr3[1], iArr3[2]});
                if (c13 != null) {
                    dVar = new d(c13.f25001a, c13.f25002b, i26);
                }
            }
        }
        dVar = null;
        if (dVar != null) {
            return dVar;
        }
        int i27 = iArr[2];
        int i28 = iArr[0];
        int i29 = iArr[1];
        int[][] iArr4 = {new int[]{i27, i28, i29}, new int[]{i28, i29, i27}};
        for (int i33 = 0; i33 < 2; i33++) {
            int[] iArr5 = iArr4[i33];
            n2 c14 = c(new int[]{iArr5[1], iArr5[2]});
            if (c14 != null) {
                int i34 = iArr5[0];
                if (i34 <= 99) {
                    i34 = i34 > 50 ? i34 + 1900 : i34 + 2000;
                }
                return new d(c14.f25001a, c14.f25002b, i34);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    @Override // jo.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(java.lang.CharSequence r17) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jo.e.a(java.lang.CharSequence):java.util.ArrayList");
    }
}
