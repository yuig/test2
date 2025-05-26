package su1;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import wo2.g0;

/* loaded from: classes2.dex */
public final class m implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.q f115242a;

    /* renamed from: b, reason: collision with root package name */
    public volatile k f115243b;

    public m(lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f115242a = prefsManagerPersisted;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        k kVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request f95974e = chain.getF95974e();
        synchronized (this) {
            kVar = this.f115243b;
            if (kVar == null) {
                g0 g0Var = n.f115244a;
                lb0.q prefsManagerPersisted = this.f115242a;
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
                Context context = kb0.a.f79058b;
                if ((context instanceof Application ? (Application) context : null) == null) {
                    kVar = null;
                } else {
                    String d2 = prefsManagerPersisted.d("network_throttling_limit", null);
                    kVar = d2 == null ? k.NO_LIMIT : k.valueOf(d2);
                }
                if (kVar != null) {
                    this.f115243b = kVar;
                    g0.b(n.f115244a, kVar.getBytesPerSecond());
                } else {
                    kVar = k.NO_LIMIT;
                }
            }
        }
        if (kVar == k.NO_LIMIT) {
            return chain.b(f95974e);
        }
        if (kVar.getInitialLatencyMs() > 0) {
            Thread.sleep(kVar.getInitialLatencyMs());
        }
        Response b13 = chain.b(f95974e);
        ResponseBody responseBody = b13.f95726g;
        if (responseBody == null) {
            return b13;
        }
        Response.Builder e13 = b13.e();
        e13.f95740g = new l(responseBody, n.f115244a);
        return e13.b();
    }
}
