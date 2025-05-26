package okhttp3;

import ep.b;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import t3.s1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MediaType;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MediaType {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f95651d = new Companion(0);

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f95652e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f95653f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f95654a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95655b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f95656c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001c\u0010\n\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005¨\u0006\r"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static MediaType a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = MediaType.f95652e.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(s1.b("No subtype found for: \"", str, '\"').toString());
            }
            String group = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
            Locale US = Locale.US;
            String l13 = b.l(US, "US", group, US, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.f95653f.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb3 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    sb3.append(substring);
                    sb3.append("\" for: \"");
                    throw new IllegalArgumentException(b.k(sb3, str, '\"').toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (z.p(group4, "'", false) && z.h(group4, "'", false) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            return new MediaType(str, l13, (String[]) arrayList.toArray(new String[0]));
        }

        public static MediaType b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public MediaType(String str, String str2, String[] strArr) {
        this.f95654a = str;
        this.f95655b = str2;
        this.f95656c = strArr;
    }

    public static final MediaType b(String str) {
        f95651d.getClass();
        return Companion.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r7) {
        /*
            r6 = this;
            java.lang.String r0 = "name"
            java.lang.String r1 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String[] r0 = r6.f95656c
            int r2 = r0.length
            int r2 = r2 + (-1)
            r3 = 0
            r4 = 2
            int r2 = ue.c.u(r3, r2, r4)
            if (r2 < 0) goto L26
        L14:
            r4 = r0[r3]
            r5 = 1
            boolean r4 = kotlin.text.z.i(r4, r1, r5)
            if (r4 == 0) goto L21
            int r3 = r3 + r5
            r0 = r0[r3]
            goto L27
        L21:
            if (r3 == r2) goto L26
            int r3 = r3 + 2
            goto L14
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L2a
            return r7
        L2a:
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L2e
        L2e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MediaType.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.d(((MediaType) obj).f95654a, this.f95654a);
    }

    public final int hashCode() {
        return this.f95654a.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public final String getF95654a() {
        return this.f95654a;
    }
}
