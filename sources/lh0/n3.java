package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83444a;

    public n3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83444a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83444a;
        return ((g1) z0Var).o("android_menu_entry_point", "enabled", z3Var) || ((g1) z0Var).l("android_menu_entry_point");
    }

    public final void b() {
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) this.f83444a;
        if (g1Var.o("android_settings_activation_test", "enabled", z3Var)) {
            return;
        }
        g1Var.l("android_settings_activation_test");
    }
}
