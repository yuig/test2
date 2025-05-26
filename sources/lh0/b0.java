package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83300a;

    public b0(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83300a = experimentsActivator;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83300a).o("android_ctx_customized_icon_animation", group, activate);
    }

    public final boolean b() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83300a;
        return ((g1) z0Var).o("android_visual_closeup_entry_point", "enabled", z3Var) || ((g1) z0Var).l("android_visual_closeup_entry_point");
    }
}
