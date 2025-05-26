package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import uo2.a;
import xk2.d;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002xyB\u0007\b\u0016¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\bSJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\bTJ\r\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\bUJ\r\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\bVJ\r\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0002\bWJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\bXJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007¢\u0006\u0002\bYJ\r\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\bZJ\r\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\b[J\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\b\\J\r\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\b]J\r\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\b^J\r\u0010.\u001a\u00020,H\u0007¢\u0006\u0002\b_J\r\u0010/\u001a\u000200H\u0007¢\u0006\u0002\b`J\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\baJ\u0013\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\bbJ\b\u0010c\u001a\u00020\u0006H\u0016J\u0010\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0016J\u0018\u0010h\u001a\u00020i2\u0006\u0010f\u001a\u00020g2\u0006\u0010j\u001a\u00020kH\u0016J\r\u00108\u001a\u00020\u000fH\u0007¢\u0006\u0002\blJ\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001cH\u0007¢\u0006\u0002\bmJ\u000f\u0010;\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0002\bnJ\r\u0010>\u001a\u00020\tH\u0007¢\u0006\u0002\boJ\r\u0010?\u001a\u00020@H\u0007¢\u0006\u0002\bpJ\r\u0010B\u001a\u00020\u000fH\u0007¢\u0006\u0002\bqJ\r\u0010C\u001a\u00020,H\u0007¢\u0006\u0002\brJ\r\u0010H\u001a\u00020IH\u0007¢\u0006\u0002\bsJ\r\u0010K\u001a\u00020LH\u0007¢\u0006\u0002\btJ\b\u0010u\u001a\u00020vH\u0002J\r\u0010O\u001a\u00020\u000fH\u0007¢\u0006\u0002\bwR\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00128G¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0014\u001a\u00020\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0018\u001a\u00020\u00198G¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001eR\u0013\u0010\u001f\u001a\u00020 8G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0013\u0010\"\u001a\u00020#8G¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'R\u0013\u0010(\u001a\u00020)8G¢\u0006\b\n\u0000\u001a\u0004\b(\u0010*R\u0013\u0010+\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b+\u0010-R\u0013\u0010.\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010/\u001a\u0002008G¢\u0006\b\n\u0000\u001a\u0004\b/\u00101R\u0019\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u00104\u001a\u0002058G¢\u0006\b\n\u0000\u001a\u0004\b4\u00106R\u0019\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR\u0013\u00108\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0010R\u0019\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001eR\u0015\u0010;\u001a\u0004\u0018\u00010<8G¢\u0006\b\n\u0000\u001a\u0004\b;\u0010=R\u0013\u0010>\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\nR\u0013\u0010?\u001a\u00020@8G¢\u0006\b\n\u0000\u001a\u0004\b?\u0010AR\u0013\u0010B\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0010R\u0013\u0010C\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0011\u0010D\u001a\u00020E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010H\u001a\u00020I8G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010JR\u0011\u0010K\u001a\u00020L8G¢\u0006\u0006\u001a\u0004\bK\u0010MR\u0010\u0010N\u001a\u0004\u0018\u00010LX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010O\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0010R\u0015\u0010P\u001a\u0004\u0018\u00010Q8G¢\u0006\b\n\u0000\u001a\u0004\bP\u0010R¨\u0006z"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "()V", "builder", "Lokhttp3/OkHttpClient$Builder;", "(Lokhttp3/OkHttpClient$Builder;)V", "authenticator", "Lokhttp3/Authenticator;", "()Lokhttp3/Authenticator;", "cache", "Lokhttp3/Cache;", "()Lokhttp3/Cache;", "callTimeoutMillis", "", "()I", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "certificatePinner", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "connectTimeoutMillis", "connectionPool", "Lokhttp3/ConnectionPool;", "()Lokhttp3/ConnectionPool;", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "()Ljava/util/List;", "cookieJar", "Lokhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "dispatcher", "Lokhttp3/Dispatcher;", "()Lokhttp3/Dispatcher;", "dns", "Lokhttp3/Dns;", "()Lokhttp3/Dns;", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "()Lokhttp3/EventListener$Factory;", "followRedirects", "", "()Z", "followSslRedirects", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "interceptors", "Lokhttp3/Interceptor;", "minWebSocketMessageToCompress", "", "()J", "networkInterceptors", "pingIntervalMillis", "protocols", "Lokhttp3/Protocol;", "proxy", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxyAuthenticator", "proxySelector", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "readTimeoutMillis", "retryOnConnectionFailure", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "socketFactory", "Ljavax/net/SocketFactory;", "()Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "writeTimeoutMillis", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "-deprecated_authenticator", "-deprecated_cache", "-deprecated_callTimeoutMillis", "-deprecated_certificatePinner", "-deprecated_connectTimeoutMillis", "-deprecated_connectionPool", "-deprecated_connectionSpecs", "-deprecated_cookieJar", "-deprecated_dispatcher", "-deprecated_dns", "-deprecated_eventListenerFactory", "-deprecated_followRedirects", "-deprecated_followSslRedirects", "-deprecated_hostnameVerifier", "-deprecated_interceptors", "-deprecated_networkInterceptors", "newBuilder", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "newWebSocket", "Lokhttp3/WebSocket;", "listener", "Lokhttp3/WebSocketListener;", "-deprecated_pingIntervalMillis", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_readTimeoutMillis", "-deprecated_retryOnConnectionFailure", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "verifyClientState", "", "-deprecated_writeTimeoutMillis", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    @NotNull
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;

    @NotNull
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;

    @NotNull
    private final ConnectionPool connectionPool;

    @NotNull
    private final List<ConnectionSpec> connectionSpecs;

    @NotNull
    private final CookieJar cookieJar;

    @NotNull
    private final Dispatcher dispatcher;

    @NotNull
    private final Dns dns;

    @NotNull
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;

    @NotNull
    private final HostnameVerifier hostnameVerifier;

    @NotNull
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;

    @NotNull
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;

    @NotNull
    private final List<Protocol> protocols;
    private final Proxy proxy;

    @NotNull
    private final Authenticator proxyAuthenticator;

    @NotNull
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @NotNull
    private final RouteDatabase routeDatabase;

    @NotNull
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    @NotNull
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.l(Protocol.HTTP_2, Protocol.HTTP_1_1);

    @NotNull
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.l(ConnectionSpec.f95571e, ConnectionSpec.f95572f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {
        public int A;
        public int B;
        public long C;
        public RouteDatabase D;

        /* renamed from: a, reason: collision with root package name */
        public Dispatcher f95674a = new Dispatcher();

        /* renamed from: b, reason: collision with root package name */
        public ConnectionPool f95675b = new ConnectionPool();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f95676c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f95677d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public EventListener.Factory f95678e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f95679f;

        /* renamed from: g, reason: collision with root package name */
        public Authenticator f95680g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f95681h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f95682i;

        /* renamed from: j, reason: collision with root package name */
        public CookieJar f95683j;

        /* renamed from: k, reason: collision with root package name */
        public Cache f95684k;

        /* renamed from: l, reason: collision with root package name */
        public Dns f95685l;

        /* renamed from: m, reason: collision with root package name */
        public Proxy f95686m;

        /* renamed from: n, reason: collision with root package name */
        public ProxySelector f95687n;

        /* renamed from: o, reason: collision with root package name */
        public Authenticator f95688o;

        /* renamed from: p, reason: collision with root package name */
        public SocketFactory f95689p;

        /* renamed from: q, reason: collision with root package name */
        public SSLSocketFactory f95690q;

        /* renamed from: r, reason: collision with root package name */
        public X509TrustManager f95691r;

        /* renamed from: s, reason: collision with root package name */
        public List f95692s;

        /* renamed from: t, reason: collision with root package name */
        public List f95693t;

        /* renamed from: u, reason: collision with root package name */
        public HostnameVerifier f95694u;

        /* renamed from: v, reason: collision with root package name */
        public CertificatePinner f95695v;

        /* renamed from: w, reason: collision with root package name */
        public CertificateChainCleaner f95696w;

        /* renamed from: x, reason: collision with root package name */
        public int f95697x;

        /* renamed from: y, reason: collision with root package name */
        public int f95698y;

        /* renamed from: z, reason: collision with root package name */
        public int f95699z;

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f95611a;
            byte[] bArr = Util.f95757a;
            Intrinsics.checkNotNullParameter(eventListener$Companion$NONE$1, "<this>");
            this.f95678e = new a(eventListener$Companion$NONE$1);
            this.f95679f = true;
            Authenticator authenticator = Authenticator.f95491a;
            this.f95680g = authenticator;
            this.f95681h = true;
            this.f95682i = true;
            this.f95683j = CookieJar.f95601a;
            this.f95685l = Dns.f95609a;
            this.f95688o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f95689p = socketFactory;
            OkHttpClient.INSTANCE.getClass();
            this.f95692s = OkHttpClient.DEFAULT_CONNECTION_SPECS;
            this.f95693t = OkHttpClient.DEFAULT_PROTOCOLS;
            this.f95694u = OkHostnameVerifier.f96256a;
            this.f95695v = CertificatePinner.f95541d;
            this.f95698y = 10000;
            this.f95699z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        public final void a(Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f95676c.add(interceptor);
        }

        public final void b(long j13, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f95697x = Util.b(j13, unit);
        }

        public final void c(long j13, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f95698y = Util.b(j13, unit);
        }

        public final void d(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList H0 = CollectionsKt.H0(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!H0.contains(protocol) && !H0.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + H0).toString());
            }
            if (H0.contains(protocol) && H0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + H0).toString());
            }
            if (!(!H0.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + H0).toString());
            }
            if (!(true ^ H0.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            H0.remove(Protocol.SPDY_3);
            if (!Intrinsics.d(H0, this.f95693t)) {
                this.D = null;
            }
            List unmodifiableList = Collections.unmodifiableList(H0);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f95693t = unmodifiableList;
        }

        public final void e(long j13, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f95699z = Util.b(j13, unit);
        }

        public final void f(long j13, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.A = Util.b(j13, unit);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    public OkHttpClient(@NotNull Builder builder) {
        ProxySelector proxySelector;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.dispatcher = builder.f95674a;
        this.connectionPool = builder.f95675b;
        this.interceptors = Util.A(builder.f95676c);
        this.networkInterceptors = Util.A(builder.f95677d);
        this.eventListenerFactory = builder.f95678e;
        this.retryOnConnectionFailure = builder.f95679f;
        this.authenticator = builder.f95680g;
        this.followRedirects = builder.f95681h;
        this.followSslRedirects = builder.f95682i;
        this.cookieJar = builder.f95683j;
        this.cache = builder.f95684k;
        this.dns = builder.f95685l;
        Proxy proxy = builder.f95686m;
        this.proxy = proxy;
        if (proxy != null) {
            proxySelector = NullProxySelector.f96244a;
        } else {
            proxySelector = builder.f95687n;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.f96244a;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.f95688o;
        this.socketFactory = builder.f95689p;
        List<ConnectionSpec> list = builder.f95692s;
        this.connectionSpecs = list;
        this.protocols = builder.f95693t;
        this.hostnameVerifier = builder.f95694u;
        this.callTimeoutMillis = builder.f95697x;
        this.connectTimeoutMillis = builder.f95698y;
        this.readTimeoutMillis = builder.f95699z;
        this.writeTimeoutMillis = builder.A;
        this.pingIntervalMillis = builder.B;
        this.minWebSocketMessageToCompress = builder.C;
        RouteDatabase routeDatabase = builder.D;
        this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List<ConnectionSpec> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f95573a) {
                    SSLSocketFactory sSLSocketFactory = builder.f95690q;
                    if (sSLSocketFactory != null) {
                        this.sslSocketFactoryOrNull = sSLSocketFactory;
                        CertificateChainCleaner certificateChainCleaner = builder.f95696w;
                        Intrinsics.f(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManager = builder.f95691r;
                        Intrinsics.f(x509TrustManager);
                        this.x509TrustManager = x509TrustManager;
                        CertificatePinner certificatePinner = builder.f95695v;
                        certificatePinner.getClass();
                        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                        this.certificatePinner = Intrinsics.d(certificatePinner.f95543b, certificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.f95542a, certificateChainCleaner);
                    } else {
                        Platform.f96214a.getClass();
                        X509TrustManager trustManager = Platform.f96215b.n();
                        this.x509TrustManager = trustManager;
                        this.sslSocketFactoryOrNull = Platform.f96215b.m(trustManager);
                        CertificateChainCleaner.f96255a.getClass();
                        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
                        CertificateChainCleaner certificateChainCleaner2 = Platform.f96215b.b(trustManager);
                        this.certificateChainCleaner = certificateChainCleaner2;
                        CertificatePinner certificatePinner2 = builder.f95695v;
                        certificatePinner2.getClass();
                        Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                        this.certificatePinner = Intrinsics.d(certificatePinner2.f95543b, certificateChainCleaner2) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f95542a, certificateChainCleaner2);
                    }
                    verifyClientState();
                }
            }
        }
        this.sslSocketFactoryOrNull = null;
        this.certificateChainCleaner = null;
        this.x509TrustManager = null;
        this.certificatePinner = CertificatePinner.f95541d;
        verifyClientState();
    }

    private final void verifyClientState() {
        Intrinsics.g(this.interceptors, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        Intrinsics.g(this.networkInterceptors, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<ConnectionSpec> list = this.connectionSpecs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f95573a) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.d(this.certificatePinner, CertificatePinner.f95541d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @d
    @NotNull
    /* renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
    public final Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @d
    /* renamed from: -deprecated_cache, reason: not valid java name and from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @d
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @d
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
    public final ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m205deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
    public final CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
    public final Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final Dns getDns() {
        return this.dns;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @d
    /* renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @d
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m213deprecated_interceptors() {
        return this.interceptors;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m214deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @d
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m216deprecated_protocols() {
        return this.protocols;
    }

    @d
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @d
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @d
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @d
    @NotNull
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m223deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @d
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @NotNull
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: certificateChainCleaner, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @NotNull
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @NotNull
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @NotNull
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    @NotNull
    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @NotNull
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    @NotNull
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    /* renamed from: minWebSocketMessageToCompress, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @NotNull
    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    @NotNull
    public Builder newBuilder() {
        Intrinsics.checkNotNullParameter(this, "okHttpClient");
        Builder builder = new Builder();
        builder.f95674a = dispatcher();
        builder.f95675b = connectionPool();
        k0.u(interceptors(), builder.f95676c);
        k0.u(networkInterceptors(), builder.f95677d);
        builder.f95678e = eventListenerFactory();
        builder.f95679f = retryOnConnectionFailure();
        builder.f95680g = authenticator();
        builder.f95681h = followRedirects();
        builder.f95682i = followSslRedirects();
        builder.f95683j = cookieJar();
        builder.f95684k = cache();
        builder.f95685l = dns();
        builder.f95686m = proxy();
        builder.f95687n = proxySelector();
        builder.f95688o = proxyAuthenticator();
        builder.f95689p = socketFactory();
        builder.f95690q = this.sslSocketFactoryOrNull;
        builder.f95691r = getX509TrustManager();
        builder.f95692s = connectionSpecs();
        builder.f95693t = protocols();
        builder.f95694u = hostnameVerifier();
        builder.f95695v = certificatePinner();
        builder.f95696w = getCertificateChainCleaner();
        builder.f95697x = callTimeoutMillis();
        builder.f95698y = connectTimeoutMillis();
        builder.f95699z = readTimeoutMillis();
        builder.A = writeTimeoutMillis();
        builder.B = pingIntervalMillis();
        builder.C = getMinWebSocketMessageToCompress();
        builder.D = getRouteDatabase();
        return builder;
    }

    @Override // okhttp3.Call.Factory
    @NotNull
    public Call newCall(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    @NotNull
    public WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.f95853i, request, listener, new Random(), this.pingIntervalMillis, this.minWebSocketMessageToCompress);
        realWebSocket.j(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @NotNull
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* renamed from: x509TrustManager, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
