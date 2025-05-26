package su1;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import pk.a0;

/* loaded from: classes2.dex */
public final class b implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final tb0.h f115229a;

    public b() {
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        this.f115229a = hVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response b13 = chain.b(chain.getF95974e());
        String c13 = b13.f95725f.c("pinterest-generated-by");
        if (c13 != null) {
            tb0.h hVar = this.f115229a;
            synchronized (hVar) {
                try {
                    String str = c13.split("-")[2];
                    if (!a0.s0(str)) {
                        tb0.o.f117107n.set(str);
                        hVar.s("api_release_stage", str);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return b13;
    }
}
