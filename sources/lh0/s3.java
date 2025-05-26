package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83478a;

    public s3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83478a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83478a;
        return ((g1) z0Var).o("sg_android_share_cta_on_profile_updated_toast", "enabled", z3Var) || ((g1) z0Var).l("sg_android_share_cta_on_profile_updated_toast");
    }
}
