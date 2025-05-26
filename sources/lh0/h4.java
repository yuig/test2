package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83384a;

    public h4(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83384a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83384a;
        return ((g1) z0Var).o("android_board_rep_view_creation", "enabled", z3Var) || ((g1) z0Var).l("android_board_rep_view_creation");
    }
}
