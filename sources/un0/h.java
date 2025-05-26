package un0;

import androidx.appcompat.widget.c2;
import androidx.recyclerview.widget.b2;
import com.google.android.gms.internal.measurement.x;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.b60;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hb;
import com.pinterest.api.model.la;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.feature.board.common.filter.view.BoardPinsFilter;
import com.pinterest.feature.pin.j;
import com.pinterest.feature.pin.r;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.y;
import dl1.s;
import h32.u0;
import ha2.c0;
import ha2.z;
import j12.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.o;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import m60.g0;
import m60.w;
import nr0.l;
import nr0.m;
import nx.b0;
import nx.d0;
import nx.d1;
import oj0.i;
import so.n6;
import so.o4;
import so.y6;
import wk1.n;
import x02.a2;
import x02.i2;
import x02.x0;
import x02.z0;
import x40.m7;
import xk2.v;

/* loaded from: classes5.dex */
public final class h extends n implements com.pinterest.feature.board.b, sn0.b, i {
    public List A;
    public zo.c B;
    public int C;
    public boolean D;
    public boolean E;
    public final w F;
    public final lk0.d G;
    public boolean H;
    public final bm0.b I;

    /* renamed from: J, reason: collision with root package name */
    public final g f122832J;
    public final d K;
    public final k11.b L;
    public final tn0.e M;
    public final tn0.e N;
    public final tn0.e O;
    public final wa2.i P;
    public final v Q;
    public final qk0.c R;
    public final v S;
    public final Set T;

    /* renamed from: a, reason: collision with root package name */
    public final String f122833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122834b;

    /* renamed from: c, reason: collision with root package name */
    public final k f122835c;

    /* renamed from: d, reason: collision with root package name */
    public final wk1.c f122836d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f122837e;

    /* renamed from: f, reason: collision with root package name */
    public final x12.a f122838f;

    /* renamed from: g, reason: collision with root package name */
    public final i92.k f122839g;

    /* renamed from: h, reason: collision with root package name */
    public final yk1.v f122840h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f122841i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f122842j;

    /* renamed from: k, reason: collision with root package name */
    public final i2 f122843k;

    /* renamed from: l, reason: collision with root package name */
    public final no1.e f122844l;

    /* renamed from: m, reason: collision with root package name */
    public final b60.b f122845m;

    /* renamed from: n, reason: collision with root package name */
    public final jl0.b f122846n;

    /* renamed from: o, reason: collision with root package name */
    public final m f122847o;

    /* renamed from: p, reason: collision with root package name */
    public final oc.c f122848p;

    /* renamed from: q, reason: collision with root package name */
    public final x f122849q;

    /* renamed from: r, reason: collision with root package name */
    public final lh0.v f122850r;

    /* renamed from: s, reason: collision with root package name */
    public final j f122851s;

    /* renamed from: t, reason: collision with root package name */
    public final d1 f122852t;

    /* renamed from: u, reason: collision with root package name */
    public final r f122853u;

    /* renamed from: v, reason: collision with root package name */
    public final c2 f122854v;

    /* renamed from: w, reason: collision with root package name */
    public final b0 f122855w;

    /* renamed from: x, reason: collision with root package name */
    public final rk0.j f122856x;

    /* renamed from: y, reason: collision with root package name */
    public v7 f122857y;

    /* renamed from: z, reason: collision with root package name */
    public ba f122858z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String boardId, String boardSectionId, k boardSectionService, wk1.c params, g0 pageSizeProvider, x12.a pagedListService, i92.k toastUtils, yk1.v viewResources, x0 boardRepository, z0 boardSectionRepository, i2 pinRepository, no1.e graphQLConversationRemoteDataSource, b60.b activeUserManager, m dynamicGridViewBinderDelegateFactory, oc.c apolloClient, o4 boardMoreBoardsPresenterFactory, x moreBoardsExperimentHelper, k22.m userService, lh0.v boardSectionExperiments, j pinAction, d1 trackingParamAttacher, r repinAnimationUtil, c2 repinToastHelper, k11.c easyGiftGuideUpsellUtilFactory, b0 pinAuxHelper, rk0.j organizeMultiToolbar) {
        super(params);
        jl0.b boardUtils = jl0.a.f76935a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        Intrinsics.checkNotNullParameter(boardSectionService, "boardSectionService");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(graphQLConversationRemoteDataSource, "graphQLConversationRemoteDataSource");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(boardUtils, "boardUtils");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(boardMoreBoardsPresenterFactory, "boardMoreBoardsPresenterFactory");
        Intrinsics.checkNotNullParameter(moreBoardsExperimentHelper, "moreBoardsExperimentHelper");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(boardSectionExperiments, "boardSectionExperiments");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(repinToastHelper, "repinToastHelper");
        Intrinsics.checkNotNullParameter(easyGiftGuideUpsellUtilFactory, "easyGiftGuideUpsellUtilFactory");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(organizeMultiToolbar, "organizeMultiToolbar");
        this.f122833a = boardId;
        this.f122834b = boardSectionId;
        this.f122835c = boardSectionService;
        this.f122836d = params;
        this.f122837e = pageSizeProvider;
        this.f122838f = pagedListService;
        this.f122839g = toastUtils;
        this.f122840h = viewResources;
        this.f122841i = boardRepository;
        this.f122842j = boardSectionRepository;
        this.f122843k = pinRepository;
        this.f122844l = graphQLConversationRemoteDataSource;
        this.f122845m = activeUserManager;
        this.f122846n = boardUtils;
        this.f122847o = dynamicGridViewBinderDelegateFactory;
        this.f122848p = apolloClient;
        this.f122849q = moreBoardsExperimentHelper;
        this.f122850r = boardSectionExperiments;
        this.f122851s = pinAction;
        this.f122852t = trackingParamAttacher;
        this.f122853u = repinAnimationUtil;
        this.f122854v = repinToastHelper;
        this.f122855w = pinAuxHelper;
        this.f122856x = organizeMultiToolbar;
        this.B = zo.c.DEFAULT;
        this.C = -1;
        this.F = params.f130134e;
        this.G = lk0.d.f83648a;
        this.I = new bm0.b();
        this.f122832J = new g(this);
        this.K = new d(this);
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.L = ((y6) easyGiftGuideUpsellUtilFactory).a(d0Var);
        this.M = v3(-1, "board/sections/" + boardSectionId + "/pins/");
        this.N = v3(6, "board/sections/" + boardSectionId + "/pins/6/");
        this.O = v3(5, "board/sections/" + boardSectionId + "/pins/5/");
        this.P = wa2.i.a(params.f130131b.f103320a, false, false, false, false, false, false, false, null, null, null, null, -1, -1, 1023);
        this.Q = xk2.m.b(new jh0.d(this, 23));
        this.R = new qk0.c(boardId, userService, getPresenterPinalytics(), boardMoreBoardsPresenterFactory);
        this.S = xk2.m.b(f.f122830i);
        this.T = h1.f(Integer.valueOf(hb.BOARD_MERGE.getEventType().value()), Integer.valueOf(hb.BULK_PIN_MOVE.getEventType().value()), Integer.valueOf(hb.BULK_SELECT_ALL_PIN_MOVE.getEventType().getValue()));
    }

    @Override // com.pinterest.feature.board.organize.h
    public final void B1() {
        tn0.e eVar = this.M;
        int i13 = 0;
        for (Object obj : eVar.d()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            eVar.u1(i13, (s) obj);
            i13 = i14;
        }
    }

    public final boolean B3() {
        v7 v7Var = this.f122857y;
        if (v7Var == null || kh2.w.i0(v7Var) || this.A == null) {
            return false;
        }
        lh0.v vVar = this.f122850r;
        vVar.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) vVar.f83489a;
        if (g1Var.o("android_presence_other_board_more_ideas_board_handler", "enabled", z3Var) || g1Var.l("android_presence_other_board_more_ideas_board_handler")) {
            List<s> q03 = CollectionsKt.q0(this.M.d());
            if ((q03 instanceof Collection) && q03.isEmpty()) {
                return false;
            }
            for (s sVar : q03) {
                if (!(sVar instanceof vh) || !Intrinsics.d(((vh) sVar).q(), "board_ideas_feed")) {
                }
            }
            return false;
        }
        List list = this.A;
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer q13 = ((la) it.next()).q();
            if (q13.intValue() == z22.c.MORE_IDEAS.getValue()) {
            }
        }
        return false;
        return true;
    }

    public final void D3(boolean z13) {
        x0 x0Var = this.f122841i;
        String str = this.f122833a;
        jk2.g0 s13 = x0Var.P(str).s();
        z0 z0Var = this.f122842j;
        String str2 = this.f122834b;
        jk2.g0 s14 = z0Var.P(str2).s();
        if (z13) {
            s13 = x0Var.Q(str).s();
            s14 = z0Var.Q(str2).s();
        }
        hl0.j jVar = new hl0.j(this, 1);
        uj2.b0.v(s13, s14, new mj.m(6)).p(jVar);
        Intrinsics.checkNotNullExpressionValue(jVar, "subscribeWith(...)");
        addDisposable(jVar);
    }

    @Override // com.pinterest.feature.board.organize.h
    public final void F(boolean z13) {
        boolean z14;
        if (this.f122858z != null && this.C != -1) {
            this.C = -1;
            onRecyclerRefresh();
        }
        for (wk1.e eVar : getDataSources()) {
            if (eVar instanceof bm0.b) {
                z14 = z13;
            } else {
                z14 = false;
                if (eVar instanceof tn0.e) {
                    if (eVar.s()) {
                    }
                    z14 = true;
                } else if (Intrinsics.d(eVar, (xk1.e) this.S.getValue())) {
                    if (eVar.s()) {
                    }
                    z14 = true;
                } else {
                    if (z13) {
                    }
                    z14 = true;
                }
            }
            eVar.C2(z14);
        }
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }

    public final void F3() {
        jk2.g0 s13 = this.f122841i.Q(this.f122833a).s();
        jk2.g0 s14 = this.f122842j.Q(this.f122834b).s();
        int i13 = 1;
        hl0.j jVar = new hl0.j(this, i13);
        new kk2.g(new kk2.g(uj2.b0.v(s13, s14, new ep.g(6, e.f122829i)), new tn0.a(14, new c(this, i13)), 2), new tn0.a(15, new c(this, 2)), 0).p(jVar);
        Intrinsics.checkNotNullExpressionValue(jVar, "subscribeWith(...)");
        addDisposable(jVar);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: G3, reason: merged with bridge method [inline-methods] */
    public final void r3(sn0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        sn0.a aVar = (sn0.a) getViewIfBound();
        if (aVar != null) {
            wk1.c gridParams = this.f122836d;
            Intrinsics.checkNotNullParameter(gridParams, "gridParams");
            gridParams.f(((wn0.j) aVar).W8());
        }
        sn0.a aVar2 = (sn0.a) getViewIfBound();
        if (aVar2 != null) {
            wn0.j jVar = (wn0.j) aVar2;
            Intrinsics.checkNotNullParameter(this, "listener");
            jVar.f130486i1 = this;
            BoardPinsFilter boardPinsFilter = jVar.A1;
            if (boardPinsFilter == null) {
                Intrinsics.r("boardSectionPinsFilter");
                throw null;
            }
            Intrinsics.checkNotNullParameter(this, "toolbarListener");
            boardPinsFilter.f45117a = this;
        }
        yk1.n viewIfBound = getViewIfBound();
        com.pinterest.feature.board.organize.g gVar = viewIfBound instanceof com.pinterest.feature.board.organize.g ? (com.pinterest.feature.board.organize.g) viewIfBound : null;
        rk0.j jVar2 = this.f122856x;
        if (gVar != null) {
            gVar.z4(jVar2);
            gVar.d4(jVar2);
        }
        w wVar = this.F;
        wVar.h(this.f122832J);
        wVar.h(this.K);
        this.L.a();
        wk1.i dataRegistry = getDataSourceRegistry();
        jVar2.getClass();
        Intrinsics.checkNotNullParameter(dataRegistry, "dataRegistry");
        jVar2.H = new WeakReference(dataRegistry);
        tn0.e eVar = this.M;
        uk2.f fVar = eVar.f49129s;
        tn0.a aVar3 = new tn0.a(8, new c(this, 5));
        tn0.a aVar4 = new tn0.a(9, b.f122824o);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        xj2.c F = fVar.F(aVar3, aVar4, cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        xj2.c F2 = this.f122842j.A(this.f122834b).F(new tn0.a(10, new c(this, 3)), new tn0.a(11, b.f122822m), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        addDisposable(F2);
        bv0.k kVar = new bv0.k(8, b.f122823n);
        uk2.f fVar2 = eVar.f49129s;
        fVar2.getClass();
        jk2.x xVar = new jk2.x(fVar2, kVar, 2);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        addDisposable(nl.b.s(xVar, new c(this, 4), null, null, 6));
        sn0.a aVar5 = (sn0.a) getViewIfBound();
        if (aVar5 != null) {
            ((wn0.j) aVar5).o9(w3().size(), this.B);
        }
    }

    public final void H3() {
        getPinalytics().F(h32.g0.NAVIGATION, u0.BOARD_TOOL_MESSAGE_GROUP);
        v7 v7Var = this.f122857y;
        if (v7Var == null || this.E) {
            return;
        }
        this.E = true;
        String uid = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        kk2.m k13 = com.bumptech.glide.d.u0(this.f122848p.c(new m7(uid))).l(wj2.c.a()).k(new qk0.b(5, b.f122820k));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        addDisposable(nl.b.q(k13, new sk0.x(18, v7Var, this), new c(this, 6)));
    }

    public final void I3(x22.c cVar) {
        uk1.c cVar2 = (sn0.a) getViewIfBound();
        if (cVar2 != null) {
            ScreenLocation screenLocation = (ScreenLocation) y.f51575f.getValue();
            String str = this.f122834b;
            NavigationImpl z03 = Navigation.z0(screenLocation, str);
            z03.m0("com.pinterest.EXTRA_BOARD_ID", this.f122833a);
            z03.m0("com.pinterest.EXTRA_BOARD_SECTION_ID", str);
            z03.z(cVar.getValue(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
            v7 v7Var = this.f122857y;
            z03.Y1("com.pinterest.EXTRA_HIDE_ONE_TAP_SAVE_BUTTON", !(v7Var != null && kh2.w.i0(v7Var)));
            Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
            ((nl1.d) cVar2).M1(z03);
        }
    }

    public final void J3() {
        getPinalytics().X(u0.MORE_BUTTON);
        Map g13 = kotlin.collections.z0.g(new Pair(Integer.valueOf(k70.e.edit_board_section), new a(this, 0)), new Pair(Integer.valueOf(d70.g.merge_into), new a(this, 1)));
        ArrayList z33 = z3();
        z zVar = new z(new ha2.x(k70.e.lego_board_section_overflow_label, null, null, null, null, 30), z33, new sv.y(z33, this, g13, 28));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zVar);
        ha2.a aVar = new ha2.a((List) arrayList, false, (Integer) null, 14);
        sn0.a aVar2 = (sn0.a) getViewIfBound();
        if (aVar2 != null) {
            ((wn0.j) aVar2).Y4(aVar);
        }
    }

    public final void K3() {
        sn0.a aVar = (sn0.a) getViewIfBound();
        if (aVar != null) {
            wn0.j jVar = (wn0.j) aVar;
            jVar.E8(0, false);
            AppBarLayout appBarLayout = jVar.f130492o1;
            if (appBarLayout != null) {
                appBarLayout.m(true, true);
            } else {
                Intrinsics.r("boardSectionHeaderContainer");
                throw null;
            }
        }
    }

    public final boolean L3() {
        return !z3().isEmpty();
    }

    @Override // oj0.i
    public final void a3() {
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(this.I);
        iVar.b(this.M);
        iVar.b(this.N);
        iVar.b(this.O);
        if (this.f122849q.q()) {
            iVar.b(this.R);
        }
        iVar.b((xk1.e) this.S.getValue());
        iVar.b((jj0.c) this.Q.getValue());
    }

    @Override // com.pinterest.feature.board.organize.h
    public final ArrayList e3() {
        List d2 = this.M.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            if (obj instanceof f30) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kj0.a
    public final void g0() {
        ha2.b0 I;
        List w13;
        ArrayList arrayList = new ArrayList();
        ba baVar = this.f122858z;
        int i13 = 0;
        if (baVar != null && (w13 = baVar.w()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : w13) {
                if (((b60) obj).e().intValue() != 5) {
                    arrayList2.add(obj);
                }
            }
            boolean z13 = true;
            if (!arrayList2.isEmpty()) {
                ha2.x xVar = new ha2.x(d70.g.filter_by_type, null, null, null, null, 30);
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    b60 b60Var = (b60) next;
                    arrayList3.add(new c0(0, i14, null, this.C == b60Var.e().intValue() ? z13 : false, false, b60Var.f(), null, null, null, null, 4052));
                    i14 = i15;
                    z13 = true;
                }
                arrayList.add(new ha2.b0(xVar, arrayList3, new sk0.x(17, this, arrayList2)));
            }
        }
        if (this.f122857y != null) {
            k41.e eVar = k41.f.Companion;
            zo.c cVar = this.B;
            eVar.getClass();
            I = o.I(k41.e.a(cVar), new c(this, i13), d70.g.set_view_as, null, null, null, null);
            arrayList.add(I);
        }
        sn0.a aVar = (sn0.a) getViewIfBound();
        if (aVar != null) {
            ((wn0.j) aVar).Y4(new ha2.a((List) arrayList, false, (Integer) null, 14));
        }
    }

    @Override // com.pinterest.feature.board.b
    public final zo.c h2() {
        return this.B;
    }

    @Override // wk1.q
    public final void loadData() {
        F3();
    }

    @Override // wk1.q, sq0.w
    public final void loadMoreData() {
        if (!this.M.t0()) {
            this.f122849q.f(this.f122857y);
        }
        super.loadMoreData();
    }

    @Override // oj0.i
    public final void n1() {
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        p3();
        if (this.M.f49127q.size() == 0 && this.N.f49127q.size() == 0 && this.O.f49127q.size() == 0) {
            F3();
        } else {
            D3(false);
        }
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        rk0.j jVar = this.f122856x;
        xj2.c cVar = jVar.f108452l;
        if (cVar != null) {
            cVar.dispose();
        }
        if (jVar.f108477z) {
            x0 x0Var = jVar.f108441a;
            if (x0Var == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            String boardId = jVar.e();
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            x0Var.O.c(new Pair(boardId, ""));
        }
        super.onDeactivate();
    }

    @Override // wk1.q, yk1.b
    public final void onDestroy() {
        this.M.U.dispose();
        this.N.U.dispose();
        this.O.U.dispose();
        super.onDestroy();
    }

    @Override // wk1.n, nr0.d
    public final void onPinClicked(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        rk0.j jVar = this.f122856x;
        if (jVar.G.inOrganize()) {
            jVar.z0(pin);
        } else {
            super.onPinClicked(pin);
        }
    }

    @Override // wk1.q, sq0.a0
    public final void onRecyclerRefresh() {
        super.onRecyclerRefresh();
        D3(true);
    }

    @Override // yk1.b
    public final void onRestore() {
        super.onRestore();
        this.D = false;
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        g gVar = this.f122832J;
        w wVar = this.F;
        wVar.j(gVar);
        wVar.j(this.K);
        this.L.c();
        super.onUnbind();
    }

    @Override // com.pinterest.feature.board.organize.h
    public final void s0(LinkedHashSet selectedPins) {
        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
        Iterator it = selectedPins.iterator();
        while (it.hasNext()) {
            String uid = ((f30) it.next()).getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            this.M.X(uid);
        }
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // com.pinterest.feature.board.organize.h
    public final void u0(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        tn0.e eVar = this.M;
        eVar.u1(eVar.d().indexOf(model), model);
    }

    public final tn0.e v3(int i13, String str) {
        uk1.d presenterPinalytics = getPresenterPinalytics();
        wk1.c cVar = this.f122836d;
        qa2.n nVar = cVar.f130131b;
        l a13 = ((n6) this.f122847o).a(presenterPinalytics, nVar.f103320a, nVar, cVar.f130137h);
        wa2.i iVar = cVar.f130131b.f103320a;
        wa2.i a14 = wa2.i.a(iVar, false, false, false, true, false, false, false, null, null, null, null, -5242881, -1, 1023);
        oj0.h hVar = new oj0.h(getPresenterPinalytics(), this.f122852t, this.f122853u, this.f122851s, this.L, this.f122854v);
        return new tn0.e(i13, this.f122833a, this.f122834b, this.f122837e, this.f122841i, this.f122843k, this, str, this.f122838f, a13, iVar, a14, this.f122856x, this.F, hVar, this.f122855w);
    }

    public final List w3() {
        int i13 = this.C;
        return i13 != 5 ? i13 != 6 ? this.M.d() : this.N.d() : this.O.d();
    }

    public final int x3() {
        Iterator it = w3().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((s) it.next()) instanceof f30) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (dl2.b.S1(r3, r2) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (kh2.d.C0(r1, y22.c.MERGE_SECTIONS) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList z3() {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.pinterest.api.model.v7 r1 = r13.f122857y
            if (r1 == 0) goto L24
            boolean r1 = kh2.w.i0(r1)
            if (r1 == 0) goto L24
            ha2.a0 r1 = new ha2.a0
            int r3 = k70.e.edit_board_section
            r10 = 0
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 1020(0x3fc, float:1.43E-42)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.add(r1)
        L24:
            com.pinterest.api.model.v7 r1 = r13.f122857y
            com.pinterest.api.model.ba r2 = r13.f122858z
            if (r1 == 0) goto L89
            if (r2 == 0) goto L89
            java.lang.Integer r3 = r1.q1()
            int r3 = r3.intValue()
            r4 = 1
            if (r3 <= r4) goto L89
            boolean[] r3 = r2.f36034k
            int r4 = r3.length
            r5 = 9
            if (r4 <= r5) goto L5f
            boolean r3 = r3[r5]
            if (r3 == 0) goto L5f
            b60.b r3 = r13.f122845m
            com.pinterest.api.model.wy0 r3 = com.bumptech.glide.d.Q(r3)
            com.pinterest.api.model.wy0 r2 = r2.B()
            if (r2 == 0) goto L53
            java.lang.String r2 = r2.getUid()
            goto L54
        L53:
            r2 = 0
        L54:
            if (r2 != 0) goto L58
            java.lang.String r2 = ""
        L58:
            boolean r2 = dl2.b.S1(r3, r2)
            if (r2 == 0) goto L5f
            goto L71
        L5f:
            boolean r2 = kh2.w.h0(r1)
            if (r2 != 0) goto L71
            y22.c r2 = y22.c.MERGE_SECTIONS
            y22.c[] r2 = new y22.c[]{r2}
            boolean r1 = kh2.d.C0(r1, r2)
            if (r1 == 0) goto L89
        L71:
            ha2.a0 r1 = new ha2.a0
            int r3 = d70.g.merge_into
            int r4 = r0.size()
            r10 = 0
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 1020(0x3fc, float:1.43E-42)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.add(r1)
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: un0.h.z3():java.util.ArrayList");
    }
}
