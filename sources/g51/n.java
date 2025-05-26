package g51;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import d51.p;
import d51.s;
import ey.t3;
import h32.f1;
import h32.g0;
import h32.u0;
import h6.r;
import i32.a0;
import i32.y0;
import j51.u;
import ja.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jk2.x;
import kh2.b0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.u2;
import m60.w;
import nx.d0;
import oi.o6;
import rg0.l0;
import so.h2;
import so.n6;
import so.r8;
import uj2.q;
import x02.a2;
import x02.i2;
import x02.x0;
import x02.x2;
import xk2.v;
import yq0.t;
import zy.q0;

/* loaded from: classes5.dex */
public final class n extends wk1.n implements c51.e, ka2.b {
    public final com.pinterest.framework.multisection.datasource.pagedlist.f A;
    public final com.pinterest.framework.multisection.datasource.pagedlist.f B;
    public final p C;
    public final n31.c D;
    public final d51.d E;
    public final d51.m F;
    public final s G;
    public final h60.d H;
    public final j I;

    /* renamed from: J, reason: collision with root package name */
    public final k f63620J;
    public wy0 K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ek2.j O;
    public Pair P;
    public i51.d Q;
    public boolean R;
    public final LinkedHashMap S;

    /* renamed from: a, reason: collision with root package name */
    public final String f63621a;

    /* renamed from: b, reason: collision with root package name */
    public final f f63622b;

    /* renamed from: c, reason: collision with root package name */
    public final wk1.c f63623c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63624d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63625e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63626f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63627g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f63628h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f63629i;

    /* renamed from: j, reason: collision with root package name */
    public final int f63630j;

    /* renamed from: k, reason: collision with root package name */
    public final x2 f63631k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f63632l;

    /* renamed from: m, reason: collision with root package name */
    public final x0 f63633m;

    /* renamed from: n, reason: collision with root package name */
    public final w f63634n;

    /* renamed from: o, reason: collision with root package name */
    public final qb0.e f63635o;

    /* renamed from: p, reason: collision with root package name */
    public final nr0.m f63636p;

    /* renamed from: q, reason: collision with root package name */
    public final rg0.s f63637q;

    /* renamed from: r, reason: collision with root package name */
    public final g70.h f63638r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ka2.c f63639s;

    /* renamed from: t, reason: collision with root package name */
    public final bq.c f63640t;

    /* renamed from: u, reason: collision with root package name */
    public final b60.b f63641u;

    /* renamed from: v, reason: collision with root package name */
    public final u2 f63642v;

    /* renamed from: w, reason: collision with root package name */
    public final v f63643w;

    /* renamed from: x, reason: collision with root package name */
    public final d51.l f63644x;

    /* renamed from: y, reason: collision with root package name */
    public final v f63645y;

    /* renamed from: z, reason: collision with root package name */
    public final com.pinterest.framework.multisection.datasource.pagedlist.f f63646z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String userId, f environment, wk1.c gridParameters, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str, int i13, x2 userRepository, i2 pinRepository, x0 boardRepository, w eventManager, qb0.e networkUtils, nr0.m viewBinderDelegateFactory, rg0.s experiences, g70.h boardNavigator, k22.m userService, q networkStateStream, h2 boardInviteProfileCellPresenterFactory, r8 boardInvitesFeedRequestProvider, so.i2 pinClusterCarouselFetchedListFactory) {
        super(gridParameters);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(gridParameters, "gridParameters");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(viewBinderDelegateFactory, "viewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(boardInviteProfileCellPresenterFactory, "boardInviteProfileCellPresenterFactory");
        Intrinsics.checkNotNullParameter(boardInvitesFeedRequestProvider, "boardInvitesFeedRequestProvider");
        Intrinsics.checkNotNullParameter(pinClusterCarouselFetchedListFactory, "pinClusterCarouselFetchedListFactory");
        this.f63621a = userId;
        this.f63622b = environment;
        this.f63623c = gridParameters;
        this.f63624d = z13;
        this.f63625e = z14;
        this.f63626f = z15;
        this.f63627g = z16;
        this.f63628h = z17;
        this.f63629i = z18;
        this.f63630j = i13;
        this.f63631k = userRepository;
        this.f63632l = pinRepository;
        this.f63633m = boardRepository;
        this.f63634n = eventManager;
        this.f63635o = networkUtils;
        this.f63636p = viewBinderDelegateFactory;
        this.f63637q = experiences;
        this.f63638r = boardNavigator;
        d0 d0Var = gridParameters.f130130a.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f63639s = new ka2.c(d0Var, (gx0.b) (0 == true ? 1 : 0), 6);
        this.f63640t = environment.f63601a;
        b60.b bVar = environment.f63603c;
        this.f63641u = bVar;
        u2 u2Var = environment.f63608h;
        this.f63642v = u2Var;
        this.f63643w = xk2.m.b(i.f63613i);
        this.f63644x = new d51.l(userId, this, environment, T3(), z16, z17, null, u2Var, null, false, z15, Integer.valueOf(i13), !com.bumptech.glide.d.o0(((b60.d) bVar).f() != null ? r0.G3() : null), 832);
        this.f63645y = xk2.m.b(new l(this, 0));
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar = new com.pinterest.framework.multisection.datasource.pagedlist.f(new d51.l(userId, this, environment, T3(), false, z17, null, u2Var, "protected-", true, z15, Integer.valueOf(i13), false, 4160), 14);
        fVar.k(RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER);
        this.f63646z = fVar;
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar2 = new com.pinterest.framework.multisection.datasource.pagedlist.f(new d51.i(userId, this, environment, T3(), z16, z17, u2Var, i13), 14);
        fVar2.k(50);
        this.A = fVar2;
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar3 = new com.pinterest.framework.multisection.datasource.pagedlist.f(new d51.h(userId, this, environment, T3()), 14);
        fVar3.k(RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER);
        this.B = fVar3;
        this.C = new p(userId, userService, new l(this, 7), new l(this, 8), new l(this, 9), new m(this, 15), gridParameters.f130137h, new l(this, 10));
        n31.a aVar = new n31.a(new l(this, 4));
        yk1.v vVar = gridParameters.f130137h;
        this.D = new n31.c(userService, vVar, aVar);
        Object obj = boardInvitesFeedRequestProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        this.E = new d51.d(this, (h51.a) obj, getPresenterPinalytics(), networkStateStream, boardInviteProfileCellPresenterFactory, userRepository, boardRepository, !z14);
        d51.m mVar = new d51.m();
        mVar.o(53, new sz0.a(12));
        this.F = mVar;
        this.G = new s(this, z14, vVar);
        this.H = new h60.d(userService, getPinalytics(), str, Integer.valueOf(eo1.c.space_200), new l(this, 5), new l(this, 6), (q0) pinClusterCarouselFetchedListFactory.f113457a.f114090a.Nb.get());
        this.I = new j(this);
        this.f63620J = new k(this);
        this.P = new Pair(Boolean.FALSE, "");
        this.S = new LinkedHashMap();
    }

    public static final void H3(n nVar, y0 placement, xj2.b bVar) {
        xj2.c aVar;
        xj2.c cVar;
        String str;
        Object obj;
        j51.d0 d0Var = (j51.d0) ((c51.f) nVar.getView());
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(placement, "placement");
        rg0.s sVar = d0Var.Y0;
        Object obj2 = null;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        rg0.n b13 = ((dh0.d) sVar).b(placement);
        Integer valueOf = b13 != null ? Integer.valueOf(b13.f108060b) : null;
        i32.l lVar = i32.l.ANDROID_BOARD_PREVIEW_SHARE_BOARD_TOOLTIP;
        int value = lVar.getValue();
        if (valueOf != null && valueOf.intValue() == value) {
            rg0.s sVar2 = d0Var.Y0;
            if (sVar2 == null) {
                Intrinsics.r("experiences");
                throw null;
            }
            rg0.n b14 = ((dh0.d) sVar2).b(placement);
            r rVar = ck2.i.f27922b;
            if (b14 != null) {
                if (b14.f108060b == lVar.getValue()) {
                    ag2.e eVar = b14.f108068j;
                    l0 l0Var = eVar instanceof l0 ? (l0) eVar : null;
                    if (l0Var == null) {
                        Intrinsics.checkNotNullExpressionValue(new xj2.e(rVar), "empty(...)");
                    } else {
                        xj2.b bVar2 = new xj2.b();
                        RecyclerView g83 = d0Var.g8();
                        if (g83 == null) {
                            Intrinsics.checkNotNullExpressionValue(new xj2.e(rVar), "empty(...)");
                        } else {
                            j51.w wVar = new j51.w(l0Var, d0Var, g83, placement, bVar2);
                            Iterator it = d7.b.O(g83).iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                str = l0Var.f108051c;
                                if (!hasNext) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                KeyEvent.Callback callback = (View) obj;
                                if ((callback instanceof dc0.i) && Intrinsics.d(((LegoBoardRep) ((dc0.i) callback)).f44739w, str)) {
                                    break;
                                }
                            }
                            KeyEvent.Callback callback2 = (View) obj;
                            if (callback2 == null) {
                                d0Var.addRecyclerViewEventListener(wVar);
                                bVar2.a(new xj2.a(new fp.a(21, d0Var, wVar)));
                            } else if (!j51.d0.p9(d0Var, g83, placement, bVar2, (dc0.i) callback2)) {
                                js1.a aVar2 = d0Var.f74736p1;
                                Integer num = aVar2.f77573c;
                                if (num != null && num.intValue() == 0) {
                                    Iterator it2 = d7.b.O(g83).iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next = it2.next();
                                        KeyEvent.Callback callback3 = (View) next;
                                        if ((callback3 instanceof dc0.i) && Intrinsics.d(((LegoBoardRep) ((dc0.i) callback3)).f44739w, str)) {
                                            obj2 = next;
                                            break;
                                        }
                                    }
                                    KeyEvent.Callback callback4 = (View) obj2;
                                    if (callback4 == null || !j51.d0.p9(d0Var, g83, placement, bVar2, (dc0.i) callback4)) {
                                        d0Var.addRecyclerViewEventListener(wVar);
                                        bVar2.a(new xj2.a(new i0(d0Var, wVar)));
                                    } else {
                                        g83.post(new o6(d0Var, wVar, 13));
                                    }
                                } else {
                                    aVar2.a(new u(aVar2, g83, d0Var, wVar, bVar2, l0Var, placement));
                                }
                            }
                        }
                    }
                    cVar = new xj2.e(rVar);
                }
            }
            Intrinsics.checkNotNullExpressionValue(new xj2.e(rVar), "empty(...)");
            cVar = new xj2.e(rVar);
        } else {
            ur0.e g13 = ur0.g.g(placement, d0Var, null);
            if (b13 != null) {
                if (b13.f108061c == a0.TOOLTIP.value()) {
                    RecyclerView g84 = d0Var.g8();
                    if (g84 != null) {
                        g84.o(d0Var.f74738r1);
                    }
                    aVar = new xj2.e(new a11.p(4, d0Var, g13));
                    Intrinsics.checkNotNullExpressionValue(aVar, "fromRunnable(...)");
                    cVar = aVar;
                }
            }
            aVar = new xj2.a(new j51.q(d0Var, g13, 0));
            Intrinsics.checkNotNullExpressionValue(aVar, "fromAction(...)");
            cVar = aVar;
        }
        bVar.a(cVar);
        bVar.a(new xj2.a(new fp.a(20, nVar, placement)));
    }

    public static final void u3(n nVar) {
        PinterestEmptyStateLayout pinterestEmptyStateLayout;
        if (!nVar.G3()) {
            if (!nVar.isBound() || (pinterestEmptyStateLayout = ((t) ((c51.f) nVar.getView())).f139733g0) == null) {
                return;
            }
            pinterestEmptyStateLayout.g();
            return;
        }
        nVar.G.n();
        if (nVar.f63625e) {
            boolean S3 = nVar.S3();
            p pVar = nVar.C;
            if (S3 && !pVar.f135189f) {
                pVar.y();
                return;
            }
            if (S3) {
                return;
            }
            pVar.t();
            wy0 wy0Var = nVar.K;
            if (com.bumptech.glide.d.o0(wy0Var != null ? wy0Var.i3() : null) && pVar.a() == 0) {
                pVar.i2();
            }
        }
    }

    public static final boolean v3(n nVar, String str) {
        return nVar.G3() ? nVar.x3().contains(str) || nVar.z3().contains(str) : nVar.x3().contains(str);
    }

    @Override // ka2.b
    public final void A2(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f63639s.A2(i13, board);
    }

    @Override // ka2.b
    public final void B(String boardId, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.RENDER;
        g0 g0Var = g0.SENSITIVITY_SCREEN_PROFILE_BOARD;
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", boardId);
        bs1.c.G1("reason", str, hashMap);
        Unit unit = Unit.f80348a;
        d0.B(pinalytics, f1Var, g0Var, null, hashMap, 20);
    }

    public final xk1.e B3() {
        return (xk1.e) this.f63643w.getValue();
    }

    @Override // ka2.b
    public final void D2(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f63639s.D2(i13, board);
    }

    public final d51.l D3() {
        return (d51.l) this.f63645y.getValue();
    }

    public final boolean F3() {
        wy0 wy0Var = this.K;
        return com.bumptech.glide.d.o0(wy0Var != null ? wy0Var.i3() : null);
    }

    public final boolean G3() {
        return this.f63641u.b(this.f63621a);
    }

    public final void I3() {
        xj2.c E = this.f63631k.g0().P(this.f63621a).E(new g(3, new m(this, 1)), new g(4, d.f63586l));
        Intrinsics.f(E);
        addDisposable(E);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: J3, reason: merged with bridge method [inline-methods] */
    public final void r3(c51.f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((j51.d0) view).f74721a1 = this;
        x0 x0Var = this.f63633m;
        int i13 = 11;
        int i14 = 2;
        x xVar = new x(x0Var.y(), new d51.a(i13, new m(this, 7)), i14);
        g gVar = new g(11, new m(this, i13));
        int i15 = 12;
        g gVar2 = new g(12, d.f63593s);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        addDisposable(xVar.F(gVar, gVar2, cVar, a2Var));
        int i16 = 13;
        int i17 = 14;
        addDisposable(new x(x0Var.D(), new d51.a(15, new m(this, i15)), i14).F(new g(13, new m(this, i16)), new g(14, d.f63594t), cVar, a2Var));
        addDisposable(x0Var.z().F(new g(15, new m(this, i17)), new g(16, d.f63588n), cVar, a2Var));
        i2 i2Var = this.f63632l;
        addDisposable(i2Var.z().F(new g(17, new m(this, 3)), new g(18, d.f63589o), cVar, a2Var));
        addDisposable(new x(i2Var.y(), new d51.a(i15, new m(this, 4)), i14).F(new g(5, new m(this, 5)), new g(6, d.f63590p), cVar, a2Var));
        uk2.f fVar = m22.a.f85712a;
        d51.a aVar = new d51.a(i16, new m(this, 6));
        fVar.getClass();
        addDisposable(new x(fVar, aVar, i14).F(new g(7, new m(this, 8)), new g(8, d.f63591q), cVar, a2Var));
        uk2.f fVar2 = m22.d.f85715a;
        d51.a aVar2 = new d51.a(i17, new m(this, 9));
        fVar2.getClass();
        addDisposable(new x(fVar2, aVar2, i14).F(new g(9, new m(this, 10)), new g(10, d.f63592r), cVar, a2Var));
        I3();
        w wVar = this.f63634n;
        wVar.h(this.I);
        wVar.h(this.f63620J);
        if (G3()) {
            return;
        }
        ((g1) this.f63642v.f83487a).c("android_boards_gg_unification");
    }

    @Override // ka2.b
    public final void K2(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f63639s.K2(i13, board);
    }

    public final void K3() {
        getPinalytics().X(u0.BOARDS_TAB_EMPTY_STATE_ORGANIZE_BUTTON);
        if (isBound()) {
            wy0 wy0Var = this.K;
            if ((wy0Var != null ? wy0Var.b4() : 0).intValue() > 0) {
                wy0 wy0Var2 = this.K;
                if ((wy0Var2 != null ? wy0Var2.i4() : 0).intValue() > 0) {
                    N3();
                    return;
                }
            }
            uk1.c cVar = (c51.f) getView();
            NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.f50969c.getValue());
            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
            ((nl1.d) cVar).M1(w13);
        }
    }

    public final void L3(i51.d dVar) {
        if (Intrinsics.d(this.Q, dVar)) {
            return;
        }
        this.Q = dVar;
        d51.l lVar = this.f63644x;
        s sVar = this.G;
        if (dVar == null) {
            sVar.y();
            D3().y();
            lVar.t();
        } else {
            boolean d2 = Intrinsics.d(dVar, i51.b.f71574a);
            wk1.c cVar = this.f63623c;
            v31.b displayState = d2 ? b0.y0(cVar.f130137h, new l(this, 1), new l(this, 2)) : b0.Z(cVar.f130137h, new l(this, 3));
            sVar.getClass();
            Intrinsics.checkNotNullParameter(displayState, "displayState");
            if (sVar.f53721i) {
                sVar.f53723k = new v31.f(displayState);
            }
            lVar.y();
            d51.l D3 = D3();
            List value = e0.b(dVar);
            D3.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            D3.T = value;
            D3.g0();
            D3().t();
        }
        onRecyclerRefresh();
    }

    public final void M3() {
        if (isBound()) {
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.BOARD_ADD_COLLABORATOR_BUTTON, (r18 & 4) != 0 ? null : g0.BOARDS_TAB, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            uk1.c cVar = (c51.f) getView();
            NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.f50971e.getValue());
            w13.Y1("com.pinterest.EXTRA_IS_ADD_COLLABORATORS_FLOW", true);
            w13.Y1("com.pinterest.EXTRA_FULL_SCREEN", true);
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            ((nl1.d) cVar).M1(w13);
        }
    }

    public final void N3() {
        if (isBound()) {
            uk1.c cVar = (c51.f) getView();
            NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.f50978l.getValue());
            w13.m0("com.pinterest.EXTRA_USER_ID", this.f63621a);
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            ((nl1.d) cVar).M1(w13);
        }
    }

    public final void Q3(bq.b option) {
        Intrinsics.checkNotNullParameter(option, "option");
        addDisposable(this.f63640t.d(option).i(new h(this, 0), new g(2, d.f63596v)));
    }

    public final void R3() {
        w3().i2();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean S3() {
        /*
            r9 = this;
            boolean r0 = r9.G3()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.List r0 = r9.getDataSources()
            d51.l r2 = r9.w3()
            boolean r0 = r0.contains(r2)
            r2 = 1
            if (r0 == 0) goto L26
            d51.l r0 = r9.w3()
            java.util.List r0 = r0.f49127q
            int r0 = r0.size()
            if (r0 <= 0) goto L24
            goto L26
        L24:
            r0 = r2
            goto L27
        L26:
            r0 = r1
        L27:
            java.util.List r3 = r9.getDataSources()
            com.pinterest.framework.multisection.datasource.pagedlist.f r4 = r9.A
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L3c
            int r3 = r4.a()
            if (r3 <= 0) goto L3a
            goto L3c
        L3a:
            r3 = r2
            goto L3d
        L3c:
            r3 = r1
        L3d:
            java.util.List r4 = r9.getDataSources()
            com.pinterest.framework.multisection.datasource.pagedlist.f r5 = r9.B
            d51.p r6 = r9.C
            boolean r7 = r9.f63625e
            if (r7 == 0) goto L4b
            r8 = r6
            goto L4c
        L4b:
            r8 = r5
        L4c:
            boolean r4 = r4.contains(r8)
            if (r4 == 0) goto L5e
            if (r7 == 0) goto L55
            r5 = r6
        L55:
            int r4 = r5.a()
            if (r4 <= 0) goto L5c
            goto L5e
        L5c:
            r4 = r2
            goto L5f
        L5e:
            r4 = r1
        L5f:
            com.pinterest.api.model.wy0 r5 = r9.K
            if (r5 == 0) goto L68
            java.lang.Boolean r5 = r5.g3()
            goto L69
        L68:
            r5 = 0
        L69:
            boolean r5 = com.bumptech.glide.d.o0(r5)
            if (r5 == 0) goto L89
            java.util.List r5 = r9.getDataSources()
            h60.d r6 = r9.H
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L87
            boolean r5 = r6.i()
            if (r5 != 0) goto L87
            int r5 = r6.a()
            if (r5 <= 0) goto L89
        L87:
            r5 = r1
            goto L8a
        L89:
            r5 = r2
        L8a:
            if (r7 == 0) goto L94
            if (r0 == 0) goto L9b
            if (r3 == 0) goto L9b
            if (r5 == 0) goto L9b
        L92:
            r1 = r2
            goto L9b
        L94:
            if (r0 == 0) goto L9b
            if (r3 == 0) goto L9b
            if (r4 == 0) goto L9b
            goto L92
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g51.n.S3():boolean");
    }

    public final nr0.l T3() {
        uk1.d presenterPinalytics = getPresenterPinalytics();
        wk1.c cVar = this.f63623c;
        qa2.n nVar = cVar.f130131b;
        return ((n6) this.f63636p).a(presenterPinalytics, nVar.f103320a, nVar, cVar.f130137h);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        boolean G3 = G3();
        d51.l lVar = this.f63644x;
        wk1.e eVar = this.B;
        if (!G3 || this.f63626f) {
            wk1.i iVar = (wk1.i) dataSources;
            iVar.b(this.F);
            iVar.b(lVar);
            iVar.b(eVar);
            return;
        }
        wk1.i iVar2 = (wk1.i) dataSources;
        iVar2.b(this.E);
        h60.d dVar = this.H;
        boolean z13 = this.f63629i;
        if (z13) {
            iVar2.b(dVar);
            iVar2.b(B3());
            B3().y();
        }
        d51.l D3 = D3();
        D3.y();
        iVar2.b(D3);
        iVar2.b(lVar);
        iVar2.b(this.f63646z);
        iVar2.b(this.A);
        iVar2.b(this.D);
        if (!z13) {
            iVar2.b(dVar);
        }
        if (this.f63625e) {
            eVar = this.C;
        }
        iVar2.b(eVar);
        iVar2.b(this.G);
    }

    @Override // wk1.q
    public final void loadData() {
        if (this.f63624d) {
            new t3(G3(), 2).i();
        }
        this.M = false;
        super.loadData();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if ((r9.f63625e ? r9.C : r9.B).a() > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (isBound() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        ((yq0.t) ((c51.f) getView())).setLoadState(yk1.i.LOADING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        r0 = r9.O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        bk2.c.dispose(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        r9.O = (ek2.j) w3().f49129s.F(new a41.u(28, new g51.m(r9, 2)), new a41.u(29, g51.d.f63587m), ck2.i.f27923c, ck2.i.f27924d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        if (r9.L == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        onRecyclerRefresh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        r9.L = true;
        loadData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003a, code lost:
    
        if (w3().f49127q.size() > 0) goto L19;
     */
    @Override // wk1.q, yk1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivate() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g51.n.onActivate():void");
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        LinkedHashMap linkedHashMap = this.S;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((xj2.b) it.next()).dispose();
        }
        linkedHashMap.clear();
        super.onDeactivate();
    }

    @Override // wk1.q, sq0.a0
    public final void onRecyclerRefresh() {
        super.onRecyclerRefresh();
        I3();
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.L = false;
        ek2.j jVar = this.O;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        w wVar = this.f63634n;
        wVar.j(this.I);
        wVar.j(this.f63620J);
        super.onUnbind();
    }

    @Override // ka2.b
    public final void r0(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f63639s.r0(i13, board);
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    public final d51.l w3() {
        return this.Q == null ? this.f63644x : D3();
    }

    public final ArrayList x3() {
        List d2 = w3().d();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(d2, 10));
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            arrayList.add(((dl1.s) it.next()).getUid());
        }
        return arrayList;
    }

    public final ArrayList z3() {
        List d2 = this.A.f49190a.d();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(d2, 10));
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            arrayList.add(((dl1.s) it.next()).getUid());
        }
        return arrayList;
    }
}
