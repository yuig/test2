package okhttp3.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import t3.s1;
import wo2.j;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HostnamesKt {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress a(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.a(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final String b(byte[] bArr) {
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < bArr.length) {
            int i17 = i15;
            while (i17 < 16 && bArr[i17] == 0 && bArr[i17 + 1] == 0) {
                i17 += 2;
            }
            int i18 = i17 - i15;
            if (i18 > i16 && i18 >= 4) {
                i13 = i15;
                i16 = i18;
            }
            i15 = i17 + 2;
        }
        j jVar = new j();
        while (i14 < bArr.length) {
            if (i14 == i13) {
                jVar.a0(58);
                i14 += i16;
                if (i14 == 16) {
                    jVar.a0(58);
                }
            } else {
                if (i14 > 0) {
                    jVar.a0(58);
                }
                byte b13 = bArr[i14];
                byte[] bArr2 = Util.f95757a;
                jVar.d0(((b13 & 255) << 8) | (bArr[i14 + 1] & 255));
                i14 += 2;
            }
        }
        return jVar.M();
    }

    public static final String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.E(str, ":", false)) {
            InetAddress a13 = (z.p(str, "[", false) && z.h(str, "]", false)) ? a(1, str.length() - 1, str) : a(0, str.length(), str);
            if (a13 == null) {
                return null;
            }
            byte[] address = a13.getAddress();
            if (address.length == 16) {
                Intrinsics.checkNotNullExpressionValue(address, "address");
                return b(address);
            }
            if (address.length == 4) {
                return a13.getHostAddress();
            }
            throw new AssertionError(s1.b("Invalid IPv6 address: '", str, '\''));
        }
        try {
            String ascii = IDN.toASCII(str);
            Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                return null;
            }
            int length = lowerCase.length();
            for (int i13 = 0; i13 < length; i13++) {
                char charAt = lowerCase.charAt(i13);
                if (Intrinsics.i(charAt, 31) <= 0 || Intrinsics.i(charAt, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) >= 0 || StringsKt.K(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                    return null;
                }
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
