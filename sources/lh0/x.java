package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83502a;

    public x(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83502a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83502a;
        return ((g1) z0Var).o("android_sharing_on_shopping_spotlight", "enabled", z3Var) || ((g1) z0Var).l("android_sharing_on_shopping_spotlight");
    }
}
