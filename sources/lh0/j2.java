package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83397a;

    public j2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83397a = experimentsActivator;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83397a).k("ap_android_nux_hf_use_case_request", group, activate);
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83397a;
        return ((g1) z0Var).o("android_nux_activity_edge_to_edge", "enabled", z3Var) || ((g1) z0Var).l("android_nux_activity_edge_to_edge");
    }
}
