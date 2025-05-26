package o71;

import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.typeahead.view.TypeaheadSearchBarContainer;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.t3;
import ey.g1;
import ey.q1;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oi.o6;
import q71.d1;

/* loaded from: classes5.dex */
public abstract class x extends wk1.q implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final ip1.b f93390a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f93391b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f93392c;

    /* renamed from: d, reason: collision with root package name */
    public final z61.b f93393d;

    /* renamed from: e, reason: collision with root package name */
    public final String f93394e;

    /* renamed from: f, reason: collision with root package name */
    public final h61.n f93395f;

    /* renamed from: g, reason: collision with root package name */
    public final h61.n f93396g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f93397h;

    /* renamed from: i, reason: collision with root package name */
    public final uk2.d f93398i;

    /* renamed from: j, reason: collision with root package name */
    public Date f93399j;

    /* renamed from: k, reason: collision with root package name */
    public final w f93400k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(uk1.d pinalytics, uj2.q networkStateStream, ip1.b prefetchManager, l0 typeaheadLogging, m60.w eventManager, z61.b searchPWTManager, String initialQuery, h61.n nVar) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(typeaheadLogging, "typeaheadLogging");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(initialQuery, "initialQuery");
        this.f93390a = prefetchManager;
        this.f93391b = typeaheadLogging;
        this.f93392c = eventManager;
        this.f93393d = searchPWTManager;
        this.f93394e = initialQuery;
        this.f93395f = nVar;
        this.f93396g = nVar;
        this.f93397h = new ArrayList();
        uk2.d dVar = new uk2.d();
        dVar.c(initialQuery);
        this.f93398i = dVar;
        this.f93400k = new w(this);
    }

    public static void z3(x xVar, String query, h61.h searchType, String referrerSource, String str, a aVar, h61.n nVar, int i13) {
        ip1.b bVar;
        String str2 = (i13 & 8) != 0 ? null : str;
        a aVar2 = (i13 & 16) != 0 ? null : aVar;
        h61.n nVar2 = (i13 & 32) != 0 ? null : nVar;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(referrerSource, "referrerSource");
        if (xVar.isBound()) {
            String obj = StringsKt.i0(query).toString();
            if (Intrinsics.d(StringsKt.i0(xVar.f93394e).toString(), obj) && xVar.f93395f == xVar.f93396g) {
                ((nl1.d) ((k71.o) xVar.getView())).X6("com.pinterest.EXTRA_SEARCH_RESUBMITTED_QUERY", new Bundle());
                return;
            }
            boolean d2 = Intrinsics.d(referrerSource, "autocomplete");
            z61.b bVar2 = xVar.f93393d;
            ip1.b bVar3 = xVar.f93390a;
            if (d2) {
                if (aVar2 != null) {
                    bVar = bVar3;
                    l0.c(xVar.f93391b, obj, obj, aVar2.f93228a, "query", null, 48);
                } else {
                    bVar = bVar3;
                }
                bVar.a();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(searchType, "searchType");
                br.a aVar3 = br.a.AUTO_COMPLETE;
                q1 pwtSearchType = searchType.toPWTSearchType();
                new ey.a0(pwtSearchType, aVar3, -1).i();
                Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
                new g1(pwtSearchType).i();
            } else if (Intrinsics.d(referrerSource, "typed")) {
                HashMap o13 = ep.b.o("entered_query", obj);
                nx.d0 d0Var = xVar.getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEARCH_BOX_TEXT_INPUT, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : o13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                if (searchType == h61.h.PINS || nVar2 != null) {
                    bVar3.a();
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(searchType, "searchType");
                    br.a aVar4 = br.a.TYPED;
                    q1 pwtSearchType2 = searchType.toPWTSearchType();
                    new ey.a0(pwtSearchType2, aVar4, -1).i();
                    Intrinsics.checkNotNullParameter(pwtSearchType2, "pwtSearchType");
                    new g1(pwtSearchType2).i();
                }
            }
            Date date = xVar.f93399j;
            Long valueOf = date != null ? Long.valueOf(new Date().getTime() - date.getTime()) : null;
            com.pinterest.framework.screens.s sVar = ((nl1.d) ((k71.o) xVar.getView())).f91293r;
            if (sVar == null || sVar.G() != 1) {
                k71.o oVar = (k71.o) xVar.getView();
                String[] values = {query, referrerSource};
                Intrinsics.checkNotNullParameter(values, "values");
                oVar.F6(c71.b0.c(new c71.b0(searchType, obj, obj, String.valueOf(valueOf), null, null, null, null, null, referrerSource, null, null, kotlin.collections.e0.b(kotlin.collections.c0.M(values, "|", null, null, 0, null, null, 62)), null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073808400, 2097151), searchType == h61.h.USERS, 2));
                return;
            }
            String[] values2 = {query, referrerSource};
            Intrinsics.checkNotNullParameter(values2, "values");
            xVar.f93392c.d(c71.b0.c(new c71.b0(searchType, obj, obj, String.valueOf(valueOf), null, null, null, null, null, referrerSource, null, null, kotlin.collections.e0.b(kotlin.collections.c0.M(values2, "|", null, null, 0, null, null, 62)), null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073808400, 2097151), searchType == h61.h.USERS, 2));
            TypeaheadSearchBarContainer typeaheadSearchBarContainer = ((q71.x) ((k71.o) xVar.getView())).G0;
            if (typeaheadSearchBarContainer != null) {
                typeaheadSearchBarContainer.j("");
            } else {
                Intrinsics.r("searchBarContainer");
                throw null;
            }
        }
    }

    @Override // q71.d1
    public void H1() {
        ((k71.o) getView()).P2(t3());
    }

    @Override // com.pinterest.feature.search.results.view.j
    public void P0() {
        nx.d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.START_TYPING, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : "", (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public void Y(String query) {
        cl1.c cVar;
        Intrinsics.checkNotNullParameter(query, "query");
        k71.o oVar = (k71.o) getViewIfBound();
        if (oVar != null && (cVar = ((q71.x) oVar).f139744r0) != null) {
            cVar.p();
        }
        uk2.d dVar = this.f93398i;
        if (dVar != null) {
            dVar.c(query);
        }
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void l() {
        getPresenterPinalytics().f122379a.F(h32.g0.SEARCH_BOX, u0.FLASHLIGHT_CAMERA_BUTTON);
        m60.u.f85943a.d(Navigation.w1((ScreenLocation) t3.f51395a.getValue()));
    }

    public final String t3() {
        uk2.d dVar = this.f93398i;
        String str = dVar != null ? (String) dVar.S() : null;
        if (str == null) {
            str = "";
        }
        return StringsKt.i0(str).toString();
    }

    public final l71.s u3() {
        List<wk1.e> dataSources = getDataSources();
        ArrayList arrayList = new ArrayList();
        for (Object obj : dataSources) {
            wk1.e eVar = (wk1.e) obj;
            if ((eVar instanceof l71.s) || ((eVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.v) && (((com.pinterest.framework.multisection.datasource.pagedlist.v) eVar).f49190a instanceof l71.s))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wt1.b bVar = (wk1.e) it.next();
            if (bVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.v) {
                bVar = ((com.pinterest.framework.multisection.datasource.pagedlist.v) bVar).f49190a;
            }
            arrayList2.add(bVar);
        }
        Object d03 = CollectionsKt.d0(arrayList2);
        if (d03 instanceof l71.s) {
            return (l71.s) d03;
        }
        return null;
    }

    /* renamed from: v3 */
    public void onBind(k71.o view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        q71.x xVar = (q71.x) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        xVar.C0 = this;
        Intrinsics.checkNotNullParameter(this, "searchBarListener");
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = xVar.G0;
        if (typeaheadSearchBarContainer == null) {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
        typeaheadSearchBarContainer.i(this);
        String value = this.f93394e;
        xVar.Y8(value);
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
            l71.s sVar = (l71.s) it2.next();
            sVar.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            r71.b bVar = sVar.f81962s;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(value, "<set-?>");
            bVar.f106413g = value;
            yo0.a aVar = sVar.f81963t;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(value, "<set-?>");
            aVar.f139598e = value;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((l71.f) it3.next()).J(this.f93398i);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (next2 instanceof l71.s) {
                arrayList3.add(next2);
            }
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            l71.s sVar2 = (l71.s) it5.next();
            h61.n nVar = this.f93396g;
            sVar2.f81967x = nVar;
            sVar2.f81962s.f106418l = nVar;
        }
        Date date = new Date();
        this.f93399j = date;
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            Object next3 = it6.next();
            if (next3 instanceof l71.s) {
                arrayList4.add(next3);
            }
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            ((l71.s) it7.next()).L(date);
        }
        if (!kotlin.text.z.j(value)) {
            TypeaheadSearchBarContainer typeaheadSearchBarContainer2 = xVar.G0;
            if (typeaheadSearchBarContainer2 != null) {
                typeaheadSearchBarContainer2.h();
            } else {
                Intrinsics.r("searchBarContainer");
                throw null;
            }
        }
    }

    public final void w3(boolean z13) {
        int i13;
        String t33 = t3();
        h61.h hVar = z13 ? h61.h.MY_PINS : h61.h.PINS;
        Iterator<wk1.e> it = getDataSources().iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            wk1.e next = it.next();
            int a13 = next.a();
            for (int i14 = 0; i14 < a13; i14++) {
                if (next.getItemViewType(i14) == 1003) {
                    i13 = getGlobalPositionFromDataSourceAndLocalPosition(next, i14);
                    break loop0;
                }
            }
        }
        z3(this, t33, hVar, "autocomplete", null, new a(i13), null, 40);
    }

    public final void x3() {
        k71.o oVar = (k71.o) getView();
        String query = t3();
        q71.x xVar = (q71.x) oVar;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        xVar.s7().X(u0.SEARCH_AUTOCOMPLETE_SYOP_BUTTON);
        nu1.a aVar = xVar.A0;
        if (aVar == null) {
            Intrinsics.r("inAppNavigator");
            throw null;
        }
        nu1.a.c(aVar, "pinterest://user/me/", null, null, false, 30);
        View view = xVar.getView();
        if (view != null) {
            view.postDelayed(new o6(xVar, query, 14), 1000L);
        }
    }
}
