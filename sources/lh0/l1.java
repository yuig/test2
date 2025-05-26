package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: c, reason: collision with root package name */
    public static l1 f83414c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83416a;

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f83413b = new i1(1, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83415d = n0.f83428k;

    public l1(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83416a = experimentsActivator;
        f83414c = this;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83416a).k("android_curation_brv_tune_constraint_to_trigger_complex_board_picker", group, activate);
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83416a).k("android_grid_overflow_menu_visual_update", group, activate);
    }
}
