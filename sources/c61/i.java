package c61;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.l2;
import com.pinterest.api.model.gw;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.ui.grid.PinterestRecyclerView;
import ey.c3;
import h32.a4;
import h32.d4;
import h32.h2;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.e3;
import lh0.f3;
import lh0.z3;
import o82.b3;
import so.c6;
import x02.x2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lc61/i;", "Lo82/i3;", "<init>", "()V", "Luk1/d;", "presenterPinalytics", "landing_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i extends a {

    /* renamed from: m1, reason: collision with root package name */
    public static final /* synthetic */ int f26565m1 = 0;
    public uk1.e F0;
    public bc2.e G0;
    public x10.b H0;
    public vg1.a I0;
    public a11.d J0;
    public nu1.a K0;
    public nx.o0 L0;
    public xr.a M0;
    public ro1.c N0;
    public yk1.v O0;
    public nr0.t P0;
    public ni1.d Q0;
    public e3 R0;
    public f3 S0;
    public c6 T0;
    public c3 U0;
    public gw V0;
    public zs1.a W0;
    public nx.b0 X0;
    public ur.a Y0;
    public rg0.s Z0;

    /* renamed from: a1, reason: collision with root package name */
    public g70.h f26566a1;

    /* renamed from: b1, reason: collision with root package name */
    public final androidx.lifecycle.m1 f26567b1;

    /* renamed from: c1, reason: collision with root package name */
    public final boolean f26568c1;

    /* renamed from: d1, reason: collision with root package name */
    public d61.d f26569d1;

    /* renamed from: e1, reason: collision with root package name */
    public ViewGroup f26570e1;

    /* renamed from: f1, reason: collision with root package name */
    public final d61.i f26571f1;

    /* renamed from: g1, reason: collision with root package name */
    public final xk2.v f26572g1;

    /* renamed from: h1, reason: collision with root package name */
    public final xk2.v f26573h1;

    /* renamed from: i1, reason: collision with root package name */
    public final xk2.v f26574i1;

    /* renamed from: j1, reason: collision with root package name */
    public final d4 f26575j1;

    /* renamed from: k1, reason: collision with root package name */
    public final a4 f26576k1;

    /* renamed from: l1, reason: collision with root package name */
    public final h f26577l1;

    public i() {
        int i13 = 22;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(24, new kl0.w(this, i13)));
        int i14 = 23;
        this.f26567b1 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(m1.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
        this.f26568c1 = hf0.b.q();
        this.f26571f1 = new d61.i();
        this.f26572g1 = xk2.m.b(new b(this, 16));
        this.f26573h1 = xk2.m.b(new b(this, 0));
        this.f26574i1 = xk2.m.b(new b(this, 17));
        this.f26575j1 = d4.SEARCH;
        this.f26576k1 = a4.SEARCH_TAB;
        this.f26577l1 = new h(this);
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

    @Override // o82.i3
    public final List R8() {
        zy.m[] mVarArr = new zy.m[3];
        qc2.d dVar = new qc2.d();
        zs1.a aVar = this.W0;
        if (aVar == null) {
            Intrinsics.r("impressionDebugUtils");
            throw null;
        }
        mVarArr[0] = new zy.o0(new zy.z(dVar, aVar), T8(), h2.GRID_CELL);
        mVarArr[1] = new zy.m0(T8());
        u50.r T8 = T8();
        gw gwVar = this.V0;
        if (gwVar != null) {
            mVarArr[2] = new zy.p0(T8, gwVar);
            return kotlin.collections.f0.j(mVarArr);
        }
        Intrinsics.r("modelHelper");
        throw null;
    }

    @Override // yq0.t, oc2.j
    public final Set S0() {
        ViewGroup viewGroup = this.f26570e1;
        if (viewGroup != null) {
            return kotlin.collections.g1.b(viewGroup);
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
            this.f26570e1 = kh2.m0.n(toolbar, requireContext, f3Var, new b(this, 18), g8(), new l11.p(this, 10), this.f26577l1);
        } else {
            Intrinsics.r("searchLibraryExperiments");
            throw null;
        }
    }

    @Override // o82.i3
    public final u50.r T8() {
        return new tx0.j(c9().c(), 17);
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(c9().a(), 1);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(c9().c(), 16);
    }

    @Override // o82.i3
    public final void W8(o82.y0 displayState) {
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
        xk2.v b13 = xk2.m.b(new b(this, 14));
        adapter.E(a61.c.VIEW_TYPE_IDEAS_BUBBLES.getType(), new b(this, 6), new yo0.a((uk1.d) b13.getValue(), p7(), A7(), "autocomplete_bubble", (i1.h) null, (c91.f) null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM), g.f26550r);
        int type = a61.c.VIEW_TYPE_SHOPPING_SPOTLIGHT.getType();
        b bVar = new b(this, 10);
        uk1.d dVar = (uk1.d) b13.getValue();
        uj2.q p73 = p7();
        m60.w f73 = f7();
        x2 A7 = A7();
        nx.d1 z73 = z7();
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
        x10.b bVar2 = this.H0;
        if (bVar2 == null) {
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
        xk2.v vVar = b13;
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
        ni1.d dVar3 = this.Q0;
        if (dVar3 == null) {
            Intrinsics.r("deepLinkHelper");
            throw null;
        }
        c6 c6Var = this.T0;
        if (c6Var == null) {
            Intrinsics.r("pinImpressionLoggerFactory");
            throw null;
        }
        nx.o0 o0Var = this.L0;
        if (o0Var == null) {
            Intrinsics.r("pinalyticsManager");
            throw null;
        }
        nx.b0 b0Var = this.X0;
        if (b0Var == null) {
            Intrinsics.r("pinAuxHelper");
            throw null;
        }
        ur.a aVar4 = this.Y0;
        if (aVar4 == null) {
            Intrinsics.r("adsCoreDependencies");
            throw null;
        }
        g70.h hVar = this.f26566a1;
        if (hVar == null) {
            Intrinsics.r("boardNavigator");
            throw null;
        }
        b3 b3Var = adapter;
        b3Var.E(type, bVar, new xg1.a(dVar, p73, f73, A7, z73, aVar, dVar2, bVar2, eVar, aVar2, aVar3, cVar, dVar3, c6Var, o0Var, b0Var, aVar4, hVar), g.f26551s);
        e3 e3Var = this.R0;
        if (e3Var == null) {
            Intrinsics.r("searchLandingExperiment");
            throw null;
        }
        if (e3Var.a(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
            int type2 = a61.c.VIEW_TYPE_IMMERSIVE_HEADER.getType();
            b bVar3 = new b(this, 11);
            uk1.d dVar4 = (uk1.d) vVar.getValue();
            uj2.q p74 = p7();
            nu1.a aVar5 = this.K0;
            if (aVar5 == null) {
                Intrinsics.r("inAppNavigator");
                throw null;
            }
            b3Var.E(type2, bVar3, new xv.g(dVar4, p74, aVar5, f7()), g.f26552t);
        } else {
            int type3 = a61.c.VIEW_TYPE_IMMERSIVE_HEADER.getType();
            b01.c cVar2 = new b01.c(22, this, vVar);
            uk1.d dVar5 = (uk1.d) vVar.getValue();
            uj2.q p75 = p7();
            m60.w f74 = f7();
            x2 A72 = A7();
            nx.d1 z74 = z7();
            nu1.a aVar6 = this.K0;
            if (aVar6 == null) {
                Intrinsics.r("inAppNavigator");
                throw null;
            }
            a11.d dVar6 = this.J0;
            if (dVar6 == null) {
                Intrinsics.r("clickThroughHelperFactory");
                throw null;
            }
            x10.b bVar4 = this.H0;
            if (bVar4 == null) {
                Intrinsics.r("pinApiService");
                throw null;
            }
            bc2.e eVar2 = this.G0;
            if (eVar2 == null) {
                Intrinsics.r("mp4TrackSelector");
                throw null;
            }
            vg1.a aVar7 = this.I0;
            if (aVar7 == null) {
                Intrinsics.r("spotlightPinImpressionManager");
                throw null;
            }
            vVar = vVar;
            xr.a aVar8 = this.M0;
            if (aVar8 == null) {
                Intrinsics.r("attributionReporting");
                throw null;
            }
            ro1.c cVar3 = this.N0;
            if (cVar3 == null) {
                Intrinsics.r("deepLinkAdUtil");
                throw null;
            }
            ni1.d dVar7 = this.Q0;
            if (dVar7 == null) {
                Intrinsics.r("deepLinkHelper");
                throw null;
            }
            c6 c6Var2 = this.T0;
            if (c6Var2 == null) {
                Intrinsics.r("pinImpressionLoggerFactory");
                throw null;
            }
            nx.o0 o0Var2 = this.L0;
            if (o0Var2 == null) {
                Intrinsics.r("pinalyticsManager");
                throw null;
            }
            nx.b0 b0Var2 = this.X0;
            if (b0Var2 == null) {
                Intrinsics.r("pinAuxHelper");
                throw null;
            }
            ur.a aVar9 = this.Y0;
            if (aVar9 == null) {
                Intrinsics.r("adsCoreDependencies");
                throw null;
            }
            g70.h hVar2 = this.f26566a1;
            if (hVar2 == null) {
                Intrinsics.r("boardNavigator");
                throw null;
            }
            b3Var = adapter;
            b3Var.E(type3, cVar2, new xg1.a(dVar5, p75, f74, A72, z74, aVar6, dVar6, bVar4, eVar2, aVar7, aVar8, cVar3, dVar7, c6Var2, o0Var2, b0Var2, aVar9, hVar2), g.f26553u);
        }
        int type4 = a61.c.VIEW_TYPE_STORY_PINS_UPSELL.getType();
        b bVar5 = new b(this, 13);
        uk1.d dVar8 = (uk1.d) vVar.getValue();
        uj2.q p76 = p7();
        a11.d dVar9 = this.J0;
        if (dVar9 == null) {
            Intrinsics.r("clickThroughHelperFactory");
            throw null;
        }
        nx.d0 d0Var = ((uk1.d) vVar.getValue()).f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        b3Var.E(type4, bVar5, new xv.g(dVar8, p76, dVar9.a(d0Var), z7()), g.f26542j);
        int type5 = a61.c.VIEW_TYPE_UNIFIED_COMPONENT_BUNDLED.getType();
        b bVar6 = new b(this, 1);
        uk1.d dVar10 = (uk1.d) vVar.getValue();
        yk1.v vVar2 = this.O0;
        if (vVar2 == null) {
            Intrinsics.r("viewResources");
            throw null;
        }
        b3Var.E(type5, bVar6, new yi0.a(dVar10, vVar2), g.f26543k);
        b3Var.E(a61.c.VIEW_TYPE_STRUCTURED_FEED_GRID_SECTION_VIEW.getType(), new b(this, 2), b9(), g.f26544l);
        b3Var.E(a61.c.VIEW_TYPE_STRUCTURED_FEED_HEADER_VIEW.getType(), new b(this, 3), b9(), g.f26545m);
        b3Var.E(a61.c.VIEW_TYPE_STRUCTURED_FEED_FOOTER_VIEW.getType(), new b(this, 4), b9(), g.f26546n);
        b3Var.E(a61.c.VIEW_TYPE_STRUCTURED_FEED_CAROUSEL_VIEW.getType(), new b(this, 5), b9(), g.f26547o);
        b3Var.E(a61.c.VIEW_TYPE_STRUCTURED_FEED_FREEFORM.getType(), new b(this, 7), b9(), g.f26548p);
        b3Var.E(a61.c.VIEW_TYPE_STRUCTURED_FEED_SINGLE_IMAGE_UPSELL_VIEW.getType(), new b(this, 8), b9(), g.f26549q);
        if (this.f26568c1) {
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
            gridLayoutManager.K = new kx0.c(b3Var);
            J8(gridLayoutManager);
            P8();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            int F0 = dl2.b.F0(requireContext, d61.h.f53778a);
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            this.f26569d1 = new d61.d(F0, dl2.b.F0(requireContext2, d61.h.f53779b), b3Var);
            RecyclerView g83 = g8();
            if (g83 != null) {
                androidx.recyclerview.widget.h2 h2Var = this.f26569d1;
                if (h2Var != null) {
                    g83.m(h2Var);
                } else {
                    Intrinsics.r("searchLandingItemPageItemDecorator");
                    throw null;
                }
            }
        }
    }

    public final se1.d b9() {
        return (se1.d) this.f26574i1.getValue();
    }

    public final m1 c9() {
        return (m1) this.f26567b1.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF112299o0() {
        return this.f26576k1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getN0() {
        return this.f26575j1;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(c9().c(), 18);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(j42.e.search_landing_recycler_container, j42.c.p_recycler_view);
        eVar.f979c = m60.t0.empty_state_container;
        eVar.c(m60.t0.swipe_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle f49207c;
        super.onCreate(bundle);
        ScreenDescription screenDescription = this.f76937a;
        if (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null || !f49207c.getBoolean("com.pinterest.EXTRA_SEARCH_SHOULD_MOCK_MODULES")) {
            return;
        }
        c9().h(true);
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        addRecyclerViewEventListener((pr0.g) this.f26572g1.getValue());
        return onCreateView;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        fo1.a i73;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.setPaddingRelative(g83.getPaddingStart(), 0, g83.getPaddingEnd(), g83.getPaddingBottom());
        }
        addScrollListener(new kx0.m(this));
        RecyclerView g84 = g8();
        if (g84 != null) {
            g84.setPaddingRelative(g84.getPaddingStart(), getResources().getDimensionPixelSize(eo1.c.sema_space_600) + getResources().getDimensionPixelSize(eo1.c.sema_space_1100), g84.getPaddingEnd(), getResources().getDimensionPixelSize(eo1.c.bottom_nav_height));
        }
        Context context = getContext();
        if (context != null && (i73 = i7()) != null) {
            ((GestaltToolbarImpl) i73).setBackgroundColor(dl2.b.x0(context, eo1.a.sema_color_background_default));
        }
        addRecyclerViewEventListener(this.f26571f1);
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
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new f(this, null), 3);
        m1 c93 = c9();
        String localDateTime = LocalDateTime.now().toString();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toString(...)");
        kh2.j.x2(c93, new p(localDateTime));
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(m60.t0.toolbar);
    }
}
