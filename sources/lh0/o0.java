package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83446a;

    public o0(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83446a = experimentsActivator;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83446a).k("android_curation_brv_tune_constraint_to_trigger_complex_board_picker", group, activate);
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83446a).k("sg_android_ctx_longpress_share_icons", group, activate);
    }

    public final boolean c() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83446a;
        return ((g1) z0Var).o("android_ctx_long_press_cleanup_animation", "enabled", z3Var) || ((g1) z0Var).l("android_ctx_long_press_cleanup_animation");
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83446a;
        return ((g1) z0Var).o("android_ctx_long_press_cleanup", "enabled", z3Var) || ((g1) z0Var).l("android_ctx_long_press_cleanup");
    }
}
