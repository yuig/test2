package cu;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.api.model.f30;
import com.pinterest.navigation.Navigation;
import cu.i;
import h32.a4;
import h32.d4;
import h32.g0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mq.j0;
import pk.a0;
import q5.d2;
import q5.e2;
import q5.f2;
import qt.g;
import xk2.v;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0010\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001*\u0014\b\u0001\u0010\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u000b2\u00020\f:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcu/m;", "Lqt/g;", "Lat/b;", "Presenter", "Lcu/i;", "Lcom/pinterest/ads/feature/owc/view/base/BaseAdsBottomSheetBehavior;", "Landroid/view/View;", "Sheet", "Lyk1/k;", "Lcu/d;", "Lmq/j0;", "Loc2/j;", "Lec2/o;", "<init>", "()V", "a8/v", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class m<Presenter extends qt.g, Sheet extends i> extends yk1.k implements at.b, d, j0, oc2.j, ec2.o {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f53224u0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public jo1.c f53225e0;

    /* renamed from: f0, reason: collision with root package name */
    public gs0.k f53226f0;

    /* renamed from: g0, reason: collision with root package name */
    public CoordinatorLayout f53227g0;

    /* renamed from: h0, reason: collision with root package name */
    public AdsCarouselIndexModule f53228h0;

    /* renamed from: i0, reason: collision with root package name */
    public FrameLayout f53229i0;

    /* renamed from: j0, reason: collision with root package name */
    public AdsToolbarModule f53230j0;

    /* renamed from: k0, reason: collision with root package name */
    public final HashSet f53231k0 = new HashSet();

    /* renamed from: l0, reason: collision with root package name */
    public at.a f53232l0;

    /* renamed from: m0, reason: collision with root package name */
    public f30 f53233m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f53234n0;

    /* renamed from: o0, reason: collision with root package name */
    public final v f53235o0;

    /* renamed from: p0, reason: collision with root package name */
    public final v f53236p0;

    /* renamed from: q0, reason: collision with root package name */
    public final v f53237q0;

    /* renamed from: r0, reason: collision with root package name */
    public final d4 f53238r0;

    /* renamed from: s0, reason: collision with root package name */
    public final a4 f53239s0;

    /* renamed from: t0, reason: collision with root package name */
    public final g0 f53240t0;

    public m() {
        r70.b bottomNavBarState = r70.b.f106349i.k0();
        Intrinsics.checkNotNullParameter(bottomNavBarState, "bottomNavBarState");
        new ArrayList();
        this.f53235o0 = xk2.m.b(new l(this, 0));
        this.f53236p0 = xk2.m.b(new l(this, 2));
        this.f53237q0 = xk2.m.b(new l(this, 1));
        this.f53238r0 = d4.ONE_TAP_V3_BROWSER;
        this.f53239s0 = a4.BROWSER;
        this.f53240t0 = g0.BROWSER;
    }

    @Override // mq.j0
    public final void H1() {
    }

    @Override // mq.j0
    public final f30 H4() {
        return getPin();
    }

    @Override // yk1.k, nl1.d
    public void K7() {
        super.K7();
        if (this.f53234n0) {
            Navigation navigation = this.I;
            f7().d(new r70.h(navigation != null ? navigation.S("com.pinterest.EXTRA_ENABLE_BOTTOM_TOOLBAR", false) : false, true));
            Pair b83 = b8();
            int intValue = ((Number) b83.f80346a).intValue();
            int intValue2 = ((Number) b83.f80347b).intValue();
            at.a aVar = this.f53232l0;
            if (aVar != null) {
                ((qt.g) aVar).z3(intValue, intValue2);
            }
        }
    }

    @Override // yk1.k, nl1.d
    public void L7() {
        at.a aVar;
        super.L7();
        if (!this.f53234n0 || (aVar = this.f53232l0) == null) {
            return;
        }
        ((qt.g) aVar).B3();
    }

    @Override // oc2.j
    public final Set S0() {
        return this.f53231k0;
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        return c8();
    }

    @Override // cu.d
    public void T4() {
        gs0.k kVar = this.f53226f0;
        if (kVar == null) {
            Intrinsics.r("pinOverflowMenuModalProvider");
            throw null;
        }
        f30 pin = getPin();
        if (this.f53225e0 != null) {
            gs0.k.a(kVar, pin, jo1.c.a(null), true, false, null, null, false, null, null, false, null, null, false, null, null, null, false, false, false, false, null, null, false, 8388600).showFeedBack();
        } else {
            Intrinsics.r("baseGridActionUtils");
            throw null;
        }
    }

    public void Y7() {
    }

    protected abstract qt.g Z7();

    @Override // at.b
    public void a4(String str, String str2, String str3, boolean z13, boolean z14) {
        FragmentActivity E4;
        Window window;
        a8().s(str, str2, str3, z13, z14);
        if (!z13 || (E4 = E4()) == null || (window = E4.getWindow()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(window, "<this>");
        a0.g1(window, false);
        h1.b bVar = new h1.b(window.getDecorView());
        int i13 = Build.VERSION.SDK_INT;
        (i13 >= 35 ? new f2(window, bVar) : i13 >= 30 ? new e2(window, bVar) : new d2(window, bVar)).i(false);
    }

    public abstract i a8();

    public final Pair b8() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type android.app.Activity");
        int[] h10 = hf0.b.h(requireActivity);
        Intrinsics.checkNotNullExpressionValue(h10, "getWindowHeightAndWidth(...)");
        return new Pair(Integer.valueOf(h10[0]), Integer.valueOf(d8().getHeight()));
    }

    public final CoordinatorLayout c8() {
        CoordinatorLayout coordinatorLayout = this.f53227g0;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        Intrinsics.r("rootView");
        throw null;
    }

    public BaseAdsScrollingModule d8() {
        return (BaseAdsScrollingModule) this.f53237q0.getValue();
    }

    public final AdsToolbarModule e8() {
        AdsToolbarModule adsToolbarModule = this.f53230j0;
        if (adsToolbarModule != null) {
            return adsToolbarModule;
        }
        Intrinsics.r("toolbarModule");
        throw null;
    }

    public final Context f8() {
        return (Context) this.f53236p0.getValue();
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    public boolean g() {
        i a83 = a8();
        if (a83.l() == 3) {
            a83.b();
            return true;
        }
        nl1.d.J7();
        return false;
    }

    public final qt.g g8(Function2 create) {
        Intrinsics.checkNotNullParameter(create, "create");
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.CLOSEUP_PIN_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        Navigation navigation2 = this.I;
        qt.g gVar = (qt.g) create.invoke(v03, new ps.l(v03, navigation2 != null ? navigation2.v0("com.pinterest.TRACKING_PARAMETER") : null, b7()));
        if (this.f53234n0) {
            gVar.D3(nq.b.SWIPE);
        }
        return gVar;
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF53240t0() {
        return this.f53240t0;
    }

    public final f30 getPin() {
        f30 f30Var = this.f53233m0;
        if (f30Var != null) {
            return f30Var;
        }
        Intrinsics.r("pin");
        throw null;
    }

    @Override // mq.j0
    public final String getPinId() {
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.v0("com.pinterest.CLOSEUP_PIN_ID");
        }
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF53239s0() {
        return this.f53239s0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF53238r0() {
        return this.f53238r0;
    }

    public void h8() {
        AdsToolbarModule adsToolbarModule = this.f53230j0;
        if (adsToolbarModule == null) {
            Intrinsics.r("toolbarModule");
            throw null;
        }
        adsToolbarModule.L(this);
        d8().f35326m0 = new a8.v(this, 18);
        ViewTreeObserver viewTreeObserver = c8().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.f53235o0.getValue());
        }
    }

    @Override // mq.j0
    public final void i(int i13, float f13, int i14) {
    }

    @Override // mq.j0
    public final boolean n1() {
        return true;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Navigation navigation = this.I;
        this.f53234n0 = navigation != null ? navigation.S("com.pinterest.EXTRA_IS_SIDE_SWIPE", false) : false;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = onGetLayoutInflater(bundle).inflate(ps.q.ads_closeup_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FrameLayout frameLayout = this.f53229i0;
        if (frameLayout == null) {
            Intrinsics.r("scrollingModuleContainer");
            throw null;
        }
        frameLayout.removeView(d8());
        c8().removeView(a8());
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
        a0.c1(requireActivity2);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(onGetLayoutInflater, "onGetLayoutInflater(...)");
        Navigation navigation = this.I;
        if (navigation == null || !navigation.S("com.pinterest.EXCLUDE_AD", false)) {
            return onGetLayoutInflater;
        }
        LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(f8());
        Intrinsics.f(cloneInContext);
        return cloneInContext;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.f53234n0) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            a0.d1(requireActivity);
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            a0.c1(requireActivity2);
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        if (this.f53234n0) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            a0.D(requireActivity);
        }
        super.onResume();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        View findViewById = v13.findViewById(ps.p.opaque_one_tap_root_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<set-?>");
        this.f53227g0 = coordinatorLayout;
        View findViewById2 = v13.findViewById(ps.p.one_tap_opaque_carousel_index_module);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        AdsCarouselIndexModule adsCarouselIndexModule = (AdsCarouselIndexModule) findViewById2;
        Intrinsics.checkNotNullParameter(adsCarouselIndexModule, "<set-?>");
        this.f53228h0 = adsCarouselIndexModule;
        View findViewById3 = v13.findViewById(ps.p.one_tap_opaque_scrolling_module_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f53229i0 = (FrameLayout) findViewById3;
        View findViewById4 = v13.findViewById(ps.p.one_tap_opaque_toolbar_module);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f53230j0 = (AdsToolbarModule) findViewById4;
        super.onViewCreated(v13, bundle);
        FrameLayout frameLayout = this.f53229i0;
        if (frameLayout == null) {
            Intrinsics.r("scrollingModuleContainer");
            throw null;
        }
        frameLayout.addView(d8());
        a8().X();
        c8().addView(a8());
    }

    @Override // at.b
    public void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pin, "<set-?>");
        this.f53233m0 = pin;
        d8().R1(pin);
        h8();
    }
}
