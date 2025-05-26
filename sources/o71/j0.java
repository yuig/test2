package o71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import x02.i2;
import x02.l2;

/* loaded from: classes5.dex */
public final class j0 extends x {

    /* renamed from: l, reason: collision with root package name */
    public final vy.m f93308l;

    /* renamed from: m, reason: collision with root package name */
    public final ip1.b f93309m;

    /* renamed from: n, reason: collision with root package name */
    public final i92.k f93310n;

    /* renamed from: o, reason: collision with root package name */
    public final m60.w f93311o;

    /* renamed from: p, reason: collision with root package name */
    public final l2 f93312p;

    /* renamed from: q, reason: collision with root package name */
    public final j22.b f93313q;

    /* renamed from: r, reason: collision with root package name */
    public final k22.m f93314r;

    /* renamed from: s, reason: collision with root package name */
    public final i2 f93315s;

    /* renamed from: t, reason: collision with root package name */
    public final yk1.v f93316t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f93317u;

    /* renamed from: v, reason: collision with root package name */
    public final j3 f93318v;

    /* renamed from: w, reason: collision with root package name */
    public final g70.h f93319w;

    /* renamed from: x, reason: collision with root package name */
    public l71.b f93320x;

    /* renamed from: y, reason: collision with root package name */
    public l71.h f93321y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, ip1.b prefetchManager, i92.k toastUtils, m60.w eventManager, z61.b searchPWTManager, l2 typeaheadRepository, j22.b searchService, k22.m userService, i2 pinRepository, yk1.a viewResources, boolean z13, String initialQuery, h61.n nVar, j3 typeaheadExperiments, g70.h boardNavigator) {
        super(presenterPinalytics, networkStateStream, prefetchManager, new l0(presenterPinalytics, analyticsApi), eventManager, searchPWTManager, initialQuery, nVar);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(typeaheadRepository, "typeaheadRepository");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(initialQuery, "initialQuery");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f93308l = analyticsApi;
        this.f93309m = prefetchManager;
        this.f93310n = toastUtils;
        this.f93311o = eventManager;
        this.f93312p = typeaheadRepository;
        this.f93313q = searchService;
        this.f93314r = userService;
        this.f93315s = pinRepository;
        this.f93316t = viewResources;
        this.f93317u = z13;
        this.f93318v = typeaheadExperiments;
        this.f93319w = boardNavigator;
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void E0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (isBound()) {
            x.z3(this, query, h61.h.MY_PINS, "typed", null, null, null, 56);
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        z61.b searchPWTManager = new z61.b(null);
        uk1.d presenterPinalytics = getPresenterPinalytics();
        uj2.q<Boolean> networkStateStream = getNetworkStateStream();
        m60.w eventManager = this.f93311o;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        w screenNavigatorManager = this.f93400k;
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        ip1.b prefetchManager = this.f93309m;
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        vy.m analyticsApi = this.f93308l;
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        l71.t tVar = new l71.t(eventManager, screenNavigatorManager, prefetchManager, presenterPinalytics, networkStateStream, analyticsApi, searchPWTManager);
        tVar.o(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL, new sz0.a(21));
        ArrayList arrayList = this.f93397h;
        arrayList.add(tVar);
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(tVar);
        l71.l lVar = new l71.l(this.f93311o, this.f93400k, this.f93309m, getPresenterPinalytics(), getNetworkStateStream(), this.f93308l, this.f93315s, searchPWTManager, this.f93313q, this.f93317u, this.f93316t, this.f93318v);
        arrayList.add(lVar);
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) lVar, false, 4);
        vVar.k(RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
        iVar.b(vVar);
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        uj2.q<Boolean> networkStateStream2 = getNetworkStateStream();
        l71.g gVar = new l71.g(this.f93316t, this.f93311o, this.f93313q, presenterPinalytics2, networkStateStream2, this.f93308l, this.f93319w);
        arrayList.add(gVar);
        int i13 = 6;
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar2 = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) gVar, (boolean) (0 == true ? 1 : 0), i13);
        vVar2.k(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
        iVar.b(vVar2);
        l71.b bVar = new l71.b(this.f93311o, this.f93400k, this.f93309m, getPresenterPinalytics(), getNetworkStateStream(), this.f93308l, searchPWTManager, this.f93313q, this.f93317u);
        this.f93320x = bVar;
        arrayList.add(bVar);
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar3 = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) bVar, (boolean) (0 == true ? 1 : 0), i13);
        vVar3.k(RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
        iVar.b(vVar3);
        uk1.d presenterPinalytics3 = getPresenterPinalytics();
        uj2.q<Boolean> networkStateStream3 = getNetworkStateStream();
        l71.o oVar = new l71.o(this.f93317u, this.f93315s, this.f93311o, presenterPinalytics3, networkStateStream3, this.f93316t, this.f93314r);
        arrayList.add(oVar);
        iVar.b(oVar);
        l71.h hVar = new l71.h(new h0(this, 0 == true ? 1 : 0), new h0(this, 1), true, 1004);
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f93321y = hVar;
        iVar.b(hVar);
    }

    @Override // wk1.q
    public final void onStateUpdated(wt1.c0 state, wt1.d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if (state instanceof wt1.p) {
            ((k71.o) getView()).w();
            l71.h hVar = this.f93321y;
            if (hVar != null) {
                hVar.u();
            } else {
                Intrinsics.r("emptyRecyclerFooterSource");
                throw null;
            }
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: v3 */
    public final void r3(k71.o view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        l71.b bVar = this.f93320x;
        if (bVar != null) {
            addDisposable(nl.b.m(bVar.f81969z, "LegoSearchTypeaheadRecentSearchesFetchedList:clearQuery", new i0(this, 0)));
        }
    }
}
