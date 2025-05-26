package cr1;

import java.util.concurrent.atomic.AtomicBoolean;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.x1;
import lh0.z3;
import okhttp3.OkHttpClient;
import pq2.c1;
import pq2.d1;
import vu1.a0;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f53107a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f53108b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53109c;

    /* renamed from: d, reason: collision with root package name */
    public final rz.c f53110d;

    /* renamed from: e, reason: collision with root package name */
    public final rq2.a f53111e;

    /* renamed from: f, reason: collision with root package name */
    public final p00.b f53112f;

    /* renamed from: g, reason: collision with root package name */
    public final er1.b f53113g;

    /* renamed from: h, reason: collision with root package name */
    public final x1 f53114h;

    public g(rz.c adapterFactory, p00.b converterFactory, x1 experiments, er1.b authenticationFailureRouterFactory, a0 privateCronetClient, String url, OkHttpClient baseClient, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        Intrinsics.checkNotNullParameter(privateCronetClient, "privateCronetClient");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(authenticationFailureRouterFactory, "authenticationFailureRouterFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f53107a = baseClient;
        this.f53108b = privateCronetClient;
        this.f53109c = url;
        this.f53110d = adapterFactory;
        this.f53111e = gsonConverterFactory;
        this.f53112f = converterFactory;
        this.f53113g = authenticationFailureRouterFactory;
        this.f53114h = experiments;
    }

    public static m a(g gVar, String authToken) {
        d1 d2;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        boolean z13 = true;
        z10.b bVar = new z10.b(new c(authToken, 1), new bk.f());
        rz.c b13 = rz.c.b(gVar.f53110d, gVar.f53113g, new AtomicBoolean(false), false, 37);
        OkHttpClient.Builder newBuilder = gVar.f53107a.newBuilder();
        newBuilder.a(bVar);
        OkHttpClient okHttpClient = new OkHttpClient(newBuilder);
        x1 x1Var = gVar.f53114h;
        x1Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) x1Var.f83504a;
        if (!g1Var.o("android_cronet_identity_api", "enabled", z3Var) && !g1Var.l("android_cronet_identity_api")) {
            z13 = false;
        }
        rq2.a aVar = gVar.f53111e;
        p00.b bVar2 = gVar.f53112f;
        String str = gVar.f53109c;
        if (z13) {
            a0 a13 = gVar.f53108b.a(okHttpClient, null);
            if (a13.b()) {
                c1 c1Var = new c1();
                c1Var.c(str);
                c1Var.f101001a = a13;
                c1Var.a(b13);
                c1Var.b(bVar2);
                c1Var.b(aVar);
                d2 = c1Var.d();
            } else {
                c1 c1Var2 = new c1();
                c1Var2.c(str);
                c1Var2.f101001a = okHttpClient;
                c1Var2.a(b13);
                c1Var2.b(bVar2);
                c1Var2.b(aVar);
                d2 = c1Var2.d();
            }
        } else {
            c1 c1Var3 = new c1();
            c1Var3.c(str);
            c1Var3.f101001a = okHttpClient;
            c1Var3.a(b13);
            c1Var3.b(bVar2);
            c1Var3.b(aVar);
            d2 = c1Var3.d();
        }
        Object b14 = d2.b(m.class);
        Intrinsics.checkNotNullExpressionValue(b14, "create(...)");
        return (m) b14;
    }
}
