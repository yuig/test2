package okhttp3.logging;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.logging.HttpLoggingInterceptor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Factory", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LoggingEventListener extends EventListener {

    /* renamed from: b, reason: collision with root package name */
    public final HttpLoggingInterceptor.Logger f96344b;

    /* renamed from: c, reason: collision with root package name */
    public long f96345c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
    public static class Factory implements EventListener.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final HttpLoggingInterceptor.Logger f96346a;

        public Factory() {
            HttpLoggingInterceptor.Logger logger = HttpLoggingInterceptor.Logger.Mo;
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.f96346a = logger;
        }

        @Override // okhttp3.EventListener.Factory
        public final EventListener a(Call call) {
            Intrinsics.checkNotNullParameter(call, "call");
            return new LoggingEventListener(this.f96346a);
        }
    }

    public LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.f96344b = logger;
    }

    @Override // okhttp3.EventListener
    public final void A(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        D("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public final void B(RealCall call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public final void C(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("secureConnectStart");
    }

    public final void D(String str) {
        this.f96344b.a("[" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f96345c) + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public final void a(Call call, Response cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        D("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public final void b(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        D("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public final void c(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public final void d(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("callEnd");
    }

    @Override // okhttp3.EventListener
    public final void e(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        D("callFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void f(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f96345c = System.nanoTime();
        D("callStart: " + call.getF95898b());
    }

    @Override // okhttp3.EventListener
    public final void g(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("canceled");
    }

    @Override // okhttp3.EventListener
    public final void h(RealCall call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        D("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public final void i(RealCall call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        D("connectFailed: null " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void j(RealCall call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        D("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public final void k(RealCall call, RealConnection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        D("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public final void l(Call call, RealConnection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        D("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public final void m(Call call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        D("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.EventListener
    public final void n(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        D("dnsStart: ".concat(domainName));
    }

    @Override // okhttp3.EventListener
    public final void o(Call call, HttpUrl url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        D("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.EventListener
    public final void p(Call call, HttpUrl url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        D("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public final void q(RealCall call, long j13) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("requestBodyEnd: byteCount=" + j13);
    }

    @Override // okhttp3.EventListener
    public final void r(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void s(RealCall call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        D("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void t(RealCall call, Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        D("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public final void u(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void v(RealCall call, long j13) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("responseBodyEnd: byteCount=" + j13);
    }

    @Override // okhttp3.EventListener
    public final void w(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void x(RealCall call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        D("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void y(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        D("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public final void z(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("responseHeadersStart");
    }
}
