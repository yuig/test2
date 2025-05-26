package l71;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import m60.w;
import uj2.b0;
import x02.i2;

/* loaded from: classes5.dex */
public final class l extends s {
    public final boolean A;
    public final p71.c B;
    public final r71.c C;
    public String D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w eventManager, o71.w screenNavigatorManager, ip1.b prefetchManager, uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, i2 pinRepository, z61.b searchPWTManager, j22.b searchService, boolean z13, yk1.v viewResources, j3 typeaheadExperiments) {
        super(eventManager, screenNavigatorManager, prefetchManager, presenterPinalytics, networkStateStream, analyticsApi, searchPWTManager);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        this.A = z13;
        this.B = new p71.c(searchService, 2);
        r71.c cVar = new r71.c(eventManager, presenterPinalytics, networkStateStream, this.f81964u, screenNavigatorManager, pinRepository, viewResources, typeaheadExperiments);
        this.C = cVar;
        this.D = this.f81938m;
        o(6, cVar);
    }

    @Override // l71.f
    public final boolean B() {
        return false;
    }

    @Override // l71.f
    public final void I(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.D = value;
        r71.c cVar = this.C;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        cVar.f106430i = value;
    }

    @Override // l71.s
    public final void L(Date date) {
        this.f81962s.f106415i = date;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 6;
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (b0) this.B.b(new p71.e(query, true, this.A)).buildRequest();
    }

    @Override // l71.f
    public final String z() {
        return this.D;
    }
}
