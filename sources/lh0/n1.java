package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: c, reason: collision with root package name */
    public static n1 f83437c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83439a;

    /* renamed from: b, reason: collision with root package name */
    public static final vb0.i f83436b = new vb0.i(12, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83438d = a.f83287l;

    public n1(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83439a = experimentsActivator;
        f83437c = this;
    }

    public final boolean a(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83439a).h("android_measure_feed_image_load_in_image_base_classes_cleanup", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final boolean b(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83439a).h("android_cronet_context_logging", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final boolean c() {
        Intrinsics.checkNotNullParameter("playservicecronetprovider", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83439a).h("android_cronet_embedded", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "playservicecronetprovider", false);
        }
        return false;
    }

    public final boolean d() {
        Intrinsics.checkNotNullParameter("disable_bugsnag", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83439a).h("android_handled_exception_gate", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "disable_bugsnag", false);
        }
        return false;
    }

    public final boolean e() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83439a;
        return ((g1) z0Var).o("android_cronet_kill_switch", "enabled", z3Var) || ((g1) z0Var).l("android_cronet_kill_switch");
    }

    public final boolean f() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83439a;
        return ((g1) z0Var).o("android_ctx_long_press_cleanup_animation", "enabled", z3Var) || ((g1) z0Var).l("android_ctx_long_press_cleanup_animation");
    }

    public final boolean g() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83439a;
        return ((g1) z0Var).o("android_kibana_custom_events", "enabled", z3Var) || ((g1) z0Var).l("android_kibana_custom_events");
    }

    public final boolean h() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83439a;
        return ((g1) z0Var).o("android_network_client_async_init", "enabled", z3Var) || ((g1) z0Var).l("android_network_client_async_init");
    }

    public final boolean i() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83439a;
        return ((g1) z0Var).o("android_pgc_render_collage", "enabled", z3Var) || ((g1) z0Var).l("android_pgc_render_collage");
    }

    public final boolean j() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83439a;
        return ((g1) z0Var).o("android_product_tag_api_migration", "enabled", z3Var) || ((g1) z0Var).l("android_product_tag_api_migration");
    }

    public final boolean k() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83439a;
        return ((g1) z0Var).o("android_slp_image_only_premiere", "enabled", z3Var) || ((g1) z0Var).l("android_slp_image_only_premiere");
    }

    public final boolean l(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83439a).h("android_network_client_async_init", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }
}
