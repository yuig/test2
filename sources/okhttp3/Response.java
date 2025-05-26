package okhttp3;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Response implements Closeable {

    /* renamed from: a */
    public final Request f95720a;

    /* renamed from: b */
    public final Protocol f95721b;

    /* renamed from: c */
    public final String f95722c;

    /* renamed from: d */
    public final int f95723d;

    /* renamed from: e */
    public final Handshake f95724e;

    /* renamed from: f */
    public final Headers f95725f;

    /* renamed from: g */
    public final ResponseBody f95726g;

    /* renamed from: h */
    public final Response f95727h;

    /* renamed from: i */
    public final Response f95728i;

    /* renamed from: j */
    public final Response f95729j;

    /* renamed from: k */
    public final long f95730k;

    /* renamed from: l */
    public final long f95731l;

    /* renamed from: m */
    public final Exchange f95732m;

    /* renamed from: n */
    public CacheControl f95733n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static class Builder {

        /* renamed from: a */
        public Request f95734a;

        /* renamed from: b */
        public Protocol f95735b;

        /* renamed from: d */
        public String f95737d;

        /* renamed from: e */
        public Handshake f95738e;

        /* renamed from: g */
        public ResponseBody f95740g;

        /* renamed from: h */
        public Response f95741h;

        /* renamed from: i */
        public Response f95742i;

        /* renamed from: j */
        public Response f95743j;

        /* renamed from: k */
        public long f95744k;

        /* renamed from: l */
        public long f95745l;

        /* renamed from: m */
        public Exchange f95746m;

        /* renamed from: c */
        public int f95736c = -1;

        /* renamed from: f */
        public Headers.Builder f95739f = new Headers.Builder();

        public static void c(String str, Response response) {
            if (response != null) {
                if (response.f95726g != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (response.f95727h != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (response.f95728i != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (response.f95729j != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final void a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f95739f.a(name, value);
        }

        public final Response b() {
            int i13 = this.f95736c;
            if (i13 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f95736c).toString());
            }
            Request request = this.f95734a;
            if (request == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f95735b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f95737d;
            if (str != null) {
                return new Response(request, protocol, str, i13, this.f95738e, this.f95739f.e(), this.f95740g, this.f95741h, this.f95742i, this.f95743j, this.f95744k, this.f95745l, this.f95746m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        /* renamed from: d, reason: from getter */
        public final int getF95736c() {
            return this.f95736c;
        }

        public final void e(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f95739f = headers.f();
        }

        public final void f(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f95737d = message;
        }

        public final void g(Response response) {
            if (response != null && response.f95726g != null) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
            this.f95743j = response;
        }

        public final void h(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f95735b = protocol;
        }
    }

    public Response(Request request, Protocol protocol, String message, int i13, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j13, long j14, Exchange exchange) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f95720a = request;
        this.f95721b = protocol;
        this.f95722c = message;
        this.f95723d = i13;
        this.f95724e = handshake;
        this.f95725f = headers;
        this.f95726g = responseBody;
        this.f95727h = response;
        this.f95728i = response2;
        this.f95729j = response3;
        this.f95730k = j13;
        this.f95731l = j14;
        this.f95732m = exchange;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.f95733n;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.f95521n.getClass();
        CacheControl a13 = CacheControl.Companion.a(this.f95725f);
        this.f95733n = a13;
        return a13;
    }

    public final String c(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String c13 = this.f95725f.c(name);
        return c13 == null ? str : c13;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.f95726g;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    public final boolean d() {
        int i13 = this.f95723d;
        return 200 <= i13 && i13 < 300;
    }

    public final Builder e() {
        Intrinsics.checkNotNullParameter(this, "response");
        Builder builder = new Builder();
        builder.f95734a = this.f95720a;
        builder.f95735b = this.f95721b;
        builder.f95736c = this.f95723d;
        builder.f95737d = this.f95722c;
        builder.f95738e = this.f95724e;
        builder.f95739f = this.f95725f.f();
        builder.f95740g = this.f95726g;
        builder.f95741h = this.f95727h;
        builder.f95742i = this.f95728i;
        builder.f95743j = this.f95729j;
        builder.f95744k = this.f95730k;
        builder.f95745l = this.f95731l;
        builder.f95746m = this.f95732m;
        return builder;
    }

    public final String toString() {
        return "Response{protocol=" + this.f95721b + ", code=" + this.f95723d + ", message=" + this.f95722c + ", url=" + this.f95720a.f95700a + '}';
    }
}
