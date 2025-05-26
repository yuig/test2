package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83517a;

    public z(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83517a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83517a;
        return ((g1) z0Var).o("android_closeup_enlarge_ctas", "enabled", z3Var) || ((g1) z0Var).l("android_closeup_enlarge_ctas");
    }
}
