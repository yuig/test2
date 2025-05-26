package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o4 {

    /* renamed from: c, reason: collision with root package name */
    public static o4 f83451c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83453a;

    /* renamed from: b, reason: collision with root package name */
    public static final h3 f83450b = new h3(23, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83452d = b4.f83304k;

    public o4(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83453a = experimentsActivator;
        f83451c = this;
    }

    public final void a() {
        ((g1) this.f83453a).c("android_new_lens_permissions");
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83453a;
        return ((g1) z0Var).o("android_flashlight_prefetching", "enabled", z3Var) || ((g1) z0Var).l("android_flashlight_prefetching");
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83453a;
        return ((g1) z0Var).o("android_p2z_unified_feed", "enabled", z3Var) || ((g1) z0Var).l("android_p2z_unified_feed");
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83453a;
        return ((g1) z0Var).o("android_pin_level_landing_feed", "enabled", z3Var) || ((g1) z0Var).l("android_pin_level_landing_feed");
    }

    public final boolean e() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83453a;
        return ((g1) z0Var).o("android_pin_level_landing_feed", "enabled", z3Var) || ((g1) z0Var).l("android_pin_level_landing_feed");
    }

    public final boolean f() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83453a;
        return ((g1) z0Var).o("android_visual_search_image_interactions", "enabled", z3Var) || ((g1) z0Var).l("android_visual_search_image_interactions");
    }
}
