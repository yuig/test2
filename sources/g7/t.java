package g7;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f63837a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f63838b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j13, long j14) {
        if (j13 == 0 && j14 == -1) {
            return null;
        }
        StringBuilder u13 = a.a.u("bytes=", j13, "-");
        if (j14 != -1) {
            u13.append((j13 + j14) - 1);
        }
        return u13.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "]"
            java.lang.String r3 = "HttpUtil"
            if (r1 != 0) goto L25
            long r4 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L11
            goto L27
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            d7.u.c(r3, r1)
        L25:
            r4 = -1
        L27:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L94
            java.util.regex.Pattern r1 = g7.t.f63837a
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r6 = r1.matches()
            if (r6 == 0) goto L94
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L80
            r6.getClass()     // Catch: java.lang.NumberFormatException -> L80
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L80
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L80
            r1.getClass()     // Catch: java.lang.NumberFormatException -> L80
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L80
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L5d
            r4 = r6
            goto L94
        L5d:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L80
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r10 = "] ["
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r11)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r10 = r1.toString()     // Catch: java.lang.NumberFormatException -> L80
            d7.u.g(r3, r10)     // Catch: java.lang.NumberFormatException -> L80
            long r4 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L80
            goto L94
        L80:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected Content-Range ["
            r10.<init>(r0)
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            d7.u.c(r3, r10)
        L94:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.t.b(java.lang.String, java.lang.String):long");
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f63838b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
