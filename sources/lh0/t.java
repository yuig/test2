package lh0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83479a;

    public t(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83479a = experimentsActivator;
    }

    public final boolean a() {
        Intrinsics.checkNotNullParameter("small", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83479a).h("android_grid_inline_actions_phase_1", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "small", false);
        }
        return false;
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83479a).o("hfp_secret_board_tabs_android", group, activate);
    }

    public final boolean c() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83479a;
        return ((g1) z0Var).o("android_grid_inline_actions_phase_1", "enabled", z3Var) || ((g1) z0Var).l("android_grid_inline_actions_phase_1");
    }
}
