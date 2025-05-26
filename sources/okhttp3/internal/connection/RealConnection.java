package okhttp3.internal.connection;

import ao2.m0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import wo2.x;
import wo2.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: b, reason: collision with root package name */
    public final Route f95920b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f95921c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f95922d;

    /* renamed from: e, reason: collision with root package name */
    public Handshake f95923e;

    /* renamed from: f, reason: collision with root package name */
    public Protocol f95924f;

    /* renamed from: g, reason: collision with root package name */
    public Http2Connection f95925g;

    /* renamed from: h, reason: collision with root package name */
    public y f95926h;

    /* renamed from: i, reason: collision with root package name */
    public x f95927i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f95928j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f95929k;

    /* renamed from: l, reason: collision with root package name */
    public int f95930l;

    /* renamed from: m, reason: collision with root package name */
    public int f95931m;

    /* renamed from: n, reason: collision with root package name */
    public int f95932n;

    /* renamed from: o, reason: collision with root package name */
    public int f95933o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f95934p;

    /* renamed from: q, reason: collision with root package name */
    public long f95935q;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95936a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f95936a = iArr;
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f95920b = route;
        this.f95933o = 1;
        this.f95934p = new ArrayList();
        this.f95935q = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient client, Route failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f95755b.type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.f95754a;
            address.f95487h.connectFailed(address.f95488i.j(), failedRoute.f95755b.address(), failure);
        }
        RouteDatabase routeDatabase = client.getRouteDatabase();
        synchronized (routeDatabase) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            routeDatabase.f95948a.add(failedRoute);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final synchronized void a(Http2Connection connection, Settings settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f95933o = (settings.f96179a & 16) != 0 ? settings.f96180b[4] : Integer.MAX_VALUE;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r14, int r15, int r16, int r17, boolean r18, okhttp3.internal.connection.RealCall r19, okhttp3.EventListener r20) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.c(int, int, int, int, boolean, okhttp3.internal.connection.RealCall, okhttp3.EventListener):void");
    }

    public final void e(int i13, int i14, RealCall realCall, EventListener eventListener) {
        Socket createSocket;
        Route route = this.f95920b;
        Proxy proxy = route.f95755b;
        Address address = route.f95754a;
        Proxy.Type type = proxy.type();
        int i15 = type == null ? -1 : WhenMappings.f95936a[type.ordinal()];
        if (i15 == 1 || i15 == 2) {
            createSocket = address.f95481b.createSocket();
            Intrinsics.f(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f95921c = createSocket;
        eventListener.j(realCall, this.f95920b.f95756c, proxy);
        createSocket.setSoTimeout(i14);
        try {
            Platform.f96214a.getClass();
            Platform.f96215b.e(createSocket, this.f95920b.f95756c, i13);
            try {
                this.f95926h = m0.i(m0.m0(createSocket));
                this.f95927i = m0.h(m0.j0(createSocket));
            } catch (NullPointerException e13) {
                if (Intrinsics.d(e13.getMessage(), "throw with null exception")) {
                    throw new IOException(e13);
                }
            }
        } catch (ConnectException e14) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f95920b.f95756c);
            connectException.initCause(e14);
            throw connectException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0163, code lost:
    
        if (r12 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0166, code lost:
    
        r2 = r17.f95921c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0168, code lost:
    
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016a, code lost:
    
        okhttp3.internal.Util.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x016d, code lost:
    
        r17.f95921c = null;
        r17.f95927i = null;
        r17.f95926h = null;
        r22.h(r21, r7.f95756c, r7.f95755b, null);
        r11 = r11 + 1;
        r1 = r19;
        r5 = r7;
        r9 = r8;
        r3 = r22;
        r4 = r16;
        r7 = null;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0194, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r18, int r19, int r20, okhttp3.internal.connection.RealCall r21, okhttp3.EventListener r22) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.f(int, int, int, okhttp3.internal.connection.RealCall, okhttp3.EventListener):void");
    }

    public final void g(ConnectionSpecSelector connectionSpecSelector, int i13, RealCall realCall, EventListener eventListener) {
        SSLSocket sSLSocket;
        Protocol protocol;
        Address address = this.f95920b.f95754a;
        if (address.f95482c == null) {
            List list = address.f95489j;
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol2)) {
                this.f95922d = this.f95921c;
                this.f95924f = Protocol.HTTP_1_1;
                return;
            } else {
                this.f95922d = this.f95921c;
                this.f95924f = protocol2;
                m(i13);
                return;
            }
        }
        eventListener.C(realCall);
        Address address2 = this.f95920b.f95754a;
        SSLSocketFactory sSLSocketFactory = address2.f95482c;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            Intrinsics.f(sSLSocketFactory);
            Socket socket = this.f95921c;
            HttpUrl httpUrl = address2.f95488i;
            Socket createSocket = sSLSocketFactory.createSocket(socket, httpUrl.f95634d, httpUrl.f95635e, true);
            Intrinsics.g(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            ConnectionSpec a13 = connectionSpecSelector.a(sSLSocket);
            if (a13.f95574b) {
                Platform.f96214a.getClass();
                Platform.f96215b.d(sSLSocket, address2.f95488i.f95634d, address2.f95489j);
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.f95618e;
            Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
            companion.getClass();
            Handshake a14 = Handshake.Companion.a(sslSocketSession);
            HostnameVerifier hostnameVerifier = address2.f95483d;
            Intrinsics.f(hostnameVerifier);
            if (!hostnameVerifier.verify(address2.f95488i.f95634d, sslSocketSession)) {
                List a15 = a14.a();
                if (!(!a15.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + address2.f95488i.f95634d + " not verified (no certificates)");
                }
                Object obj = a15.get(0);
                Intrinsics.g(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb3 = new StringBuilder("\n              |Hostname ");
                sb3.append(address2.f95488i.f95634d);
                sb3.append(" not verified:\n              |    certificate: ");
                CertificatePinner.f95540c.getClass();
                sb3.append(CertificatePinner.Companion.a(x509Certificate));
                sb3.append("\n              |    DN: ");
                sb3.append(x509Certificate.getSubjectDN().getName());
                sb3.append("\n              |    subjectAltNames: ");
                OkHostnameVerifier.f96256a.getClass();
                sb3.append(OkHostnameVerifier.a(x509Certificate));
                sb3.append("\n              ");
                throw new SSLPeerUnverifiedException(t.c(sb3.toString()));
            }
            CertificatePinner certificatePinner = address2.f95484e;
            Intrinsics.f(certificatePinner);
            this.f95923e = new Handshake(a14.f95619a, a14.f95620b, a14.f95621c, new RealConnection$connectTls$1(certificatePinner, a14, address2));
            certificatePinner.b(new RealConnection$connectTls$2(this), address2.f95488i.f95634d);
            if (a13.f95574b) {
                Platform.f96214a.getClass();
                str = Platform.f96215b.f(sSLSocket);
            }
            this.f95922d = sSLSocket;
            this.f95926h = m0.i(m0.m0(sSLSocket));
            this.f95927i = m0.h(m0.j0(sSLSocket));
            if (str != null) {
                Protocol.INSTANCE.getClass();
                protocol = Protocol.Companion.a(str);
            } else {
                protocol = Protocol.HTTP_1_1;
            }
            this.f95924f = protocol;
            Platform.f96214a.getClass();
            Platform.f96215b.a(sSLSocket);
            eventListener.B(realCall, this.f95923e);
            if (this.f95924f == Protocol.HTTP_2) {
                m(i13);
            }
        } catch (Throwable th4) {
            th = th4;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                Platform.f96214a.getClass();
                Platform.f96215b.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                Util.d(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r8.f95483d == okhttp3.internal.tls.OkHostnameVerifier.f96256a) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (n(r1) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        r8 = r8.f95484e;
        kotlin.jvm.internal.Intrinsics.f(r8);
        r9 = r1.f95634d;
        r0 = r7.f95923e;
        kotlin.jvm.internal.Intrinsics.f(r0);
        r8.a(r9, r0.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(okhttp3.Address r8, java.util.ArrayList r9) {
        /*
            r7 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            byte[] r0 = okhttp3.internal.Util.f95757a
            java.util.ArrayList r0 = r7.f95934p
            int r0 = r0.size()
            int r1 = r7.f95933o
            r2 = 0
            if (r0 >= r1) goto L91
            boolean r0 = r7.f95928j
            if (r0 == 0) goto L18
            goto L91
        L18:
            okhttp3.Route r0 = r7.f95920b
            okhttp3.Address r1 = r0.f95754a
            boolean r1 = r1.a(r8)
            if (r1 != 0) goto L23
            return r2
        L23:
            okhttp3.HttpUrl r1 = r8.f95488i
            java.lang.String r3 = r1.f95634d
            okhttp3.Address r4 = r0.f95754a
            okhttp3.HttpUrl r4 = r4.f95488i
            java.lang.String r4 = r4.f95634d
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            r4 = 1
            if (r3 == 0) goto L35
            return r4
        L35:
            okhttp3.internal.http2.Http2Connection r3 = r7.f95925g
            if (r3 != 0) goto L3a
            return r2
        L3a:
            if (r9 == 0) goto L91
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L43
            goto L91
        L43:
            java.util.Iterator r9 = r9.iterator()
        L47:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r9.next()
            okhttp3.Route r3 = (okhttp3.Route) r3
            java.net.Proxy r5 = r3.f95755b
            java.net.Proxy$Type r5 = r5.type()
            java.net.Proxy$Type r6 = java.net.Proxy.Type.DIRECT
            if (r5 != r6) goto L47
            java.net.Proxy r5 = r0.f95755b
            java.net.Proxy$Type r5 = r5.type()
            if (r5 != r6) goto L47
            java.net.InetSocketAddress r3 = r3.f95756c
            java.net.InetSocketAddress r5 = r0.f95756c
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r5, r3)
            if (r3 == 0) goto L47
            okhttp3.internal.tls.OkHostnameVerifier r9 = okhttp3.internal.tls.OkHostnameVerifier.f96256a
            javax.net.ssl.HostnameVerifier r0 = r8.f95483d
            if (r0 == r9) goto L76
            return r2
        L76:
            boolean r9 = r7.n(r1)
            if (r9 != 0) goto L7d
            return r2
        L7d:
            okhttp3.CertificatePinner r8 = r8.f95484e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L91
            kotlin.jvm.internal.Intrinsics.f(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L91
            java.lang.String r9 = r1.f95634d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L91
            okhttp3.Handshake r0 = r7.f95923e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L91
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L91
            java.util.List r0 = r0.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L91
            r8.a(r9, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L91
            return r4
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.h(okhttp3.Address, java.util.ArrayList):boolean");
    }

    public final boolean i(boolean z13) {
        long j13;
        byte[] bArr = Util.f95757a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f95921c;
        Intrinsics.f(socket);
        Socket socket2 = this.f95922d;
        Intrinsics.f(socket2);
        y yVar = this.f95926h;
        Intrinsics.f(yVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f95925g;
        if (http2Connection == null) {
            synchronized (this) {
                j13 = nanoTime - this.f95935q;
            }
            if (j13 < 10000000000L || !z13) {
                return true;
            }
            return Util.q(socket2, yVar);
        }
        synchronized (http2Connection) {
            if (http2Connection.f96053g) {
                return false;
            }
            if (http2Connection.f96062p < http2Connection.f96061o) {
                if (nanoTime >= http2Connection.f96063q) {
                    return false;
                }
            }
            return true;
        }
    }

    public final ExchangeCodec j(OkHttpClient client, RealInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f95922d;
        Intrinsics.f(socket);
        y yVar = this.f95926h;
        Intrinsics.f(yVar);
        x xVar = this.f95927i;
        Intrinsics.f(xVar);
        Http2Connection http2Connection = this.f95925g;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        int i13 = chain.f95976g;
        socket.setSoTimeout(i13);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.f130749a.timeout().g(i13, timeUnit);
        xVar.f130746a.timeout().g(chain.f95977h, timeUnit);
        return new Http1ExchangeCodec(client, this, yVar, xVar);
    }

    public final synchronized void k() {
        this.f95929k = true;
    }

    public final synchronized void l() {
        this.f95928j = true;
    }

    public final void m(int i13) {
        Socket socket = this.f95922d;
        Intrinsics.f(socket);
        y source = this.f95926h;
        Intrinsics.f(source);
        x sink = this.f95927i;
        Intrinsics.f(sink);
        socket.setSoTimeout(0);
        TaskRunner taskRunner = TaskRunner.f95853i;
        Http2Connection.Builder builder = new Http2Connection.Builder(taskRunner);
        String peerName = this.f95920b.f95754a.f95488i.f95634d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        builder.f96107c = socket;
        String str = Util.f95763g + ' ' + peerName;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        builder.f96108d = str;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        builder.f96109e = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        builder.f96110f = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        builder.f96111g = this;
        builder.f96113i = i13;
        Http2Connection http2Connection = new Http2Connection(builder);
        this.f95925g = http2Connection;
        Http2Connection.B.getClass();
        Settings settings = Http2Connection.C;
        this.f95933o = (settings.f96179a & 16) != 0 ? settings.f96180b[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Http2Writer http2Writer = http2Connection.f96071y;
        synchronized (http2Writer) {
            try {
                if (http2Writer.f96168e) {
                    throw new IOException("closed");
                }
                if (http2Writer.f96165b) {
                    Logger logger = Http2Writer.f96163g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(Util.i(">> CONNECTION " + Http2.f96043b.c(), new Object[0]));
                    }
                    http2Writer.f96164a.t1(Http2.f96043b);
                    http2Writer.f96164a.flush();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Http2Writer http2Writer2 = http2Connection.f96071y;
        Settings settings2 = http2Connection.f96064r;
        synchronized (http2Writer2) {
            try {
                Intrinsics.checkNotNullParameter(settings2, "settings");
                if (http2Writer2.f96168e) {
                    throw new IOException("closed");
                }
                http2Writer2.d(0, Integer.bitCount(settings2.f96179a) * 6, 4, 0);
                int i14 = 0;
                while (i14 < 10) {
                    if (((1 << i14) & settings2.f96179a) != 0) {
                        http2Writer2.f96164a.g1(i14 != 4 ? i14 != 7 ? i14 : 4 : 3);
                        http2Writer2.f96164a.I(settings2.f96180b[i14]);
                    }
                    i14++;
                }
                http2Writer2.f96164a.flush();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (http2Connection.f96064r.a() != 65535) {
            http2Connection.f96071y.h(0, r0 - 65535);
        }
        TaskQueue f13 = taskRunner.f();
        final String str2 = http2Connection.f96050d;
        final Http2Connection.ReaderRunnable readerRunnable = http2Connection.f96072z;
        f13.d(new Task(str2) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long b() {
                readerRunnable.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final boolean n(HttpUrl httpUrl) {
        Handshake handshake;
        byte[] bArr = Util.f95757a;
        HttpUrl httpUrl2 = this.f95920b.f95754a.f95488i;
        if (httpUrl.f95635e != httpUrl2.f95635e) {
            return false;
        }
        String str = httpUrl2.f95634d;
        String str2 = httpUrl.f95634d;
        if (Intrinsics.d(str2, str)) {
            return true;
        }
        if (this.f95929k || (handshake = this.f95923e) == null) {
            return false;
        }
        List a13 = handshake.a();
        if (!(!a13.isEmpty())) {
            return false;
        }
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f96256a;
        Object obj = a13.get(0);
        Intrinsics.g(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        okHostnameVerifier.getClass();
        return OkHostnameVerifier.d(str2, (X509Certificate) obj);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb3 = new StringBuilder("Connection{");
        Route route = this.f95920b;
        sb3.append(route.f95754a.f95488i.f95634d);
        sb3.append(':');
        sb3.append(route.f95754a.f95488i.f95635e);
        sb3.append(", proxy=");
        sb3.append(route.f95755b);
        sb3.append(" hostAddress=");
        sb3.append(route.f95756c);
        sb3.append(" cipherSuite=");
        Handshake handshake = this.f95923e;
        if (handshake == null || (obj = handshake.f95620b) == null) {
            obj = "none";
        }
        sb3.append(obj);
        sb3.append(" protocol=");
        sb3.append(this.f95924f);
        sb3.append('}');
        return sb3.toString();
    }
}
