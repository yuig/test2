package okhttp3.internal.cache;

import ao2.m0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.Cache;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealResponseBody;
import wo2.c0;
import wo2.e0;
import wo2.i0;
import wo2.j;
import wo2.k;
import wo2.l;
import wo2.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f95766b = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Cache f95767a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static final Headers a(Companion companion, Headers headers, Headers headers2) {
            companion.getClass();
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i13 = 0; i13 < size; i13++) {
                String d2 = headers.d(i13);
                String j13 = headers.j(i13);
                if ((!z.i("Warning", d2, true) || !z.p(j13, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, false)) && (z.i("Content-Length", d2, true) || z.i("Content-Encoding", d2, true) || z.i("Content-Type", d2, true) || !c(d2) || headers2.c(d2) == null)) {
                    builder.c(d2, j13);
                }
            }
            int size2 = headers2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                String d13 = headers2.d(i14);
                if (!z.i("Content-Length", d13, true) && !z.i("Content-Encoding", d13, true) && !z.i("Content-Type", d13, true) && c(d13)) {
                    builder.c(d13, headers2.j(i14));
                }
            }
            return builder.e();
        }

        public static final Response b(Companion companion, Response response) {
            companion.getClass();
            if ((response != null ? response.f95726g : null) == null) {
                return response;
            }
            Response.Builder e13 = response.e();
            e13.f95740g = null;
            return e13.b();
        }

        public static boolean c(String str) {
            return (z.i("Connection", str, true) || z.i("Keep-Alive", str, true) || z.i("Proxy-Authenticate", str, true) || z.i("Proxy-Authorization", str, true) || z.i("TE", str, true) || z.i("Trailers", str, true) || z.i("Transfer-Encoding", str, true) || z.i("Upgrade", str, true)) ? false : true;
        }
    }

    public CacheInterceptor(Cache cache) {
        this.f95767a = cache;
    }

    public static Response a(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        c0 b13 = cacheRequest.b();
        ResponseBody responseBody = response.f95726g;
        Intrinsics.f(responseBody);
        final l f95981f = responseBody.getF95981f();
        final x h10 = m0.h(b13);
        e0 e0Var = new e0() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1

            /* renamed from: a, reason: collision with root package name */
            public boolean f95768a;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                if (!this.f95768a && !Util.h(this, TimeUnit.MILLISECONDS)) {
                    this.f95768a = true;
                    cacheRequest.a();
                }
                l.this.close();
            }

            @Override // wo2.e0
            public final long read(j sink, long j13) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    long read = l.this.read(sink, j13);
                    k kVar = h10;
                    if (read == -1) {
                        if (!this.f95768a) {
                            this.f95768a = true;
                            kVar.close();
                        }
                        return -1L;
                    }
                    sink.h(sink.f130711b - read, read, kVar.l());
                    kVar.V();
                    return read;
                } catch (IOException e13) {
                    if (!this.f95768a) {
                        this.f95768a = true;
                        cacheRequest.a();
                    }
                    throw e13;
                }
            }

            @Override // wo2.e0
            public final i0 timeout() {
                return l.this.timeout();
            }
        };
        String c13 = response.c("Content-Type", null);
        long f95980e = responseBody.getF95980e();
        Response.Builder e13 = response.e();
        e13.f95740g = new RealResponseBody(c13, f95980e, m0.i(e0Var));
        return e13.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ea  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r20) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
