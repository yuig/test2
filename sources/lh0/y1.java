package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83514a;

    public y1(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83514a = experimentsActivator;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83514a).k("ap_unauth_splash_screen_revamp_v3", group, activate);
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83514a;
        return ((g1) z0Var).o("android_gestalt_buttonsocial_adoption", "enabled", z3Var) || ((g1) z0Var).l("android_gestalt_buttonsocial_adoption");
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83514a;
        return ((g1) z0Var).o("android_line_auth", "enabled", z3Var) || ((g1) z0Var).l("android_line_auth");
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83514a;
        return ((g1) z0Var).o("ppm_unauth_preload", "enabled", z3Var) || ((g1) z0Var).l("ppm_unauth_preload");
    }

    public final boolean e() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83514a;
        return ((g1) z0Var).o("android_strong_password", "enabled", z3Var) || ((g1) z0Var).l("android_strong_password");
    }

    public final boolean f() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83514a;
        return ((g1) z0Var).o("android_unauth_account_recovery_flow_phase3", "enabled", z3Var) || ((g1) z0Var).l("android_unauth_account_recovery_flow_phase3");
    }

    public final boolean g(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83514a).o("android_unauth_experiment_loading", group, activate);
    }
}
