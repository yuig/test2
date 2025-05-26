package okhttp3.internal.connection;

import a.a;
import ao2.m0;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.ws.RealWebSocket;
import wo2.c0;
import wo2.e0;
import wo2.j;
import wo2.o;
import wo2.p;
import wo2.x;
import wo2.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Exchange {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f95869a;

    /* renamed from: b, reason: collision with root package name */
    public final EventListener f95870b;

    /* renamed from: c, reason: collision with root package name */
    public final ExchangeFinder f95871c;

    /* renamed from: d, reason: collision with root package name */
    public final ExchangeCodec f95872d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95873e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95874f;

    /* renamed from: g, reason: collision with root package name */
    public final RealConnection f95875g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lwo2/o;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class RequestBodySink extends o {

        /* renamed from: b, reason: collision with root package name */
        public final long f95876b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f95877c;

        /* renamed from: d, reason: collision with root package name */
        public long f95878d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f95879e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Exchange f95880f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, c0 delegate, long j13) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f95880f = exchange;
            this.f95876b = j13;
        }

        public final IOException a(IOException iOException) {
            if (this.f95877c) {
                return iOException;
            }
            this.f95877c = true;
            return this.f95880f.a(this.f95878d, false, true, iOException);
        }

        @Override // wo2.o, wo2.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f95879e) {
                return;
            }
            this.f95879e = true;
            long j13 = this.f95876b;
            if (j13 != -1 && this.f95878d != j13) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e13) {
                throw a(e13);
            }
        }

        @Override // wo2.o, wo2.c0, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e13) {
                throw a(e13);
            }
        }

        @Override // wo2.o, wo2.c0
        public final void write(j source, long j13) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f95879e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j14 = this.f95876b;
            if (j14 != -1 && this.f95878d + j13 > j14) {
                StringBuilder u13 = a.u("expected ", j14, " bytes but received ");
                u13.append(this.f95878d + j13);
                throw new ProtocolException(u13.toString());
            }
            try {
                super.write(source, j13);
                this.f95878d += j13;
            } catch (IOException e13) {
                throw a(e13);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lwo2/p;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class ResponseBodySource extends p {

        /* renamed from: b, reason: collision with root package name */
        public final long f95881b;

        /* renamed from: c, reason: collision with root package name */
        public long f95882c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f95883d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f95884e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f95885f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Exchange f95886g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, e0 delegate, long j13) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f95886g = exchange;
            this.f95881b = j13;
            this.f95883d = true;
            if (j13 == 0) {
                a(null);
            }
        }

        public final IOException a(IOException iOException) {
            if (this.f95884e) {
                return iOException;
            }
            this.f95884e = true;
            if (iOException == null && this.f95883d) {
                this.f95883d = false;
                Exchange exchange = this.f95886g;
                exchange.f95870b.w(exchange.f95869a);
            }
            return this.f95886g.a(this.f95882c, true, false, iOException);
        }

        @Override // wo2.p, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f95885f) {
                return;
            }
            this.f95885f = true;
            try {
                super.close();
                a(null);
            } catch (IOException e13) {
                throw a(e13);
            }
        }

        @Override // wo2.p, wo2.e0
        public final long read(j sink, long j13) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.f95885f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long read = this.f130720a.read(sink, j13);
                if (this.f95883d) {
                    this.f95883d = false;
                    Exchange exchange = this.f95886g;
                    exchange.f95870b.w(exchange.f95869a);
                }
                if (read == -1) {
                    a(null);
                    return -1L;
                }
                long j14 = this.f95882c + read;
                long j15 = this.f95881b;
                if (j15 == -1 || j14 <= j15) {
                    this.f95882c = j14;
                    if (j14 == j15) {
                        a(null);
                    }
                    return read;
                }
                throw new ProtocolException("expected " + j15 + " bytes but received " + j14);
            } catch (IOException e13) {
                throw a(e13);
            }
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f95869a = call;
        this.f95870b = eventListener;
        this.f95871c = finder;
        this.f95872d = codec;
        this.f95875g = codec.getF96120a();
    }

    public final IOException a(long j13, boolean z13, boolean z14, IOException iOException) {
        if (iOException != null) {
            k(iOException);
        }
        EventListener eventListener = this.f95870b;
        RealCall realCall = this.f95869a;
        if (z14) {
            if (iOException != null) {
                eventListener.s(realCall, iOException);
            } else {
                eventListener.q(realCall, j13);
            }
        }
        if (z13) {
            if (iOException != null) {
                eventListener.x(realCall, iOException);
            } else {
                eventListener.v(realCall, j13);
            }
        }
        return realCall.i(this, z14, z13, iOException);
    }

    public final c0 b(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f95873e = false;
        RequestBody requestBody = request.f95703d;
        Intrinsics.f(requestBody);
        long a13 = requestBody.a();
        this.f95870b.r(this.f95869a);
        return new RequestBodySink(this, this.f95872d.e(request, a13), a13);
    }

    public final void c() {
        this.f95872d.cancel();
        this.f95869a.i(this, true, true, null);
    }

    public final void d() {
        try {
            this.f95872d.h();
        } catch (IOException e13) {
            this.f95870b.s(this.f95869a, e13);
            k(e13);
            throw e13;
        }
    }

    /* renamed from: e, reason: from getter */
    public final boolean getF95874f() {
        return this.f95874f;
    }

    public final boolean f() {
        return !Intrinsics.d(this.f95871c.f95888b.f95488i.f95634d, this.f95875g.f95920b.f95754a.f95488i.f95634d);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnection$newWebSocketStreams$1] */
    public final RealConnection$newWebSocketStreams$1 g() {
        this.f95869a.l();
        RealConnection f96120a = this.f95872d.getF96120a();
        f96120a.getClass();
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = f96120a.f95922d;
        Intrinsics.f(socket);
        final y yVar = f96120a.f95926h;
        Intrinsics.f(yVar);
        final x xVar = f96120a.f95927i;
        Intrinsics.f(xVar);
        socket.setSoTimeout(0);
        f96120a.l();
        return new RealWebSocket.Streams(yVar, xVar) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                exchange.a(-1L, true, true, null);
            }
        };
    }

    public final void h() {
        this.f95872d.getF96120a().l();
    }

    public final RealResponseBody i(Response response) {
        ExchangeCodec exchangeCodec = this.f95872d;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String c13 = response.c("Content-Type", null);
            long d2 = exchangeCodec.d(response);
            return new RealResponseBody(c13, d2, m0.i(new ResponseBodySource(this, exchangeCodec.c(response), d2)));
        } catch (IOException e13) {
            this.f95870b.x(this.f95869a, e13);
            k(e13);
            throw e13;
        }
    }

    public final Response.Builder j(boolean z13) {
        try {
            Response.Builder g13 = this.f95872d.g(z13);
            if (g13 != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                g13.f95746m = this;
            }
            return g13;
        } catch (IOException e13) {
            this.f95870b.x(this.f95869a, e13);
            k(e13);
            throw e13;
        }
    }

    public final void k(IOException iOException) {
        this.f95874f = true;
        this.f95871c.c(iOException);
        RealConnection f96120a = this.f95872d.getF96120a();
        RealCall call = this.f95869a;
        synchronized (f96120a) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                if (iOException instanceof StreamResetException) {
                    if (((StreamResetException) iOException).f96181a == ErrorCode.REFUSED_STREAM) {
                        int i13 = f96120a.f95932n + 1;
                        f96120a.f95932n = i13;
                        if (i13 > 1) {
                            f96120a.f95928j = true;
                            f96120a.f95930l++;
                        }
                    } else if (((StreamResetException) iOException).f96181a != ErrorCode.CANCEL || !call.f95912p) {
                        f96120a.f95928j = true;
                        f96120a.f95930l++;
                    }
                } else if (f96120a.f95925g == null || (iOException instanceof ConnectionShutdownException)) {
                    f96120a.f95928j = true;
                    if (f96120a.f95931m == 0) {
                        RealConnection.d(call.f95897a, f96120a.f95920b, iOException);
                        f96120a.f95930l++;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
