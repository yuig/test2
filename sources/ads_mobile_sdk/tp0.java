package ads_mobile_sdk;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class tp0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11617c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f11618d;

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f11619e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f11620f;

    /* renamed from: a, reason: collision with root package name */
    public final oh0 f11621a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11622b;

    static {
        Pattern compile = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        f11617c = compile;
        Pattern compile2 = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
        Intrinsics.checkNotNullExpressionValue(compile2, "compile(...)");
        f11618d = compile2;
        Pattern compile3 = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>[.\\s]*<\\s*html[^>]*>", 2);
        Intrinsics.checkNotNullExpressionValue(compile3, "compile(...)");
        f11619e = compile3;
        Pattern compile4 = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>[.\\s]*<\\s*html[^>]*>[.\\s]*<\\s*head[^>]*>", 2);
        Intrinsics.checkNotNullExpressionValue(compile4, "compile(...)");
        f11620f = compile4;
    }

    public tp0(oh0 flags, String gmaVersion) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        this.f11621a = flags;
        this.f11622b = gmaVersion;
    }

    public static String a(String str, String str2) {
        return StringsKt.i0("\n      <script>Object.defineProperty(window,'" + str + "',{get:function(){return " + str2 + "}});</script>\n    ").toString();
    }

    public final String a() {
        return a("MRAID_ENV", StringsKt.i0("\n      {\"version\": \"" + this.f11621a.S() + "\", \"sdk\": \"Google Mobile Ads\", \"sdkVersion\": \"" + this.f11622b + "\"}\n    ").toString());
    }

    public final String a(r0 configuration) {
        ts tsVar;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (!this.f11621a.U() || !configuration.N) {
            return null;
        }
        dt1 dt1Var = configuration.R;
        if (!dt1Var.f4435c) {
            return null;
        }
        if (dt1Var.f4433a == ct1.f4028a) {
            tsVar = ts.f11655e;
        } else {
            tsVar = ts.f11653c;
        }
        return a("GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV", kotlin.text.t.b("\n      {\"creativeType\": \"" + tsVar + "\", \"contentUrl\": \"" + configuration.f10398x + "\"}\n    "));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b A[LOOP:0: B:21:0x0095->B:23:0x009b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r6, java.util.List r7) {
        /*
            java.lang.String r0 = "html"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "scripts"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.regex.Pattern r0 = ads_mobile_sdk.tp0.f11620f
            java.util.regex.Matcher r0 = r0.matcher(r6)
            java.lang.String r1 = "matcher(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            boolean r3 = r0.find()
            r4 = 0
            if (r3 == 0) goto L2b
            int r0 = r0.end()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L2c
        L2b:
            r0 = r4
        L2c:
            r3 = 0
            if (r0 == 0) goto L30
            goto L6c
        L30:
            java.util.regex.Pattern r0 = ads_mobile_sdk.tp0.f11619e
            java.util.regex.Matcher r0 = r0.matcher(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            boolean r5 = r0.find()
            if (r5 == 0) goto L4b
            int r0 = r0.end()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L4c
        L4b:
            r0 = r4
        L4c:
            if (r0 == 0) goto L4f
            goto L6c
        L4f:
            java.util.regex.Pattern r0 = ads_mobile_sdk.tp0.f11618d
            java.util.regex.Matcher r0 = r0.matcher(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            boolean r1 = r0.find()
            if (r1 == 0) goto L69
            int r0 = r0.end()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L69:
            if (r4 == 0) goto L71
            r0 = r4
        L6c:
            int r0 = r0.intValue()
            goto L7f
        L71:
            java.util.regex.Pattern r0 = ads_mobile_sdk.tp0.f11617c
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r0 = r0.find()
            if (r0 == 0) goto L7e
            return r6
        L7e:
            r0 = r3
        L7f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.substring(r3, r0)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.util.Iterator r7 = r7.iterator()
        L95:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            goto L95
        La5:
            java.lang.String r6 = r6.substring(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tp0.a(java.lang.String, java.util.List):java.lang.String");
    }
}
