package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83338a;

    public e3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83338a = experimentsActivator;
    }

    public final boolean a(z3 activate) {
        Intrinsics.checkNotNullParameter("enabled_2tap", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83338a).k("android_search_nux_1tap_autocomplete", "enabled_2tap", activate);
    }
}
