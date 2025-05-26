package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83299a;

    public b(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83299a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83299a;
        return ((g1) z0Var).o("android_disable_bridge", "enabled", z3Var) || ((g1) z0Var).l("android_disable_bridge");
    }
}
