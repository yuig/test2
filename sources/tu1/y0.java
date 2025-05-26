package tu1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* loaded from: classes2.dex */
public final class y0 implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public static final Regex f119473b = new Regex("Retryable=(true|false)");

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f119474a;

    public y0(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f119474a = client;
    }

    public static boolean b(IOException exception) {
        kotlin.text.j b13;
        String value;
        String a03;
        Intrinsics.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        if (message == null || (b13 = f119473b.b(0, message)) == null || (value = b13.getValue()) == null || (a03 = StringsKt.a0(value, "=", value)) == null) {
            return false;
        }
        return Boolean.parseBoolean(a03);
    }

    public static int c(Response response, int i13) {
        String c13 = response.c("Retry-After", null);
        if (c13 == null) {
            return i13;
        }
        if (!new Regex("\\d+").e(c13)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(c13);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    public final Request a(Response response) {
        String c13;
        HttpUrl httpUrl;
        HttpUrl url;
        int i13 = response.f95723d;
        Request request = response.f95720a;
        String str = request.f95701b;
        RequestBody requestBody = request.f95703d;
        OkHttpClient okHttpClient = this.f119474a;
        if (i13 != 307 && i13 != 308) {
            if (i13 == 401) {
                return okHttpClient.authenticator().a(null, response);
            }
            if (i13 == 421) {
                if (requestBody == null || !requestBody.c()) {
                    return request;
                }
                return null;
            }
            Response response2 = response.f95729j;
            if (i13 == 503) {
                if ((response2 == null || response2.f95723d != 503) && c(response, Integer.MAX_VALUE) == 0) {
                    return request;
                }
                return null;
            }
            if (i13 == 407) {
                return okHttpClient.proxyAuthenticator().a(null, response);
            }
            if (i13 != 408) {
                switch (i13) {
                }
                return null;
            }
            if (!okHttpClient.retryOnConnectionFailure()) {
                return null;
            }
            if (requestBody != null && requestBody.c()) {
                return null;
            }
            if ((response2 == null || response2.f95723d != 408) && c(response, 0) <= 0) {
                return request;
            }
            return null;
        }
        if (!okHttpClient.followRedirects() || (c13 = response.c("Location", null)) == null || (url = (httpUrl = request.f95700a).i(c13)) == null) {
            return null;
        }
        if (!Intrinsics.d(url.f95631a, httpUrl.f95631a) && !okHttpClient.followSslRedirects()) {
            return null;
        }
        Request.Builder b13 = request.b();
        if (HttpMethod.b(str)) {
            HttpMethod.f95969a.getClass();
            boolean d2 = HttpMethod.d(str);
            int i14 = response.f95723d;
            boolean z13 = d2 || i14 == 308 || i14 == 307;
            if (!HttpMethod.c(str) || i14 == 308 || i14 == 307) {
                b13.f(str, z13 ? requestBody : null);
            } else {
                b13.f("GET", null);
            }
            if (!z13) {
                b13.h("Transfer-Encoding");
                b13.h("Content-Length");
                b13.h("Content-Type");
            }
        }
        if (!Util.a(httpUrl, url)) {
            b13.h("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        b13.f95706a = url;
        return b13.b();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request f95974e = chain.getF95974e();
        Call call = chain.call();
        List list = kotlin.collections.q0.f80391a;
        int i13 = 0;
        Response response = null;
        while (!call.getF95912p()) {
            try {
                Response b13 = chain.b(f95974e);
                if (response != null) {
                    Response.Builder e13 = b13.e();
                    Response.Builder e14 = response.e();
                    e14.f95740g = null;
                    e13.g(e14.b());
                    b13 = e13.b();
                }
                response = b13;
                f95974e = a(response);
            } catch (IOException e15) {
                if (!b(e15)) {
                    Util.E(e15, list);
                    throw e15;
                }
                list = CollectionsKt.m0(e15, list);
            }
            if (f95974e == null) {
                return response;
            }
            RequestBody requestBody = f95974e.f95703d;
            if (requestBody != null && requestBody.c()) {
                return response;
            }
            ResponseBody responseBody = response.f95726g;
            if (responseBody != null) {
                Util.c(responseBody);
            }
            i13++;
            if (i13 > 20) {
                throw new ProtocolException(a.a.d("Too many follow-up requests: ", i13));
            }
        }
        throw new IOException("Canceled");
    }
}
