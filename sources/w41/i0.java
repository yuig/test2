package w41;

import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.l2;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.feature.profile.filters.FilterBarView;
import com.pinterest.feature.profile.pills.view.PillView;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128017r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f128018s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n0 n0Var, bl2.c cVar) {
        super(2, cVar);
        this.f128018s = n0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i0 i0Var = new i0(this.f128018s, cVar);
        i0Var.f128017r = obj;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((k) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k kVar = (k) this.f128017r;
        int i13 = n0.f128044e1;
        n0 n0Var = this.f128018s;
        n0Var.getClass();
        n0Var.f128045a1 = kVar.f128029g;
        f31.j jVar = kVar.f128023a;
        int i14 = 14;
        if (jVar instanceof f31.f) {
            GestaltStaticSearchBar gestaltStaticSearchBar = n0Var.Q0;
            if (gestaltStaticSearchBar == null) {
                Intrinsics.r("searchBar");
                throw null;
            }
            bs1.c.X0(gestaltStaticSearchBar);
        } else if (jVar instanceof f31.i) {
            f31.i iVar = (f31.i) jVar;
            f31.h hVar = iVar.f61012a;
            GestaltStaticSearchBar gestaltStaticSearchBar2 = n0Var.Q0;
            if (gestaltStaticSearchBar2 == null) {
                Intrinsics.r("searchBar");
                throw null;
            }
            gestaltStaticSearchBar2.d0(new y11.c(i14, n0Var, hVar));
            gestaltStaticSearchBar2.k0(new lq0.o(23, n0Var, hVar));
            bs1.c.U1(gestaltStaticSearchBar2);
            kh2.n nVar = iVar.f61013b;
            boolean z13 = nVar instanceof f31.e;
            f31.p pVar = f31.p.f61026a;
            if (z13) {
                nx.d0 s73 = n0Var.s7();
                FragmentActivity requireActivity = n0Var.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                el.a.l2(s73, requireActivity, ou1.e.ALL_PINS_PLUS_BUTTON);
                n0Var.n9(new u(pVar));
            } else if (nVar instanceof f31.b) {
                kg.t.L0(n0Var.s7(), null, null, d32.c.PROFILE_PLUS_BUTTON, null, 22);
                n0Var.n9(new u(pVar));
            } else if (nVar instanceof f31.a) {
                nx.d0 pinalytics = n0Var.s7();
                String value = ou1.b.PROFILE_PLUS_BUTTON.getValue();
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                kg.t.K0(pinalytics, value);
                n0Var.n9(new u(pVar));
            } else if (nVar instanceof f31.c) {
                f9.f fVar = ((f31.c) nVar).f60994b;
                if (fVar != null) {
                    n0Var.f7().d(new jc0.v(new zp.b0(n0Var.s7(), fVar, ou1.b.PROFILE_PLUS_BUTTON.getValue()), false, 0L, 30));
                }
                n0Var.n9(new u(pVar));
            } else {
                boolean z14 = nVar instanceof f31.d;
            }
        }
        a0 a0Var = kVar.f128024b;
        boolean z15 = a0Var instanceof y;
        int i15 = 1;
        k51.o oVar = kVar.f128028f;
        if (z15) {
            FilterBarView filterBarView = n0Var.R0;
            if (filterBarView == null) {
                Intrinsics.r("filterBar");
                throw null;
            }
            bs1.c.X0(filterBarView);
            PillView pillView = n0Var.S0;
            if (pillView == null) {
                Intrinsics.r("viewOptionsButton");
                throw null;
            }
            bs1.c.X0(pillView);
        } else if (a0Var instanceof z) {
            FilterBarView filterBarView2 = n0Var.R0;
            if (filterBarView2 == null) {
                Intrinsics.r("filterBar");
                throw null;
            }
            filterBarView2.o(ph.a.N0(((z) a0Var).f128099a, new tx0.j(n0Var.l9().f128084j.e(), i14)).f131617a);
            FilterBarView filterBarView3 = n0Var.R0;
            if (filterBarView3 == null) {
                Intrinsics.r("filterBar");
                throw null;
            }
            bs1.c.U1(filterBarView3);
            if (oVar.f78328a != k51.n.SEARCH_BAR) {
                PillView pillView2 = n0Var.S0;
                if (pillView2 == null) {
                    Intrinsics.r("viewOptionsButton");
                    throw null;
                }
                pillView2.o(k51.b.b(oVar, new h0(n0Var, i15)));
                PillView pillView3 = n0Var.S0;
                if (pillView3 == null) {
                    Intrinsics.r("viewOptionsButton");
                    throw null;
                }
                bs1.c.U1(pillView3);
            }
        }
        b22.l lVar = oVar.f78329b;
        int S1 = kh2.b0.S1(lVar, hf0.b.q() ? hf0.b.o() ? f.f128001b : d.f127991b : b.f127980b);
        boolean z16 = n0Var.Z0 != S1;
        n0Var.Z0 = S1;
        if (z16) {
            kh2.b0.a2(((o82.y) n0Var.V0.getValue()).f93752f, lVar, ((Boolean) n0Var.U0.getValue()).booleanValue());
            RecyclerView g83 = n0Var.g8();
            if (g83 != null) {
                l2 l2Var = g83.f19242n;
                PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
                if (pinterestStaggeredGridLayoutManager != null) {
                    pinterestStaggeredGridLayoutManager.h1(S1);
                }
                b2 b2Var = g83.f19240m;
                if (b2Var != null) {
                    b2Var.h();
                }
                n0Var.P8();
            }
        }
        l lVar2 = kVar.f128026d;
        int i16 = lVar2.f128034a;
        Resources resources = n0Var.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String c23 = bs1.c.c2(lVar2.f128035b, resources);
        Resources resources2 = n0Var.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String c24 = bs1.c.c2(lVar2.f128036c, resources2);
        int i17 = lVar2.f128037d;
        if (i17 != 0) {
            Resources resources3 = n0Var.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            str = bs1.c.c2(i17, resources3);
        } else {
            str = "";
        }
        String str2 = str;
        q qVar = lVar2.f128038e;
        v31.b bVar = new v31.b(i16, 0, c23, c24, str2, qVar != null ? new b01.c(16, n0Var, qVar) : m0.f128042i, null, 66);
        xk2.k kVar2 = n0Var.T0;
        ((EmptyStateBannerView) kVar2.getValue()).o(bVar);
        x0 x0Var = x0.f128096c;
        y0 y0Var = kVar.f128027e;
        boolean d2 = Intrinsics.d(y0Var, x0Var);
        m mVar = m.f128041a;
        if (d2) {
            n0Var.w8();
            n0Var.n9(mVar);
        } else if (Intrinsics.d(y0Var, x0.f128094a)) {
            if (n0Var.f139733g0 != null && n0Var.f139745s0) {
                n0Var.I8(false);
                PinterestEmptyStateLayout pinterestEmptyStateLayout = n0Var.f139733g0;
                if (pinterestEmptyStateLayout != null) {
                    pinterestEmptyStateLayout.b();
                }
            }
            n0Var.O8((EmptyStateBannerView) kVar2.getValue(), 1);
            n0Var.n9(mVar);
        } else {
            Intrinsics.d(y0Var, x0.f128095b);
        }
        return Unit.f80348a;
    }
}
