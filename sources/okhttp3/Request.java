package okhttp3;

import a.a;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Request;", "", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Request {

    /* renamed from: a */
    public final HttpUrl f95700a;

    /* renamed from: b */
    public final String f95701b;

    /* renamed from: c */
    public final Headers f95702c;

    /* renamed from: d */
    public final RequestBody f95703d;

    /* renamed from: e */
    public final Map f95704e;

    /* renamed from: f */
    public CacheControl f95705f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static class Builder {

        /* renamed from: a */
        public HttpUrl f95706a;

        /* renamed from: d */
        public RequestBody f95709d;

        /* renamed from: e */
        public LinkedHashMap f95710e = new LinkedHashMap();

        /* renamed from: b */
        public String f95707b = "GET";

        /* renamed from: c */
        public Headers.Builder f95708c = new Headers.Builder();

        public final void a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f95708c.a(name, value);
        }

        public final Request b() {
            HttpUrl httpUrl = this.f95706a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.f95707b, this.f95708c.e(), this.f95709d, Util.B(this.f95710e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void c(CacheControl cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                h("Cache-Control");
            } else {
                d("Cache-Control", cacheControl2);
            }
        }

        public final void d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Headers.Builder builder = this.f95708c;
            builder.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Headers.f95626b.getClass();
            Headers.Companion.a(name);
            Headers.Companion.b(value, name);
            builder.g(name);
            builder.c(name, value);
        }

        public final void e(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f95708c = headers.f();
        }

        public final void f(String method, RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.f95969a;
                Intrinsics.checkNotNullParameter(method, "method");
                if (!(!(Intrinsics.d(method, "POST") || Intrinsics.d(method, "PUT") || Intrinsics.d(method, "PATCH") || Intrinsics.d(method, "PROPPATCH") || Intrinsics.d(method, "REPORT")))) {
                    throw new IllegalArgumentException(a.k("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.b(method)) {
                throw new IllegalArgumentException(a.k("method ", method, " must not have a request body.").toString());
            }
            this.f95707b = method;
            this.f95709d = requestBody;
        }

        public final void g(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            f("POST", body);
        }

        public final void h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f95708c.g(name);
        }

        public final void i(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f95710e.remove(type);
                return;
            }
            if (this.f95710e.isEmpty()) {
                this.f95710e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f95710e;
            Object cast = type.cast(obj);
            Intrinsics.f(cast);
            linkedHashMap.put(type, cast);
        }

        public final void j(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (z.p(url, "ws:", true)) {
                StringBuilder sb3 = new StringBuilder("http:");
                String substring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                sb3.append(substring);
                url = sb3.toString();
            } else if (z.p(url, "wss:", true)) {
                StringBuilder sb4 = new StringBuilder("https:");
                String substring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                sb4.append(substring2);
                url = sb4.toString();
            }
            HttpUrl.f95629k.getClass();
            HttpUrl url2 = HttpUrl.Companion.d(url);
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f95706a = url2;
        }

        public final void k(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpUrl.Companion companion = HttpUrl.f95629k;
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "url.toString()");
            companion.getClass();
            HttpUrl url3 = HttpUrl.Companion.d(url2);
            Intrinsics.checkNotNullParameter(url3, "url");
            this.f95706a = url3;
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f95700a = url;
        this.f95701b = method;
        this.f95702c = headers;
        this.f95703d = requestBody;
        this.f95704e = tags;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f95702c.c(name);
    }

    public final Builder b() {
        Intrinsics.checkNotNullParameter(this, "request");
        Builder builder = new Builder();
        builder.f95710e = new LinkedHashMap();
        builder.f95706a = this.f95700a;
        builder.f95707b = this.f95701b;
        builder.f95709d = this.f95703d;
        Map map = this.f95704e;
        builder.f95710e = map.isEmpty() ? new LinkedHashMap() : z0.r(map);
        builder.f95708c = this.f95702c.f();
        return builder;
    }

    public final Object c(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f95704e.get(type));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Request{method=");
        sb3.append(this.f95701b);
        sb3.append(", url=");
        sb3.append(this.f95700a);
        Headers headers = this.f95702c;
        if (headers.size() != 0) {
            sb3.append(", headers=[");
            int i13 = 0;
            for (Pair<? extends String, ? extends String> pair : headers) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    f0.p();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.f80346a;
                String str2 = (String) pair2.f80347b;
                if (i13 > 0) {
                    sb3.append(", ");
                }
                sb3.append(str);
                sb3.append(':');
                sb3.append(str2);
                i13 = i14;
            }
            sb3.append(']');
        }
        Map map = this.f95704e;
        if (!map.isEmpty()) {
            sb3.append(", tags=");
            sb3.append(map);
        }
        sb3.append('}');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
