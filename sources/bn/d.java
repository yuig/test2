package bn;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f23553a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23554b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f23555c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f23556d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f23557e;

    static {
        int i13 = 0;
        byte[] bArr = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        f23555c = bArr;
        f23556d = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        f23557e = StandardCharsets.ISO_8859_1;
        Arrays.fill(bArr, (byte) -1);
        int i14 = 0;
        while (true) {
            byte[] bArr2 = f23553a;
            if (i14 >= bArr2.length) {
                break;
            }
            byte b13 = bArr2[i14];
            if (b13 > 0) {
                f23555c[b13] = (byte) i14;
            }
            i14++;
        }
        Arrays.fill(f23556d, (byte) -1);
        while (true) {
            byte[] bArr3 = f23554b;
            if (i13 >= bArr3.length) {
                return;
            }
            byte b14 = bArr3[i13];
            if (b14 > 0) {
                f23556d[b14] = (byte) i13;
            }
            i13++;
        }
    }

    public static void a(byte[] bArr, int i13, int i14, StringBuilder sb3) {
        if (i13 == 1 && i14 == 0) {
            sb3.append((char) 913);
        } else if (i13 % 6 == 0) {
            sb3.append((char) 924);
        } else {
            sb3.append((char) 901);
        }
        int i15 = 0;
        if (i13 >= 6) {
            char[] cArr = new char[5];
            int i16 = 0;
            while (i13 - i16 >= 6) {
                long j13 = 0;
                for (int i17 = 0; i17 < 6; i17++) {
                    j13 = (j13 << 8) + (bArr[i16 + i17] & 255);
                }
                for (int i18 = 0; i18 < 5; i18++) {
                    cArr[i18] = (char) (j13 % 900);
                    j13 /= 900;
                }
                for (int i19 = 4; i19 >= 0; i19--) {
                    sb3.append(cArr[i19]);
                }
                i16 += 6;
            }
            i15 = i16;
        }
        while (i15 < i13) {
            sb3.append((char) (bArr[i15] & 255));
            i15++;
        }
    }

    public static void b(int i13, int i14, String str, StringBuilder sb3) {
        StringBuilder sb4 = new StringBuilder((i14 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i15 = 0;
        while (i15 < i14) {
            sb4.setLength(0);
            int min = Math.min(44, i14 - i15);
            StringBuilder sb5 = new StringBuilder(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
            int i16 = i13 + i15;
            sb5.append(str.substring(i16, i16 + min));
            BigInteger bigInteger = new BigInteger(sb5.toString());
            do {
                sb4.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb4.length() - 1; length >= 0; length--) {
                sb3.append(sb4.charAt(length));
            }
            i15 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4 A[EDGE_INSN: B:21:0x00e4->B:22:0x00e4 BREAK  A[LOOP:0: B:2:0x000e->B:16:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.lang.CharSequence r17, int r18, int r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.d.c(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static boolean d(char c13) {
        if (c13 != ' ') {
            return c13 >= 'a' && c13 <= 'z';
        }
        return true;
    }

    public static boolean e(char c13) {
        if (c13 != ' ') {
            return c13 >= 'A' && c13 <= 'Z';
        }
        return true;
    }
}
