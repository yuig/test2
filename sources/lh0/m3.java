package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83424a;

    public m3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83424a = experimentsActivator;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83424a).k("android_backfill_option", group, activate);
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83424a;
        return ((g1) z0Var).o("android_ig_pin_auto_org", "enabled", z3Var) || ((g1) z0Var).l("android_ig_pin_auto_org");
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83424a;
        return ((g1) z0Var).o("android_passcode_required_sba", "enabled", z3Var) || ((g1) z0Var).l("android_passcode_required_sba");
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83424a;
        return ((g1) z0Var).o("android_strong_password", "enabled", z3Var) || ((g1) z0Var).l("android_strong_password");
    }
}
