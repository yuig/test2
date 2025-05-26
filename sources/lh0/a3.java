package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83296a;

    public a3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83296a = experimentsActivator;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83296a).k("android_curation_brv_tune_constraint_to_trigger_complex_board_picker", group, activate);
    }
}
