package z10;

import df.j1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class b implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final a f140584a;

    /* renamed from: b, reason: collision with root package name */
    public final bk.f f140585b;

    public b(a authTokenProvider, bk.f authDomainRule) {
        Intrinsics.checkNotNullParameter(authTokenProvider, "authTokenProvider");
        Intrinsics.checkNotNullParameter(authDomainRule, "authDomainRule");
        this.f140584a = authTokenProvider;
        this.f140585b = authDomainRule;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request.Builder b13 = chain.getF95974e().b();
        String u13 = this.f140584a.u();
        if (u13 == null || z.j(u13)) {
            Response.Builder builder = new Response.Builder();
            Request request = chain.getF95974e();
            Intrinsics.checkNotNullParameter(request, "request");
            builder.f95734a = request;
            builder.h(Protocol.HTTP_1_1);
            builder.f95736c = 400;
            Intrinsics.checkNotNullParameter("Auth token missing. This is a synthetic local error from AuthenticatedHeaderInterceptor", "message");
            builder.f95737d = "Auth token missing. This is a synthetic local error from AuthenticatedHeaderInterceptor";
            ResponseBody.INSTANCE.getClass();
            builder.f95740g = ResponseBody.Companion.a("Auth token missing. This is a synthetic local error from AuthenticatedHeaderInterceptor");
            return builder.b();
        }
        String host = chain.getF95974e().f95700a.f95634d;
        Intrinsics.checkNotNullParameter(host, "host");
        this.f140585b.getClass();
        Intrinsics.checkNotNullParameter(host, "host");
        if (a20.a.f460b.e(host) || a20.a.b().e(host) || a20.a.a().e(host)) {
            b13.d("Authorization", j1.U("Bearer %s", new Object[]{u13}));
            return chain.b(b13.b());
        }
        String C = a.a.C(chain.getF95974e().f95700a.f95634d, " is not on the approved list of domains for access. This is a synthetic local error from AuthenticatedHeaderInterceptor");
        Response.Builder builder2 = new Response.Builder();
        Request request2 = chain.getF95974e();
        Intrinsics.checkNotNullParameter(request2, "request");
        builder2.f95734a = request2;
        builder2.h(Protocol.HTTP_1_1);
        builder2.f95736c = 400;
        builder2.f(C);
        ResponseBody.INSTANCE.getClass();
        builder2.f95740g = ResponseBody.Companion.a(C);
        return builder2.b();
    }
}
