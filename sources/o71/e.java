package o71;

import a.cb;
import com.pinterest.api.model.eh0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import x02.l2;

/* loaded from: classes5.dex */
public final class e extends x {
    public final ArrayList A;
    public final uk2.f B;

    /* renamed from: l, reason: collision with root package name */
    public final vy.m f93256l;

    /* renamed from: m, reason: collision with root package name */
    public final ip1.b f93257m;

    /* renamed from: n, reason: collision with root package name */
    public final i92.k f93258n;

    /* renamed from: o, reason: collision with root package name */
    public final m60.w f93259o;

    /* renamed from: p, reason: collision with root package name */
    public final z61.b f93260p;

    /* renamed from: q, reason: collision with root package name */
    public final l2 f93261q;

    /* renamed from: r, reason: collision with root package name */
    public final j22.b f93262r;

    /* renamed from: s, reason: collision with root package name */
    public final j3 f93263s;

    /* renamed from: t, reason: collision with root package name */
    public final yk1.v f93264t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f93265u;

    /* renamed from: v, reason: collision with root package name */
    public final eh0 f93266v;

    /* renamed from: w, reason: collision with root package name */
    public final hl1.a f93267w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f93268x;

    /* renamed from: y, reason: collision with root package name */
    public l71.f f93269y;

    /* renamed from: z, reason: collision with root package name */
    public l71.n f93270z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, ip1.b prefetchManager, i92.k toastUtils, m60.w eventManager, z61.b searchPWTManager, l2 typeaheadRepository, j22.b searchService, j3 typeaheadExperiments, yk1.a viewResources, boolean z13, eh0 searchTypeaheadLocal, org.chromium.net.y viewActivity, boolean z14, String initialQuery, h61.n nVar) {
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
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(searchTypeaheadLocal, "searchTypeaheadLocal");
        Intrinsics.checkNotNullParameter(viewActivity, "viewActivity");
        Intrinsics.checkNotNullParameter(initialQuery, "initialQuery");
        this.f93256l = analyticsApi;
        this.f93257m = prefetchManager;
        this.f93258n = toastUtils;
        this.f93259o = eventManager;
        this.f93260p = searchPWTManager;
        this.f93261q = typeaheadRepository;
        this.f93262r = searchService;
        this.f93263s = typeaheadExperiments;
        this.f93264t = viewResources;
        this.f93265u = z13;
        this.f93266v = searchTypeaheadLocal;
        this.f93267w = viewActivity;
        this.f93268x = z14;
        this.A = new ArrayList();
        this.B = cb.r("create(...)");
    }

    public final l71.n B3() {
        l71.n nVar = this.f93270z;
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
            ((nl1.d) ((k71.o) getView())).D5();
            this.f93259o.d(new s71.c(query));
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        l71.n nVar = new l71.n(this.f93259o, this.f93400k, this.f93257m, getPresenterPinalytics(), getNetworkStateStream(), this.f93256l, this.f93260p, this.f93262r, this.f93268x);
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.f93270z = nVar;
        ArrayList arrayList = this.f93397h;
        arrayList.add(B3());
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(B3());
        l71.m mVar = new l71.m(this.f93259o, this.f93400k, this.f93257m, getPresenterPinalytics(), getNetworkStateStream(), this.f93256l, this.f93260p, this.f93262r, this.f93263s, this.f93265u, new m71.a(this.f93266v), this.f93267w, this.f93268x);
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f93269y = mVar;
        arrayList.add(mVar);
        iVar.b(mVar);
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
            ((k71.o) getView()).w();
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                ((l71.h) it.next()).u();
            }
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public final void r3(k71.o view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        l71.f fVar = this.f93269y;
        if (fVar == null) {
            Intrinsics.r("mainList");
            throw null;
        }
        l71.k kVar = fVar instanceof l71.k ? (l71.k) fVar : null;
        uk2.f fVar2 = this.B;
        if (kVar != null) {
            kVar.f81966w = fVar2;
        }
        addDisposable(nl.b.l(fVar2, "CollageTypeaheadPresenter:autoFillSubject", new c(view, 0)));
        ArrayList arrayList = this.f93397h;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof l71.s) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((l71.s) it2.next()).f81962s.f106417k = true;
        }
        l71.s u33 = u3();
        if (u33 != null) {
            addDisposable(nl.b.m(u33.f81969z, "SearchTypeaheadTextBaseFetchedList:clearQuery", new d(this, 0)));
        }
    }
}
