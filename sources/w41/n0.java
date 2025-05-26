package w41;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.feature.profile.filters.FilterBarView;
import com.pinterest.feature.profile.pills.view.PillView;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import h32.a4;
import h32.d4;
import h32.x3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.f3;
import lh0.u2;
import lh0.z3;
import o82.b3;
import so.n5;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw41/n0;", "Lo82/v2;", "Lcom/pinterest/feature/profile/b;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class n0 extends g implements com.pinterest.feature.profile.b {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f128044e1 = 0;
    public zf0.f L0;
    public n5 M0;
    public qb0.f N0;
    public u2 O0;
    public f3 P0;
    public GestaltStaticSearchBar Q0;
    public FilterBarView R0;
    public PillView S0;
    public final xk2.k T0;
    public final xk2.v U0;
    public final xk2.k V0;
    public final xk2.k W0;
    public final xk2.k X0;
    public final androidx.lifecycle.m1 Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public zy.a0 f128045a1;

    /* renamed from: b1, reason: collision with root package name */
    public final y32.f f128046b1;

    /* renamed from: c1, reason: collision with root package name */
    public final d4 f128047c1;

    /* renamed from: d1, reason: collision with root package name */
    public final h32.g0 f128048d1;

    public n0() {
        xk2.n nVar = xk2.n.NONE;
        this.T0 = xk2.m.a(nVar, new c0(this, 0));
        this.U0 = xk2.m.b(new c0(this, 4));
        this.V0 = xk2.m.a(nVar, new c0(this, 1));
        this.W0 = xk2.m.a(nVar, new c0(this, 5));
        this.X0 = xk2.m.a(nVar, new c0(this, 2));
        int i13 = 20;
        xk2.k a13 = xk2.m.a(nVar, new uv0.f(22, new kl0.w(this, i13)));
        int i14 = 21;
        this.Y0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(s1.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
        this.Z0 = kh2.b0.S1(k51.b.a(), kh2.j.x());
        this.f128045a1 = new zy.a0();
        this.f128046b1 = y32.f.PROFILE_LONGPRESS;
        this.f128047c1 = d4.USER;
        this.f128048d1 = h32.g0.PINS_TAB;
    }

    public static cn1.c o9(f31.g gVar) {
        u50.k0 k0Var;
        rm1.q qVar = gVar.f61003b;
        if (qVar == null) {
            return null;
        }
        Integer num = gVar.f61004c;
        if (num != null) {
            k0Var = bs1.c.j2(new String[0], num.intValue());
        } else {
            k0Var = null;
        }
        return new cn1.c(qVar, (om1.f) null, k0Var, dn1.a.END_ACTION_BUTTONS_ONE, 18);
    }

    @Override // com.pinterest.feature.profile.b
    public final View C() {
        GestaltStaticSearchBar gestaltStaticSearchBar = this.Q0;
        if (gestaltStaticSearchBar == null) {
            return null;
        }
        if (gestaltStaticSearchBar != null) {
            return gestaltStaticSearchBar;
        }
        Intrinsics.r("searchBar");
        throw null;
    }

    @Override // com.pinterest.feature.profile.b
    public final View K3() {
        FilterBarView filterBarView = this.R0;
        if (filterBarView == null) {
            return null;
        }
        if (filterBarView != null) {
            return filterBarView;
        }
        Intrinsics.r("filterBar");
        throw null;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new g0(l9().a(), 0);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(l9().c(), 12);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        c0.d.A2(adapter, q0.a(), k0.f128030j, (o82.y) this.V0.getValue());
        b3.G(adapter, 122333, new c0(this, 3), u0.f128090a, l0.f128039a, new a.z0(this, 12), null, 96);
    }

    @Override // o82.v2
    public final int a9() {
        return 0;
    }

    @Override // o82.v2
    public final int d9() {
        return 0;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f128045a1.e();
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final h32.g0 getV0() {
        return this.f128048d1;
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns, reason: from getter */
    public final int getT0() {
        return this.Z0;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f128045a1.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getQ0() {
        return ((Boolean) this.X0.getValue()).booleanValue() ? a4.USER_SELF : a4.USER_OTHERS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f128047c1;
    }

    public final String k9() {
        return (String) this.W0.getValue();
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(l9().c(), 13);
    }

    public final s1 l9() {
        return (s1) this.Y0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(nz1.d.fragment_profile_pins, nz1.c.profile_pins_collection);
        eVar.f979c = nz1.c.profile_pins_empty_state_container;
        eVar.c(nz1.c.profile_pins_swipe_container);
        return eVar;
    }

    public final boolean m9() {
        if (ve.h.V()) {
            f3 f3Var = this.P0;
            if (f3Var == null) {
                Intrinsics.r("searchLibraryExperiments");
                throw null;
            }
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            if (ve.h.W(f3Var, requireContext)) {
                u2 u2Var = this.O0;
                if (u2Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = lh0.a4.f83297a;
                lh0.g1 g1Var = (lh0.g1) u2Var.f83487a;
                if (g1Var.o("android_vc_search_gestalt", "enabled", z3Var) || g1Var.l("android_vc_search_gestalt")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void n9(x xVar) {
        kh2.j.x2(l9(), xVar);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle f49207c;
        super.onCreate(bundle);
        xk2.k kVar = this.X0;
        k51.n nVar = !((Boolean) kVar.getValue()).booleanValue() ? k51.n.SEARCH_BAR : k51.n.FILTER_BAR_ICON;
        s1 l93 = l9();
        String k93 = k9();
        boolean booleanValue = ((Boolean) kVar.getValue()).booleanValue();
        h32.i0 G0 = l3.c.G0(this.f128048d1, getQ0(), this.f128047c1, k9());
        String f13 = this.f128045a1.f();
        List j13 = kotlin.collections.f0.j(w31.b.f127916a, w31.a.f127915a);
        ScreenDescription screenDescription = this.f76937a;
        String string = (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null) ? null : f49207c.getString("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS");
        Context context = getContext();
        l93.h(k93, booleanValue, G0, f13, j13, nVar, string, context != null ? dl2.b.A1(context) : false);
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(nz1.c.profile_pins_action_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltStaticSearchBar gestaltStaticSearchBar = (GestaltStaticSearchBar) findViewById;
        oe.f.n(gestaltStaticSearchBar, new h0(this, 0));
        this.Q0 = gestaltStaticSearchBar;
        View findViewById2 = onCreateView.findViewById(nz1.c.profile_pins_filter_bar);
        FilterBarView filterBarView = (FilterBarView) findViewById2;
        Intrinsics.f(filterBarView);
        ViewGroup.LayoutParams layoutParams = filterBarView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(bs1.c.W(filterBarView, eo1.c.space_200));
        filterBarView.setLayoutParams(marginLayoutParams);
        u41.b a13 = u41.b.a(u41.d.b(), androidx.compose.foundation.layout.b.c(0.0f, 8, 0.0f, 11));
        x31.h.b().getClass();
        filterBarView.q(x31.d.a(a13));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.R0 = filterBarView;
        View findViewById3 = onCreateView.findViewById(nz1.c.profile_pins_filter_bar_view_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.S0 = (PillView) findViewById3;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (ve.h.V()) {
            f3 f3Var = this.P0;
            if (f3Var == null) {
                Intrinsics.r("searchLibraryExperiments");
                throw null;
            }
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            if (ve.h.W(f3Var, requireContext)) {
                u2 u2Var = this.O0;
                if (u2Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                u2Var.f();
            }
        }
        if (m9()) {
            n9(new u(f31.v.f61031a));
        }
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        O8((EmptyStateBannerView) this.T0.getValue(), 1);
        g9(bs1.c.X(this, eo1.c.bottom_nav_height));
        j0 j0Var = new j0(this, null);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new e0(this, j0Var, null), 3);
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f128045a1.e().f67083c;
        return (x3Var == null || (str = x3Var.f67402f) == null) ? k9() : str;
    }

    @Override // nl1.d
    public final y32.f v7() {
        throw null;
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
