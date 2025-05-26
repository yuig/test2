package an;

import java.util.Map;
import kh2.w;

/* loaded from: classes3.dex */
public final class e extends w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15615a;

    public /* synthetic */ e(int i13) {
        this.f15615a = i13;
    }

    public static void E0(boolean[] zArr, int i13, int[] iArr) {
        int length = iArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = i13 + 1;
            zArr[i13] = iArr[i14] != 0;
            i14++;
            i13 = i15;
        }
    }

    public static int F0(int i13, String str) {
        int i14 = 0;
        int i15 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i14 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i15;
            i15++;
            if (i15 > i13) {
                i15 = 1;
            }
        }
        return i14 % 47;
    }

    public static d G0(int i13, CharSequence charSequence) {
        int length = charSequence.length();
        if (i13 >= length) {
            return d.UNCODABLE;
        }
        char charAt = charSequence.charAt(i13);
        if (charAt == 241) {
            return d.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return d.UNCODABLE;
        }
        int i14 = i13 + 1;
        if (i14 >= length) {
            return d.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i14);
        return (charAt2 < '0' || charAt2 > '9') ? d.ONE_DIGIT : d.TWO_DIGITS;
    }

    public static void H0(int[] iArr, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            int i15 = 1;
            if (((1 << (8 - i14)) & i13) != 0) {
                i15 = 2;
            }
            iArr[i14] = i15;
        }
    }

    public static void I0(int[] iArr, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            int i15 = 1;
            if (((1 << (8 - i14)) & i13) == 0) {
                i15 = 0;
            }
            iArr[i14] = i15;
        }
    }

    @Override // kh2.w, vm.d
    public final xm.b A(String str, vm.a aVar, int i13, int i14, Map map) {
        switch (this.f15615a) {
            case 0:
                if (aVar == vm.a.CODE_128) {
                    return super.A(str, aVar, i13, i14, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
            case 1:
                if (aVar == vm.a.CODE_39) {
                    return super.A(str, aVar, i13, i14, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
            default:
                if (aVar == vm.a.CODE_93) {
                    return super.A(str, aVar, i13, i14, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x026e, code lost:
    
        if (r12 < '`') goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02a1, code lost:
    
        if (G0(r4 + 3, r1) == an.d.TWO_DIGITS) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02a3, code lost:
    
        r11 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02b5, code lost:
    
        if (r12 == an.d.ONE_DIGIT) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02c4, code lost:
    
        if (r13 == an.d.TWO_DIGITS) goto L137;
     */
    @Override // kh2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean[] y(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: an.e.y(java.lang.String):boolean[]");
    }
}
