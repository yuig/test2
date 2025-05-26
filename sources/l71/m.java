package l71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Set;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.j3;
import m60.w;
import uj2.b0;

/* loaded from: classes5.dex */
public final class m extends s {
    public final j3 A;
    public final boolean B;
    public final m71.a C;
    public final boolean D;
    public final Set E;
    public final p71.c F;
    public String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w eventManager, o71.w screenNavigatorManager, ip1.b prefetchManager, uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, z61.b searchPWTManager, j22.b searchService, j3 typeaheadExperiments, boolean z13, m71.a cacheInteractor, hl1.a viewActivity, boolean z14, Set typesToFilterOut) {
        super(eventManager, screenNavigatorManager, prefetchManager, presenterPinalytics, networkStateStream, analyticsApi, searchPWTManager);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        Intrinsics.checkNotNullParameter(cacheInteractor, "cacheInteractor");
        Intrinsics.checkNotNullParameter(viewActivity, "viewActivity");
        Intrinsics.checkNotNullParameter(typesToFilterOut, "typesToFilterOut");
        this.A = typeaheadExperiments;
        this.B = z13;
        this.C = cacheInteractor;
        this.D = z14;
        this.E = typesToFilterOut;
        this.F = new p71.c(searchService, 2);
        this.G = this.f81938m;
        i iVar = new i(this, 1);
        if (Intrinsics.d(this.f81965v, iVar)) {
            return;
        }
        this.f81965v = iVar;
        this.f81962s.f106419m = iVar;
        this.f81963t.f139602i = iVar;
    }

    @Override // l71.f
    public final boolean B() {
        return false;
    }

    @Override // l71.f
    public final void I(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.G = value;
        r71.b bVar = this.f81962s;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        bVar.f106414h = value;
        yo0.a aVar = this.f81963t;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        aVar.f139600g = value;
    }

    @Override // l71.f
    public final boolean K() {
        ((g1) this.A.f83398a).c("android_search_client_cache_delay");
        return this.B;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object item = getItem(i13);
        Intrinsics.g(item, "null cannot be cast to non-null type com.pinterest.activity.search.model.SearchTypeaheadItem");
        br.c cVar = ((br.d) item).f23707e;
        if (cVar == br.c.AUTO_COMPLETE_UPSELL) {
            return 10;
        }
        if (cVar == br.c.SEARCH_FILTER_QUERY) {
            return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE;
        }
        return 1;
    }

    @Override // l71.f
    public final b0 v(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.C.a(query, this.B, j22.a.TYPEAHEAD);
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (b0) this.F.b(new p71.e(query, false, this.D)).buildRequest();
    }

    @Override // l71.f
    public final boolean x(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Set set = this.E;
        if (set.isEmpty()) {
            super.x(model);
            return true;
        }
        if (model instanceof br.d) {
            return !set.contains(((br.d) model).f23707e);
        }
        super.x(model);
        return true;
    }

    @Override // l71.f
    public final String z() {
        return this.G;
    }

    public m(w wVar, o71.w wVar2, ip1.b bVar, uk1.d dVar, uj2.q qVar, vy.m mVar, z61.b bVar2, j22.b bVar3, j3 j3Var, boolean z13, m71.a aVar, hl1.a aVar2, boolean z14) {
        this(wVar, wVar2, bVar, dVar, qVar, mVar, bVar2, bVar3, j3Var, z13, aVar, aVar2, z14, s0.f80394a);
    }
}
