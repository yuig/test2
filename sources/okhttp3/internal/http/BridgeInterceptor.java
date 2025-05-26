package okhttp3.internal.http;

import ao2.m0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import wo2.s;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final CookieJar f95962a;

    public BridgeInterceptor(CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f95962a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        BridgeInterceptor bridgeInterceptor;
        boolean z13;
        ResponseBody responseBody;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.getF95974e();
        Request.Builder b13 = request.b();
        RequestBody requestBody = request.f95703d;
        if (requestBody != null) {
            MediaType f95712b = requestBody.getF95712b();
            if (f95712b != null) {
                b13.d("Content-Type", f95712b.f95654a);
            }
            long a13 = requestBody.a();
            if (a13 != -1) {
                b13.d("Content-Length", String.valueOf(a13));
                b13.h("Transfer-Encoding");
            } else {
                b13.d("Transfer-Encoding", "chunked");
                b13.h("Content-Length");
            }
        }
        String a14 = request.a("Host");
        HttpUrl httpUrl = request.f95700a;
        if (a14 == null) {
            b13.d("Host", Util.z(httpUrl, false));
        }
        if (request.a("Connection") == null) {
            b13.d("Connection", "Keep-Alive");
        }
        if (request.a("Accept-Encoding") == null && request.a("Range") == null) {
            b13.d("Accept-Encoding", "gzip");
            bridgeInterceptor = this;
            z13 = true;
        } else {
            bridgeInterceptor = this;
            z13 = false;
        }
        CookieJar cookieJar = bridgeInterceptor.f95962a;
        List a15 = cookieJar.a(httpUrl);
        if (!a15.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            int i13 = 0;
            for (Object obj : a15) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    f0.p();
                    throw null;
                }
                Cookie cookie = (Cookie) obj;
                if (i13 > 0) {
                    sb3.append("; ");
                }
                sb3.append(cookie.f95586a);
                sb3.append('=');
                sb3.append(cookie.f95587b);
                i13 = i14;
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            b13.d("Cookie", sb4);
        }
        if (request.a("User-Agent") == null) {
            b13.d("User-Agent", "okhttp/4.12.0");
        }
        Response b14 = chain.b(b13.b());
        Headers headers = b14.f95725f;
        HttpHeaders.d(cookieJar, httpUrl, headers);
        Response.Builder e13 = b14.e();
        Intrinsics.checkNotNullParameter(request, "request");
        e13.f95734a = request;
        if (z13 && z.i("gzip", b14.c("Content-Encoding", null), true) && HttpHeaders.a(b14) && (responseBody = b14.f95726g) != null) {
            s sVar = new s(responseBody.getF95981f());
            Headers.Builder f13 = headers.f();
            f13.g("Content-Encoding");
            f13.g("Content-Length");
            e13.e(f13.e());
            e13.f95740g = new RealResponseBody(b14.c("Content-Type", null), -1L, m0.i(sVar));
        }
        return e13.b();
    }
}
