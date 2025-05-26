package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83411a;

    public l(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83411a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83411a;
        return ((g1) z0Var).o("android_handshake_remove_cookies", "enabled", z3Var) || ((g1) z0Var).l("android_handshake_remove_cookies");
    }
}
