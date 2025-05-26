package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static j f83392c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83394a;

    /* renamed from: b, reason: collision with root package name */
    public static final vb0.e f83391b = new vb0.e(7, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83393d = a.f83286k;

    public j(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83394a = experimentsActivator;
        f83392c = this;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83394a;
        return ((g1) z0Var).o("android_3p_audio_control_on_grid", "enabled", z3Var) || ((g1) z0Var).l("android_3p_audio_control_on_grid");
    }

    public final boolean b() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83394a;
        return ((g1) z0Var).o("android_video_in_carousel", "enabled", z3Var) || ((g1) z0Var).l("android_video_in_carousel");
    }

    public final boolean c() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83394a;
        return ((g1) z0Var).o("android_dco_cpd", "enabled", z3Var) || ((g1) z0Var).l("android_dco_cpd");
    }

    public final boolean d() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83394a;
        return ((g1) z0Var).o("android_pintag_decan_v2", "enabled", z3Var) || ((g1) z0Var).l("android_pintag_decan_v2");
    }
}
