package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83399a;

    public j4(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83399a = experimentsActivator;
    }

    public final boolean a(z3 activate) {
        Intrinsics.checkNotNullParameter("enabled_default_newest", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83399a).o("android_comment_sort_option", "enabled_default_newest", activate);
    }

    public final boolean b() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83399a;
        return ((g1) z0Var).o("ce_android_comment_composer_redesign", "enabled", z3Var) || ((g1) z0Var).l("ce_android_comment_composer_redesign");
    }

    public final boolean c() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83399a;
        return ((g1) z0Var).o("android_comment_sort_option", "enabled", z3Var) || ((g1) z0Var).l("android_comment_sort_option");
    }
}
