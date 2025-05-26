package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83348a;

    public g(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83348a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83348a;
        return ((g1) z0Var).o("ads_android_internal_link_support", "enabled", z3Var) || ((g1) z0Var).l("ads_android_internal_link_support");
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83348a;
        return ((g1) z0Var).o("android_full_screen_expand_collections", "enabled", z3Var) || ((g1) z0Var).l("android_full_screen_expand_collections");
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83348a;
        return ((g1) z0Var).o("ads_sponsored_label_cleanup", "enabled", z3Var) || ((g1) z0Var).l("ads_sponsored_label_cleanup");
    }

    public final boolean d() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83348a;
        return ((g1) z0Var).o("android_waista_genai_modified_with_ai", "enabled", z3Var) || ((g1) z0Var).l("android_waista_genai_modified_with_ai");
    }

    public final boolean e() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83348a;
        return ((g1) z0Var).o("android_ads_mdl_collections", "enabled", z3Var) || ((g1) z0Var).l("android_ads_mdl_collections");
    }

    public final boolean f() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83348a;
        return ((g1) z0Var).o("android_collection_ads_click_analytics", "enabled", z3Var) || ((g1) z0Var).l("android_collection_ads_click_analytics");
    }

    public final boolean g() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83348a;
        return ((g1) z0Var).o("android_pintag_decan_v2", "enabled", z3Var) || ((g1) z0Var).l("android_pintag_decan_v2");
    }
}
