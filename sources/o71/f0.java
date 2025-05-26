package o71;

import a.cb;
import com.pinterest.api.model.eh0;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.f3;
import lh0.g1;
import lh0.j3;
import lh0.z3;
import x02.l2;

/* loaded from: classes5.dex */
public final class f0 extends x {
    public final nu1.a A;
    public final g70.h B;
    public l71.f C;
    public l71.n D;
    public final ArrayList E;
    public final uk2.f F;

    /* renamed from: l, reason: collision with root package name */
    public final vy.m f93275l;

    /* renamed from: m, reason: collision with root package name */
    public final ip1.b f93276m;

    /* renamed from: n, reason: collision with root package name */
    public final i92.k f93277n;

    /* renamed from: o, reason: collision with root package name */
    public final m60.w f93278o;

    /* renamed from: p, reason: collision with root package name */
    public final z61.b f93279p;

    /* renamed from: q, reason: collision with root package name */
    public final l2 f93280q;

    /* renamed from: r, reason: collision with root package name */
    public final j22.b f93281r;

    /* renamed from: s, reason: collision with root package name */
    public final lh0.o f93282s;

    /* renamed from: t, reason: collision with root package name */
    public final j3 f93283t;

    /* renamed from: u, reason: collision with root package name */
    public final f3 f93284u;

    /* renamed from: v, reason: collision with root package name */
    public final yk1.v f93285v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f93286w;

    /* renamed from: x, reason: collision with root package name */
    public final eh0 f93287x;

    /* renamed from: y, reason: collision with root package name */
    public final hl1.a f93288y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f93289z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, ip1.b prefetchManager, i92.k toastUtils, m60.w eventManager, z61.b searchPWTManager, l2 typeaheadRepository, j22.b searchService, lh0.o baseExperimentsHelper, j3 typeaheadExperiments, f3 libraryExperiments, yk1.a viewResources, boolean z13, eh0 searchTypeaheadLocal, org.chromium.net.y viewActivity, boolean z14, nu1.a inAppNavigator, String initialQuery, h61.n nVar, g70.h boardNavigator) {
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
        Intrinsics.checkNotNullParameter(baseExperimentsHelper, "baseExperimentsHelper");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        Intrinsics.checkNotNullParameter(libraryExperiments, "libraryExperiments");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(searchTypeaheadLocal, "searchTypeaheadLocal");
        Intrinsics.checkNotNullParameter(viewActivity, "viewActivity");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(initialQuery, "initialQuery");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f93275l = analyticsApi;
        this.f93276m = prefetchManager;
        this.f93277n = toastUtils;
        this.f93278o = eventManager;
        this.f93279p = searchPWTManager;
        this.f93280q = typeaheadRepository;
        this.f93281r = searchService;
        this.f93282s = baseExperimentsHelper;
        this.f93283t = typeaheadExperiments;
        this.f93284u = libraryExperiments;
        this.f93285v = viewResources;
        this.f93286w = z13;
        this.f93287x = searchTypeaheadLocal;
        this.f93288y = viewActivity;
        this.f93289z = z14;
        this.A = inAppNavigator;
        this.B = boardNavigator;
        this.E = new ArrayList();
        this.F = cb.r("create(...)");
    }

    public final l71.n B3() {
        l71.n nVar = this.D;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.r("recentSearchesFetchedList");
        throw null;
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void E0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (isBound()) {
            x.z3(this, query, pe.i.F(br.c.NONE, this.f93396g), "typed", null, null, this.f93396g, 24);
        }
    }

    @Override // o71.x, com.pinterest.feature.search.results.view.j
    public final void Y(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        super.Y(query);
        k71.o oVar = (k71.o) getViewIfBound();
        if (oVar != null) {
            oVar.w();
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        l71.n nVar = new l71.n(this.f93278o, this.f93400k, this.f93276m, getPresenterPinalytics(), getNetworkStateStream(), this.f93275l, this.f93279p, this.f93281r, this.f93289z, this.f93283t, this.A);
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.D = nVar;
        ArrayList arrayList = this.f93397h;
        arrayList.add(B3());
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(B3());
        uk1.d presenterPinalytics = getPresenterPinalytics();
        uj2.q<Boolean> networkStateStream = getNetworkStateStream();
        r41.k kVar = r41.k.f106176a;
        l71.k kVar2 = new l71.k(this.f93278o, this.f93400k, this.f93276m, presenterPinalytics, networkStateStream, this.f93275l, this.f93279p, this.f93281r, this.f93286w, new m71.a(this.f93287x), this.f93282s, this.f93283t, this.f93284u, this.f93288y, this.f93289z, this.f93285v, this.A, this.B);
        Intrinsics.checkNotNullParameter(kVar2, "<set-?>");
        this.C = kVar2;
        arrayList.add(kVar2);
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) kVar2, false, 4);
        j3 j3Var = this.f93283t;
        if (!j3Var.c()) {
            vVar.g(1005);
        }
        iVar.b(vVar);
        if (j3Var.c()) {
            return;
        }
        l71.h hVar = new l71.h(new d0(this, 0), new d0(this, 1), false, 1005);
        this.E.add(hVar);
        iVar.b(hVar);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        String str;
        p3();
        uk2.d dVar = this.f93398i;
        if (dVar == null || (str = (String) dVar.S()) == null || !B3().D(str)) {
            return;
        }
        B3().F(str);
    }

    @Override // wk1.q
    public final void onStateUpdated(wt1.c0 state, wt1.d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if (state instanceof wt1.p) {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                ((l71.h) it.next()).u();
            }
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: v3 */
    public final void r3(k71.o view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        j3 j3Var = this.f93283t;
        j3Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) j3Var.f83398a;
        if (!g1Var.o("android_search_autocomplete_header_icon_exp", "enabled", z3Var)) {
            g1Var.l("android_search_autocomplete_header_icon_exp");
        }
        l71.f fVar = this.C;
        if (fVar == null) {
            Intrinsics.r("mainList");
            throw null;
        }
        l71.k kVar = fVar instanceof l71.k ? (l71.k) fVar : null;
        uk2.f fVar2 = this.F;
        if (kVar != null) {
            kVar.f81966w = fVar2;
        }
        addDisposable(nl.b.l(fVar2, "SearchTypeaheadTabsPresenter:autoFillSubject", new c(view, 1)));
        l71.s u33 = u3();
        if (u33 != null) {
            addDisposable(nl.b.m(u33.f81969z, "SearchTypeaheadTextBaseFetchedList:clearQuery", new e0(this, 0)));
        }
    }
}
