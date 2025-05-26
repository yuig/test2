package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83487a;

    public u2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83487a = experimentsActivator;
    }

    public final void a() {
        ((g1) this.f83487a).c("uup_dsa_launch_android");
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83487a).k("android_curation_business_profile_header_update_tab_deprecation_child", group, activate);
    }

    public final boolean c() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83487a;
        return ((g1) z0Var).o("android_boards_gg_unification", "enabled", z3Var) || ((g1) z0Var).l("android_boards_gg_unification");
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83487a;
        return ((g1) z0Var).o("android_board_invitation_rep_ui_update", "enabled", z3Var) || ((g1) z0Var).l("android_board_invitation_rep_ui_update");
    }

    public final boolean e() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83487a;
        return ((g1) z0Var).o("android_business_profile_header_update", "enabled", z3Var) || ((g1) z0Var).l("android_business_profile_header_update");
    }

    public final boolean f() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83487a;
        return ((g1) z0Var).o("android_vc_search_gestalt", "enabled", z3Var) || ((g1) z0Var).l("android_vc_search_gestalt");
    }
}
