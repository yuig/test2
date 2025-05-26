package ah2;

import e0.t;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequestV2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import pg2.s;
import xk2.k;
import xk2.v;

/* loaded from: classes4.dex */
public final class i implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final MediaType f15208f;

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f15209a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15210b;

    /* renamed from: c, reason: collision with root package name */
    public final k f15211c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15212d;

    /* renamed from: e, reason: collision with root package name */
    public final lh2.b f15213e;

    static {
        MediaType.f95651d.getClass();
        f15208f = MediaType.Companion.a("application/json");
    }

    public i(OkHttpClient okHttpClient, String coreBaseUrl, v lazyDeviceId, String appId, lh2.b logger) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(coreBaseUrl, "coreBaseUrl");
        Intrinsics.checkNotNullParameter(lazyDeviceId, "lazyDeviceId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter("7.1.0", "embraceVersionName");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f15209a = okHttpClient;
        this.f15210b = coreBaseUrl;
        this.f15211c = lazyDeviceId;
        this.f15212d = appId;
        this.f15213e = logger;
    }

    @Override // ah2.j
    public final f a(nd2.a payloadStream, yg2.f envelopeType, String payloadType) {
        Request b13;
        Throwable th3;
        Response response;
        Intrinsics.checkNotNullParameter(payloadStream, "payloadStream");
        Intrinsics.checkNotNullParameter(envelopeType, "envelopeType");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        boolean z13 = envelopeType.getEndpoint() == s.ATTACHMENTS;
        String str = this.f15210b + envelopeType.getEndpoint().getPath();
        ApiRequestV2 apiRequestV2 = new ApiRequestV2(z13 ? "multipart/form-data" : "application/json", "Embrace/a/7.1.0", z13 ? null : "gzip", null, this.f15212d, (String) this.f15211c.getValue(), str, 8, null);
        String str2 = apiRequestV2.f72948g;
        if (z13) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream((InputStream) payloadStream.invoke());
            try {
                Pair v13 = bp1.h.v(gZIPInputStream);
                MultipartBody.Builder builder = new MultipartBody.Builder(0);
                builder.c(MultipartBody.f95659h);
                String str3 = apiRequestV2.f72946e;
                if (str3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                builder.a("app_id", str3);
                builder.a("attachment_id", (String) v13.f80347b);
                RequestBody$Companion$toRequestBody$2 body = RequestBody.Companion.e(RequestBody.f95711a, (byte[]) v13.f80346a, null, 7);
                Intrinsics.checkNotNullParameter("file", "name");
                Intrinsics.checkNotNullParameter(body, "body");
                MultipartBody.Part.f95670c.getClass();
                MultipartBody.Part part = MultipartBody.Part.Companion.b("file", "file", body);
                Intrinsics.checkNotNullParameter(part, "part");
                builder.f95669c.add(part);
                Request.Builder builder2 = new Request.Builder();
                builder2.j(str2);
                builder2.g(builder.b());
                b13 = builder2.b();
                dl2.b.J(gZIPInputStream, null);
            } finally {
            }
        } else {
            Request.Builder builder3 = new Request.Builder();
            builder3.j(str2);
            Headers.Companion companion = Headers.f95626b;
            Map k13 = z0.k(apiRequestV2.a(), new Pair("X-EM-TYPES", payloadType));
            companion.getClass();
            builder3.e(Headers.Companion.c(k13));
            builder3.g(new sv0.d(payloadStream));
            b13 = builder3.b();
        }
        try {
            response = this.f15209a.newCall(b13).e();
            th3 = null;
        } catch (Throwable th4) {
            if (!(th4 instanceof IOException)) {
                ((lh2.e) this.f15213e).b(lh2.g.PAYLOAD_DELIVERY_FAIL, th4);
            }
            th3 = th4;
            response = null;
        }
        IntRange intRange = f.f15200b;
        return t.w(envelopeType.getEndpoint(), response != null ? Integer.valueOf(response.f95723d) : null, new nd2.a(response, 21), th3);
    }
}
