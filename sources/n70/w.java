package n70;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import df.j1;
import h32.a4;
import h32.d4;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.k2;
import o82.b3;
import oi.o6;
import x02.a2;
import z32.f2;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Ln70/w;", "Lo82/v2;", "Lmj0/g;", "Lde1/d0;", "<init>", "()V", "Luk1/d;", "presenterPinalytics", "boardShopTool_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class w extends u0 implements mj0.g, de1.d0 {

    /* renamed from: k1, reason: collision with root package name */
    public static final /* synthetic */ int f89690k1 = 0;
    public final m1 L0;
    public Map M0;
    public f30 N0;
    public final xk2.v O0;
    public final xk2.v P0;
    public final xk2.v Q0;
    public final xk2.v R0;
    public final xk2.v S0;
    public final xk2.v T0;
    public final xk2.v U0;
    public final xk2.v V0;
    public final xk2.v W0;
    public final xk2.v X0;
    public final xk2.v Y0;
    public uk1.e Z0;

    /* renamed from: a1, reason: collision with root package name */
    public jq.c f89691a1;

    /* renamed from: b1, reason: collision with root package name */
    public nr0.t f89692b1;

    /* renamed from: c1, reason: collision with root package name */
    public yk1.v f89693c1;

    /* renamed from: d1, reason: collision with root package name */
    public vy.m f89694d1;

    /* renamed from: e1, reason: collision with root package name */
    public lb0.q f89695e1;

    /* renamed from: f1, reason: collision with root package name */
    public k2 f89696f1;

    /* renamed from: g1, reason: collision with root package name */
    public nx.f0 f89697g1;

    /* renamed from: h1, reason: collision with root package name */
    public ov1.k f89698h1;

    /* renamed from: i1, reason: collision with root package name */
    public final xk2.v f89699i1;

    /* renamed from: j1, reason: collision with root package name */
    public final d4 f89700j1;

    public w() {
        int i13 = 13;
        xk2.k q13 = jq.b.q(13, new q1(this, i13), xk2.n.NONE);
        int i14 = 12;
        this.L0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(t0.class), new mq.e0(q13, i14), new mq.f0(null, q13, i14), new mq.g0(this, q13, i14));
        this.M0 = new LinkedHashMap();
        this.O0 = xk2.m.b(new n(this, 0));
        this.P0 = xk2.m.b(new n(this, 5));
        this.Q0 = xk2.m.b(new n(this, 2));
        this.R0 = xk2.m.b(new n(this, 3));
        this.S0 = xk2.m.b(new n(this, 1));
        this.T0 = xk2.m.b(new n(this, 10));
        this.U0 = xk2.m.b(new n(this, 4));
        this.V0 = xk2.m.b(new n(this, 8));
        this.W0 = xk2.m.b(new n(this, i13));
        this.X0 = xk2.m.b(new n(this, i14));
        this.Y0 = xk2.m.b(new n(this, 9));
        this.f89699i1 = xk2.m.b(new n(this, 11));
        this.f89700j1 = d4.FEED;
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        ((l82.c) k9().c()).a(new d());
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (j1.U0((String) this.P0.getValue())) {
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
            gestaltToolbarImpl.b0(getResources().getString(com.pinterest.boardShopTool.d.board_shop_the_look_title));
            gestaltToolbarImpl.m();
        } else {
            xk2.v vVar = this.W0;
            if (j1.U0((String) vVar.getValue())) {
                ((GestaltToolbarImpl) toolbar).b0(URLDecoder.decode((String) vVar.getValue(), "UTF-8"));
            }
            GestaltToolbarImpl gestaltToolbarImpl2 = (GestaltToolbarImpl) toolbar;
            gestaltToolbarImpl2.m();
            xk2.v vVar2 = this.X0;
            if (j1.U0((String) vVar2.getValue())) {
                gestaltToolbarImpl2.W(URLDecoder.decode((String) vVar2.getValue(), "UTF-8"));
            }
        }
        ((GestaltToolbarImpl) toolbar).U(new tq.j(this, 17));
    }

    @Override // nl1.d
    public final ll1.a T6() {
        String n73 = n7();
        String valueOf = String.valueOf(q7());
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", (String) this.O0.getValue());
        hashMap.put("board_session_id", (String) this.S0.getValue());
        hashMap.put("module_id", (String) this.T0.getValue());
        return new ll1.a(n73, valueOf, null, hashMap, 4);
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(k9().a(), 9);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new mq.z(k9().c(), 15);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        int i13 = 1;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        xk2.v b13 = xk2.m.b(new n(this, 7));
        int[] iArr = {32, 33, 28, 30, 100, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, 36};
        wa2.i a13 = wa2.i.a(bs1.c.r(), true, true, false, false, false, false, false, new wa2.g0(true, false, false, false, false, false, null, null, null, false, false, false, false, 1, true, true, false, false, false, false, false, false, 33341414), null, null, null, -786689, -4194305, 1023);
        nx.d0 s73 = s7();
        y32.f fVar = y32.f.CLOSEUP_LONGPRESS;
        com.google.firebase.messaging.k kVar = qa2.f.f103257d;
        if (this.f89691a1 == null) {
            Intrinsics.r("pinTrafficSourceMapper");
            throw null;
        }
        String name = w.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        qa2.n a14 = new qa2.f(s73, fVar, kVar, jq.c.a(name)).a(new yk1.a(getResources(), requireContext().getTheme()));
        int i14 = 0;
        for (int i15 = 0; i15 < 7; i15++) {
            adapter.E(iArr[i15], new n(this, 6), (se1.d) this.f89699i1.getValue(), q.f89661r);
        }
        adapter.E(10001, new v(this, a13, b13, i14), new tj0.w(a13, (mj0.g) this, false, (f2) null, 28), q.f89662s);
        nx.d0 d0Var = ((uk1.d) b13.getValue()).f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        adapter.E(10002, dl2.b.m2(d0Var, a14, new v(this, a13, b13, i13)), new tj0.w(a13, (mj0.g) this, false, (f2) null, 28), q.f89663t);
    }

    @Override // de1.d0
    public final void Z(ArrayList appliedProductFilters) {
        Intrinsics.checkNotNullParameter(appliedProductFilters, "appliedProductFilters");
        ((l82.c) k9().c()).a(new c(appliedProductFilters));
        Intrinsics.checkNotNullParameter(appliedProductFilters, "appliedProductFilters");
        RecyclerView g83 = g8();
        Object obj = g83 != null ? g83.f19242n : null;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = obj instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) obj : null;
        if (pinterestStaggeredGridLayoutManager == null) {
            return;
        }
        pinterestStaggeredGridLayoutManager.Z0();
        RecyclerView g84 = g8();
        if (g84 != null) {
            q5.x.a(g84, new o6(g84, pinterestStaggeredGridLayoutManager, 9));
        }
    }

    @Override // mj0.g
    public final boolean a6(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return this.M0.containsKey(pin.getUid());
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(this.f89700j1, getF119520d0(), null, null, null, null);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF119520d0() {
        return j1.U0((String) this.P0.getValue()) ? a4.FEED_BOARD_SHOP_SHOP_THE_LOOK : j1.U0((String) this.Q0.getValue()) ? a4.FEED_BOARD_SHOP_PRODUCT_CATEGORY : a4.FEED_BOARD_SHOP;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF130901r1() {
        return this.f89700j1;
    }

    public final t0 k9() {
        return (t0) this.L0.getValue();
    }

    @Override // mj0.g
    public final void l2(f30 pin, qa2.h0 h0Var) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        String uid = pin.getUid();
        f30 f30Var = this.N0;
        if (Intrinsics.d(uid, f30Var != null ? f30Var.getUid() : null)) {
            return;
        }
        ((l82.c) k9().c()).a(new f(pin));
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(k9().c(), 16);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(com.pinterest.boardShopTool.c.fragment_board_shop_tool, com.pinterest.boardShopTool.b.p_recycler_view);
        eVar.c(com.pinterest.boardShopTool.b.swipe_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k9().h(generateLoggingContext(), (String) this.O0.getValue(), (String) this.S0.getValue(), (String) this.P0.getValue(), (String) this.R0.getValue(), (String) this.U0.getValue(), (String) this.T0.getValue(), (String) this.V0.getValue(), (String) this.Q0.getValue(), (String) this.Y0.getValue());
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Context requireContext = requireContext();
        int i13 = 0;
        ov1.f fVar = new ov1.f(0, null, 7);
        nx.f0 f0Var = this.f89697g1;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        o oVar = new o(this, f0Var, i13);
        uj2.q p73 = p7();
        m60.w f73 = f7();
        int hashCode = hashCode();
        k2 k2Var = this.f89696f1;
        if (k2Var == null) {
            Intrinsics.r("oneBarLibraryExperiments");
            throw null;
        }
        vy.m mVar = this.f89694d1;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        b60.b activeUserManager = getActiveUserManager();
        lb0.q qVar = this.f89695e1;
        if (qVar == null) {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
        de1.r0 r0Var = de1.r0.BOARD_SHOP_TOOL;
        ov1.e eVar = ov1.e.NOT_SELECTABLE;
        Intrinsics.f(requireContext);
        this.f89698h1 = new ov1.k(requireContext, v13, fVar, oVar, p73, f73, true, hashCode, mVar, activeUserManager, qVar, k2Var, eVar, r0Var, 237568);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new u(this, null), 3);
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(4, q.f89653j);
        dVar.getClass();
        int i14 = 2;
        int i15 = 0;
        jk2.x xVar = new jk2.x(new jk2.u0(new jk2.x(pk2.f.j(new jk2.j1(dVar, aVar, 0), new qt.b(4, q.f89654k), 2, "filter(...)"), new com.pinterest.framework.multisection.datasource.pagedlist.h(21, q.f89655l), i14), ck2.i.f27921a, i15), new com.pinterest.framework.multisection.datasource.pagedlist.h(22, q.f89656m), i14);
        u60.g gVar = new u60.g(20, new r(this, i15));
        u60.g gVar2 = new u60.g(21, q.f89657n);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        xj2.c F = xVar.F(gVar, gVar2, cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        R6(F);
        xj2.c F2 = pk2.f.j(new jk2.j1(dVar, new qt.a(4, q.f89658o), 0), new qt.b(4, q.f89659p), 2, "filter(...)").F(new u60.g(18, new r(this, 1)), new u60.g(19, q.f89660q), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        R6(F2);
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(com.pinterest.boardShopTool.b.toolbar);
    }
}
