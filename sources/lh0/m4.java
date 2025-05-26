package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83425a;

    public m4(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83425a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83425a;
        return ((g1) z0Var).o("android_premiere_video_quality", "enabled", z3Var) || ((g1) z0Var).l("android_premiere_video_quality");
    }
}
