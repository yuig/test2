package an;

import kh2.w;

/* loaded from: classes3.dex */
public final class b extends w {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f15609a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f15610b = {'T', 'N', '*', 'E'};

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f15611c = {'/', ':', '+', '.'};

    /* renamed from: d, reason: collision with root package name */
    public static final char f15612d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f15609a = cArr;
        f15612d = cArr[0];
    }

    @Override // kh2.w
    public final boolean[] y(String str) {
        int i13;
        int length = str.length();
        char c13 = f15612d;
        if (length < 2) {
            str = c13 + str + c13;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f15609a;
            boolean r03 = a.r0(upperCase, cArr);
            boolean r04 = a.r0(upperCase2, cArr);
            char[] cArr2 = f15610b;
            boolean r05 = a.r0(upperCase, cArr2);
            boolean r06 = a.r0(upperCase2, cArr2);
            if (r03) {
                if (!r04) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!r05) {
                if (r04 || r06) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c13 + str + c13;
            } else if (!r06) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i14 = 20;
        for (int i15 = 1; i15 < str.length() - 1; i15++) {
            if (Character.isDigit(str.charAt(i15)) || str.charAt(i15) == '-' || str.charAt(i15) == '$') {
                i14 += 9;
            } else {
                if (!a.r0(str.charAt(i15), f15611c)) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i15) + '\'');
                }
                i14 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i14];
        int i16 = 0;
        for (int i17 = 0; i17 < str.length(); i17++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i17));
            if (i17 == 0 || i17 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i18 = 0;
            while (true) {
                char[] cArr3 = a.f15607b;
                if (i18 >= cArr3.length) {
                    i13 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i18]) {
                    i13 = a.f15608c[i18];
                    break;
                }
                i18++;
            }
            int i19 = 0;
            int i23 = 0;
            boolean z13 = true;
            while (i19 < 7) {
                zArr[i16] = z13;
                i16++;
                if (((i13 >> (6 - i19)) & 1) == 0 || i23 == 1) {
                    z13 = !z13;
                    i19++;
                    i23 = 0;
                } else {
                    i23++;
                }
            }
            if (i17 < str.length() - 1) {
                zArr[i16] = false;
                i16++;
            }
        }
        return zArr;
    }
}
