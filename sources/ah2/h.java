package ah2;

import io.embrace.android.embracesdk.internal.comms.api.ApiRequestV2;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import xk2.k;
import xk2.v;

/* loaded from: classes4.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f15203a;

    /* renamed from: b, reason: collision with root package name */
    public final k f15204b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15205c;

    /* renamed from: d, reason: collision with root package name */
    public final lh2.b f15206d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15207e;

    public h(String coreBaseUrl, v lazyDeviceId, String appId, lh2.b logger) {
        Intrinsics.checkNotNullParameter(coreBaseUrl, "coreBaseUrl");
        Intrinsics.checkNotNullParameter(lazyDeviceId, "lazyDeviceId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter("7.1.0", "embraceVersionName");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f15203a = coreBaseUrl;
        this.f15204b = lazyDeviceId;
        this.f15205c = appId;
        this.f15206d = logger;
        this.f15207e = 10000;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    @Override // ah2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ah2.f a(nd2.a r18, yg2.f r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            java.lang.String r2 = "payloadStream"
            r3 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "envelopeType"
            r4 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "payloadType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            pg2.s r2 = r19.getEndpoint()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r1.f15203a
            r5.append(r6)
            java.lang.String r6 = "/v2/"
            r5.append(r6)
            java.lang.String r2 = r2.getPath()
            r5.append(r2)
            java.lang.String r13 = r5.toString()
            xk2.k r2 = r1.f15204b
            java.lang.Object r2 = r2.getValue()
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            io.embrace.android.embracesdk.internal.comms.api.ApiRequestV2 r2 = new io.embrace.android.embracesdk.internal.comms.api.ApiRequestV2
            r14 = 9
            r15 = 0
            r7 = 0
            java.lang.String r8 = "Embrace/a/7.1.0"
            java.lang.String r9 = "gzip"
            r10 = 0
            java.lang.String r11 = r1.f15205c
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = 0
            java.net.HttpURLConnection r0 = r1.b(r2, r0)     // Catch: java.lang.Throwable -> L72
            java.io.OutputStream r2 = r0.getOutputStream()     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L88
            java.lang.String r6 = "outputStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = r18.invoke()     // Catch: java.lang.Throwable -> L75
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.lang.Throwable -> L75
            r6 = r3
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L78
            bs1.c.L(r6, r2)     // Catch: java.lang.Throwable -> L78
            dl2.b.J(r3, r5)     // Catch: java.lang.Throwable -> L75
            dl2.b.J(r2, r5)     // Catch: java.lang.Throwable -> L72
            goto L88
        L72:
            r0 = move-exception
            r2 = r5
            goto La0
        L75:
            r0 = move-exception
            r3 = r0
            goto L81
        L78:
            r0 = move-exception
            r6 = r0
            throw r6     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            r7 = r0
            dl2.b.J(r3, r6)     // Catch: java.lang.Throwable -> L75
            throw r7     // Catch: java.lang.Throwable -> L75
        L81:
            throw r3     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            r6 = r0
            dl2.b.J(r2, r3)     // Catch: java.lang.Throwable -> L72
            throw r6     // Catch: java.lang.Throwable -> L72
        L88:
            r0.connect()     // Catch: java.lang.Throwable -> L72
            fe2.a r2 = new fe2.a     // Catch: java.lang.Throwable -> L72
            r3 = 6
            r2.<init>(r3, r1, r0)     // Catch: java.lang.Throwable -> L72
            int r0 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L9f
            r16 = r5
            r5 = r0
            r0 = r16
            goto Lad
        L9f:
            r0 = move-exception
        La0:
            boolean r3 = r0 instanceof java.io.IOException
            if (r3 != 0) goto Lad
            lh2.g r3 = lh2.g.PAYLOAD_DELIVERY_FAIL
            lh2.b r6 = r1.f15206d
            lh2.e r6 = (lh2.e) r6
            r6.b(r3, r0)
        Lad:
            kotlin.ranges.IntRange r3 = ah2.f.f15200b
            pg2.s r3 = r19.getEndpoint()
            if (r2 != 0) goto Lb7
            ah2.g r2 = ah2.g.f15202i
        Lb7:
            ah2.f r0 = e0.t.w(r3, r5, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah2.h.a(nd2.a, yg2.f, java.lang.String):ah2.f");
    }

    public final HttpURLConnection b(ApiRequestV2 apiRequestV2, String str) {
        URLConnection openConnection = new URL(apiRequestV2.f72948g).openConnection();
        Intrinsics.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        for (Map.Entry entry : apiRequestV2.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestProperty("X-EM-TYPES", str);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        int i13 = this.f15207e;
        httpURLConnection.setConnectTimeout(i13);
        httpURLConnection.setReadTimeout(i13);
        return httpURLConnection;
    }
}
