package okhttp3;

import ao2.m0;
import dl2.b;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.StringsKt;
import kotlin.text.z;
import m60.f0;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import wo2.a;
import wo2.c0;
import wo2.e0;
import wo2.j;
import wo2.l;
import wo2.m;
import wo2.o;
import wo2.p;
import wo2.x;
import wo2.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Cache implements Closeable, Flushable {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f95494b = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final DiskLruCache f95495a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class CacheResponseBody extends ResponseBody {

        /* renamed from: d, reason: collision with root package name */
        public final DiskLruCache.Snapshot f95496d;

        /* renamed from: e, reason: collision with root package name */
        public final String f95497e;

        /* renamed from: f, reason: collision with root package name */
        public final String f95498f;

        /* renamed from: g, reason: collision with root package name */
        public final y f95499g;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.f95496d = snapshot;
            this.f95497e = str;
            this.f95498f = str2;
            this.f95499g = m0.i(new p((e0) snapshot.f95833c.get(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // wo2.p, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    this.f95496d.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public final long getF95980e() {
            String str = this.f95498f;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = Util.f95757a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public final MediaType getF95751d() {
            String str = this.f95497e;
            if (str == null) {
                return null;
            }
            MediaType.f95651d.getClass();
            return MediaType.Companion.b(str);
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public final l getF95981f() {
            return this.f95499g;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lokhttp3/Cache$Companion;", "", "", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static String a(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            m mVar = m.f130712d;
            return f0.h0(url.f95639i).a("MD5").c();
        }

        public static int b(y source) {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long d2 = source.d();
                String Z = source.Z(Long.MAX_VALUE);
                if (d2 >= 0 && d2 <= 2147483647L && Z.length() <= 0) {
                    return (int) d2;
                }
                throw new IOException("expected an int but was \"" + d2 + Z + '\"');
            } catch (NumberFormatException e13) {
                throw new IOException(e13.getMessage());
            }
        }

        public static Set c(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i13 = 0; i13 < size; i13++) {
                if (z.i("Vary", headers.d(i13), true)) {
                    String j13 = headers.j(i13);
                    if (treeSet == null) {
                        Intrinsics.checkNotNullParameter(o0.f80439a, "<this>");
                        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = StringsKt.V(j13, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.i0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? s0.f80394a : treeSet;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class RealCacheRequest implements CacheRequest {

        /* renamed from: a, reason: collision with root package name */
        public final DiskLruCache.Editor f95513a;

        /* renamed from: b, reason: collision with root package name */
        public final c0 f95514b;

        /* renamed from: c, reason: collision with root package name */
        public final AnonymousClass1 f95515c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f95516d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Cache f95517e;

        /* JADX WARN: Type inference failed for: r0v2, types: [okhttp3.Cache$RealCacheRequest$1] */
        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f95517e = cache;
            this.f95513a = editor;
            c0 d2 = editor.d(1);
            this.f95514b = d2;
            this.f95515c = new o(d2) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // wo2.o, wo2.c0, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.f95516d) {
                            return;
                        }
                        realCacheRequest.f95516d = true;
                        super.close();
                        this.f95513a.b();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void a() {
            synchronized (this.f95517e) {
                if (this.f95516d) {
                    return;
                }
                this.f95516d = true;
                Util.c(this.f95514b);
                try {
                    this.f95513a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final c0 b() {
            return this.f95515c;
        }
    }

    public Cache(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        FileSystem fileSystem = FileSystem.f96182a;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f95495a = new DiskLruCache(fileSystem, directory, TaskRunner.f95853i);
    }

    public static void g(Response cached, Response network) {
        DiskLruCache.Editor editor;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        Entry entry = new Entry(network);
        ResponseBody responseBody = cached.f95726g;
        Intrinsics.g(responseBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        DiskLruCache.Snapshot snapshot = ((CacheResponseBody) responseBody).f95496d;
        try {
            String str = snapshot.f95831a;
            editor = snapshot.f95834d.d(snapshot.f95832b, str);
            if (editor == null) {
                return;
            }
            try {
                entry.c(editor);
                editor.b();
            } catch (IOException unused) {
                if (editor != null) {
                    try {
                        editor.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final Response a(Request newRequest) {
        Intrinsics.checkNotNullParameter(newRequest, "request");
        HttpUrl httpUrl = newRequest.f95700a;
        f95494b.getClass();
        try {
            DiskLruCache.Snapshot snapshot = this.f95495a.e(Companion.a(httpUrl));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry((e0) snapshot.f95833c.get(0));
                Headers cachedRequest = entry.f95504b;
                String str = entry.f95505c;
                HttpUrl url = entry.f95503a;
                Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                Headers headers = entry.f95509g;
                String c13 = headers.c("Content-Type");
                String c14 = headers.c("Content-Length");
                Request.Builder builder = new Request.Builder();
                Intrinsics.checkNotNullParameter(url, "url");
                builder.f95706a = url;
                builder.f(str, null);
                builder.e(cachedRequest);
                Request request = builder.b();
                Response.Builder builder2 = new Response.Builder();
                Intrinsics.checkNotNullParameter(request, "request");
                builder2.f95734a = request;
                builder2.h(entry.f95506d);
                builder2.f95736c = entry.f95507e;
                builder2.f(entry.f95508f);
                builder2.e(headers);
                builder2.f95740g = new CacheResponseBody(snapshot, c13, c14);
                builder2.f95738e = entry.f95510h;
                builder2.f95744k = entry.f95511i;
                builder2.f95745l = entry.f95512j;
                Response cachedResponse = builder2.b();
                Intrinsics.checkNotNullParameter(newRequest, "request");
                Intrinsics.checkNotNullParameter(cachedResponse, "response");
                if (Intrinsics.d(url, newRequest.f95700a) && Intrinsics.d(str, newRequest.f95701b)) {
                    Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
                    Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
                    Intrinsics.checkNotNullParameter(newRequest, "newRequest");
                    Set<String> c15 = Companion.c(cachedResponse.f95725f);
                    if (!(c15 instanceof Collection) || !c15.isEmpty()) {
                        for (String name : c15) {
                            List n13 = cachedRequest.n(name);
                            Intrinsics.checkNotNullParameter(name, "name");
                            if (!Intrinsics.d(n13, newRequest.f95702c.n(name))) {
                            }
                        }
                    }
                    return cachedResponse;
                }
                ResponseBody responseBody = cachedResponse.f95726g;
                if (responseBody != null) {
                    Util.c(responseBody);
                }
                return null;
            } catch (IOException unused) {
                Util.c(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final CacheRequest c(Response response) {
        DiskLruCache.Editor editor;
        Intrinsics.checkNotNullParameter(response, "response");
        Request request = response.f95720a;
        String str = request.f95701b;
        HttpMethod.f95969a.getClass();
        if (HttpMethod.a(str)) {
            try {
                d(request);
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.d(str, "GET")) {
            return null;
        }
        f95494b.getClass();
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Companion.c(response.f95725f).contains("*")) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = this.f95495a.d(DiskLruCache.A, Companion.a(request.f95700a));
            if (editor == null) {
                return null;
            }
            try {
                entry.c(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                if (editor != null) {
                    try {
                        editor.a();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            }
        } catch (IOException unused4) {
            editor = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f95495a.close();
    }

    public final void d(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        HttpUrl httpUrl = request.f95700a;
        f95494b.getClass();
        String key = Companion.a(httpUrl);
        DiskLruCache diskLruCache = this.f95495a;
        synchronized (diskLruCache) {
            Intrinsics.checkNotNullParameter(key, "key");
            diskLruCache.f();
            diskLruCache.a();
            DiskLruCache.z(key);
            DiskLruCache.Entry entry = (DiskLruCache.Entry) diskLruCache.f95801k.get(key);
            if (entry == null) {
                return;
            }
            diskLruCache.q(entry);
            if (diskLruCache.f95799i <= diskLruCache.f95795e) {
                diskLruCache.f95807q = false;
            }
        }
    }

    public final synchronized void e() {
    }

    public final synchronized void f(CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f95495a.flush();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Entry {

        /* renamed from: k, reason: collision with root package name */
        public static final String f95501k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f95502l;

        /* renamed from: a, reason: collision with root package name */
        public final HttpUrl f95503a;

        /* renamed from: b, reason: collision with root package name */
        public final Headers f95504b;

        /* renamed from: c, reason: collision with root package name */
        public final String f95505c;

        /* renamed from: d, reason: collision with root package name */
        public final Protocol f95506d;

        /* renamed from: e, reason: collision with root package name */
        public final int f95507e;

        /* renamed from: f, reason: collision with root package name */
        public final String f95508f;

        /* renamed from: g, reason: collision with root package name */
        public final Headers f95509g;

        /* renamed from: h, reason: collision with root package name */
        public final Handshake f95510h;

        /* renamed from: i, reason: collision with root package name */
        public final long f95511i;

        /* renamed from: j, reason: collision with root package name */
        public final long f95512j;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i13) {
                this();
            }
        }

        static {
            new Companion(0);
            Platform.f96214a.getClass();
            Platform.f96215b.getClass();
            f95501k = "OkHttp-Sent-Millis";
            Platform.f96215b.getClass();
            f95502l = "OkHttp-Received-Millis";
        }

        public Entry(e0 rawSource) {
            TlsVersion tlsVersion;
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                y i13 = m0.i(rawSource);
                String Z = i13.Z(Long.MAX_VALUE);
                HttpUrl.f95629k.getClass();
                HttpUrl f13 = HttpUrl.Companion.f(Z);
                if (f13 == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(Z));
                    Platform.f96214a.getClass();
                    Platform.f96215b.getClass();
                    Platform.i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.f95503a = f13;
                this.f95505c = i13.Z(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                Cache.f95494b.getClass();
                int b13 = Companion.b(i13);
                for (int i14 = 0; i14 < b13; i14++) {
                    builder.b(i13.Z(Long.MAX_VALUE));
                }
                this.f95504b = builder.e();
                StatusLine.Companion companion = StatusLine.f95984d;
                String Z2 = i13.Z(Long.MAX_VALUE);
                companion.getClass();
                StatusLine a13 = StatusLine.Companion.a(Z2);
                this.f95506d = a13.f95985a;
                this.f95507e = a13.f95986b;
                this.f95508f = a13.f95987c;
                Headers.Builder builder2 = new Headers.Builder();
                Cache.f95494b.getClass();
                int b14 = Companion.b(i13);
                for (int i15 = 0; i15 < b14; i15++) {
                    builder2.b(i13.Z(Long.MAX_VALUE));
                }
                String str = f95501k;
                String f14 = builder2.f(str);
                String str2 = f95502l;
                String f15 = builder2.f(str2);
                builder2.g(str);
                builder2.g(str2);
                this.f95511i = f14 != null ? Long.parseLong(f14) : 0L;
                this.f95512j = f15 != null ? Long.parseLong(f15) : 0L;
                this.f95509g = builder2.e();
                if (Intrinsics.d(this.f95503a.f95631a, "https")) {
                    String Z3 = i13.Z(Long.MAX_VALUE);
                    if (Z3.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + Z3 + '\"');
                    }
                    CipherSuite b15 = CipherSuite.f95550b.b(i13.Z(Long.MAX_VALUE));
                    List a14 = a(i13);
                    List a15 = a(i13);
                    if (i13.o1()) {
                        tlsVersion = TlsVersion.SSL_3_0;
                    } else {
                        TlsVersion.Companion companion2 = TlsVersion.INSTANCE;
                        String Z4 = i13.Z(Long.MAX_VALUE);
                        companion2.getClass();
                        tlsVersion = TlsVersion.Companion.a(Z4);
                    }
                    Handshake.f95618e.getClass();
                    this.f95510h = Handshake.Companion.b(tlsVersion, b15, a14, a15);
                } else {
                    this.f95510h = null;
                }
                Unit unit = Unit.f80348a;
                b.J(rawSource, null);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    b.J(rawSource, th3);
                    throw th4;
                }
            }
        }

        public static List a(y yVar) {
            Cache.f95494b.getClass();
            int b13 = Companion.b(yVar);
            if (b13 == -1) {
                return q0.f80391a;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(b13);
                for (int i13 = 0; i13 < b13; i13++) {
                    String Z = yVar.Z(Long.MAX_VALUE);
                    j jVar = new j();
                    m mVar = m.f130712d;
                    m e03 = f0.e0(Z);
                    if (e03 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    jVar.S(e03);
                    arrayList.add(certificateFactory.generateCertificate(jVar.k2()));
                }
                return arrayList;
            } catch (CertificateException e13) {
                throw new IOException(e13.getMessage());
            }
        }

        public static void b(x xVar, List list) {
            try {
                xVar.O0(list.size());
                xVar.p1(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    m mVar = m.f130712d;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    xVar.l0(a.a(f0.q0(bytes).f130713a));
                    xVar.p1(10);
                }
            } catch (CertificateEncodingException e13) {
                throw new IOException(e13.getMessage());
            }
        }

        public final void c(DiskLruCache.Editor editor) {
            HttpUrl httpUrl = this.f95503a;
            Handshake handshake = this.f95510h;
            Headers headers = this.f95509g;
            Headers headers2 = this.f95504b;
            Intrinsics.checkNotNullParameter(editor, "editor");
            x h10 = m0.h(editor.d(0));
            try {
                h10.l0(httpUrl.f95639i);
                h10.p1(10);
                h10.l0(this.f95505c);
                h10.p1(10);
                h10.O0(headers2.size());
                h10.p1(10);
                int size = headers2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    h10.l0(headers2.d(i13));
                    h10.l0(": ");
                    h10.l0(headers2.j(i13));
                    h10.p1(10);
                }
                h10.l0(new StatusLine(this.f95506d, this.f95507e, this.f95508f).toString());
                h10.p1(10);
                h10.O0(headers.size() + 2);
                h10.p1(10);
                int size2 = headers.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    h10.l0(headers.d(i14));
                    h10.l0(": ");
                    h10.l0(headers.j(i14));
                    h10.p1(10);
                }
                h10.l0(f95501k);
                h10.l0(": ");
                h10.O0(this.f95511i);
                h10.p1(10);
                h10.l0(f95502l);
                h10.l0(": ");
                h10.O0(this.f95512j);
                h10.p1(10);
                if (Intrinsics.d(httpUrl.f95631a, "https")) {
                    h10.p1(10);
                    Intrinsics.f(handshake);
                    h10.l0(handshake.f95620b.f95569a);
                    h10.p1(10);
                    b(h10, handshake.a());
                    b(h10, handshake.f95621c);
                    h10.l0(handshake.f95619a.javaName());
                    h10.p1(10);
                }
                Unit unit = Unit.f80348a;
                b.J(h10, null);
            } finally {
            }
        }

        public Entry(Response response) {
            Headers e13;
            Intrinsics.checkNotNullParameter(response, "response");
            Request request = response.f95720a;
            this.f95503a = request.f95700a;
            Cache.f95494b.getClass();
            Intrinsics.checkNotNullParameter(response, "<this>");
            Response response2 = response.f95727h;
            Intrinsics.f(response2);
            Headers headers = response2.f95720a.f95702c;
            Headers headers2 = response.f95725f;
            Set c13 = Companion.c(headers2);
            if (c13.isEmpty()) {
                e13 = Util.f95758b;
            } else {
                Headers.Builder builder = new Headers.Builder();
                int size = headers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    String d2 = headers.d(i13);
                    if (c13.contains(d2)) {
                        builder.a(d2, headers.j(i13));
                    }
                }
                e13 = builder.e();
            }
            this.f95504b = e13;
            this.f95505c = request.f95701b;
            this.f95506d = response.f95721b;
            this.f95507e = response.f95723d;
            this.f95508f = response.f95722c;
            this.f95509g = headers2;
            this.f95510h = response.f95724e;
            this.f95511i = response.f95730k;
            this.f95512j = response.f95731l;
        }
    }
}
