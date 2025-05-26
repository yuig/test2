package okhttp3.internal.http;

import ads_mobile_sdk.wb;
import com.google.android.gms.ads.AdSize;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteSelector;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f95983a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f95983a = client;
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
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    public final Request a(Response response, Exchange exchange) {
        String c13;
        HttpUrl httpUrl;
        HttpUrl url;
        RealConnection realConnection;
        Route route = (exchange == null || (realConnection = exchange.f95875g) == null) ? null : realConnection.f95920b;
        int i13 = response.f95723d;
        Request request = response.f95720a;
        String str = request.f95701b;
        RequestBody requestBody = request.f95703d;
        OkHttpClient okHttpClient = this.f95983a;
        if (i13 != 307 && i13 != 308) {
            if (i13 == 401) {
                return okHttpClient.authenticator().a(route, response);
            }
            if (i13 == 421) {
                if ((requestBody != null && requestBody.c()) || exchange == null || !exchange.f()) {
                    return null;
                }
                exchange.f95875g.k();
                return request;
            }
            Response response2 = response.f95729j;
            if (i13 == 503) {
                if ((response2 == null || response2.f95723d != 503) && c(response, Integer.MAX_VALUE) == 0) {
                    return request;
                }
                return null;
            }
            if (i13 == 407) {
                Intrinsics.f(route);
                if (route.f95755b.type() == Proxy.Type.HTTP) {
                    return okHttpClient.proxyAuthenticator().a(route, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i13 == 408) {
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
            switch (i13) {
                case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                case wb.W0 /* 301 */:
                case wb.X0 /* 302 */:
                case 303:
                    break;
                default:
                    return null;
            }
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

    public final boolean b(IOException iOException, RealCall realCall, Request request, boolean z13) {
        RouteSelector routeSelector;
        RealConnection realConnection;
        RequestBody requestBody;
        if (!this.f95983a.retryOnConnectionFailure()) {
            return false;
        }
        if ((z13 && (((requestBody = request.f95703d) != null && requestBody.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z13)) {
            return false;
        }
        ExchangeFinder exchangeFinder = realCall.f95905i;
        Intrinsics.f(exchangeFinder);
        int i13 = exchangeFinder.f95893g;
        if (i13 != 0 || exchangeFinder.f95894h != 0 || exchangeFinder.f95895i != 0) {
            if (exchangeFinder.f95896j == null) {
                Route route = null;
                if (i13 <= 1 && exchangeFinder.f95894h <= 1 && exchangeFinder.f95895i <= 0 && (realConnection = exchangeFinder.f95889c.f95906j) != null) {
                    synchronized (realConnection) {
                        if (realConnection.f95930l == 0) {
                            if (Util.a(realConnection.f95920b.f95754a.f95488i, exchangeFinder.f95888b.f95488i)) {
                                route = realConnection.f95920b;
                            }
                        }
                    }
                }
                if (route != null) {
                    exchangeFinder.f95896j = route;
                } else {
                    RouteSelector.Selection selection = exchangeFinder.f95891e;
                    if ((selection == null || !selection.a()) && (routeSelector = exchangeFinder.f95892f) != null && !routeSelector.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r9 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        r0 = r0.e();
        r4 = r9.e();
        r4.f95740g = null;
        r0.g(r4.b());
        r0 = r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        r0 = r3.f95908l;
        r4 = a(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (r4 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        r0 = r4.f95703d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r0.c() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        r3.g(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        r0 = r9.f95726g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        okhttp3.internal.Util.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r10 > 20) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        if (r0.f95873e == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
    
        r3.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        r3.g(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
    
        return r9;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r31) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
