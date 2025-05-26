package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83385a;

    public i(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83385a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83385a;
        return ((g1) z0Var).o("android_ad_gma_new", "enabled", z3Var) || ((g1) z0Var).l("android_ad_gma_new");
    }
}
