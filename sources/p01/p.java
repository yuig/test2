package p01;

import com.pinterest.api.model.tc0;
import com.pinterest.api.model.xc0;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i0;
import h32.f1;
import h32.g0;
import h32.u0;
import i01.c1;
import i01.d1;
import i01.y0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import sq0.e0;
import uj2.q;

/* loaded from: classes5.dex */
public final class p extends vq0.b implements d1, y0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f98395c;

    /* renamed from: d, reason: collision with root package name */
    public final j f98396d;

    /* renamed from: e, reason: collision with root package name */
    public final List f98397e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98398f;

    /* renamed from: g, reason: collision with root package name */
    public final w f98399g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f98400h;

    /* renamed from: i, reason: collision with root package name */
    public final String f98401i;

    /* renamed from: j, reason: collision with root package name */
    public int f98402j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String pinId, j filterSelectionStateManager, List unmodifiedDefaultFilters, String storyId, w eventManager, yk1.a viewResources, uk1.d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(filterSelectionStateManager, "filterSelectionStateManager");
        Intrinsics.checkNotNullParameter(unmodifiedDefaultFilters, "unmodifiedDefaultFilters");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f98395c = pinId;
        this.f98396d = filterSelectionStateManager;
        this.f98397e = unmodifiedDefaultFilters;
        this.f98398f = storyId;
        this.f98399g = eventManager;
        tc0 tc0Var = (tc0) CollectionsKt.firstOrNull(unmodifiedDefaultFilters);
        String q13 = tc0Var != null ? tc0Var.q() : null;
        this.f98401i = q13 == null ? "" : q13;
        this.f126436a.j(18992131, new h(filterSelectionStateManager, this, viewResources, storyId, unmodifiedDefaultFilters.size()));
    }

    public final tc0 D3() {
        Object obj;
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer u13 = ((tc0) obj).u();
            if (u13.intValue() == m32.c.ALL.getValue()) {
                break;
            }
        }
        return (tc0) obj;
    }

    public final void F3(tc0 filterTab) {
        tc0 D3 = D3();
        int i13 = D3 != null ? 1 : 0;
        int indexOf = d().indexOf(filterTab);
        n nVar = (n) this.f98396d;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(filterTab, "filterTab");
        nVar.f98392h.remove(filterTab);
        n3(indexOf, Math.max(this.f98397e.indexOf(filterTab), nVar.f98392h.size() + i13));
        z3(filterTab);
        if (D3 != null) {
            z3(D3);
        }
        nVar.c();
    }

    @Override // vq0.g
    /* renamed from: G3, reason: merged with bridge method [inline-methods] */
    public final void r3(c1 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((RelatedPinsFiltersCarouselView) view).f46964e = this;
        n nVar = (n) this.f98396d;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        nVar.f98394j = this;
        x3(this.f98397e);
    }

    @Override // i01.d1
    public final void Q(tc0 deselectedFilter) {
        Intrinsics.checkNotNullParameter(deselectedFilter, "deselectedFilter");
        F3(deselectedFilter);
    }

    @Override // i01.d1
    public final void X0() {
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.SWIPE;
        g0 g0Var = g0.RELATED_PINS_FILTERS_CAROUSEL;
        HashMap hashMap = new HashMap();
        hashMap.put("story_id", this.f98398f);
        Unit unit = Unit.f80348a;
        d0.B(pinalytics, f1Var, g0Var, this.f98401i, hashMap, 16);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 18992131;
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }

    @Override // i01.y0
    public final void x0(String filterTabId) {
        Object obj;
        Intrinsics.checkNotNullParameter(filterTabId, "filterTabId");
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((tc0) obj).getUid(), filterTabId)) {
                    break;
                }
            }
        }
        tc0 filter = (tc0) obj;
        if (filter == null) {
            return;
        }
        Integer u13 = filter.u();
        int value = m32.c.ALL.getValue();
        int intValue = u13.intValue();
        String str = this.f98401i;
        j jVar = this.f98396d;
        String str2 = this.f98398f;
        if (intValue == value) {
            if (isBound()) {
                n nVar = (n) jVar;
                int size = nVar.f98392h.size();
                d0 pinalytics = getPinalytics();
                u0 u0Var = u0.RELATED_PINS_RESET_ALL_FILTERS_BUTTON;
                g0 g0Var = g0.RELATED_PINS_FILTERS_CAROUSEL;
                HashMap o13 = ep.b.o("story_id", str2);
                o13.put("num_filters_reset", String.valueOf(size));
                o13.put("pin_id", str);
                Unit unit = Unit.f80348a;
                pinalytics.h(g0Var, u0Var, o13);
                nVar.f98392h.clear();
                x3(this.f98397e);
                nVar.c();
                return;
            }
            return;
        }
        n nVar2 = (n) jVar;
        nVar2.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        xc0 xc0Var = (xc0) nVar2.f98392h.get(filter);
        d0 pinalytics2 = getPinalytics();
        u0 u0Var2 = u0.RELATED_PINS_FILTER_REP;
        g0 g0Var2 = g0.RELATED_PINS_FILTERS_CAROUSEL;
        String uid = filter.getUid();
        HashMap o14 = ep.b.o("story_id", str2);
        o14.put("filter_name", filter.n());
        o14.put("filter_type", String.valueOf(filter.u().intValue()));
        o14.put("carousel_slot_index", String.valueOf(d().indexOf(filter)));
        o14.put("pin_id", str);
        if (xc0Var != null) {
            o14.put("selected_filter_option_name", xc0Var.j());
        }
        Unit unit2 = Unit.f80348a;
        pinalytics2.f0(u0Var2, g0Var2, uid, o14, false);
        NavigationImpl L = Navigation.L((ScreenLocation) i0.f50933k.getValue(), filter.getUid(), ml1.b.NO_TRANSITION.getValue());
        L.e(new m01.a(this.f98395c, str2, filter, xc0Var));
        this.f98399g.d(L);
    }

    @Override // i01.d1
    public final void x2() {
        if (this.f98400h) {
            return;
        }
        this.f98400h = true;
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.VIEW;
        g0 g0Var = g0.RELATED_PINS_FILTERS_CAROUSEL;
        HashMap hashMap = new HashMap();
        hashMap.put("story_id", this.f98398f);
        Unit unit = Unit.f80348a;
        d0.B(pinalytics, f1Var, g0Var, this.f98401i, hashMap, 16);
    }
}
