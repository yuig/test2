package an;

import a.cb;
import com.google.zxing.FormatException;
import java.util.Map;
import kh2.w;

/* loaded from: classes3.dex */
public final class h extends k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15619a;

    public h(int i13) {
        this.f15619a = i13;
    }

    @Override // kh2.w, vm.d
    public final xm.b A(String str, vm.a aVar, int i13, int i14, Map map) {
        switch (this.f15619a) {
            case 0:
                if (aVar == vm.a.EAN_13) {
                    return super.A(str, aVar, i13, i14, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
            case 1:
                if (aVar == vm.a.EAN_8) {
                    return super.A(str, aVar, i13, i14, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
            default:
                if (aVar == vm.a.UPC_E) {
                    return super.A(str, aVar, i13, i14, map);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
        }
    }

    @Override // kh2.w
    public final boolean[] y(String str) {
        switch (this.f15619a) {
            case 0:
                int length = str.length();
                if (length == 12) {
                    try {
                        str = cb.i(str, j.s0(str));
                    } catch (FormatException e13) {
                        throw new IllegalArgumentException(e13);
                    }
                } else {
                    if (length != 13) {
                        throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    try {
                        if (!j.r0(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int i13 = g.f15617g[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int r13 = w.r(zArr, 0, j.f15623b, true);
                for (int i14 = 1; i14 <= 6; i14++) {
                    int digit = Character.digit(str.charAt(i14), 10);
                    if (((i13 >> (6 - i14)) & 1) == 1) {
                        digit += 10;
                    }
                    r13 += w.r(zArr, r13, j.f15627f[digit], false);
                }
                int r14 = w.r(zArr, r13, j.f15624c, false) + r13;
                for (int i15 = 7; i15 <= 12; i15++) {
                    r14 += w.r(zArr, r14, j.f15626e[Character.digit(str.charAt(i15), 10)], true);
                }
                w.r(zArr, r14, j.f15623b, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 == 7) {
                    try {
                        str = cb.i(str, j.s0(str));
                    } catch (FormatException e14) {
                        throw new IllegalArgumentException(e14);
                    }
                } else {
                    if (length2 != 8) {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    try {
                        if (!j.r0(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused2) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int r15 = w.r(zArr2, 0, j.f15623b, true);
                for (int i16 = 0; i16 <= 3; i16++) {
                    r15 += w.r(zArr2, r15, j.f15626e[Character.digit(str.charAt(i16), 10)], false);
                }
                int r16 = w.r(zArr2, r15, j.f15624c, false) + r15;
                for (int i17 = 4; i17 <= 7; i17++) {
                    r16 += w.r(zArr2, r16, j.f15626e[Character.digit(str.charAt(i17), 10)], true);
                }
                w.r(zArr2, r16, j.f15623b, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 == 7) {
                    try {
                        str = cb.i(str, j.s0(g.t0(str)));
                    } catch (FormatException e15) {
                        throw new IllegalArgumentException(e15);
                    }
                } else {
                    if (length3 != 8) {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    try {
                        if (!j.r0(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused3) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int digit2 = Character.digit(str.charAt(0), 10);
                if (digit2 != 0 && digit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i18 = g.f15618h[digit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int r17 = w.r(zArr3, 0, j.f15623b, true);
                for (int i19 = 1; i19 <= 6; i19++) {
                    int digit3 = Character.digit(str.charAt(i19), 10);
                    if (((i18 >> (6 - i19)) & 1) == 1) {
                        digit3 += 10;
                    }
                    r17 += w.r(zArr3, r17, j.f15627f[digit3], false);
                }
                w.r(zArr3, r17, j.f15625d, false);
                return zArr3;
        }
    }
}
