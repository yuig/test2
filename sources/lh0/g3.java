package lh0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83374a;

    public g3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83374a = experimentsActivator;
    }

    public final boolean a(z3 activate) {
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83374a).g("android_search_filter_button_migration_expansion", activate) != null;
    }

    public final boolean b(z3 activate) {
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83374a).g("android_search_onebar_filter_count", activate) != null;
    }

    public final boolean c() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_boards_gg_unification", "enabled", z3Var) || ((g1) z0Var).l("android_boards_gg_unification");
    }

    public final boolean d() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_grid_inline_actions_phase_1", "enabled", z3Var) || ((g1) z0Var).l("android_grid_inline_actions_phase_1");
    }

    public final boolean e() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_search_perceived_wait", "enabled", z3Var) || ((g1) z0Var).l("android_search_perceived_wait");
    }

    public final boolean f() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_search_perceived_wait", "enabled", z3Var) || ((g1) z0Var).l("android_search_perceived_wait");
    }

    public final boolean g() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_inc_persistence", "enabled", z3Var) || ((g1) z0Var).l("android_inc_persistence");
    }

    public final boolean h() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_search_filter_button_migration_expansion", "enabled", z3Var) || ((g1) z0Var).l("android_search_filter_button_migration_expansion");
    }

    public final boolean i() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_search_people_tab", "enabled", z3Var) || ((g1) z0Var).l("android_search_people_tab");
    }

    public final boolean j() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_search_sticky_guides_tablet", "enabled", z3Var) || ((g1) z0Var).l("android_search_sticky_guides_tablet");
    }

    public final void k() {
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) this.f83374a;
        if (g1Var.o("android_search_unify_tap_back_behavior", "enabled", z3Var)) {
            return;
        }
        g1Var.l("android_search_unify_tap_back_behavior");
    }

    public final boolean l() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_search_unify_tap_back_behavior", "enabled", z3Var) || ((g1) z0Var).l("android_search_unify_tap_back_behavior");
    }

    public final boolean m() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83374a;
        return ((g1) z0Var).o("android_vc_search_gestalt", "enabled", z3Var) || ((g1) z0Var).l("android_vc_search_gestalt");
    }

    public final boolean n(z3 activate) {
        Intrinsics.checkNotNullParameter("enabled_pwt", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83374a).o("android_search_guide_cover_image", "enabled_pwt", activate);
    }

    public final boolean o(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83374a).h("shopping_unit_search", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final boolean p() {
        Intrinsics.checkNotNullParameter("autoscroll", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83374a).h("android_search_sticky_guides_tablet", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "autoscroll", false);
        }
        return false;
    }

    public final boolean q(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83374a).h("android_ways_to_style_ui_v2_search", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }
}
