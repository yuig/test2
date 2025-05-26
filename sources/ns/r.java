package ns;

import a.sc;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.l2;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.a4;
import h32.d4;
import java.util.Set;
import kh2.a1;
import kotlin.Metadata;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;
import lh0.f3;
import nx.d1;
import o82.b3;
import o82.y0;
import rq.n3;
import so.c6;
import x02.x2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lns/r;", "Lo82/i3;", "<init>", "()V", "Luk1/d;", "presenterPinalytics", "adPreview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r extends a {

    /* renamed from: c1, reason: collision with root package name */
    public static final /* synthetic */ int f91954c1 = 0;
    public uk1.e F0;
    public bc2.e G0;
    public x10.b H0;
    public vg1.a I0;
    public a11.d J0;
    public nu1.a K0;
    public nx.o0 L0;
    public xr.a M0;
    public ro1.c N0;
    public ni1.d O0;
    public c6 P0;
    public nx.b0 Q0;
    public ur.a R0;
    public f3 S0;
    public g70.h T0;
    public final m1 U0;
    public final boolean V0;
    public d61.d W0;
    public ViewGroup X0;
    public final d61.i Y0;
    public final kx0.m Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final d4 f91955a1;

    /* renamed from: b1, reason: collision with root package name */
    public final a4 f91956b1;

    public r() {
        int i13 = 1;
        xk2.k q13 = jq.b.q(1, new q1(this, 2), xk2.n.NONE);
        this.U0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(p0.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.V0 = hf0.b.q();
        this.Y0 = new d61.i();
        this.Z0 = new kx0.m(this);
        this.f91955a1 = d4.SEARCH;
        this.f91956b1 = a4.AD_PREVIEW_FEED;
    }

    @Override // nl1.d
    public final boolean N7(int i13, KeyEvent keyEvent) {
        RecyclerView g83;
        l2 l2Var;
        View z13;
        if ((i13 == 24 || i13 == 25) && (g83 = g8()) != null && (l2Var = g83.f19242n) != null) {
            int E = l2Var.E();
            for (int i14 = 0; i14 < E; i14++) {
                View D = l2Var.D(i14);
                if (D != null && (z13 = l2Var.z(l2.Z(D))) != null) {
                    z13.onKeyDown(i13, keyEvent);
                }
            }
        }
        return false;
    }

    @Override // yq0.t, oc2.j
    public final Set S0() {
        ViewGroup viewGroup = this.X0;
        if (viewGroup != null) {
            return g1.b(viewGroup);
        }
        Intrinsics.r("searchBar");
        throw null;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        f3 f3Var = this.S0;
        if (f3Var != null) {
            this.X0 = kh2.m0.o(toolbar, requireContext, f3Var, g8(), new n3(1));
        } else {
            Intrinsics.r("searchLibraryExperiments");
            throw null;
        }
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(b9().a(), 2);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new mq.z(b9().c(), 1);
    }

    @Override // o82.i3
    public final void W8(y0 displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        if (!(displayState.i() instanceof o82.u) || !displayState.h().isEmpty()) {
            super.W8(displayState);
            return;
        }
        setLoadState(yk1.i.LOADED);
        setShowPaginationSpinner(true);
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.f(false);
        }
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        xk2.v b13 = xk2.m.b(new n(this, 2));
        int type = a61.c.VIEW_TYPE_IMMERSIVE_HEADER.getType();
        zp.j0 j0Var = new zp.j0(13, this, b13);
        uk1.d dVar = (uk1.d) b13.getValue();
        uj2.q p73 = p7();
        m60.w f73 = f7();
        x2 A7 = A7();
        d1 z73 = z7();
        nu1.a aVar = this.K0;
        if (aVar == null) {
            Intrinsics.r("inAppNavigator");
            throw null;
        }
        a11.d dVar2 = this.J0;
        if (dVar2 == null) {
            Intrinsics.r("clickThroughHelperFactory");
            throw null;
        }
        x10.b bVar = this.H0;
        if (bVar == null) {
            Intrinsics.r("pinApiService");
            throw null;
        }
        bc2.e eVar = this.G0;
        if (eVar == null) {
            Intrinsics.r("mp4TrackSelector");
            throw null;
        }
        vg1.a aVar2 = this.I0;
        if (aVar2 == null) {
            Intrinsics.r("spotlightPinImpressionManager");
            throw null;
        }
        xr.a aVar3 = this.M0;
        if (aVar3 == null) {
            Intrinsics.r("attributionReporting");
            throw null;
        }
        ro1.c cVar = this.N0;
        if (cVar == null) {
            Intrinsics.r("deepLinkAdUtil");
            throw null;
        }
        ni1.d dVar3 = this.O0;
        if (dVar3 == null) {
            Intrinsics.r("deepLinkHelper");
            throw null;
        }
        c6 c6Var = this.P0;
        if (c6Var == null) {
            Intrinsics.r("pinImpressionLoggerFactory");
            throw null;
        }
        nx.o0 o0Var = this.L0;
        if (o0Var == null) {
            Intrinsics.r("pinalyticsManager");
            throw null;
        }
        nx.b0 b0Var = this.Q0;
        if (b0Var == null) {
            Intrinsics.r("pinAuxHelper");
            throw null;
        }
        ur.a aVar4 = this.R0;
        if (aVar4 == null) {
            Intrinsics.r("adsCoreDependencies");
            throw null;
        }
        g70.h hVar = this.T0;
        if (hVar == null) {
            Intrinsics.r("boardNavigator");
            throw null;
        }
        adapter.E(type, j0Var, new xg1.a(dVar, p73, f73, A7, z73, aVar, dVar2, bVar, eVar, aVar2, aVar3, cVar, dVar3, c6Var, o0Var, b0Var, aVar4, hVar), o.f91944j);
        b3.G(adapter, a61.c.VIEW_TYPE_STRUCTURED_FEED_GRID_SECTION_VIEW.getType(), new n(this, 1), new u(), new i(0), new sc(21), null, 96);
        if (this.V0) {
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
            gridLayoutManager.K = new kx0.c(adapter);
            J8(gridLayoutManager);
            P8();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            int F0 = dl2.b.F0(requireContext, d61.h.f53778a);
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            this.W0 = new d61.d(F0, dl2.b.F0(requireContext2, d61.h.f53779b), adapter);
            RecyclerView g83 = g8();
            if (g83 != null) {
                h2 h2Var = this.W0;
                if (h2Var != null) {
                    g83.m(h2Var);
                } else {
                    Intrinsics.r("searchLandingItemPageItemDecorator");
                    throw null;
                }
            }
        }
    }

    public final p0 b9() {
        return (p0) this.U0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF53439t0() {
        return this.f91956b1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF53438s0() {
        return this.f91955a1;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(b9().c(), 2);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(js.d.fragment_search_landing_ad_preview, js.c.p_recycler_view);
        eVar.f979c = js.c.empty_state_container;
        eVar.c(js.c.swipe_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String f49940b;
        super.onCreate(bundle);
        p0 b93 = b9();
        Navigation navigation = this.I;
        if (navigation == null || (f49940b = navigation.getF49940b()) == null) {
            throw new IllegalStateException("Pin ID is required");
        }
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("override") : null;
        if (v03 == null) {
            throw new IllegalStateException("Deeplink URL is required");
        }
        b93.h(this.f91956b1, this.f91955a1, f49940b, v03);
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.setPaddingRelative(g83.getPaddingStart(), 0, g83.getPaddingEnd(), g83.getPaddingBottom());
        }
        addScrollListener(this.Z0);
        RecyclerView g84 = g8();
        if (g84 != null) {
            g84.setPaddingRelative(g84.getPaddingStart(), getResources().getDimensionPixelSize(eo1.c.sema_space_600) + getResources().getDimensionPixelSize(eo1.c.sema_space_1100), g84.getPaddingEnd(), getResources().getDimensionPixelSize(eo1.c.bottom_nav_height));
        }
        addRecyclerViewEventListener(this.Y0);
        RecyclerView g85 = g8();
        b2 b2Var = g85 != null ? g85.f19240m : null;
        if ((b2Var instanceof os.f ? (os.f) b2Var : null) != null) {
            getResources().getDimensionPixelSize(eo1.c.space_800);
        }
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.k(null);
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new m(this, null), 3);
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(js.c.toolbar);
    }
}
