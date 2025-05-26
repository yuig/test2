package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.platform.Platform;
import wo2.e;
import xk2.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RealCall implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f95897a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f95898b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f95899c;

    /* renamed from: d, reason: collision with root package name */
    public final RealConnectionPool f95900d;

    /* renamed from: e, reason: collision with root package name */
    public final EventListener f95901e;

    /* renamed from: f, reason: collision with root package name */
    public final RealCall$timeout$1 f95902f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f95903g;

    /* renamed from: h, reason: collision with root package name */
    public Object f95904h;

    /* renamed from: i, reason: collision with root package name */
    public ExchangeFinder f95905i;

    /* renamed from: j, reason: collision with root package name */
    public RealConnection f95906j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f95907k;

    /* renamed from: l, reason: collision with root package name */
    public Exchange f95908l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f95909m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f95910n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95911o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f95912p;

    /* renamed from: q, reason: collision with root package name */
    public volatile Exchange f95913q;

    /* renamed from: r, reason: collision with root package name */
    public volatile RealConnection f95914r;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class AsyncCall implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Callback f95915a;

        /* renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f95916b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RealCall f95917c;

        public AsyncCall(RealCall realCall, Callback responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f95917c = realCall;
            this.f95915a = responseCallback;
            this.f95916b = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Dispatcher dispatcher;
            String str = "OkHttp " + this.f95917c.f95898b.f95700a.h();
            RealCall realCall = this.f95917c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                realCall.f95902f.j();
                boolean z13 = false;
                try {
                    try {
                    } catch (IOException e13) {
                        e = e13;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        this.f95915a.onResponse(realCall, realCall.h());
                        dispatcher = realCall.f95897a.dispatcher();
                    } catch (IOException e14) {
                        e = e14;
                        z13 = true;
                        if (z13) {
                            Platform.f96214a.getClass();
                            Platform platform = Platform.f96215b;
                            String str2 = "Callback failure for " + RealCall.a(realCall);
                            platform.getClass();
                            Platform.i(4, str2, e);
                        } else {
                            this.f95915a.onFailure(realCall, e);
                        }
                        dispatcher = realCall.f95897a.dispatcher();
                        dispatcher.b(this);
                    } catch (Throwable th4) {
                        th = th4;
                        z13 = true;
                        realCall.cancel();
                        if (!z13) {
                            IOException iOException = new IOException("canceled due to " + th);
                            f.a(iOException, th);
                            this.f95915a.onFailure(realCall, iOException);
                        }
                        throw th;
                    }
                    dispatcher.b(this);
                } catch (Throwable th5) {
                    realCall.f95897a.dispatcher().b(this);
                    throw th5;
                }
            } finally {
                currentThread.setName(name);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f95918a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f95918a = obj;
        }

        /* renamed from: a, reason: from getter */
        public final Object getF95918a() {
            return this.f95918a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [okhttp3.internal.connection.RealCall$timeout$1, wo2.i0] */
    public RealCall(OkHttpClient client, Request originalRequest, boolean z13) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f95897a = client;
        this.f95898b = originalRequest;
        this.f95899c = z13;
        this.f95900d = client.connectionPool().f95570a;
        this.f95901e = client.eventListenerFactory().a(this);
        ?? r43 = new e() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // wo2.e
            public final void m() {
                RealCall.this.cancel();
            }
        };
        r43.g(client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.f95902f = r43;
        this.f95903g = new AtomicBoolean();
        this.f95911o = true;
    }

    public static final String a(RealCall realCall) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(realCall.f95912p ? "canceled " : "");
        sb3.append(realCall.f95899c ? "web socket" : "call");
        sb3.append(" to ");
        sb3.append(realCall.f95898b.f95700a.h());
        return sb3.toString();
    }

    public final void b(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = Util.f95757a;
        if (this.f95906j != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f95906j = connection;
        connection.f95934p.add(new CallReference(this, this.f95904h));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket k13;
        byte[] bArr = Util.f95757a;
        RealConnection realConnection = this.f95906j;
        if (realConnection != null) {
            synchronized (realConnection) {
                k13 = k();
            }
            if (this.f95906j == null) {
                if (k13 != null) {
                    Util.d(k13);
                }
                this.f95901e.l(this, realConnection);
            } else if (k13 != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.f95907k && k()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            EventListener eventListener = this.f95901e;
            Intrinsics.f(interruptedIOException);
            eventListener.e(this, interruptedIOException);
        } else {
            this.f95901e.d(this);
        }
        return interruptedIOException;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        Socket socket;
        if (this.f95912p) {
            return;
        }
        this.f95912p = true;
        Exchange exchange = this.f95913q;
        if (exchange != null) {
            exchange.f95872d.cancel();
        }
        RealConnection realConnection = this.f95914r;
        if (realConnection != null && (socket = realConnection.f95921c) != null) {
            Util.d(socket);
        }
        this.f95901e.g(this);
    }

    public final Object clone() {
        return new RealCall(this.f95897a, this.f95898b, this.f95899c);
    }

    @Override // okhttp3.Call
    /* renamed from: d, reason: from getter */
    public final Request getF95898b() {
        return this.f95898b;
    }

    @Override // okhttp3.Call
    public final Response e() {
        if (!this.f95903g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        j();
        Platform.f96214a.getClass();
        this.f95904h = Platform.f96215b.g();
        this.f95901e.f(this);
        try {
            Dispatcher dispatcher = this.f95897a.dispatcher();
            synchronized (dispatcher) {
                Intrinsics.checkNotNullParameter(this, "call");
                dispatcher.f95608f.add(this);
            }
            return h();
        } finally {
            Dispatcher dispatcher2 = this.f95897a.dispatcher();
            dispatcher2.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            dispatcher2.a(dispatcher2.f95608f, this);
        }
    }

    @Override // okhttp3.Call
    /* renamed from: f, reason: from getter */
    public final boolean getF95912p() {
        return this.f95912p;
    }

    public final void g(boolean z13) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f95911o) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.f80348a;
        }
        if (z13 && (exchange = this.f95913q) != null) {
            exchange.c();
        }
        this.f95908l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response h() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.f95897a
            java.util.List r0 = r0.interceptors()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.k0.u(r0, r2)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.f95897a
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.f95897a
            okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.f95897a
            okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.f95864a
            r2.add(r0)
            boolean r0 = r11.f95899c
            if (r0 != 0) goto L4a
            okhttp3.OkHttpClient r0 = r11.f95897a
            java.util.List r0 = r0.networkInterceptors()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.k0.u(r0, r2)
        L4a:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.f95899c
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.Request r5 = r11.f95898b
            okhttp3.OkHttpClient r0 = r11.f95897a
            int r6 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.f95897a
            int r7 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.f95897a
            int r8 = r0.writeTimeoutMillis()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.f95898b     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            okhttp3.Response r2 = r9.b(r2)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            boolean r3 = r11.f95912p     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            if (r3 != 0) goto L81
            r11.j(r0)
            return r2
        L81:
            okhttp3.internal.Util.c(r2)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            throw r2     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
        L8c:
            r2 = move-exception
            goto L9e
        L8e:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.j(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.Intrinsics.g(r1, r3)     // Catch: java.lang.Throwable -> L9a
            throw r1     // Catch: java.lang.Throwable -> L9a
        L9a:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L9e:
            if (r1 != 0) goto La3
            r11.j(r0)
        La3:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.h():okhttp3.Response");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001c), top: B:49:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException i(okhttp3.internal.connection.Exchange r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.connection.Exchange r0 = r2.f95913q
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r3 != 0) goto Le
            return r6
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.f95909m     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            goto L1a
        L18:
            r3 = move-exception
            goto L61
        L1a:
            if (r5 == 0) goto L41
            boolean r1 = r2.f95910n     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L41
        L20:
            if (r4 == 0) goto L24
            r2.f95909m = r0     // Catch: java.lang.Throwable -> L18
        L24:
            if (r5 == 0) goto L28
            r2.f95910n = r0     // Catch: java.lang.Throwable -> L18
        L28:
            boolean r4 = r2.f95909m     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            boolean r5 = r2.f95910n     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != 0) goto L3e
            boolean r4 = r2.f95910n     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            boolean r4 = r2.f95911o     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            r0 = r3
        L3e:
            r4 = r0
            r0 = r5
            goto L42
        L41:
            r4 = r0
        L42:
            kotlin.Unit r5 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L59
            r5 = 0
            r2.f95913q = r5
            okhttp3.internal.connection.RealConnection r5 = r2.f95906j
            if (r5 == 0) goto L59
            monitor-enter(r5)
            int r0 = r5.f95931m     // Catch: java.lang.Throwable -> L56
            int r0 = r0 + r3
            r5.f95931m = r0     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            goto L59
        L56:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L59:
            if (r4 == 0) goto L60
            java.io.IOException r3 = r2.c(r6)
            return r3
        L60:
            return r6
        L61:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.i(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException j(IOException iOException) {
        boolean z13;
        synchronized (this) {
            try {
                z13 = false;
                if (this.f95911o) {
                    this.f95911o = false;
                    if (!this.f95909m && !this.f95910n) {
                        z13 = true;
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z13 ? c(iOException) : iOException;
    }

    public final Socket k() {
        RealConnection connection = this.f95906j;
        Intrinsics.f(connection);
        byte[] bArr = Util.f95757a;
        ArrayList arrayList = connection.f95934p;
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (Intrinsics.d(((Reference) it.next()).get(), this)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i13);
        this.f95906j = null;
        if (arrayList.isEmpty()) {
            connection.f95935q = System.nanoTime();
            RealConnectionPool realConnectionPool = this.f95900d;
            realConnectionPool.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            byte[] bArr2 = Util.f95757a;
            boolean z13 = connection.f95928j;
            TaskQueue taskQueue = realConnectionPool.f95944c;
            if (z13 || realConnectionPool.f95942a == 0) {
                connection.f95928j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = realConnectionPool.f95946e;
                concurrentLinkedQueue.remove(connection);
                if (concurrentLinkedQueue.isEmpty()) {
                    taskQueue.a();
                }
                Socket socket = connection.f95922d;
                Intrinsics.f(socket);
                return socket;
            }
            taskQueue.d(realConnectionPool.f95945d, 0L);
        }
        return null;
    }

    @Override // okhttp3.Call
    public final void k1(Callback responseCallback) {
        AsyncCall other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f95903g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        Platform.f96214a.getClass();
        this.f95904h = Platform.f96215b.g();
        this.f95901e.f(this);
        Dispatcher dispatcher = this.f95897a.dispatcher();
        AsyncCall call = new AsyncCall(this, responseCallback);
        dispatcher.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (dispatcher) {
            dispatcher.f95606d.add(call);
            if (!this.f95899c) {
                String str = this.f95898b.f95700a.f95634d;
                Iterator it = dispatcher.f95607e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = dispatcher.f95606d.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            } else {
                                other = (AsyncCall) it2.next();
                                if (Intrinsics.d(other.f95917c.f95898b.f95700a.f95634d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        other = (AsyncCall) it.next();
                        if (Intrinsics.d(other.f95917c.f95898b.f95700a.f95634d, str)) {
                            break;
                        }
                    }
                }
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f95916b = other.f95916b;
                }
            }
            Unit unit = Unit.f80348a;
        }
        dispatcher.c();
    }

    public final void l() {
        if (!(!this.f95907k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f95907k = true;
        k();
    }
}
