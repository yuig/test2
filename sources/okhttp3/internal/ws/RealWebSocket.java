package okhttp3.internal.ws;

import a.a;
import ep.b;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.z;
import m60.f0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection$newWebSocketStreams$1;
import okhttp3.internal.ws.WebSocketExtensions;
import okhttp3.internal.ws.WebSocketReader;
import t3.s1;
import wo2.g;
import wo2.j;
import wo2.k;
import wo2.l;
import wo2.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Close", "Companion", "Message", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* renamed from: x, reason: collision with root package name */
    public static final List f96266x;

    /* renamed from: a, reason: collision with root package name */
    public final Request f96267a;

    /* renamed from: b, reason: collision with root package name */
    public final WebSocketListener f96268b;

    /* renamed from: c, reason: collision with root package name */
    public final Random f96269c;

    /* renamed from: d, reason: collision with root package name */
    public final long f96270d;

    /* renamed from: e, reason: collision with root package name */
    public WebSocketExtensions f96271e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96272f;

    /* renamed from: g, reason: collision with root package name */
    public final String f96273g;

    /* renamed from: h, reason: collision with root package name */
    public RealCall f96274h;

    /* renamed from: i, reason: collision with root package name */
    public Task f96275i;

    /* renamed from: j, reason: collision with root package name */
    public WebSocketReader f96276j;

    /* renamed from: k, reason: collision with root package name */
    public WebSocketWriter f96277k;

    /* renamed from: l, reason: collision with root package name */
    public final TaskQueue f96278l;

    /* renamed from: m, reason: collision with root package name */
    public String f96279m;

    /* renamed from: n, reason: collision with root package name */
    public Streams f96280n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f96281o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayDeque f96282p;

    /* renamed from: q, reason: collision with root package name */
    public long f96283q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f96284r;

    /* renamed from: s, reason: collision with root package name */
    public int f96285s;

    /* renamed from: t, reason: collision with root package name */
    public String f96286t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f96287u;

    /* renamed from: v, reason: collision with root package name */
    public int f96288v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f96289w;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Close {

        /* renamed from: a, reason: collision with root package name */
        public final int f96293a;

        /* renamed from: b, reason: collision with root package name */
        public final m f96294b;

        /* renamed from: c, reason: collision with root package name */
        public final long f96295c = 60000;

        public Close(int i13, m mVar) {
            this.f96293a = i13;
            this.f96294b = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Message {

        /* renamed from: a, reason: collision with root package name */
        public final int f96296a;

        /* renamed from: b, reason: collision with root package name */
        public final m f96297b;

        public Message(int i13, m data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f96296a = i13;
            this.f96297b = data;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static abstract class Streams implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f96298a;

        /* renamed from: b, reason: collision with root package name */
        public final l f96299b;

        /* renamed from: c, reason: collision with root package name */
        public final k f96300c;

        public Streams(l source, k sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f96298a = true;
            this.f96299b = source;
            this.f96300c = sink;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class WriterTask extends Task {
        public WriterTask() {
            super(a.p(new StringBuilder(), RealWebSocket.this.f96279m, " writer"), true);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long b() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            try {
                return realWebSocket.p() ? 0L : -1L;
            } catch (IOException e13) {
                realWebSocket.k(e13, null);
                return -1L;
            }
        }
    }

    static {
        new Companion(0);
        f96266x = e0.b(Protocol.HTTP_1_1);
    }

    public RealWebSocket(TaskRunner taskRunner, Request originalRequest, WebSocketListener listener, Random random, long j13, long j14) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f96267a = originalRequest;
        this.f96268b = listener;
        this.f96269c = random;
        this.f96270d = j13;
        this.f96271e = null;
        this.f96272f = j14;
        this.f96278l = taskRunner.f();
        this.f96281o = new ArrayDeque();
        this.f96282p = new ArrayDeque();
        this.f96285s = -1;
        if (!Intrinsics.d("GET", originalRequest.f95701b)) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.f95701b).toString());
        }
        m mVar = m.f130712d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f80348a;
        this.f96273g = wo2.a.a(f0.q0(bArr).f130713a);
    }

    @Override // okhttp3.WebSocket
    public final boolean a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m mVar = m.f130712d;
        return o(1, f0.h0(text));
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f96268b.d(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void c(m payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f96289w = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void d(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f96268b.e(this, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void e(m payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f96287u && (!this.f96284r || !this.f96282p.isEmpty())) {
                this.f96281o.add(payload);
                n();
            }
        } finally {
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean f(int i13, String str) {
        m mVar;
        synchronized (this) {
            try {
                WebSocketProtocol.f96311a.getClass();
                String a13 = WebSocketProtocol.a(i13);
                if (a13 != null) {
                    throw new IllegalArgumentException(a13.toString());
                }
                if (str != null) {
                    m mVar2 = m.f130712d;
                    mVar = f0.h0(str);
                    if (mVar.f130713a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                } else {
                    mVar = null;
                }
                if (!this.f96287u && !this.f96284r) {
                    this.f96284r = true;
                    this.f96282p.add(new Close(i13, mVar));
                    n();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean g(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return o(2, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void h(int i13, String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (i13 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            try {
                if (this.f96285s != -1) {
                    throw new IllegalStateException("already closed".toString());
                }
                this.f96285s = i13;
                this.f96286t = reason;
                streams = null;
                if (this.f96284r && this.f96282p.isEmpty()) {
                    Streams streams2 = this.f96280n;
                    this.f96280n = null;
                    webSocketReader = this.f96276j;
                    this.f96276j = null;
                    webSocketWriter = this.f96277k;
                    this.f96277k = null;
                    this.f96278l.g();
                    streams = streams2;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            this.f96268b.b(this, i13, reason);
            if (streams != null) {
                this.f96268b.a(this, reason);
            }
        } finally {
            if (streams != null) {
                Util.c(streams);
            }
            if (webSocketReader != null) {
                Util.c(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.c(webSocketWriter);
            }
        }
    }

    public final void i(Response response, Exchange exchange) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.f95723d != 101) {
            StringBuilder sb3 = new StringBuilder("Expected HTTP 101 response but was '");
            sb3.append(response.f95723d);
            sb3.append(' ');
            throw new ProtocolException(b.k(sb3, response.f95722c, '\''));
        }
        String c13 = response.c("Connection", null);
        if (!z.i("Upgrade", c13, true)) {
            throw new ProtocolException(s1.b("Expected 'Connection' header value 'Upgrade' but was '", c13, '\''));
        }
        String c14 = response.c("Upgrade", null);
        if (!z.i("websocket", c14, true)) {
            throw new ProtocolException(s1.b("Expected 'Upgrade' header value 'websocket' but was '", c14, '\''));
        }
        String c15 = response.c("Sec-WebSocket-Accept", null);
        m mVar = m.f130712d;
        String a13 = wo2.a.a(f0.h0(this.f96273g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").a("SHA-1").f130713a);
        if (Intrinsics.d(a13, c15)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a13 + "' but was '" + c15 + '\'');
    }

    public final void j(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Request request = this.f96267a;
        if (request.a("Sec-WebSocket-Extensions") != null) {
            k(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient.Builder newBuilder = client.newBuilder();
        EventListener$Companion$NONE$1 eventListener = EventListener.f95611a;
        newBuilder.getClass();
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        byte[] bArr = Util.f95757a;
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        newBuilder.f95678e = new uo2.a(eventListener);
        newBuilder.d(f96266x);
        OkHttpClient okHttpClient = new OkHttpClient(newBuilder);
        Request.Builder b13 = request.b();
        b13.d("Upgrade", "websocket");
        b13.d("Connection", "Upgrade");
        b13.d("Sec-WebSocket-Key", this.f96273g);
        b13.d("Sec-WebSocket-Version", "13");
        b13.d("Sec-WebSocket-Extensions", "permessage-deflate");
        final Request b14 = b13.b();
        RealCall realCall = new RealCall(okHttpClient, b14, true);
        this.f96274h = realCall;
        realCall.k1(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException e13) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e13, "e");
                RealWebSocket.this.k(e13, null);
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                Exchange exchange = response.f95732m;
                try {
                    RealWebSocket.this.i(response, exchange);
                    RealConnection$newWebSocketStreams$1 g13 = exchange.g();
                    WebSocketExtensions.Companion companion = WebSocketExtensions.f96304g;
                    Headers responseHeaders = response.f95725f;
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    int size = responseHeaders.size();
                    int i13 = 0;
                    int i14 = 0;
                    boolean z13 = false;
                    boolean z14 = false;
                    boolean z15 = false;
                    boolean z16 = false;
                    Integer num = null;
                    Integer num2 = null;
                    while (i14 < size) {
                        if (z.i(responseHeaders.d(i14), "Sec-WebSocket-Extensions", true)) {
                            String j13 = responseHeaders.j(i14);
                            int i15 = i13;
                            while (i15 < j13.length()) {
                                int g14 = Util.g(j13, ',', i15, i13, 4);
                                int e13 = Util.e(j13, ';', i15, g14);
                                String D = Util.D(i15, e13, j13);
                                int i16 = e13 + 1;
                                if (z.i(D, "permessage-deflate", true)) {
                                    if (z13) {
                                        z16 = true;
                                    }
                                    i15 = i16;
                                    while (i15 < g14) {
                                        int e14 = Util.e(j13, ';', i15, g14);
                                        int e15 = Util.e(j13, '=', i15, e14);
                                        String D2 = Util.D(i15, e15, j13);
                                        String T = e15 < e14 ? StringsKt.T(Util.D(e15 + 1, e14, j13)) : null;
                                        int i17 = e14 + 1;
                                        if (z.i(D2, "client_max_window_bits", true)) {
                                            if (num != null) {
                                                z16 = true;
                                            }
                                            num = T != null ? StringsKt.toIntOrNull(T) : null;
                                            if (num == null) {
                                                i15 = i17;
                                                z16 = true;
                                            } else {
                                                i15 = i17;
                                            }
                                        } else if (z.i(D2, "client_no_context_takeover", true)) {
                                            if (z14) {
                                                z16 = true;
                                            }
                                            if (T != null) {
                                                z16 = true;
                                            }
                                            i15 = i17;
                                            z14 = true;
                                        } else {
                                            if (z.i(D2, "server_max_window_bits", true)) {
                                                if (num2 != null) {
                                                    z16 = true;
                                                }
                                                num2 = T != null ? StringsKt.toIntOrNull(T) : null;
                                                if (num2 != null) {
                                                    i15 = i17;
                                                }
                                            } else if (z.i(D2, "server_no_context_takeover", true)) {
                                                if (z15) {
                                                    z16 = true;
                                                }
                                                if (T != null) {
                                                    z16 = true;
                                                }
                                                i15 = i17;
                                                z15 = true;
                                            }
                                            i15 = i17;
                                            z16 = true;
                                        }
                                    }
                                    z13 = true;
                                } else {
                                    i15 = i16;
                                    z16 = true;
                                }
                                i13 = 0;
                            }
                        }
                        i14++;
                        i13 = 0;
                    }
                    RealWebSocket.this.f96271e = new WebSocketExtensions(z13, num, z14, num2, z15, z16);
                    if (z16 || num != null || (num2 != null && !new IntRange(8, 15, 1).f(num2.intValue()))) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.f96282p.clear();
                            realWebSocket.f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.l(Util.f95763g + " WebSocket " + b14.f95700a.h(), g13);
                        RealWebSocket realWebSocket2 = RealWebSocket.this;
                        realWebSocket2.f96268b.f(realWebSocket2, response);
                        RealWebSocket.this.m();
                    } catch (Exception e16) {
                        RealWebSocket.this.k(e16, null);
                    }
                } catch (IOException e17) {
                    RealWebSocket.this.k(e17, response);
                    Util.c(response);
                    if (exchange != null) {
                        exchange.a(-1L, true, true, null);
                    }
                }
            }
        });
    }

    public final void k(Exception e13, Response response) {
        Intrinsics.checkNotNullParameter(e13, "e");
        synchronized (this) {
            if (this.f96287u) {
                return;
            }
            this.f96287u = true;
            Streams streams = this.f96280n;
            this.f96280n = null;
            WebSocketReader webSocketReader = this.f96276j;
            this.f96276j = null;
            WebSocketWriter webSocketWriter = this.f96277k;
            this.f96277k = null;
            this.f96278l.g();
            Unit unit = Unit.f80348a;
            try {
                this.f96268b.c(this, e13);
            } finally {
                if (streams != null) {
                    Util.c(streams);
                }
                if (webSocketReader != null) {
                    Util.c(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.c(webSocketWriter);
                }
            }
        }
    }

    public final void l(String name, RealConnection$newWebSocketStreams$1 streams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.f96271e;
        Intrinsics.f(webSocketExtensions);
        synchronized (this) {
            try {
                this.f96279m = name;
                this.f96280n = streams;
                boolean z13 = streams.f96298a;
                this.f96277k = new WebSocketWriter(z13, streams.f96300c, this.f96269c, webSocketExtensions.f96305a, z13 ? webSocketExtensions.f96307c : webSocketExtensions.f96309e, this.f96272f);
                this.f96275i = new WriterTask();
                long j13 = this.f96270d;
                if (j13 != 0) {
                    final long nanos = TimeUnit.MILLISECONDS.toNanos(j13);
                    final String str = name + " ping";
                    this.f96278l.d(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                        @Override // okhttp3.internal.concurrent.Task
                        public final long b() {
                            RealWebSocket realWebSocket = this;
                            synchronized (realWebSocket) {
                                try {
                                    if (!realWebSocket.f96287u) {
                                        WebSocketWriter webSocketWriter = realWebSocket.f96277k;
                                        if (webSocketWriter != null) {
                                            int i13 = realWebSocket.f96289w ? realWebSocket.f96288v : -1;
                                            realWebSocket.f96288v++;
                                            realWebSocket.f96289w = true;
                                            Unit unit = Unit.f80348a;
                                            if (i13 != -1) {
                                                StringBuilder sb3 = new StringBuilder("sent ping but didn't receive pong within ");
                                                sb3.append(realWebSocket.f96270d);
                                                sb3.append("ms (after ");
                                                realWebSocket.k(new SocketTimeoutException(a.n(sb3, i13 - 1, " successful ping/pongs)")), null);
                                            } else {
                                                try {
                                                    m payload = m.f130712d;
                                                    Intrinsics.checkNotNullParameter(payload, "payload");
                                                    webSocketWriter.a(9, payload);
                                                } catch (IOException e13) {
                                                    realWebSocket.k(e13, null);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            return nanos;
                        }
                    }, nanos);
                }
                if (!this.f96282p.isEmpty()) {
                    n();
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        boolean z14 = streams.f96298a;
        this.f96276j = new WebSocketReader(z14, streams.f96299b, this, webSocketExtensions.f96305a, z14 ^ true ? webSocketExtensions.f96307c : webSocketExtensions.f96309e);
    }

    public final void m() {
        while (this.f96285s == -1) {
            WebSocketReader webSocketReader = this.f96276j;
            Intrinsics.f(webSocketReader);
            webSocketReader.c();
            if (!webSocketReader.f96321j) {
                int i13 = webSocketReader.f96318g;
                if (i13 != 1 && i13 != 2) {
                    StringBuilder sb3 = new StringBuilder("Unknown opcode: ");
                    byte[] bArr = Util.f95757a;
                    String hexString = Integer.toHexString(i13);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb3.append(hexString);
                    throw new ProtocolException(sb3.toString());
                }
                while (!webSocketReader.f96317f) {
                    long j13 = webSocketReader.f96319h;
                    j buffer = webSocketReader.f96324m;
                    if (j13 > 0) {
                        webSocketReader.f96313b.R(buffer, j13);
                        if (!webSocketReader.f96312a) {
                            g gVar = webSocketReader.f96327p;
                            Intrinsics.f(gVar);
                            buffer.z(gVar);
                            gVar.c(buffer.f130711b - webSocketReader.f96319h);
                            WebSocketProtocol webSocketProtocol = WebSocketProtocol.f96311a;
                            byte[] bArr2 = webSocketReader.f96326o;
                            Intrinsics.f(bArr2);
                            webSocketProtocol.getClass();
                            WebSocketProtocol.b(gVar, bArr2);
                            gVar.close();
                        }
                    }
                    if (webSocketReader.f96320i) {
                        if (webSocketReader.f96322k) {
                            MessageInflater messageInflater = webSocketReader.f96325n;
                            if (messageInflater == null) {
                                messageInflater = new MessageInflater(webSocketReader.f96316e);
                                webSocketReader.f96325n = messageInflater;
                            }
                            Intrinsics.checkNotNullParameter(buffer, "buffer");
                            j jVar = messageInflater.f96263b;
                            if (jVar.f130711b != 0) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            Inflater inflater = messageInflater.f96264c;
                            if (messageInflater.f96262a) {
                                inflater.reset();
                            }
                            jVar.i2(buffer);
                            jVar.g0(65535);
                            long bytesRead = inflater.getBytesRead() + jVar.f130711b;
                            do {
                                messageInflater.f96265d.a(buffer, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        WebSocketReader.FrameCallback frameCallback = webSocketReader.f96314c;
                        if (i13 == 1) {
                            frameCallback.b(buffer.M());
                        } else {
                            frameCallback.d(buffer.a1(buffer.f130711b));
                        }
                    } else {
                        while (!webSocketReader.f96317f) {
                            webSocketReader.c();
                            if (!webSocketReader.f96321j) {
                                break;
                            } else {
                                webSocketReader.a();
                            }
                        }
                        if (webSocketReader.f96318g != 0) {
                            StringBuilder sb4 = new StringBuilder("Expected continuation opcode. Got: ");
                            int i14 = webSocketReader.f96318g;
                            byte[] bArr3 = Util.f95757a;
                            String hexString2 = Integer.toHexString(i14);
                            Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(this)");
                            sb4.append(hexString2);
                            throw new ProtocolException(sb4.toString());
                        }
                    }
                }
                throw new IOException("closed");
            }
            webSocketReader.a();
        }
    }

    public final void n() {
        byte[] bArr = Util.f95757a;
        Task task = this.f96275i;
        if (task != null) {
            this.f96278l.d(task, 0L);
        }
    }

    public final synchronized boolean o(int i13, m mVar) {
        if (!this.f96287u && !this.f96284r) {
            if (this.f96283q + mVar.b() > 16777216) {
                f(1001, null);
                return false;
            }
            this.f96283q += mVar.b();
            this.f96282p.add(new Message(i13, mVar));
            n();
            return true;
        }
        return false;
    }

    public final boolean p() {
        Streams streams;
        String str;
        WebSocketReader webSocketReader;
        Closeable closeable;
        synchronized (this) {
            try {
                if (this.f96287u) {
                    return false;
                }
                WebSocketWriter webSocketWriter = this.f96277k;
                Object poll = this.f96281o.poll();
                Object obj = null;
                if (poll == null) {
                    Object poll2 = this.f96282p.poll();
                    if (poll2 instanceof Close) {
                        int i13 = this.f96285s;
                        str = this.f96286t;
                        if (i13 != -1) {
                            streams = this.f96280n;
                            this.f96280n = null;
                            webSocketReader = this.f96276j;
                            this.f96276j = null;
                            closeable = this.f96277k;
                            this.f96277k = null;
                            this.f96278l.g();
                            obj = poll2;
                        } else {
                            long j13 = ((Close) poll2).f96295c;
                            TaskQueue taskQueue = this.f96278l;
                            final String str2 = this.f96279m + " cancel";
                            taskQueue.d(new Task(str2) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                public final long b() {
                                    RealCall realCall = this.f96274h;
                                    Intrinsics.f(realCall);
                                    realCall.cancel();
                                    return -1L;
                                }
                            }, TimeUnit.MILLISECONDS.toNanos(j13));
                            streams = null;
                            webSocketReader = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        streams = null;
                        str = null;
                        webSocketReader = null;
                    }
                    closeable = webSocketReader;
                    obj = poll2;
                } else {
                    streams = null;
                    str = null;
                    webSocketReader = null;
                    closeable = null;
                }
                Unit unit = Unit.f80348a;
                try {
                    if (poll != null) {
                        Intrinsics.f(webSocketWriter);
                        m payload = (m) poll;
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        webSocketWriter.a(10, payload);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        Intrinsics.f(webSocketWriter);
                        webSocketWriter.c(message.f96296a, message.f96297b);
                        synchronized (this) {
                            this.f96283q -= message.f96297b.b();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        Intrinsics.f(webSocketWriter);
                        int i14 = close.f96293a;
                        m mVar = close.f96294b;
                        m mVar2 = m.f130712d;
                        if (i14 != 0 || mVar != null) {
                            if (i14 != 0) {
                                WebSocketProtocol.f96311a.getClass();
                                String a13 = WebSocketProtocol.a(i14);
                                if (a13 != null) {
                                    throw new IllegalArgumentException(a13.toString());
                                }
                            }
                            j jVar = new j();
                            jVar.m0(i14);
                            if (mVar != null) {
                                jVar.S(mVar);
                            }
                            mVar2 = jVar.a1(jVar.f130711b);
                        }
                        try {
                            webSocketWriter.a(8, mVar2);
                            if (streams != null) {
                                WebSocketListener webSocketListener = this.f96268b;
                                Intrinsics.f(str);
                                webSocketListener.a(this, str);
                            }
                        } finally {
                            webSocketWriter.f96336i = true;
                        }
                    }
                    return true;
                } finally {
                    if (streams != null) {
                        Util.c(streams);
                    }
                    if (webSocketReader != null) {
                        Util.c(webSocketReader);
                    }
                    if (closeable != null) {
                        Util.c(closeable);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
