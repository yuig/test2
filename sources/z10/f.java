package z10;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class f implements Interceptor {
    public final boolean a(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String str = url.f95639i;
        List j13 = f0.j("v3/callback/event", "v3/callback/ping");
        if ((j13 instanceof Collection) && j13.isEmpty()) {
            return false;
        }
        Iterator it = j13.iterator();
        while (it.hasNext()) {
            if (StringsKt.E(str, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request f95974e = chain.getF95974e();
        if (f95974e.f95703d != null && f95974e.a("Content-Encoding") == null) {
            HttpUrl url = f95974e.f95700a;
            Intrinsics.checkNotNullParameter(url, "url");
            if (Intrinsics.d(url.f95634d, "trk.pinterest.com") || Intrinsics.d(url.f95634d, "trk2.pinterest.com") || a(url)) {
                RequestBody requestBody = f95974e.f95703d;
                long a13 = requestBody != null ? requestBody.a() : 0L;
                Intrinsics.f(requestBody);
                d dVar = new d(requestBody, 1);
                Request.Builder b13 = f95974e.b();
                b13.d("Content-Encoding", "gzip");
                b13.f(f95974e.f95701b, dVar);
                b13.i(cy.i.class, new cy.i(a13));
                return chain.b(b13.b());
            }
        }
        return chain.b(f95974e);
    }
}
