package z10;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class c implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final y10.a f140586a;

    public c(y10.a requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.f140586a = requestHeaders;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String c13;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request f95974e = chain.getF95974e();
        Request.Builder b13 = f95974e.b();
        Headers.Companion companion = Headers.f95626b;
        y10.a aVar = this.f140586a;
        aVar.getClass();
        HashMap hashMap = new HashMap((HashMap) aVar.f136619f.getValue());
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("Accept-Language", dl2.b.c1());
        AdvertisingIdClient.Info a13 = aVar.f136617d.a();
        String id3 = a13 != null ? a13.getId() : null;
        if (id3 == null) {
            id3 = "";
        }
        pairArr[1] = new Pair("X-Pinterest-Advertising-Id", id3);
        hashMap.putAll(z0.f(pairArr));
        m60.e eVar = aVar.f136615b;
        ((m60.d) eVar).g();
        companion.getClass();
        Headers c14 = Headers.Companion.c(hashMap);
        for (String str : c14.e()) {
            if (!Intrinsics.d(str, "Authorization") && (c13 = c14.c(str)) != null) {
                b13.a(str, c13);
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("X-Pinterest-AppState", ((m60.d) eVar).f85891a.getApiHeader());
        for (Map.Entry entry : hashMap2.entrySet()) {
            String str2 = (String) entry.getKey();
            Headers headers = f95974e.f95702c;
            if (headers.c(str2) != null) {
                String c15 = headers.c((String) entry.getKey());
                Boolean valueOf = c15 != null ? Boolean.valueOf(c15.length() == 0) : null;
                Intrinsics.f(valueOf);
                if (valueOf.booleanValue()) {
                }
            }
            b13.d((String) entry.getKey(), (String) entry.getValue());
        }
        if (!StringsKt.E(f95974e.f95700a.b(), "graphql", false)) {
            b13.a("X-Node-ID", "true");
        }
        return chain.b(b13.b());
    }
}
