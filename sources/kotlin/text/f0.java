package kotlin.text;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class f0 {
    public static final String a(char c13) {
        String valueOf = String.valueOf(c13);
        Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c13));
        }
        if (c13 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        String substring = upperCase.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte b(java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            xk2.b0 r0 = d(r3)
            r1 = 0
            if (r0 == 0) goto L1c
            r2 = 255(0xff, float:3.57E-43)
            int r0 = r0.f135201a
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L1e
        L1c:
            r2 = r1
            goto L24
        L1e:
            byte r0 = (byte) r0
            xk2.y r2 = new xk2.y
            r2.<init>(r0)
        L24:
            if (r2 == 0) goto L29
            byte r3 = r2.f135238a
            return r3
        L29:
            kotlin.text.StringsKt__StringNumberConversionsKt.f(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.f0.b(java.lang.String):byte");
    }

    public static final int c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        xk2.b0 d2 = d(str);
        if (d2 != null) {
            return d2.f135201a;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    public static final xk2.b0 d(String str) {
        int i13;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.i(charAt, 48) < 0) {
            i13 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i13 = 0;
        }
        xk2.a0 a0Var = xk2.b0.f135200b;
        int i15 = 119304647;
        while (i13 < length) {
            int digit = Character.digit((int) str.charAt(i13), 10);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i14, i15) > 0) {
                if (i15 == 119304647) {
                    i15 = Integer.divideUnsigned(-1, 10);
                    if (Integer.compareUnsigned(i14, i15) > 0) {
                    }
                }
                return null;
            }
            int i16 = i14 * 10;
            int i17 = digit + i16;
            if (Integer.compareUnsigned(i17, i16) < 0) {
                return null;
            }
            i13++;
            i14 = i17;
        }
        return new xk2.b0(i14);
    }

    public static final long e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        xk2.e0 f13 = f(str);
        if (f13 != null) {
            return f13.f135208a;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    public static final xk2.e0 f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.i(charAt, 48) < 0) {
            i13 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j13 = 10;
        xk2.d0 d0Var = xk2.e0.f135207b;
        long j14 = 0;
        long j15 = 512409557603043100L;
        while (i13 < length) {
            int digit = Character.digit((int) str.charAt(i13), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j14, j15) > 0) {
                if (j15 != 512409557603043100L) {
                    return null;
                }
                j15 = Long.divideUnsigned(-1L, j13);
                if (Long.compareUnsigned(j14, j15) > 0) {
                    return null;
                }
            }
            long j16 = j14 * j13;
            xk2.a0 a0Var = xk2.b0.f135200b;
            long j17 = (digit & 4294967295L) + j16;
            if (Long.compareUnsigned(j17, j16) < 0) {
                return null;
            }
            i13++;
            j14 = j17;
        }
        return new xk2.e0(j14);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final short g(java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            xk2.b0 r0 = d(r3)
            r1 = 0
            if (r0 == 0) goto L1d
            r2 = 65535(0xffff, float:9.1834E-41)
            int r0 = r0.f135201a
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L1f
        L1d:
            r2 = r1
            goto L25
        L1f:
            short r0 = (short) r0
            xk2.i0 r2 = new xk2.i0
            r2.<init>(r0)
        L25:
            if (r2 == 0) goto L2a
            short r3 = r2.f135213a
            return r3
        L2a:
            kotlin.text.StringsKt__StringNumberConversionsKt.f(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.f0.g(java.lang.String):short");
    }
}
