package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83468a;

    public r1(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83468a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83468a;
        return ((g1) z0Var).o("uup_dsa_launch_android", "enabled", z3Var) || ((g1) z0Var).l("uup_dsa_launch_android");
    }
}
