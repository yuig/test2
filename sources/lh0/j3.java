package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83398a;

    public j3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83398a = experimentsActivator;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83398a).k("android_search_autocomplete_rs_cover_image", group, activate);
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83398a).k("android_search_autocomplete_visual_treatment", group, activate);
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83398a;
        return ((g1) z0Var).o("android_autocomplete_remove_syp", "enabled", z3Var) || ((g1) z0Var).l("android_autocomplete_remove_syp");
    }

    public final boolean d() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83398a;
        return ((g1) z0Var).o("mobile_search_autocomplete_empty_state", "enabled", z3Var) || ((g1) z0Var).l("mobile_search_autocomplete_empty_state");
    }
}
