package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83346a;

    public f3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83346a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83346a;
        return ((g1) z0Var).o("android_vc_search", "enabled", z3Var) || ((g1) z0Var).l("android_vc_search");
    }

    public final boolean b() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83346a;
        return ((g1) z0Var).o("android_vc_search_gestalt", "enabled", z3Var) || ((g1) z0Var).l("android_vc_search_gestalt");
    }

    public final boolean c() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83346a;
        return ((g1) z0Var).o("android_vc_search_gestalt", "enabled", z3Var) || ((g1) z0Var).l("android_vc_search_gestalt");
    }
}
