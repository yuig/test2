package o71;

import com.pinterest.api.model.eh0;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;

/* loaded from: classes5.dex */
public final class y extends x {

    /* renamed from: l, reason: collision with root package name */
    public final vy.m f93401l;

    /* renamed from: m, reason: collision with root package name */
    public final ip1.b f93402m;

    /* renamed from: n, reason: collision with root package name */
    public final m60.w f93403n;

    /* renamed from: o, reason: collision with root package name */
    public final z61.b f93404o;

    /* renamed from: p, reason: collision with root package name */
    public final j22.b f93405p;

    /* renamed from: q, reason: collision with root package name */
    public final j3 f93406q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f93407r;

    /* renamed from: s, reason: collision with root package name */
    public final eh0 f93408s;

    /* renamed from: t, reason: collision with root package name */
    public final hl1.a f93409t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f93410u;

    /* renamed from: v, reason: collision with root package name */
    public final j22.l f93411v;

    /* renamed from: w, reason: collision with root package name */
    public final String f93412w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f93413x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, ip1.b prefetchManager, m60.w eventManager, z61.b searchPWTManager, j22.b searchService, j3 typeaheadExperiments, boolean z13, eh0 searchTypeaheadLocal, org.chromium.net.y viewActivity, boolean z14, String initialQuery, h61.n nVar, j22.l typeaheadTabType, String str, boolean z15) {
        super(presenterPinalytics, networkStateStream, prefetchManager, new l0(presenterPinalytics, analyticsApi), eventManager, searchPWTManager, initialQuery, nVar);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        Intrinsics.checkNotNullParameter(searchTypeaheadLocal, "searchTypeaheadLocal");
        Intrinsics.checkNotNullParameter(viewActivity, "viewActivity");
        Intrinsics.checkNotNullParameter(initialQuery, "initialQuery");
        Intrinsics.checkNotNullParameter(typeaheadTabType, "typeaheadTabType");
        this.f93401l = analyticsApi;
        this.f93402m = prefetchManager;
        this.f93403n = eventManager;
        this.f93404o = searchPWTManager;
        this.f93405p = searchService;
        this.f93406q = typeaheadExperiments;
        this.f93407r = z13;
        this.f93408s = searchTypeaheadLocal;
        this.f93409t = viewActivity;
        this.f93410u = z14;
        this.f93411v = typeaheadTabType;
        this.f93412w = str;
        this.f93413x = z15;
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void E0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (isBound()) {
            if (this.f93411v == j22.l.PRODUCT_TAGGING) {
                ((k71.o) getView()).P2(query);
            } else {
                x.z3(this, query, h61.h.PRODUCTS, "typed", this.f93412w, null, null, 48);
            }
        }
    }

    @Override // o71.x, q71.d1
    public final void H1() {
        ((nl1.d) ((k71.o) getView())).D5();
    }

    @Override // o71.x, com.pinterest.feature.search.results.view.j
    public final void P0() {
        j22.l lVar = j22.l.PRODUCT_TAGGING;
        j22.l lVar2 = this.f93411v;
        if (lVar2 == lVar) {
            getPresenterPinalytics().c(a4.PRODUCT_TAGGING_SEARCH_PRODUCT_FEED, d4.PRODUCT_TAGGING, null);
        } else if (lVar2 == j22.l.PRODUCTS) {
            getPresenterPinalytics().c(a4.PERSONAL_BOUTIQUE_SEARCH_AUTOCOMPLETE, d4.PRODUCT_TAGGING, null);
        }
        super.P0();
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        l71.m mVar = new l71.m(this.f93403n, this.f93400k, this.f93402m, getPresenterPinalytics(), getNetworkStateStream(), this.f93401l, this.f93404o, this.f93405p, this.f93406q, this.f93407r, new m71.a(this.f93408s), this.f93409t, this.f93410u);
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f93397h.add(mVar);
        ((wk1.i) dataSources).b(mVar);
    }

    @Override // wk1.q
    public final void onStateUpdated(wt1.c0 state, wt1.d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if (state instanceof wt1.p) {
            ((k71.o) getView()).w();
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: v3 */
    public final void r3(k71.o view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        ArrayList arrayList = this.f93397h;
        String str = this.f93412w;
        if (str != null) {
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
                ((l71.s) it2.next()).f81962s.f106420n = str;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (next2 instanceof l71.s) {
                arrayList3.add(next2);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((l71.s) it4.next()).f81962s.f106416j = this.f93413x;
        }
    }
}
