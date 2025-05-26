package vu1;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import tu1.d0;

/* loaded from: classes2.dex */
public final class e implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final s f126669a;

    /* renamed from: b, reason: collision with root package name */
    public UrlRequest f126670b;

    public e(s cronetClient) {
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        this.f126669a = cronetClient;
    }

    public final UrlRequest a() {
        return this.f126670b;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        s sVar = this.f126669a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (chain.call().getF95912p()) {
            throw new IOException("Canceled");
        }
        Request f95974e = chain.getF95974e();
        try {
            d0 d0Var = sVar.f126705b;
            CronetEngine d2 = sVar.d();
            Intrinsics.f(d2);
            com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(rVar, "directExecutor(...)");
            tu1.a0 a13 = d0Var.a(d2, rVar, f95974e, chain.getF95976g(), chain.getF95977h(), sVar.f126710g, false);
            try {
                boolean f95912p = chain.call().getF95912p();
                Object obj = a13.f119343a;
                if (f95912p) {
                    ((UrlRequest) obj).cancel();
                    throw new IOException("This Request is canceled!");
                }
                ((UrlRequest) obj).start();
                this.f126670b = (UrlRequest) obj;
                return a13.a();
            } catch (Throwable th3) {
                sVar.e().q(th3, "Failed to start Cronet UrlRequesturl: " + f95974e.f95700a, tb0.p.PLATFORM);
                ((tu1.n) sVar.f().getValue()).getClass();
                throw tu1.n.a(th3);
            }
        } catch (Throwable th4) {
            sVar.e().q(th4, "Failed to get response from CronetServiceClient for url: " + f95974e.f95700a, tb0.p.PLATFORM);
            throw th4;
        }
    }
}
