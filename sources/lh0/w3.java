package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w3 {

    /* renamed from: c, reason: collision with root package name */
    public static w3 f83499c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83501a;

    /* renamed from: b, reason: collision with root package name */
    public static final h3 f83498b = new h3(13, 0);

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f83500d = n2.f83442l;

    public w3(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83501a = experimentsActivator;
        f83499c = this;
    }

    public final boolean a(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83501a).k("sg_android_download_upsell_preview_sharesheet", group, activate);
    }

    public final boolean b(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83501a).k("sg_android_screenshot_upsell_preview_sharesheet", group, activate);
    }

    public final boolean c() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83501a;
        return ((g1) z0Var).o("sg_android_pin_preview_sharesheet", "enabled", z3Var) || ((g1) z0Var).l("sg_android_pin_preview_sharesheet");
    }

    public final boolean d() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83501a;
        return ((g1) z0Var).o("android_preview_sharesheet", "enabled", z3Var) || ((g1) z0Var).l("android_preview_sharesheet");
    }
}
