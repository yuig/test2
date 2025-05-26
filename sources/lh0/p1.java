package lh0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83456a;

    public p1(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83456a = experimentsActivator;
    }

    public final boolean a(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83456a).h("android_defer_cedexis_sampling_after_cold_start", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final boolean b(z3 activate) {
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83456a).g("hfp_visual_tabs_android", activate) != null;
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83456a;
        return ((g1) z0Var).o("android_ad_deal_module_hf", "enabled", z3Var) || ((g1) z0Var).l("android_ad_deal_module_hf");
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83456a;
        return ((g1) z0Var).o("android_biz_creator_metrics_toast", "enabled", z3Var) || ((g1) z0Var).l("android_biz_creator_metrics_toast");
    }

    public final boolean e() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83456a;
        return ((g1) z0Var).o("hfp_empty_state_android", "enabled", z3Var) || ((g1) z0Var).l("hfp_empty_state_android");
    }
}
