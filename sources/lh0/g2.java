package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: c, reason: collision with root package name */
    public static g2 f83371c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83373a;

    /* renamed from: b, reason: collision with root package name */
    public static final vb0.i f83370b = new vb0.i(17, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83372d = a.f83290o;

    public g2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83373a = experimentsActivator;
        f83371c = this;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83373a).o("hfp_gen_ai_topics_opt_out_android", group, activate);
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83373a).k("search_android_universal_authority", group, activate);
    }

    public final boolean c(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83373a).k("android_pintag_decan_v2", group, activate);
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83373a;
        return ((g1) z0Var).o("android_curated_articles_to_board_shift", "enabled", z3Var) || ((g1) z0Var).l("android_curated_articles_to_board_shift");
    }

    public final boolean e() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83373a;
        return ((g1) z0Var).o("android_product_tag_api_migration", "enabled", z3Var) || ((g1) z0Var).l("android_product_tag_api_migration");
    }

    public final boolean f(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83373a).o("android_search_hybrid_v2", group, activate);
    }

    public final boolean g(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83373a).o("slp_featured_boards_module_experiment", group, activate);
    }
}
