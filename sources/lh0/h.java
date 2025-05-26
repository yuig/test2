package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83376a;

    public h(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83376a = experimentsActivator;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83376a).o("android_pinrep_one_line_title", group, activate);
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83376a;
        return ((g1) z0Var).o("ads_android_brand_name_reorder", "enabled", z3Var) || ((g1) z0Var).l("ads_android_brand_name_reorder");
    }
}
