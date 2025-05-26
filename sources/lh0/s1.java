package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: c, reason: collision with root package name */
    public static s1 f83474c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83476a;

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f83473b = new i1(4, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83475d = n0.f83431n;

    public s1(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83476a = experimentsActivator;
        f83474c = this;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83476a).k("disable_pin_creation", group, activate);
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83476a;
        return ((g1) z0Var).o("android_idea_pin_create_camera_x", "enabled", z3Var) || ((g1) z0Var).l("android_idea_pin_create_camera_x");
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83476a;
        return ((g1) z0Var).o("android_ip_overlay_transitions", "enabled", z3Var) || ((g1) z0Var).l("android_ip_overlay_transitions");
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83476a;
        return ((g1) z0Var).o("android_paid_partnership_ui_improvements", "enabled", z3Var) || ((g1) z0Var).l("android_paid_partnership_ui_improvements");
    }

    public final boolean e() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83476a;
        return ((g1) z0Var).o("android_product_tag_api_migration", "enabled", z3Var) || ((g1) z0Var).l("android_product_tag_api_migration");
    }

    public final boolean f() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83476a;
        return ((g1) z0Var).o("android_story_pin_speed_control", "enabled", z3Var) || ((g1) z0Var).l("android_story_pin_speed_control");
    }
}
