package q01;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.api.model.tc0;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.xc0;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import h32.f1;
import h32.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import oi.p6;
import r0.p0;
import v.c1;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final View f101841a;

    /* renamed from: b, reason: collision with root package name */
    public final i01.t f101842b;

    /* renamed from: c, reason: collision with root package name */
    public final i01.z f101843c;

    /* renamed from: d, reason: collision with root package name */
    public final ar0.t f101844d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f101845e;

    /* renamed from: f, reason: collision with root package name */
    public final uj2.q f101846f;

    /* renamed from: g, reason: collision with root package name */
    public final yk1.j f101847g;

    /* renamed from: h, reason: collision with root package name */
    public final hs.d f101848h;

    /* renamed from: i, reason: collision with root package name */
    public final Activity f101849i;

    /* renamed from: j, reason: collision with root package name */
    public c1 f101850j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.k f101851k;

    /* renamed from: l, reason: collision with root package name */
    public RelatedPinsFiltersCarouselView f101852l;

    /* renamed from: m, reason: collision with root package name */
    public p01.p f101853m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f101854n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f101855o;

    /* renamed from: p, reason: collision with root package name */
    public p01.j f101856p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.k f101857q;

    public y(View fragmentView, i01.t pinCloseupView, i01.z pinCloseupScrollObservable, ar0.t recyclerViewScrollObservable, RecyclerView closeupRecyclerView, uj2.q networkStateStream, yk1.j mvpBinder, hs.d moduleViewabilityHelper, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(fragmentView, "fragmentView");
        Intrinsics.checkNotNullParameter(pinCloseupView, "pinCloseupView");
        Intrinsics.checkNotNullParameter(pinCloseupScrollObservable, "pinCloseupScrollObservable");
        Intrinsics.checkNotNullParameter(recyclerViewScrollObservable, "recyclerViewScrollObservable");
        Intrinsics.checkNotNullParameter(closeupRecyclerView, "closeupRecyclerView");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f101841a = fragmentView;
        this.f101842b = pinCloseupView;
        this.f101843c = pinCloseupScrollObservable;
        this.f101844d = recyclerViewScrollObservable;
        this.f101845e = closeupRecyclerView;
        this.f101846f = networkStateStream;
        this.f101847g = mvpBinder;
        this.f101848h = moduleViewabilityHelper;
        this.f101849i = activity;
        xk2.n nVar = xk2.n.NONE;
        this.f101851k = xk2.m.a(nVar, new x(this, 0));
        this.f101855o = new Handler(Looper.getMainLooper());
        this.f101857q = xk2.m.a(nVar, new x(this, 1));
    }

    public final int a() {
        boolean a13 = this.f101848h.a();
        View view = this.f101841a;
        if (!a13) {
            return view.getResources().getDimensionPixelSize(n80.a.related_pins_filters_carousel_height);
        }
        return ((Number) this.f101857q.getValue()).intValue() + view.getResources().getDimensionPixelSize(n80.a.related_pins_filters_carousel_height);
    }

    public final void b(String pinId, vh story, uk1.d presenterPinalytics) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        if (this.f101852l != null) {
            return;
        }
        List list = story.f42865w;
        Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof tc0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f101855o.post(new p0(this, pinId, story, arrayList, presenterPinalytics, 5));
    }

    public final void c() {
        if (this.f101854n && this.f101848h.a()) {
            Context context = this.f101841a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (pk.a0.q0(context)) {
                return;
            }
            Window window = this.f101849i.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            pk.a0.i1(window);
        }
    }

    public final void d() {
        RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView = this.f101852l;
        if (relatedPinsFiltersCarouselView != null) {
            relatedPinsFiltersCarouselView.onDeactivated();
        }
    }

    public final void e(String code, Bundle result) {
        Object obj;
        i01.c1 c1Var;
        List s13;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        p01.p pVar = this.f101853m;
        if (pVar != null) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(result, "result");
            boolean d2 = Intrinsics.d(code, "100");
            p01.j jVar = pVar.f98396d;
            Object obj2 = null;
            if (!d2) {
                if (Intrinsics.d(code, "101")) {
                    String string = result.getString("filter_tab_id");
                    Iterator it = pVar.d().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.d(((tc0) next).getUid(), string)) {
                            obj2 = next;
                            break;
                        }
                    }
                    tc0 tc0Var = (tc0) obj2;
                    if (tc0Var != null) {
                        pVar.F3(tc0Var);
                        if (((p01.n) jVar).f98392h.size() == 0) {
                            int i13 = pVar.f98402j;
                            d0 pinalytics = pVar.getPinalytics();
                            f1 f1Var = f1.ALL_FILTERS_DESELECTED;
                            g0 g0Var = g0.RELATED_PINS_FILTERS_CAROUSEL;
                            HashMap hashMap = new HashMap();
                            hashMap.put("story_id", pVar.f98398f);
                            hashMap.put("num_filters_reset", String.valueOf(i13));
                            hashMap.put("pin_id", pVar.f98401i);
                            Unit unit = Unit.f80348a;
                            d0.B(pinalytics, f1Var, g0Var, null, hashMap, 20);
                            pVar.f98402j = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            String string2 = result.getString("selected_option_id");
            String string3 = result.getString("filter_tab_id");
            Iterator it2 = pVar.d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (Intrinsics.d(((tc0) obj).getUid(), string3)) {
                        break;
                    }
                }
            }
            tc0 filterTab = (tc0) obj;
            if (filterTab != null && (s13 = filterTab.s()) != null) {
                Iterator it3 = s13.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.d(((xc0) next2).getUid(), string2)) {
                        obj2 = next2;
                        break;
                    }
                }
                obj2 = (xc0) obj2;
            }
            if (filterTab == null || obj2 == null) {
                return;
            }
            p01.n nVar = (p01.n) jVar;
            nVar.getClass();
            Intrinsics.checkNotNullParameter(filterTab, "filter");
            LinkedHashMap linkedHashMap = nVar.f98392h;
            if (((xc0) linkedHashMap.get(filterTab)) == null) {
                pVar.f98402j++;
            }
            tc0 D3 = pVar.D3();
            pVar.n3(pVar.d().indexOf(filterTab), D3 != null ? 1 : 0);
            Intrinsics.checkNotNullParameter(filterTab, "filterTab");
            linkedHashMap.put(filterTab, obj2);
            if (pVar.isBound() && (c1Var = (i01.c1) pVar.getView()) != null) {
                RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView = (RelatedPinsFiltersCarouselView) c1Var;
                relatedPinsFiltersCarouselView.postDelayed(new v.k(relatedPinsFiltersCarouselView, pVar.d().indexOf(filterTab), 12), 300L);
            }
            if (D3 != null) {
                pVar.z3(D3);
            }
            nVar.c();
        }
    }

    public final void f() {
        i01.t tVar = this.f101842b;
        ((PinCloseupFragment) tVar).G9();
        ((PinCloseupFragment) tVar).J9(yk1.i.LOADING);
    }

    public final void g(int i13) {
        l2 l2Var = this.f101845e.f19242n;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager == null) {
            return;
        }
        pinterestStaggeredGridLayoutManager.Z0();
        RecyclerView recyclerView = this.f101845e;
        q5.x.a(recyclerView, new p6(recyclerView, this, pinterestStaggeredGridLayoutManager, i13, 3));
    }

    public final void h(c1 c1Var) {
        this.f101850j = c1Var;
    }

    public final void i(p01.n listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f101856p = listener;
    }
}
