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
public final class f implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final v f126671a;

    /* renamed from: b, reason: collision with root package name */
    public UrlRequest f126672b;

    public f(v cronetClient) {
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        this.f126671a = cronetClient;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        v vVar = this.f126671a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (chain.call().getF95912p()) {
            throw new IOException("Canceled");
        }
        Request f95974e = chain.getF95974e();
        try {
            d0 d0Var = vVar.f126721b;
            CronetEngine b13 = vVar.f126723d.b();
            com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(rVar, "directExecutor(...)");
            tu1.a0 a13 = d0Var.a(b13, rVar, f95974e, chain.getF95976g(), chain.getF95977h(), vVar.f126726g, false);
            try {
                boolean f95912p = chain.call().getF95912p();
                Object obj = a13.f119343a;
                if (f95912p) {
                    ((UrlRequest) obj).cancel();
                    throw new IOException("This Request is canceled!");
                }
                ((UrlRequest) obj).start();
                this.f126672b = (UrlRequest) obj;
                return a13.a();
            } catch (Throwable th3) {
                vVar.d().q(th3, "Failed to start Cronet UrlRequesturl: " + f95974e.f95700a, tb0.p.PLATFORM);
                ((tu1.n) vVar.e().getValue()).getClass();
                throw tu1.n.a(th3);
            }
        } catch (Throwable th4) {
            vVar.d().q(th4, "Failed to get response from CronetServiceClient for url: " + f95974e.f95700a, tb0.p.PLATFORM);
            throw th4;
        }
    }
}
