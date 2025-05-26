package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83457a;

    public p2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83457a = experimentsActivator;
    }

    public final void a() {
        ((g1) this.f83457a).c("android_organic_carousel_simplification");
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83457a).k("android_organic_carousel_simplification", group, activate);
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83457a;
        return ((g1) z0Var).o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || ((g1) z0Var).l("android_ads_mrc_btr_1px1s");
    }

    public final boolean d() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83457a;
        return ((g1) z0Var).o("android_ad_mrc_btr_closeup_pin_impression_gate", "enabled", z3Var) || ((g1) z0Var).l("android_ad_mrc_btr_closeup_pin_impression_gate");
    }

    public final boolean e() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83457a;
        return ((g1) z0Var).o("android_catalog_carousel_index_animation", "enabled", z3Var) || ((g1) z0Var).l("android_catalog_carousel_index_animation");
    }
}
