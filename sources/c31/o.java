package c31;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.l2;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import java.util.Set;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f25608r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f25609s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f25609s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        o oVar = new o(this.f25609s, cVar);
        oVar.f25608r = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        b2 b2Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f25608r;
        r rVar = this.f25609s;
        boolean z13 = rVar.Q0.f25562a != aVar2.f25562a;
        rVar.Q0 = aVar2;
        if (z13) {
            Set set = h31.g.f66813a;
            bp1.h.d(((o82.y) rVar.T0.getValue()).f93752f, rVar.Q0.f25563b, ((Boolean) rVar.R0.getValue()).booleanValue());
            RecyclerView g83 = rVar.g8();
            l2 l2Var = g83 != null ? g83.f19242n : null;
            PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
            if (pinterestStaggeredGridLayoutManager != null) {
                pinterestStaggeredGridLayoutManager.h1(aVar2.f25562a);
            }
            rVar.P8();
            RecyclerView g84 = rVar.g8();
            if (g84 != null && (b2Var = g84.f19240m) != null) {
                b2Var.h();
            }
        }
        a1 a1Var = aVar2.f25566e;
        boolean z14 = a1Var instanceof x;
        e eVar = e.f25579a;
        if (z14) {
            rVar.w8();
            kh2.j.x2(rVar.l9(), eVar);
        } else if (a1Var instanceof v) {
            if (rVar.f139733g0 != null && rVar.f139745s0) {
                rVar.I8(false);
                PinterestEmptyStateLayout pinterestEmptyStateLayout = rVar.f139733g0;
                if (pinterestEmptyStateLayout != null) {
                    pinterestEmptyStateLayout.b();
                }
            }
            kh2.j.x2(rVar.l9(), eVar);
        } else {
            boolean z15 = a1Var instanceof w;
        }
        f31.f fVar = f31.f.f61000a;
        f31.j jVar = aVar2.f25564c;
        if (Intrinsics.d(jVar, fVar)) {
            GestaltStaticSearchBar gestaltStaticSearchBar = rVar.P0;
            if (gestaltStaticSearchBar == null) {
                Intrinsics.r("searchBar");
                throw null;
            }
            oe.f.n(gestaltStaticSearchBar, n.f25599j);
        } else if (jVar instanceof f31.i) {
            tx0.j jVar2 = new tx0.j(rVar.l9().f25624l.e(), 8);
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            kotlin.jvm.internal.j0 j0Var2 = new kotlin.jvm.internal.j0();
            f31.i iVar = (f31.i) jVar;
            f31.h hVar = iVar.f61012a;
            GestaltStaticSearchBar gestaltStaticSearchBar2 = rVar.P0;
            if (gestaltStaticSearchBar2 == null) {
                Intrinsics.r("searchBar");
                throw null;
            }
            oe.f.n(gestaltStaticSearchBar2, new aw0.j(hVar, rVar, j0Var, j0Var2, 9));
            gestaltStaticSearchBar2.k0(new zu0.f(jVar2, hVar, rVar, j0Var, j0Var2, 2));
            kh2.n nVar = iVar.f61013b;
            if (nVar instanceof f31.e) {
                nx.d0 s73 = rVar.s7();
                FragmentActivity requireActivity = rVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                el.a.l2(s73, requireActivity, ou1.e.ALL_PINS_PLUS_BUTTON);
                rVar.m9();
            } else if (nVar instanceof f31.b) {
                kg.t.L0(rVar.s7(), null, null, d32.c.PROFILE_PLUS_BUTTON, null, 22);
                rVar.m9();
            } else if (nVar instanceof f31.a) {
                nx.d0 pinalytics = rVar.s7();
                String value = ou1.b.PROFILE_PLUS_BUTTON.getValue();
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                kg.t.K0(pinalytics, value);
                rVar.m9();
            } else if (nVar instanceof f31.c) {
                f9.f fVar2 = ((f31.c) nVar).f60994b;
                rVar.f7().d(fVar2 != null ? new jc0.v(new zp.b0(rVar.s7(), fVar2), false, 0L, 30) : null);
                rVar.m9();
            } else {
                boolean z16 = nVar instanceof f31.d;
            }
        }
        return Unit.f80348a;
    }
}
