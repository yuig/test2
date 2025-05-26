package j51;

import a.cb;
import a41.r0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v0;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.feature.profile.filters.FilterBarView;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.feature.profile.pills.view.PillView;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.g0;
import i32.y0;
import java.util.HashMap;
import kh2.a1;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.u2;
import m60.x0;
import nx.o0;
import so.g2;
import so.j2;
import so.oa;
import x02.i2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u00052\u00020\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj51/d0;", "Lwk1/k;", "Ldl1/s;", "Lc51/f;", "Lnr0/j;", "La41/r0;", "Lxa/i;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d0 extends m<dl1.s> implements c51.f, r0, xa.i {

    /* renamed from: s1, reason: collision with root package name */
    public static final /* synthetic */ int f74720s1 = 0;
    public g2 R0;
    public uk1.e S0;
    public g51.f T0;
    public i2 U0;
    public zf0.f V0;
    public yk1.v W0;
    public m60.f0 X0;
    public rg0.s Y0;
    public u2 Z0;

    /* renamed from: a1, reason: collision with root package name */
    public c51.e f74721a1;

    /* renamed from: b1, reason: collision with root package name */
    public j2 f74722b1;

    /* renamed from: c1, reason: collision with root package name */
    public bq.c f74723c1;

    /* renamed from: d1, reason: collision with root package name */
    public pb0.a f74724d1;

    /* renamed from: e1, reason: collision with root package name */
    public o0 f74725e1;

    /* renamed from: f1, reason: collision with root package name */
    public qc2.a f74726f1;

    /* renamed from: g1, reason: collision with root package name */
    public ViewGroup f74727g1;

    /* renamed from: h1, reason: collision with root package name */
    public FilterBarView f74728h1;

    /* renamed from: i1, reason: collision with root package name */
    public PillView f74729i1;

    /* renamed from: j1, reason: collision with root package name */
    public i51.d f74730j1;

    /* renamed from: k1, reason: collision with root package name */
    public c51.b f74731k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f74732l1;

    /* renamed from: m1, reason: collision with root package name */
    public final m1 f74733m1;

    /* renamed from: n1, reason: collision with root package name */
    public final t f74734n1;

    /* renamed from: o1, reason: collision with root package name */
    public final r f74735o1;

    /* renamed from: p1, reason: collision with root package name */
    public final js1.a f74736p1;

    /* renamed from: q1, reason: collision with root package name */
    public final d4 f74737q1;

    /* renamed from: r1, reason: collision with root package name */
    public final androidx.recyclerview.widget.c0 f74738r1;

    public d0() {
        int i13 = 21;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(23, new kl0.w(this, i13)));
        int i14 = 22;
        this.f74733m1 = a1.s(this, k0.f80436a.b(i51.b0.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
        this.f74734n1 = new t(this);
        this.f74735o1 = new r(this);
        this.f74736p1 = new js1.a();
        this.f74737q1 = d4.USER;
        this.f74738r1 = new androidx.recyclerview.widget.c0(this, 20);
    }

    public static final boolean p9(d0 d0Var, RecyclerView recyclerView, y0 y0Var, xj2.b bVar, dc0.i iVar) {
        float d2;
        qc2.a aVar = d0Var.f74726f1;
        if (aVar == null) {
            Intrinsics.r("viewabilityCalculator");
            throw null;
        }
        LegoBoardRep legoBoardRep = (LegoBoardRep) iVar;
        d2 = ((qc2.d) aVar).d(legoBoardRep.getF44721e(), recyclerView, null);
        if (d2 < 99.0f) {
            return false;
        }
        ur0.e g13 = ur0.g.g(y0Var, d0Var, legoBoardRep.getF44721e());
        int i13 = 1;
        if (g13 != null) {
            bVar.a(new xj2.a(new q(d0Var, g13, i13)));
        }
        return true;
    }

    @Override // xa.i
    public final void A5(int i13) {
        this.f74736p1.A5(i13);
    }

    @Override // com.pinterest.feature.profile.b
    public final void D6() {
        c51.e eVar = this.f74721a1;
        if (eVar != null) {
            ((g51.n) eVar).r3();
        }
    }

    @Override // nl1.d
    public final void I7() {
        a4 g03;
        String obj;
        ScreenLocation f49939a;
        nx.d0 s73 = s7();
        HashMap hashMap = new HashMap();
        Navigation navigation = this.I;
        if ((navigation == null || (f49939a = navigation.getF49939a()) == null || (obj = f49939a.getName()) == null) && ((g03 = getG0()) == null || (obj = g03.toString()) == null)) {
            obj = this.f74737q1.toString();
        }
        hashMap.put("nav_target", obj);
        String R0 = dl2.b.R0(com.bumptech.glide.d.Z(this, "EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", f60.b.PROFILE.getValue()));
        if (R0 != null) {
            hashMap.put("navigation_source", R0);
        }
        s73.z(hashMap);
    }

    @Override // com.pinterest.feature.profile.b
    public final View K3() {
        return this.f74728h1;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        super.L7();
        c51.b bVar = this.f74731k1;
        if (bVar != null) {
            bVar.k();
            A8(bVar);
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        c51.e eVar;
        c51.e eVar2;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_SENSITIVITY_SCREEN_RESULT_CODE") && result.containsKey("com.pinterest.EXTRA_BOARD_ID") && (eVar2 = this.f74721a1) != null) {
            ((g51.n) eVar2).R3();
        }
        if (!Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_REFRESH_BOARDS") || (eVar = this.f74721a1) == null) {
            return;
        }
        ((g51.n) eVar).q3();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(54, new s(this, 9));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER, new s(this, 11));
        adapter.G(48, new s(this, 13));
        adapter.G(49, new s(this, 15));
        adapter.G(16925, new s(this, 16));
        adapter.G(55, new s(this, 17));
        adapter.G(1234567, new s(this, 18));
        adapter.G(67, new s(this, 19));
        adapter.G(53, new s(this, 20));
        adapter.G(2778801, new s(this, 2));
        adapter.G(50, new s(this, 3));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER, new s(this, 4));
        adapter.G(3128342, new s(this, 5));
        adapter.G(7654320, new s(this, 6));
        adapter.G(7654321, new s(this, 7));
        adapter.G(2770202, new s(this, 8));
    }

    @Override // sq0.e
    public final tq0.b[] S8() {
        tq0.b[] bVarArr = new tq0.b[1];
        pb0.a aVar = this.f74724d1;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        nx.d0 s73 = s7();
        o0 o0Var = this.f74725e1;
        if (o0Var != null) {
            bVarArr[0] = new tq0.c(aVar, s73, o0Var, null, null, 24);
            return bVarArr;
        }
        Intrinsics.r("pinalyticsManager");
        throw null;
    }

    @Override // yq0.t, se0.k
    public final void V1() {
        super.V1();
        c51.b bVar = this.f74731k1;
        if (bVar != null) {
            bVar.k();
            A8(bVar);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        m60.f0 f0Var = this.X0;
        if (f0Var == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var.S(l9().length() > 0, "Missing or invalid user ID was passed as navigation parameter. Please provide a non-empty user ID!", new Object[0]);
        wa2.i iVar = W8().f103320a;
        if (this.V0 == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        boolean h10 = zf0.f.h();
        iVar.f128797t = h10;
        iVar.F = h10;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.S0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).d(l9()));
        i2 i2Var = this.U0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        g2 g2Var = this.R0;
        if (g2Var == null) {
            Intrinsics.r("profileSavedTabPresenterFactory");
            throw null;
        }
        String l93 = l9();
        g51.f fVar = this.T0;
        if (fVar == null) {
            Intrinsics.r("environment");
            throw null;
        }
        boolean G = com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_IS_PINNER_PROFILE", true);
        boolean k93 = k9();
        boolean G2 = com.bumptech.glide.d.G(this, "EXTRAS_KEY_USE_PUBLIC_DISPLAY", false);
        boolean z13 = !k9();
        boolean z14 = !k9();
        boolean G3 = com.bumptech.glide.d.G(this, "EXTRAS_KEY_AUTO_ORG_AT_TOP", false);
        String Z = com.bumptech.glide.d.Z(this, "EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", f60.b.PROFILE.getValue());
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        return g2Var.a(l93, fVar, a13, G, k93, G2, z13, z14, G3, Z, dl2.b.F0(requireContext2, eo1.a.profile_board_rep_vertical_spacing));
    }

    @Override // ha2.f
    public final void Y4(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
    }

    @Override // sq0.e
    public final int Y8() {
        if (k9()) {
            return 0;
        }
        return super.Y8();
    }

    @Override // sq0.e
    public final int Z8() {
        if (k9()) {
            return 0;
        }
        return super.Z8();
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final g0 getF68304o1() {
        return k9() ? g0.BOARDS_TAB : g0.SAVED_TAB;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getG0() {
        if (this.I == null) {
            ScreenDescription screenDescription = this.f76937a;
            if ((screenDescription != null ? screenDescription.getF49207c() : null) == null) {
                return null;
            }
        }
        return o9() ? a4.USER_SELF : a4.USER_OTHERS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f74737q1;
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
        this.f74736p1.i(i13, f13, i14);
    }

    @Override // xa.i
    public final void i5(int i13) {
        this.f74736p1.i5(i13);
    }

    public final ViewGroup j9(String str) {
        String string;
        if (k9()) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            EmptyStateBannerView emptyStateBannerView = new EmptyStateBannerView(6, requireContext, (AttributeSet) null);
            Context context = emptyStateBannerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int W = bs1.c.W(emptyStateBannerView, dl2.b.A1(context) ? eo1.c.space_1000 : eo1.c.space_600);
            emptyStateBannerView.setPaddingRelative(W, bs1.c.W(emptyStateBannerView, nz1.a.profile_tab_empty_state_top_spacing), W, emptyStateBannerView.getPaddingBottom());
            emptyStateBannerView.o(kh2.b0.Z(n9(), new s(this, 0)));
            return emptyStateBannerView;
        }
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(requireContext2);
        if (o9()) {
            String string2 = legoEmptyStateView.getResources().getString(nz1.f.empty_profile_find_ideas);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            legoEmptyStateView.b(new b41.c(1, string2, new s(this, 1)));
            legoEmptyStateView.i();
        } else {
            legoEmptyStateView.a();
        }
        legoEmptyStateView.setPaddingRelative(legoEmptyStateView.getPaddingStart(), legoEmptyStateView.getResources().getDimensionPixelOffset(m60.r0.lego_empty_state_view_top_spacing), legoEmptyStateView.getPaddingEnd(), legoEmptyStateView.getPaddingBottom());
        if (o9()) {
            string = ((yk1.a) n9()).f139224a.getString(x0.library_empty_feed_me);
        } else if (str == null || str.length() == 0) {
            string = legoEmptyStateView.getResources().getString(x0.library_empty_feed_generic);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = legoEmptyStateView.getResources().getString(x0.library_empty_feed, str);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        legoEmptyStateView.e(string);
        return legoEmptyStateView;
    }

    public final boolean k9() {
        return com.bumptech.glide.d.G(this, "EXTRAS_KEY_USE_RETRIEVAL_DISPLAY", false);
    }

    public final String l9() {
        return com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", "");
    }

    @Override // sq0.e, nr0.c
    public final void m() {
        com.pinterest.framework.screens.s sVar = ((ku1.j) o7()).f80914l;
        r70.a aVar = sVar != null ? sVar.f49234i : null;
        if (aVar != null) {
            aVar.k(com.pinterest.framework.screens.u.GO_TO_HOME_FEED_UPSELL);
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(nz1.d.fragment_user_library_boards, nz1.c.p_recycler_boards_view);
        eVar.f979c = nz1.c.empty_state_container;
        eVar.c(nz1.c.user_library_swipe_container);
        return eVar;
    }

    public final i51.b0 m9() {
        return (i51.b0) this.f74733m1.getValue();
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        u2 u2Var = this.Z0;
        if (u2Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (!u2Var.c() || o9()) {
            return super.n8();
        }
        g41.a aVar = new g41.a(this, 1);
        requireContext();
        PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(aVar, hf0.b.f69004d);
        pinterestGridLayoutManager.K = new kx0.c(this, 2);
        return new v0(pinterestGridLayoutManager);
    }

    public final yk1.v n9() {
        yk1.v vVar = this.W0;
        if (vVar != null) {
            return vVar;
        }
        Intrinsics.r("viewResources");
        throw null;
    }

    public final boolean o9() {
        return getActiveUserManager().b(l9());
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        c51.b bVar = this.f74731k1;
        if (bVar != null) {
            bVar.k();
            A8(bVar);
        }
        f7().j(this.f74734n1);
        f7().j(this.f74735o1);
        super.onDestroyView();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        bq.b bVar;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (q9()) {
            View findViewById = v13.findViewById(nz1.c.boards_filter_bar_container);
            this.f74728h1 = (FilterBarView) findViewById.findViewById(nz1.c.boards_filter_bar);
            this.f74729i1 = (PillView) findViewById.findViewById(nz1.c.boards_filter_bar_sort_button);
            i51.b0 m93 = m9();
            String l93 = l9();
            i51.f fVar = q9() ? i51.f.Icon : i51.f.None;
            if (o9()) {
                bq.c cVar = this.f74723c1;
                if (cVar == null) {
                    Intrinsics.r("boardSortingUtils");
                    throw null;
                }
                bVar = cVar.b();
            } else {
                bVar = bq.c.f23676d;
            }
            Intrinsics.f(bVar);
            m93.h(l93, fVar, bVar, s7().p());
            androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new b0(this, findViewById, null), 3);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) c7().b(), g83);
            if (com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_IS_PINNER_PROFILE", true) && !com.bumptech.glide.d.G(this, "EXTRAS_KEY_USE_PUBLIC_DISPLAY", false)) {
                c51.b bVar2 = new c51.b(g83, l9(), o9());
                b8(bVar2);
                this.f74731k1 = bVar2;
            }
        }
        f7().h(this.f74734n1);
        f7().h(this.f74735o1);
    }

    @Override // nl1.d
    public final String q7() {
        return l9();
    }

    public final boolean q9() {
        return k9() && o9() && !com.bumptech.glide.d.G(this, "EXTRAS_KEY_USE_PUBLIC_DISPLAY", false);
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(f7());
    }
}
