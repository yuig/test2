package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83396a;

    public j1(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83396a = experimentsActivator;
    }

    public final boolean a(z3 activate) {
        Intrinsics.checkNotNullParameter("enabled_spinner_optimized", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83396a).k("android_gestalt_theme_vr_tier_two", "enabled_spinner_optimized", activate);
    }
}
