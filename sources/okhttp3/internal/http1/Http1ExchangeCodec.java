package okhttp3.internal.http1;

import a.a;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import wo2.c0;
import wo2.e0;
import wo2.h0;
import wo2.i0;
import wo2.j;
import wo2.k;
import wo2.l;
import wo2.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f95990a;

    /* renamed from: b, reason: collision with root package name */
    public final RealConnection f95991b;

    /* renamed from: c, reason: collision with root package name */
    public final l f95992c;

    /* renamed from: d, reason: collision with root package name */
    public final k f95993d;

    /* renamed from: e, reason: collision with root package name */
    public int f95994e;

    /* renamed from: f, reason: collision with root package name */
    public final HeadersReader f95995f;

    /* renamed from: g, reason: collision with root package name */
    public Headers f95996g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lwo2/e0;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public abstract class AbstractSource implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final q f95997a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f95998b;

        public AbstractSource() {
            this.f95997a = new q(Http1ExchangeCodec.this.f95992c.timeout());
        }

        public final void a() {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            int i13 = http1ExchangeCodec.f95994e;
            if (i13 == 6) {
                return;
            }
            if (i13 == 5) {
                Http1ExchangeCodec.i(http1ExchangeCodec, this.f95997a);
                http1ExchangeCodec.f95994e = 6;
            } else {
                throw new IllegalStateException("state: " + http1ExchangeCodec.f95994e);
            }
        }

        @Override // wo2.e0
        public long read(j sink, long j13) {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return http1ExchangeCodec.f95992c.read(sink, j13);
            } catch (IOException e13) {
                http1ExchangeCodec.f95991b.l();
                a();
                throw e13;
            }
        }

        @Override // wo2.e0
        public final i0 timeout() {
            return this.f95997a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lwo2/c0;", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class ChunkedSink implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final q f96000a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f96001b;

        public ChunkedSink() {
            this.f96000a = new q(Http1ExchangeCodec.this.f95993d.timeout());
        }

        @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f96001b) {
                return;
            }
            this.f96001b = true;
            Http1ExchangeCodec.this.f95993d.l0("0\r\n\r\n");
            Http1ExchangeCodec.i(Http1ExchangeCodec.this, this.f96000a);
            Http1ExchangeCodec.this.f95994e = 3;
        }

        @Override // wo2.c0, java.io.Flushable
        public final synchronized void flush() {
            if (this.f96001b) {
                return;
            }
            Http1ExchangeCodec.this.f95993d.flush();
        }

        @Override // wo2.c0
        public final i0 timeout() {
            return this.f96000a;
        }

        @Override // wo2.c0
        public final void write(j source, long j13) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f96001b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j13 == 0) {
                return;
            }
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            http1ExchangeCodec.f95993d.F1(j13);
            k kVar = http1ExchangeCodec.f95993d;
            kVar.l0("\r\n");
            kVar.write(source, j13);
            kVar.l0("\r\n");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class ChunkedSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public final HttpUrl f96003d;

        /* renamed from: e, reason: collision with root package name */
        public long f96004e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f96005f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f96006g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f96006g = http1ExchangeCodec;
            this.f96003d = url;
            this.f96004e = -1L;
            this.f96005f = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f95998b) {
                return;
            }
            if (this.f96005f && !Util.h(this, TimeUnit.MILLISECONDS)) {
                this.f96006g.f95991b.l();
                a();
            }
            this.f95998b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, wo2.e0
        public final long read(j sink, long j13) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j13 < 0) {
                throw new IllegalArgumentException(a.g("byteCount < 0: ", j13).toString());
            }
            if (!(!this.f95998b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f96005f) {
                return -1L;
            }
            long j14 = this.f96004e;
            Http1ExchangeCodec http1ExchangeCodec = this.f96006g;
            if (j14 == 0 || j14 == -1) {
                if (j14 != -1) {
                    http1ExchangeCodec.f95992c.B0();
                }
                try {
                    this.f96004e = http1ExchangeCodec.f95992c.j2();
                    String obj = StringsKt.i0(http1ExchangeCodec.f95992c.B0()).toString();
                    if (this.f96004e < 0 || (obj.length() > 0 && !z.p(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f96004e + obj + '\"');
                    }
                    if (this.f96004e == 0) {
                        this.f96005f = false;
                        HeadersReader headersReader = http1ExchangeCodec.f95995f;
                        headersReader.getClass();
                        Headers.Builder builder = new Headers.Builder();
                        while (true) {
                            String Z = headersReader.f95988a.Z(headersReader.f95989b);
                            headersReader.f95989b -= Z.length();
                            if (Z.length() == 0) {
                                break;
                            }
                            builder.b(Z);
                        }
                        http1ExchangeCodec.f95996g = builder.e();
                        OkHttpClient okHttpClient = http1ExchangeCodec.f95990a;
                        Intrinsics.f(okHttpClient);
                        CookieJar cookieJar = okHttpClient.cookieJar();
                        Headers headers = http1ExchangeCodec.f95996g;
                        Intrinsics.f(headers);
                        HttpHeaders.d(cookieJar, this.f96003d, headers);
                        a();
                    }
                    if (!this.f96005f) {
                        return -1L;
                    }
                } catch (NumberFormatException e13) {
                    throw new ProtocolException(e13.getMessage());
                }
            }
            long read = super.read(sink, Math.min(j13, this.f96004e));
            if (read != -1) {
                this.f96004e -= read;
                return read;
            }
            http1ExchangeCodec.f95991b.l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "NO_CHUNK_YET", "", "STATE_CLOSED", "", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class FixedLengthSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public long f96007d;

        public FixedLengthSource(long j13) {
            super();
            this.f96007d = j13;
            if (j13 == 0) {
                a();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f95998b) {
                return;
            }
            if (this.f96007d != 0 && !Util.h(this, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.f95991b.l();
                a();
            }
            this.f95998b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, wo2.e0
        public final long read(j sink, long j13) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j13 < 0) {
                throw new IllegalArgumentException(a.g("byteCount < 0: ", j13).toString());
            }
            if (!(!this.f95998b)) {
                throw new IllegalStateException("closed".toString());
            }
            long j14 = this.f96007d;
            if (j14 == 0) {
                return -1L;
            }
            long read = super.read(sink, Math.min(j14, j13));
            if (read == -1) {
                Http1ExchangeCodec.this.f95991b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            long j15 = this.f96007d - read;
            this.f96007d = j15;
            if (j15 == 0) {
                a();
            }
            return read;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lwo2/c0;", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class KnownLengthSink implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final q f96009a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f96010b;

        public KnownLengthSink() {
            this.f96009a = new q(Http1ExchangeCodec.this.f95993d.timeout());
        }

        @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f96010b) {
                return;
            }
            this.f96010b = true;
            q qVar = this.f96009a;
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            Http1ExchangeCodec.i(http1ExchangeCodec, qVar);
            http1ExchangeCodec.f95994e = 3;
        }

        @Override // wo2.c0, java.io.Flushable
        public final void flush() {
            if (this.f96010b) {
                return;
            }
            Http1ExchangeCodec.this.f95993d.flush();
        }

        @Override // wo2.c0
        public final i0 timeout() {
            return this.f96009a;
        }

        @Override // wo2.c0
        public final void write(j source, long j13) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f96010b)) {
                throw new IllegalStateException("closed".toString());
            }
            long j14 = source.f130711b;
            byte[] bArr = Util.f95757a;
            if (j13 < 0 || 0 > j14 || j14 < j13) {
                throw new ArrayIndexOutOfBoundsException();
            }
            Http1ExchangeCodec.this.f95993d.write(source, j13);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class UnknownLengthSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public boolean f96012d;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f95998b) {
                return;
            }
            if (!this.f96012d) {
                a();
            }
            this.f95998b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, wo2.e0
        public final long read(j sink, long j13) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j13 < 0) {
                throw new IllegalArgumentException(a.g("byteCount < 0: ", j13).toString());
            }
            if (!(!this.f95998b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f96012d) {
                return -1L;
            }
            long read = super.read(sink, j13);
            if (read != -1) {
                return read;
            }
            this.f96012d = true;
            a();
            return -1L;
        }
    }

    static {
        new Companion(0);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, l source, k sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f95990a = okHttpClient;
        this.f95991b = connection;
        this.f95992c = source;
        this.f95993d = sink;
        this.f95995f = new HeadersReader(source);
    }

    public static final void i(Http1ExchangeCodec http1ExchangeCodec, q qVar) {
        http1ExchangeCodec.getClass();
        i0 i0Var = qVar.f130721f;
        h0 delegate = i0.f130705e;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        qVar.f130721f = delegate;
        i0Var.a();
        i0Var.b();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: a, reason: from getter */
    public final RealConnection getF96120a() {
        return this.f95991b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b() {
        this.f95993d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final e0 c(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!HttpHeaders.a(response)) {
            return k(0L);
        }
        if (z.i("chunked", response.c("Transfer-Encoding", null), true)) {
            return j(response.f95720a.f95700a);
        }
        long k13 = Util.k(response);
        return k13 != -1 ? k(k13) : l();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        Socket socket = this.f95991b.f95921c;
        if (socket != null) {
            Util.d(socket);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long d(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        if (z.i("chunked", response.c("Transfer-Encoding", null), true)) {
            return -1L;
        }
        return Util.k(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final c0 e(Request request, long j13) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (z.i("chunked", request.a("Transfer-Encoding"), true)) {
            if (this.f95994e == 1) {
                this.f95994e = 2;
                return new ChunkedSink();
            }
            throw new IllegalStateException(("state: " + this.f95994e).toString());
        }
        if (j13 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f95994e == 1) {
            this.f95994e = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.f95994e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestLine requestLine = RequestLine.f95982a;
        Proxy.Type proxyType = this.f95991b.f95920b.f95755b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        requestLine.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(request.f95701b);
        sb3.append(' ');
        HttpUrl httpUrl = request.f95700a;
        if (httpUrl.f95640j || proxyType != Proxy.Type.HTTP) {
            sb3.append(RequestLine.a(httpUrl));
        } else {
            sb3.append(httpUrl);
        }
        sb3.append(" HTTP/1.1");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        n(request.f95702c, sb4);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder g(boolean z13) {
        HeadersReader headersReader = this.f95995f;
        int i13 = this.f95994e;
        if (i13 != 1 && i13 != 2 && i13 != 3) {
            throw new IllegalStateException(("state: " + this.f95994e).toString());
        }
        try {
            StatusLine.Companion companion = StatusLine.f95984d;
            String Z = headersReader.f95988a.Z(headersReader.f95989b);
            headersReader.f95989b -= Z.length();
            companion.getClass();
            StatusLine a13 = StatusLine.Companion.a(Z);
            int i14 = a13.f95986b;
            Response.Builder builder = new Response.Builder();
            builder.h(a13.f95985a);
            builder.f95736c = i14;
            builder.f(a13.f95987c);
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String Z2 = headersReader.f95988a.Z(headersReader.f95989b);
                headersReader.f95989b -= Z2.length();
                if (Z2.length() == 0) {
                    break;
                }
                builder2.b(Z2);
            }
            builder.e(builder2.e());
            if (z13 && i14 == 100) {
                return null;
            }
            if (i14 == 100) {
                this.f95994e = 3;
                return builder;
            }
            if (102 > i14 || i14 >= 200) {
                this.f95994e = 4;
                return builder;
            }
            this.f95994e = 3;
            return builder;
        } catch (EOFException e13) {
            throw new IOException(a.j("unexpected end of stream on ", this.f95991b.f95920b.f95754a.f95488i.h()), e13);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void h() {
        this.f95993d.flush();
    }

    public final e0 j(HttpUrl httpUrl) {
        if (this.f95994e == 4) {
            this.f95994e = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.f95994e).toString());
    }

    public final e0 k(long j13) {
        if (this.f95994e == 4) {
            this.f95994e = 5;
            return new FixedLengthSource(j13);
        }
        throw new IllegalStateException(("state: " + this.f95994e).toString());
    }

    public final e0 l() {
        if (this.f95994e == 4) {
            this.f95994e = 5;
            this.f95991b.l();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.f95994e).toString());
    }

    public final void m(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long k13 = Util.k(response);
        if (k13 == -1) {
            return;
        }
        e0 k14 = k(k13);
        Util.w(k14, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        ((FixedLengthSource) k14).close();
    }

    public final void n(Headers headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f95994e != 0) {
            throw new IllegalStateException(("state: " + this.f95994e).toString());
        }
        k kVar = this.f95993d;
        kVar.l0(requestLine).l0("\r\n");
        int size = headers.size();
        for (int i13 = 0; i13 < size; i13++) {
            kVar.l0(headers.d(i13)).l0(": ").l0(headers.j(i13)).l0("\r\n");
        }
        kVar.l0("\r\n");
        this.f95994e = 1;
    }
}
