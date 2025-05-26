package l71;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import uj2.b0;

/* loaded from: classes5.dex */
public final class b extends s {
    public final j22.b A;
    public final boolean B;
    public final boolean C;
    public final no0.a D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w eventManager, o71.w screenNavigatorManager, ip1.b prefetchManager, uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, z61.b searchPWTManager, j22.b searchService, boolean z13) {
        super(eventManager, screenNavigatorManager, prefetchManager, presenterPinalytics, networkStateStream, analyticsApi, searchPWTManager);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        this.A = searchService;
        this.B = true;
        this.C = z13;
        o(13, new ni0.f(presenterPinalytics, networkStateStream, this.f81962s));
        this.D = new no0.a(searchService);
    }

    @Override // l71.f
    public final boolean B() {
        return z.j(this.f81938m);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 13;
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        kk2.m k13 = ((b0) this.D.b(new p71.f(this.B, this.C)).buildRequest()).k(new d51.a(8, a.f81925j));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }
}
