package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83466a;

    public r(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83466a = experimentsActivator;
    }

    public final void a() {
        ((g1) this.f83466a).c("android_curated_articles_to_board_pwt");
    }

    public final void b() {
        ((g1) this.f83466a).c("android_more_ideas_on_endless_scroll");
    }

    public final boolean c(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83466a).k("android_more_ideas_on_endless_scroll", group, activate);
    }

    public final boolean d() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83466a;
        return ((g1) z0Var).o("android_curated_articles_to_board_shift", "enabled", z3Var) || ((g1) z0Var).l("android_curated_articles_to_board_shift");
    }

    public final boolean e() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83466a;
        return ((g1) z0Var).o("android_lifecycle_aware_grid_view_to_all_surfaces", "enabled", z3Var) || ((g1) z0Var).l("android_lifecycle_aware_grid_view_to_all_surfaces");
    }

    public final boolean f() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83466a;
        return ((g1) z0Var).o("android_more_ideas_on_endless_scroll", "enabled", z3Var) || ((g1) z0Var).l("android_more_ideas_on_endless_scroll");
    }

    public final boolean g() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83466a;
        return ((g1) z0Var).o("sg_android_screenshot_detector_logging", "enabled", z3Var) || ((g1) z0Var).l("sg_android_screenshot_detector_logging");
    }
}
