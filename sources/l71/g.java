package l71;

import kotlin.jvm.internal.Intrinsics;
import m60.w;
import o71.l0;
import uj2.b0;

/* loaded from: classes5.dex */
public final class g extends f {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f81944s;

    /* renamed from: t, reason: collision with root package name */
    public final j22.b f81945t;

    /* renamed from: u, reason: collision with root package name */
    public final p71.c f81946u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yk1.v viewResources, w eventManager, j22.b searchService, uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, g70.h boardNavigator) {
        super(null, null);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f81944s = true;
        this.f81945t = searchService;
        this.f81946u = new p71.c(searchService, 0);
        o(2, new aj0.d(viewResources, presenterPinalytics, networkStateStream, new l0(presenterPinalytics, analyticsApi), boardNavigator));
    }

    @Override // l71.f
    public final boolean B() {
        return false;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 2;
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (b0) this.f81946u.b(new p71.a(query, this.f81944s)).buildRequest();
    }

    @Override // l71.f
    public final boolean x(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return ((model instanceof br.d) && ((br.d) model).f23707e == br.c.AUTO_COMPLETE_UPSELL) ? false : true;
    }
}
