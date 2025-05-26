package okhttp3;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import ql2.s;
import wo2.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/HttpUrl;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HttpUrl {

    /* renamed from: k, reason: collision with root package name */
    public static final Companion f95629k = new Companion(0);

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f95630l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f95631a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95632b;

    /* renamed from: c, reason: collision with root package name */
    public final String f95633c;

    /* renamed from: d, reason: collision with root package name */
    public final String f95634d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95635e;

    /* renamed from: f, reason: collision with root package name */
    public final List f95636f;

    /* renamed from: g, reason: collision with root package name */
    public final List f95637g;

    /* renamed from: h, reason: collision with root package name */
    public final String f95638h;

    /* renamed from: i, reason: collision with root package name */
    public final String f95639i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f95640j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: i, reason: collision with root package name */
        public static final Companion f95641i = new Companion(0);

        /* renamed from: a, reason: collision with root package name */
        public String f95642a;

        /* renamed from: d, reason: collision with root package name */
        public String f95645d;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f95647f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f95648g;

        /* renamed from: h, reason: collision with root package name */
        public String f95649h;

        /* renamed from: b, reason: collision with root package name */
        public String f95643b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f95644c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f95646e = -1;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i13) {
                this();
            }

            public static final int a(Companion companion, String str, int i13, int i14) {
                companion.getClass();
                try {
                    int parseInt = Integer.parseInt(Companion.b(HttpUrl.f95629k, str, i13, i14, "", false, false, false, false, null, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f95647f = arrayList;
            arrayList.add("");
        }

        public final void a(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f95648g == null) {
                this.f95648g = new ArrayList();
            }
            ArrayList arrayList = this.f95648g;
            Intrinsics.f(arrayList);
            Companion companion = HttpUrl.f95629k;
            arrayList.add(Companion.b(companion, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER));
            ArrayList arrayList2 = this.f95648g;
            Intrinsics.f(arrayList2);
            arrayList2.add(str != null ? Companion.b(companion, str, 0, 0, " \"'<>#&=", true, false, true, false, null, RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER) : null);
        }

        public final void b(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f95648g == null) {
                this.f95648g = new ArrayList();
            }
            ArrayList arrayList = this.f95648g;
            Intrinsics.f(arrayList);
            Companion companion = HttpUrl.f95629k;
            arrayList.add(Companion.b(companion, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION));
            ArrayList arrayList2 = this.f95648g;
            Intrinsics.f(arrayList2);
            arrayList2.add(str != null ? Companion.b(companion, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION) : null);
        }

        public final HttpUrl c() {
            int c13;
            ArrayList arrayList;
            String str = this.f95642a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.f95629k;
            String g13 = Companion.g(companion, this.f95643b, 0, 0, false, 7);
            String g14 = Companion.g(companion, this.f95644c, 0, 0, false, 7);
            String str2 = this.f95645d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i13 = this.f95646e;
            if (i13 != -1) {
                c13 = i13;
            } else {
                String str3 = this.f95642a;
                Intrinsics.f(str3);
                companion.getClass();
                c13 = Companion.c(str3);
            }
            ArrayList arrayList2 = this.f95647f;
            ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Companion.g(HttpUrl.f95629k, (String) it.next(), 0, 0, false, 7));
            }
            ArrayList<String> arrayList4 = this.f95648g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(g0.q(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 != null ? Companion.g(HttpUrl.f95629k, str4, 0, 0, true, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.f95649h;
            return new HttpUrl(str, g13, g14, str2, c13, arrayList3, arrayList, str5 != null ? Companion.g(HttpUrl.f95629k, str5, 0, 0, false, 7) : null, toString());
        }

        public final void d(String str) {
            String b13;
            this.f95648g = (str == null || (b13 = Companion.b(HttpUrl.f95629k, str, 0, 0, " \"'<>#", true, false, true, false, null, RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER)) == null) ? null : Companion.h(b13);
        }

        /* JADX WARN: Code restructure failed: missing block: B:202:0x0080, code lost:
        
            if (r6 == ':') goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x03f4  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0245 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x013a  */
        /* JADX WARN: Type inference failed for: r14v12, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v16 */
        /* JADX WARN: Type inference failed for: r14v18 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(okhttp3.HttpUrl r35, java.lang.String r36) {
            /*
                Method dump skipped, instructions count: 1088
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.e(okhttp3.HttpUrl, java.lang.String):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        
            if (r1 != okhttp3.HttpUrl.Companion.c(r3)) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.f95642a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r5.f95643b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r5.f95644c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r5.f95643b
                r0.append(r1)
                java.lang.String r1 = r5.f95644c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r5.f95644c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r5.f95645d
                if (r1 == 0) goto L63
                boolean r1 = kotlin.text.StringsKt.F(r1, r2)
                if (r1 == 0) goto L5e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r5.f95645d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L63
            L5e:
                java.lang.String r1 = r5.f95645d
                r0.append(r1)
            L63:
                int r1 = r5.f95646e
                r3 = -1
                if (r1 != r3) goto L6c
                java.lang.String r4 = r5.f95642a
                if (r4 == 0) goto L92
            L6c:
                if (r1 == r3) goto L6f
                goto L7d
            L6f:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f95629k
                java.lang.String r3 = r5.f95642a
                kotlin.jvm.internal.Intrinsics.f(r3)
                r1.getClass()
                int r1 = okhttp3.HttpUrl.Companion.c(r3)
            L7d:
                java.lang.String r3 = r5.f95642a
                if (r3 == 0) goto L8c
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.f95629k
                r4.getClass()
                int r3 = okhttp3.HttpUrl.Companion.c(r3)
                if (r1 == r3) goto L92
            L8c:
                r0.append(r2)
                r0.append(r1)
            L92:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f95629k
                java.util.ArrayList r2 = r5.f95647f
                r1.getClass()
                java.lang.String r1 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                java.lang.String r1 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                int r1 = r2.size()
                r3 = 0
            La8:
                if (r3 >= r1) goto Lbb
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r2.get(r3)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r3 = r3 + 1
                goto La8
            Lbb:
                java.util.ArrayList r1 = r5.f95648g
                if (r1 == 0) goto Ld1
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f95629k
                java.util.ArrayList r2 = r5.f95648g
                kotlin.jvm.internal.Intrinsics.f(r2)
                r1.getClass()
                okhttp3.HttpUrl.Companion.i(r0, r2)
            Ld1:
                java.lang.String r1 = r5.f95649h
                if (r1 == 0) goto Ldf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r5.f95649h
                r0.append(r1)
            Ldf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static String a(String str, int i13, int i14, String encodeSet, boolean z13, boolean z14, boolean z15, boolean z16, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i15 = i13;
            while (i15 < i14) {
                int codePointAt = str.codePointAt(i15);
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z16) || StringsKt.F(encodeSet, (char) codePointAt) || ((codePointAt == 37 && (!z13 || (z14 && !e(i15, i14, str)))) || (codePointAt == 43 && z15)))) {
                    j jVar = new j();
                    jVar.q0(i13, i15, str);
                    j jVar2 = null;
                    while (i15 < i14) {
                        int codePointAt2 = str.codePointAt(i15);
                        if (!z13 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                            if (codePointAt2 == 43 && z15) {
                                jVar.r0(z13 ? "+" : "%2B");
                            } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && !z16) || StringsKt.F(encodeSet, (char) codePointAt2) || (codePointAt2 == 37 && (!z13 || (z14 && !e(i15, i14, str)))))) {
                                if (jVar2 == null) {
                                    jVar2 = new j();
                                }
                                if (charset == null || Intrinsics.d(charset, StandardCharsets.UTF_8)) {
                                    jVar2.s0(codePointAt2);
                                } else {
                                    jVar2.n0(str, i15, Character.charCount(codePointAt2) + i15, charset);
                                }
                                while (!jVar2.o1()) {
                                    byte readByte = jVar2.readByte();
                                    jVar.a0(37);
                                    char[] cArr = HttpUrl.f95630l;
                                    jVar.a0(cArr[((readByte & 255) >> 4) & 15]);
                                    jVar.a0(cArr[readByte & 15]);
                                }
                            } else {
                                jVar.s0(codePointAt2);
                            }
                        }
                        i15 += Character.charCount(codePointAt2);
                    }
                    return jVar.M();
                }
                i15 += Character.charCount(codePointAt);
            }
            String substring = str.substring(i13, i14);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public static /* synthetic */ String b(Companion companion, String str, int i13, int i14, String str2, boolean z13, boolean z14, boolean z15, boolean z16, Charset charset, int i15) {
            int i16 = (i15 & 1) != 0 ? 0 : i13;
            int length = (i15 & 2) != 0 ? str.length() : i14;
            boolean z17 = (i15 & 8) != 0 ? false : z13;
            boolean z18 = (i15 & 16) != 0 ? false : z14;
            boolean z19 = (i15 & 32) != 0 ? false : z15;
            boolean z23 = (i15 & 64) != 0 ? false : z16;
            Charset charset2 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : charset;
            companion.getClass();
            return a(str, i16, length, str2, z17, z18, z19, z23, charset2);
        }

        public static int c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.d(scheme, "http")) {
                return 80;
            }
            return Intrinsics.d(scheme, "https") ? 443 : -1;
        }

        public static HttpUrl d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Builder builder = new Builder();
            builder.e(null, str);
            return builder.c();
        }

        public static boolean e(int i13, int i14, String str) {
            int i15 = i13 + 2;
            return i15 < i14 && str.charAt(i13) == '%' && Util.s(str.charAt(i13 + 1)) != -1 && Util.s(str.charAt(i15)) != -1;
        }

        public static HttpUrl f(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public static String g(Companion companion, String str, int i13, int i14, boolean z13, int i15) {
            int i16;
            if ((i15 & 1) != 0) {
                i13 = 0;
            }
            if ((i15 & 2) != 0) {
                i14 = str.length();
            }
            if ((i15 & 4) != 0) {
                z13 = false;
            }
            companion.getClass();
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i17 = i13;
            while (i17 < i14) {
                char charAt = str.charAt(i17);
                if (charAt == '%' || (charAt == '+' && z13)) {
                    j jVar = new j();
                    jVar.q0(i13, i17, str);
                    while (i17 < i14) {
                        int codePointAt = str.codePointAt(i17);
                        if (codePointAt != 37 || (i16 = i17 + 2) >= i14) {
                            if (codePointAt == 43 && z13) {
                                jVar.a0(32);
                                i17++;
                            }
                            jVar.s0(codePointAt);
                            i17 += Character.charCount(codePointAt);
                        } else {
                            int s13 = Util.s(str.charAt(i17 + 1));
                            int s14 = Util.s(str.charAt(i16));
                            if (s13 != -1 && s14 != -1) {
                                jVar.a0((s13 << 4) + s14);
                                i17 = Character.charCount(codePointAt) + i16;
                            }
                            jVar.s0(codePointAt);
                            i17 += Character.charCount(codePointAt);
                        }
                    }
                    return jVar.M();
                }
                i17++;
            }
            String substring = str.substring(i13, i14);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public static ArrayList h(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i13 = 0;
            while (i13 <= str.length()) {
                int K = StringsKt.K(str, '&', i13, false, 4);
                if (K == -1) {
                    K = str.length();
                }
                int K2 = StringsKt.K(str, '=', i13, false, 4);
                if (K2 == -1 || K2 > K) {
                    String substring = str.substring(i13, K);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i13, K2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(K2 + 1, K);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i13 = K + 1;
            }
            return arrayList;
        }

        public static void i(StringBuilder out, List list) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            a p13 = s.p(s.q(0, list.size()), 2);
            int i13 = p13.f80453a;
            int i14 = p13.f80454b;
            int i15 = p13.f80455c;
            if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i13);
                String str2 = (String) list.get(i13 + 1);
                if (i13 > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (i13 == i14) {
                    return;
                } else {
                    i13 += i15;
                }
            }
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i13, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f95631a = scheme;
        this.f95632b = username;
        this.f95633c = password;
        this.f95634d = host;
        this.f95635e = i13;
        this.f95636f = pathSegments;
        this.f95637g = arrayList;
        this.f95638h = str;
        this.f95639i = url;
        this.f95640j = Intrinsics.d(scheme, "https");
    }

    public final String a() {
        if (this.f95633c.length() == 0) {
            return "";
        }
        int length = this.f95631a.length() + 3;
        String str = this.f95639i;
        String substring = str.substring(StringsKt.K(str, ':', length, false, 4) + 1, StringsKt.K(str, '@', 0, false, 6));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f95631a.length() + 3;
        String str = this.f95639i;
        int K = StringsKt.K(str, '/', length, false, 4);
        String substring = str.substring(K, Util.f(str, K, str.length(), "?#"));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f95631a.length() + 3;
        String str = this.f95639i;
        int K = StringsKt.K(str, '/', length, false, 4);
        int f13 = Util.f(str, K, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (K < f13) {
            int i13 = K + 1;
            int e13 = Util.e(str, '/', i13, f13);
            String substring = str.substring(i13, e13);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            K = e13;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f95637g == null) {
            return null;
        }
        String str = this.f95639i;
        int K = StringsKt.K(str, '?', 0, false, 6) + 1;
        String substring = str.substring(K, Util.e(str, '#', K, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f95632b.length() == 0) {
            return "";
        }
        int length = this.f95631a.length() + 3;
        String str = this.f95639i;
        String substring = str.substring(length, Util.f(str, length, str.length(), ":@"));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.d(((HttpUrl) obj).f95639i, this.f95639i);
    }

    public final Builder f() {
        String substring;
        Builder builder = new Builder();
        String str = this.f95631a;
        builder.f95642a = str;
        String e13 = e();
        Intrinsics.checkNotNullParameter(e13, "<set-?>");
        builder.f95643b = e13;
        String a13 = a();
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        builder.f95644c = a13;
        builder.f95645d = this.f95634d;
        f95629k.getClass();
        int c13 = Companion.c(str);
        int i13 = this.f95635e;
        if (i13 == c13) {
            i13 = -1;
        }
        builder.f95646e = i13;
        ArrayList arrayList = builder.f95647f;
        arrayList.clear();
        arrayList.addAll(c());
        builder.d(d());
        if (this.f95638h == null) {
            substring = null;
        } else {
            String str2 = this.f95639i;
            substring = str2.substring(StringsKt.K(str2, '#', 0, false, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        }
        builder.f95649h = substring;
        return builder;
    }

    public final Builder g(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            Builder builder = new Builder();
            builder.e(this, link);
            return builder;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() {
        Builder g13 = g("/...");
        Intrinsics.f(g13);
        Intrinsics.checkNotNullParameter("", "username");
        Companion companion = f95629k;
        g13.f95643b = Companion.b(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE);
        Intrinsics.checkNotNullParameter("", "password");
        g13.f95644c = Companion.b(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE);
        return g13.c().f95639i;
    }

    public final int hashCode() {
        return this.f95639i.hashCode();
    }

    public final HttpUrl i(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Builder g13 = g(link);
        if (g13 != null) {
            return g13.c();
        }
        return null;
    }

    public final URI j() {
        Builder f13 = f();
        String str = f13.f95645d;
        f13.f95645d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        ArrayList arrayList = f13.f95647f;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.set(i13, Companion.b(f95629k, (String) arrayList.get(i13), 0, 0, "[]", true, true, false, false, null, RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER));
        }
        ArrayList arrayList2 = f13.f95648g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                String str2 = (String) arrayList2.get(i14);
                arrayList2.set(i14, str2 != null ? Companion.b(f95629k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, RecyclerViewTypes.VIEW_TYPE_USER) : null);
            }
        }
        String str3 = f13.f95649h;
        f13.f95649h = str3 != null ? Companion.b(f95629k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM) : null;
        String builder = f13.toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e13) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e13);
            }
        }
    }

    /* renamed from: toString, reason: from getter */
    public final String getF95639i() {
        return this.f95639i;
    }
}
