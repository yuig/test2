package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static d f83321c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83323a;

    /* renamed from: b, reason: collision with root package name */
    public static final vb0.e f83320b = new vb0.e(6, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83322d = a.f83285j;

    public d(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83323a = experimentsActivator;
        f83321c = this;
    }

    public final boolean a() {
        Intrinsics.checkNotNullParameter("enabled_promo_with_corner_badge", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83323a).h("ads_deal_indicator", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "enabled_promo_with_corner_badge", false);
        }
        return false;
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83323a).o("android_ads_module_viewability_extended", group, activate);
    }

    public final boolean c(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83323a).o("dl_ad_closeup_format_expansion", group, activate);
    }

    public final boolean d(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83323a).o("android_dl_ad_closeup", group, activate);
    }

    public final boolean e(z3 activate) {
        Intrinsics.checkNotNullParameter("enabled_with_logging", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83323a).k("android_pintag_decan_v2", "enabled_with_logging", activate);
    }

    public final boolean f() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83323a;
        return ((g1) z0Var).o("android_ads_3p_grid_video_letterbox_killswitch", "enabled", z3Var) || ((g1) z0Var).l("android_ads_3p_grid_video_letterbox_killswitch");
    }

    public final boolean g() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83323a;
        return ((g1) z0Var).o("android_carting_killswitch", "enabled", z3Var) || ((g1) z0Var).l("android_carting_killswitch");
    }

    public final boolean h() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83323a;
        return ((g1) z0Var).o("android_dco_cpd", "enabled", z3Var) || ((g1) z0Var).l("android_dco_cpd");
    }

    public final boolean i() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83323a;
        return ((g1) z0Var).o("deals_grid_rep_exclusion_override", "enabled", z3Var) || ((g1) z0Var).l("deals_grid_rep_exclusion_override");
    }

    public final boolean j() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83323a;
        return ((g1) z0Var).o("android_pintag_decan_v2", "enabled", z3Var) || ((g1) z0Var).l("android_pintag_decan_v2");
    }

    public final boolean k() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83323a;
        return ((g1) z0Var).o("android_weight_loss_opt_out_option", "enabled", z3Var) || ((g1) z0Var).l("android_weight_loss_opt_out_option");
    }

    public final boolean l(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83323a).o("price_and_ratings_broad", group, activate);
    }
}
