package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f113413a;

    public f3(r8 r8Var) {
        this.f113413a = r8Var;
    }

    public final com.pinterest.creatorHub.feature.creatorpathways.j a(nx.a0 noOpPinalytics) {
        uk1.d f13;
        r8 r8Var = this.f113413a;
        uk1.e pinalyticsFactory = (uk1.e) r8Var.f114090a.f113702ga.get();
        uj2.q networkStateStream = (uj2.q) r8Var.f114090a.f113947u9.get();
        Intrinsics.checkNotNullParameter(noOpPinalytics, "noOpPinalytics");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        f13 = ((uk1.a) pinalyticsFactory).f(noOpPinalytics, "");
        return new com.pinterest.creatorHub.feature.creatorpathways.j(f13, networkStateStream);
    }
}
