package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83301a;

    public b2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83301a = experimentsActivator;
    }

    public final void a() {
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) this.f83301a;
        if (g1Var.o("android_search_nux_1tap_autocomplete", "enabled", z3Var)) {
            return;
        }
        g1Var.l("android_search_nux_1tap_autocomplete");
    }
}
