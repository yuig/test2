package c60;

import df.j1;
import java.io.EOFException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import nm.s;
import nm.u;
import nm.v;
import okhttp3.Authenticator;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.Route;
import wo2.j;
import wo2.y;

/* loaded from: classes.dex */
public final class b implements Authenticator {

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f26510c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26511d;

    public b(bf2.a baseClientProvider, String apiHost) {
        Intrinsics.checkNotNullParameter(baseClientProvider, "baseClientProvider");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        this.f26510c = baseClientProvider;
        this.f26511d = apiHost;
    }

    @Override // okhttp3.Authenticator
    public final Request a(Route route, Response response) {
        String a13;
        List split$default;
        String str;
        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1;
        String str2;
        Intrinsics.checkNotNullParameter(response, "response");
        Request request = null;
        if (!Intrinsics.d(response.f95720a.f95700a.f95634d, this.f26511d) || (a13 = response.f95720a.a("Authorization")) == null || !z.p(a13, "Bearer", false)) {
            return null;
        }
        split$default = StringsKt__StringsKt.split$default(a13, new String[]{" "}, false, 0, 6, null);
        if (split$default.size() != 2) {
            split$default = null;
        }
        if (split$default == null || (str = (String) split$default.get(1)) == null || !z.p(str, "pina_", false)) {
            return null;
        }
        ResponseBody responseBody = response.f95726g;
        if (responseBody != null) {
            y source = responseBody.getF95981f().peek();
            j jVar = new j();
            source.request(Long.MAX_VALUE);
            long min = Math.min(Long.MAX_VALUE, source.f130750b.f130711b);
            Intrinsics.checkNotNullParameter(source, "source");
            while (min > 0) {
                long read = source.read(jVar, min);
                if (read == -1) {
                    throw new EOFException();
                }
                min -= read;
            }
            ResponseBody.Companion companion = ResponseBody.INSTANCE;
            MediaType f95751d = responseBody.getF95751d();
            long j13 = jVar.f130711b;
            companion.getClass();
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            responseBody$Companion$asResponseBody$1 = new ResponseBody$Companion$asResponseBody$1(f95751d, j13, jVar);
        } else {
            responseBody$Companion$asResponseBody$1 = null;
        }
        u i13 = j1.p1(responseBody$Companion$asResponseBody$1 != null ? responseBody$Companion$asResponseBody$1.string() : null).i();
        int i14 = -1;
        if (i13.v("code") != null) {
            s v13 = i13.v("code");
            v13.getClass();
            if (v13 instanceof v) {
                try {
                    i14 = i13.v("code").e();
                } catch (Exception unused) {
                }
            }
        }
        String str3 = response.f95720a.f95701b;
        if (i14 != 2) {
            return null;
        }
        synchronized (this) {
            try {
                d dVar = d.f26513a;
                a aVar = d.f26516d;
                if (aVar != null && (str2 = aVar.f26508b) != null) {
                    if (!Intrinsics.d(str, str2)) {
                        Request request2 = response.f95720a;
                        HttpUrl httpUrl = request2.f95700a;
                        Request.Builder b13 = request2.b();
                        b13.d("Authorization", "Bearer ".concat(str2));
                        return b13.b();
                    }
                    String a14 = response.f95720a.a("User-Agent");
                    if (a14 == null) {
                        a14 = "okhttp/4.12.0";
                    }
                    Object obj = this.f26510c.get();
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    if (d.c((OkHttpClient) obj, this.f26511d, a14)) {
                        Request request3 = response.f95720a;
                        HttpUrl httpUrl2 = request3.f95700a;
                        a aVar2 = d.f26516d;
                        String str4 = aVar2 != null ? aVar2.f26508b : null;
                        Intrinsics.f(str4);
                        Request.Builder b14 = request3.b();
                        b14.d("Authorization", "Bearer ".concat(str4));
                        request = b14.b();
                    }
                    return request;
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
