package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83460a;

    public q(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83460a = experimentsActivator;
    }

    public final boolean a(z3 activate) {
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83460a).g("hfp_bmi_tab_header_android", activate) != null;
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83460a;
        return ((g1) z0Var).o("hfp_one_tap_save_pin_leveling", "enabled", z3Var) || ((g1) z0Var).l("hfp_one_tap_save_pin_leveling");
    }
}
