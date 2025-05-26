package we1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;

/* loaded from: classes5.dex */
public final class t2 extends vq0.b implements nr0.d {

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f129615c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f129616d;

    /* renamed from: e, reason: collision with root package name */
    public final oj0.h f129617e;

    /* renamed from: f, reason: collision with root package name */
    public final is1.s f129618f;

    /* renamed from: g, reason: collision with root package name */
    public final String f129619g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.b0 f129620h;

    /* renamed from: i, reason: collision with root package name */
    public final g70.h f129621i;

    /* renamed from: j, reason: collision with root package name */
    public List f129622j;

    /* renamed from: k, reason: collision with root package name */
    public final nr0.b f129623k;

    /* renamed from: l, reason: collision with root package name */
    public final np0.e f129624l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f129625m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f129626n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f129627o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f129628p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(uk1.d presenterPinalytics, uj2.q networkStateStream, b60.b activeUserManager, m60.w eventManager, gi2.b boardRepItemViewBinderProvider, pb0.d fuzzyDateFormatter, x02.i2 pinRepository, boolean z13, oj0.h oneTapSaveConfig, is1.s pinSwipePreferences, String trafficSource, nx.b0 pinAuxHelper, f4 experiments, g70.h boardNavigator) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardRepItemViewBinderProvider, "boardRepItemViewBinderProvider");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(oneTapSaveConfig, "oneTapSaveConfig");
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "pinSwipePreferences");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f129615c = eventManager;
        this.f129616d = z13;
        this.f129617e = oneTapSaveConfig;
        this.f129618f = pinSwipePreferences;
        this.f129619g = trafficSource;
        this.f129620h = pinAuxHelper;
        this.f129621i = boardNavigator;
        nr0.b bVar = new nr0.b();
        this.f129623k = bVar;
        this.f129624l = new np0.e(pinRepository);
        this.f129625m = new LinkedHashMap();
        if (!z13) {
            bVar.f91865a = this;
        }
        this.f126436a.j(10, new f2(6));
        this.f126436a.j(3, new f2(5));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL, new f2(6));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP, new f2(13));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY, new h90.m(presenterPinalytics));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, new ac1.j(29));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_USER, new f2(12));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL, new f2(8));
        int i13 = 0;
        q2 clickHandler = new q2(this, i13);
        w longClickHandler = w.f129662k;
        wy0 f13 = ((b60.d) activeUserManager).f();
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Intrinsics.checkNotNullParameter(longClickHandler, "longClickHandler");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        this.f126436a.j(43, new xv.g(clickHandler, longClickHandler, f13, fuzzyDateFormatter));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP, new f2(1));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP, new f2(9));
        this.f126436a.j(39, new ni0.f(eventManager, bVar));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD, new ac1.j(27));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP, new f2(11));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP, new f2(7));
        this.f126436a.j(250, new cg0.c(presenterPinalytics, networkStateStream));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER, new ac1.j(25));
        c(new int[]{RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK}, new h90.m());
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL, new h90.m(getScope()));
        this.f129626n = xk2.m.b(new ee1.d(this, 7));
        this.f129627o = xk2.m.b(new s2(this, pinRepository, i13));
        this.f129628p = xk2.m.b(new s2(this, pinRepository, 1));
    }

    public final String D3() {
        String str;
        ue1.a0 a0Var = (ue1.a0) CollectionsKt.firstOrNull(d());
        return (!(a0Var instanceof ue1.w) || (str = ((ue1.w) a0Var).f122067f) == null) ? "" : str;
    }

    @Override // vq0.g
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final void r3(n2 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        if (!this.f129616d) {
            this.f129624l.f91749b = view;
        }
        List list = this.f129622j;
        if (list != null) {
            x3(list);
        }
        gb2.f fVar = gb2.f.f64747a;
        uj2.a0 a0Var = tk2.e.f118017c;
        mk2.k kVar = gl1.c.f65741g;
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(16, b2.f129294s);
        dVar.getClass();
        int i13 = 0;
        int i14 = 2;
        int i15 = 1;
        int i16 = 5;
        jk2.x xVar = new jk2.x(new jk2.j1(new jk2.j1(pk2.f.j(new jk2.j1(dVar, aVar, 0), new qt.b(16, b2.f129295t), 2, "filter(...)"), new f5.g(true, 5), 0), new qt.a(16, new q2(this, 4)), 0), new qt.b(16, b2.f129296u), i14);
        if (a0Var != null) {
            xVar.H(a0Var);
        }
        if (kVar != null) {
            xVar.A(kVar);
        }
        rr.c cVar = new rr.c(6, new q2(this, i16));
        x02.a2 a2Var = ck2.i.f27925e;
        ck2.c cVar2 = ck2.i.f27923c;
        x02.a2 a2Var2 = ck2.i.f27924d;
        xj2.c F = xVar.F(cVar, a2Var, cVar2, a2Var2);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        xj2.c F2 = new jk2.x(new jk2.j1(pk2.f.j(new jk2.j1(dVar, new qt.a(16, b2.f129297v), 0), new qt.b(16, b2.f129298w), 2, "filter(...)"), new ic1.a(7, b2.f129299x), 0), new d51.a(19, b2.f129300y), i14).F(new vd1.a(6, new q2(this, 6)), new vd1.a(7, b2.f129301z), cVar2, a2Var2);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        addDisposable(F2);
        List d2 = d();
        if (!(d2 instanceof Collection) || !d2.isEmpty()) {
            Iterator it = d2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ue1.a0) it.next()) instanceof ue1.w) {
                    ue1.a0 a0Var2 = (ue1.a0) CollectionsKt.firstOrNull(d());
                    if (!(a0Var2 instanceof ue1.w) || !((ue1.w) a0Var2).f122071j) {
                        if (Intrinsics.d(this.f129619g, "feed_holiday_finds")) {
                            LinkedHashMap linkedHashMap = jj0.a.f76305a;
                            oj0.g oneTapSaveListener = (oj0.g) this.f129628p.getValue();
                            Intrinsics.checkNotNullParameter("__wishlist__", "boardId");
                            Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
                            jj0.a.f76305a.put("__wishlist__", oneTapSaveListener);
                        } else {
                            LinkedHashMap linkedHashMap2 = jj0.a.f76305a;
                            String boardId = D3();
                            oj0.f oneTapSaveListener2 = (oj0.f) this.f129627o.getValue();
                            Intrinsics.checkNotNullParameter(boardId, "boardId");
                            Intrinsics.checkNotNullParameter(oneTapSaveListener2, "oneTapSaveListener");
                            jj0.a.f76305a.put(boardId, oneTapSaveListener2);
                        }
                    }
                    gb2.f fVar2 = gb2.f.f64747a;
                    mk2.k kVar2 = gl1.c.f65741g;
                    uk2.d dVar2 = gb2.f.f64748b;
                    qt.a aVar2 = new qt.a(16, b2.f129291p);
                    dVar2.getClass();
                    jk2.x xVar2 = new jk2.x(new jk2.j1(new jk2.j1(pk2.f.j(new jk2.j1(dVar2, aVar2, 0), new qt.b(16, b2.f129292q), 2, "filter(...)"), new f5.g(true, 4), 0), new qt.a(16, new q2(this, i14)), 0), new qt.b(16, b2.f129293r), i14);
                    if (kVar2 != null) {
                        xVar2.A(kVar2);
                    }
                    xj2.c F3 = xVar2.F(new rr.c(6, new q2(this, 3)), a2Var, cVar2, a2Var2);
                    Intrinsics.checkNotNullExpressionValue(F3, "subscribe(...)");
                    addDisposable(F3);
                }
            }
        }
        List<ue1.a0> d13 = d();
        if ((d13 instanceof Collection) && d13.isEmpty()) {
            return;
        }
        for (ue1.a0 a0Var3 : d13) {
            if ((a0Var3 instanceof ue1.f) && kh2.d.B0(((ue1.f) a0Var3).f122000a)) {
                uk2.d dVar3 = gb2.f.f64748b;
                qt.a aVar3 = new qt.a(16, b2.f129287l);
                dVar3.getClass();
                xj2.c F4 = new jk2.u0(pk2.f.j(new jk2.j1(dVar3, aVar3, 0), new qt.b(16, b2.f129288m), 2, "filter(...)"), new ic1.a(8, b2.f129289n), i13).F(new vd1.a(8, new q2(this, i15)), new vd1.a(9, b2.f129290o), cVar2, a2Var2);
                Intrinsics.checkNotNullExpressionValue(F4, "subscribe(...)");
                addDisposable(F4);
                return;
            }
        }
    }

    public final void G3(List itemRepModels) {
        Intrinsics.checkNotNullParameter(itemRepModels, "itemRepModels");
        if (this.f129616d) {
            this.f129622j = itemRepModels;
            x3(itemRepModels);
            return;
        }
        List<Object> list = itemRepModels;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (Object obj : list) {
            if (obj instanceof ue1.u) {
                ue1.u uVar = (ue1.u) obj;
                obj = ue1.u.c(uVar, wa2.m.a(uVar.f122056d, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, null, null, this.f129623k, false, null, null, false, false, null, null, false, -1, -8388609, 1023), null, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER);
            }
            arrayList.add(obj);
        }
        this.f129622j = arrayList;
        x3(arrayList);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        ue1.a0 a0Var = (ue1.a0) getItem(i13);
        if ((a0Var instanceof ue1.u) && ((wa2.a0) this.f129625m.get(((ue1.u) a0Var).f122053a.getUid())) == wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION) {
            return 10;
        }
        if (a0Var != null) {
            return a0Var.m();
        }
        return -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [np0.e] */
    @Override // nr0.d
    public final void onPinClicked(f30 pin) {
        ?? r03;
        Intrinsics.checkNotNullParameter(pin, "pin");
        List list = this.f129622j;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ue1.v) {
                    arrayList.add(obj);
                }
            }
            r03 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r03.add(((ue1.v) it.next()).a());
            }
        } else {
            r03 = kotlin.collections.q0.f80391a;
        }
        this.f129624l.a(pin, r03, null, ((is1.t) this.f129618f).a(pin));
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }
}
