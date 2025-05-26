package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83482a;

    public t2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83482a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83482a;
        return ((g1) z0Var).o("android_cx_ds_migration", "enabled", z3Var) || ((g1) z0Var).l("android_cx_ds_migration");
    }
}
