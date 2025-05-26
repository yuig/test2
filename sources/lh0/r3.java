package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83470a;

    public r3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83470a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83470a;
        return ((g1) z0Var).o("android_passcode_required_sba", "enabled", z3Var) || ((g1) z0Var).l("android_passcode_required_sba");
    }
}
