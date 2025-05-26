package mu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmu/p0;", "Lnl1/d;", "Lcu/d;", "Loc2/j;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class p0 extends b0 implements cu.d, oc2.j {

    /* renamed from: c0, reason: collision with root package name */
    public gs0.k f88224c0;

    /* renamed from: d0, reason: collision with root package name */
    public CoordinatorLayout f88225d0;

    /* renamed from: e0, reason: collision with root package name */
    public AdsCarouselIndexModule f88226e0;

    /* renamed from: f0, reason: collision with root package name */
    public FrameLayout f88227f0;

    /* renamed from: g0, reason: collision with root package name */
    public AdsToolbarModule f88228g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f88229h0;

    /* renamed from: i0, reason: collision with root package name */
    public final HashSet f88230i0 = new HashSet();

    /* renamed from: j0, reason: collision with root package name */
    public final xk2.v f88231j0 = xk2.m.b(new l0(this, 1));

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f88232k0 = d4.ONE_TAP_V3_BROWSER;

    /* renamed from: l0, reason: collision with root package name */
    public zy.a0 f88233l0 = new zy.a0();

    /* renamed from: m0, reason: collision with root package name */
    public final xk2.v f88234m0 = xk2.m.b(new l0(this, 2));

    /* renamed from: n0, reason: collision with root package name */
    public final xk2.v f88235n0 = xk2.m.b(new l0(this, 0));

    @Override // nl1.d
    public void K7() {
        super.K7();
        Navigation navigation = this.I;
        boolean S = navigation != null ? navigation.S("com.pinterest.EXTRA_IS_SIDE_SWIPE", false) : false;
        Navigation navigation2 = this.I;
        Z7().a(new e(S, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_ENABLE_BOTTOM_TOOLBAR", false) : false));
    }

    @Override // oc2.j
    public final Set S0() {
        return this.f88230i0;
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        CoordinatorLayout coordinatorLayout = this.f88225d0;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        Intrinsics.r("rootView");
        throw null;
    }

    @Override // cu.d
    public final void T4() {
        Z7().a(h.f88205a);
    }

    public abstract wb.c Y7();

    public abstract mq.z Z7();

    public abstract qu.a a8();

    public abstract ru.b b8();

    public final Context c8() {
        return (Context) this.f88234m0.getValue();
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public boolean getF103154e0() {
        Z7().a(f.f88200a);
        return true;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f88233l0.e();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f88233l0.f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF112037k0() {
        return this.f88232k0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(Z7(), 7);
    }

    @Override // mu.b0, nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.D(requireActivity);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.CLOSEUP_PIN_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        ((mq.z) l7()).a(new ll1.b(v03));
        View inflate = inflater.inflate(ps.q.ads_closeup_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        FrameLayout frameLayout = this.f88227f0;
        if (frameLayout == null) {
            Intrinsics.r("scrollingModuleContainer");
            throw null;
        }
        frameLayout.removeView(b8());
        CoordinatorLayout coordinatorLayout = this.f88225d0;
        if (coordinatorLayout == null) {
            Intrinsics.r("rootView");
            throw null;
        }
        coordinatorLayout.removeView(a8());
        Z7().a(new g(System.currentTimeMillis() * 1000000));
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.d1(requireActivity);
        super.onDetach();
    }

    @Override // mu.b0, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(onGetLayoutInflater, "onGetLayoutInflater(...)");
        Navigation navigation = this.I;
        if (navigation == null || !navigation.S("com.pinterest.EXCLUDE_AD", false)) {
            return onGetLayoutInflater;
        }
        LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(c8());
        Intrinsics.f(cloneInContext);
        return cloneInContext;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(ps.p.opaque_one_tap_root_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f88225d0 = (CoordinatorLayout) findViewById;
        View findViewById2 = v13.findViewById(ps.p.one_tap_opaque_carousel_index_module);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f88226e0 = (AdsCarouselIndexModule) findViewById2;
        View findViewById3 = v13.findViewById(ps.p.one_tap_opaque_scrolling_module_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f88227f0 = (FrameLayout) findViewById3;
        View findViewById4 = v13.findViewById(ps.p.one_tap_opaque_toolbar_module);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f88228g0 = (AdsToolbarModule) findViewById4;
        Z7().a(new j(System.currentTimeMillis() * 1000000));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new o0(this, null), 3);
    }
}
