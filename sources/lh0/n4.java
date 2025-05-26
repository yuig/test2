package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83445a;

    public n4(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83445a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83445a;
        return ((g1) z0Var).o("hfp_android_structured_feed_container_refactor", "enabled", z3Var) || ((g1) z0Var).l("hfp_android_structured_feed_container_refactor");
    }
}
