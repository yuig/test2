package ap0;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.j2;
import h32.f1;
import h32.g0;
import h32.u0;
import kg.t;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nt.c2;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wy0 f20306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f20307c;

    public /* synthetic */ g(i iVar, wy0 wy0Var) {
        this.f20305a = 2;
        this.f20307c = iVar;
        this.f20306b = wy0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f20305a;
        wy0 wy0Var = this.f20306b;
        i this$0 = this.f20307c;
        switch (i13) {
            case 0:
                int i14 = i.f20310r0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (wy0Var != null) {
                    this$0.b8(wy0Var);
                    w f73 = this$0.f7();
                    NavigationImpl z03 = Navigation.z0((ScreenLocation) j2.f51012e.getValue(), wy0Var.getUid());
                    z03.z(r41.b.BusinessOnboardingStep.ordinal(), "ADS_ONLY_PROFILE_ORIGIN");
                    f73.d(z03);
                    nu1.a inAppNavigator = this$0.f20312k0;
                    if (inAppNavigator == null) {
                        Intrinsics.r("inAppNavigator");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
                    c3.h0(inAppNavigator, "");
                    this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CREATE_AD_BUTTON, (r18 & 4) != 0 ? null : g0.BIZ_ONBOARDING_CREATE_AD, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                this$0.c8();
                this$0.D5();
                return;
            case 1:
                int i15 = i.f20310r0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (wy0Var != null) {
                    this$0.b8(wy0Var);
                    w f74 = this$0.f7();
                    NavigationImpl z04 = Navigation.z0((ScreenLocation) j2.f51012e.getValue(), wy0Var.getUid());
                    z04.z(r41.b.BusinessOnboardingStep.ordinal(), "ADS_ONLY_PROFILE_ORIGIN");
                    f74.d(z04);
                    Context requireContext = this$0.requireContext();
                    d0 s73 = this$0.s7();
                    ou1.e eVar = ou1.e.BUSINESS_ONBOARDING;
                    Intrinsics.f(requireContext);
                    t.M0(s73, requireContext, eVar, null, null, 0, 56);
                    this$0.c8();
                }
                this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CREATE_PIN_BUTTON, (r18 & 4) != 0 ? null : g0.BIZ_ONBOARDING_CREATE_PIN, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$0.D5();
                return;
            default:
                int i16 = i.f20310r0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.YOUR_PROFILE_BUTTON, (r18 & 4) != 0 ? null : g0.BIZ_ONBOARDING_BUILD_PROFILE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$0.D5();
                if (wy0Var != null) {
                    this$0.b8(wy0Var);
                    view.postDelayed(new c2(this$0, 23), 10L);
                    this$0.c8();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(wy0 wy0Var, i iVar, int i13) {
        this.f20305a = i13;
        this.f20306b = wy0Var;
        this.f20307c = iVar;
    }
}
