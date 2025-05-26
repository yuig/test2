package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.StatusLine;
import wo2.c0;
import wo2.e0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* renamed from: g, reason: collision with root package name */
    public static final Companion f96117g = new Companion(0);

    /* renamed from: h, reason: collision with root package name */
    public static final List f96118h = Util.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    public static final List f96119i = Util.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final RealConnection f96120a;

    /* renamed from: b, reason: collision with root package name */
    public final RealInterceptorChain f96121b;

    /* renamed from: c, reason: collision with root package name */
    public final Http2Connection f96122c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Http2Stream f96123d;

    /* renamed from: e, reason: collision with root package name */
    public final Protocol f96124e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f96125f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain chain, Http2Connection http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f96120a = connection;
        this.f96121b = chain;
        this.f96122c = http2Connection;
        List<Protocol> protocols = client.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f96124e = protocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: a, reason: from getter */
    public final RealConnection getF96120a() {
        return this.f96120a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b() {
        Http2Stream http2Stream = this.f96123d;
        Intrinsics.f(http2Stream);
        http2Stream.g().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final e0 c(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Http2Stream http2Stream = this.f96123d;
        Intrinsics.f(http2Stream);
        return http2Stream.f96146i;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f96125f = true;
        Http2Stream http2Stream = this.f96123d;
        if (http2Stream != null) {
            http2Stream.e(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long d(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (HttpHeaders.a(response)) {
            return Util.k(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final c0 e(Request request, long j13) {
        Intrinsics.checkNotNullParameter(request, "request");
        Http2Stream http2Stream = this.f96123d;
        Intrinsics.f(http2Stream);
        return http2Stream.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0104 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:30:0x00bf, B:32:0x00c6, B:33:0x00cf, B:35:0x00d3, B:37:0x00ea, B:39:0x00f2, B:43:0x00fe, B:45:0x0104, B:46:0x010d, B:78:0x019d, B:79:0x01a2), top: B:29:0x00bf, outer: #0 }] */
    @Override // okhttp3.internal.http.ExchangeCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(okhttp3.Request r19) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2ExchangeCodec.f(okhttp3.Request):void");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder g(boolean z13) {
        Headers headerBlock;
        Http2Stream http2Stream = this.f96123d;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (http2Stream) {
            http2Stream.f96148k.j();
            while (http2Stream.f96144g.isEmpty() && http2Stream.f96150m == null) {
                try {
                    http2Stream.m();
                } catch (Throwable th3) {
                    http2Stream.f96148k.n();
                    throw th3;
                }
            }
            http2Stream.f96148k.n();
            if (!(!http2Stream.f96144g.isEmpty())) {
                IOException iOException = http2Stream.f96151n;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = http2Stream.f96150m;
                Intrinsics.f(errorCode);
                throw new StreamResetException(errorCode);
            }
            Object removeFirst = http2Stream.f96144g.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
            headerBlock = (Headers) removeFirst;
        }
        Companion companion = f96117g;
        Protocol protocol = this.f96124e;
        companion.getClass();
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Headers.Builder builder = new Headers.Builder();
        int size = headerBlock.size();
        StatusLine statusLine = null;
        for (int i13 = 0; i13 < size; i13++) {
            String d2 = headerBlock.d(i13);
            String j13 = headerBlock.j(i13);
            if (Intrinsics.d(d2, ":status")) {
                StatusLine.f95984d.getClass();
                statusLine = StatusLine.Companion.a("HTTP/1.1 " + j13);
            } else if (!f96119i.contains(d2)) {
                builder.c(d2, j13);
            }
        }
        if (statusLine == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.h(protocol);
        builder2.f95736c = statusLine.f95986b;
        builder2.f(statusLine.f95987c);
        builder2.e(builder.e());
        if (z13 && builder2.getF95736c() == 100) {
            return null;
        }
        return builder2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void h() {
        this.f96122c.flush();
    }
}
