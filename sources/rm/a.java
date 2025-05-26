package rm;

import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f108680a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i13, char c13) {
        return i13 < str.length() && str.charAt(i13) == c13;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i13, int i14, String str) {
        int i15;
        int i16;
        if (i13 < 0 || i14 > str.length() || i13 > i14) {
            throw new NumberFormatException(str);
        }
        if (i13 < i14) {
            i16 = i13 + 1;
            int digit = Character.digit(str.charAt(i13), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i13, i14));
            }
            i15 = -digit;
        } else {
            i15 = 0;
            i16 = i13;
        }
        while (i16 < i14) {
            int i17 = i16 + 1;
            int digit2 = Character.digit(str.charAt(i16), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i13, i14));
            }
            i15 = (i15 * 10) - digit2;
            i16 = i17;
        }
        return -i15;
    }
}
