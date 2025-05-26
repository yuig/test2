package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h2 {

    /* renamed from: c, reason: collision with root package name */
    public static h2 f83380c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83382a;

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f83379b = new i1(12, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83381d = n0.f83434q;

    public h2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83382a = experimentsActivator;
        f83380c = this;
    }

    public final void a() {
        ((g1) this.f83382a).c("uup_dsa_launch_android");
    }

    public final boolean b() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83382a;
        return ((g1) z0Var).o("android_notification_deeplink_handle_tab", "enabled", z3Var) || ((g1) z0Var).l("android_notification_deeplink_handle_tab");
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83382a;
        return ((g1) z0Var).o("android_unified_inbox", "enabled", z3Var) || ((g1) z0Var).l("android_unified_inbox");
    }

    public final boolean d() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83382a;
        return ((g1) z0Var).o("android_unified_inbox", "enabled", z3Var) || ((g1) z0Var).l("android_unified_inbox");
    }
}
