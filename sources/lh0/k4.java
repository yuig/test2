package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: b, reason: collision with root package name */
    public static final vb0.i f83408b = new vb0.i(22, 0);

    /* renamed from: c, reason: collision with root package name */
    public static Function0 f83409c;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83410a;

    public k4(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83410a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83410a;
        return ((g1) z0Var).o("android_video_organic_trim_dash_manifest", "enabled", z3Var) || ((g1) z0Var).l("android_video_organic_trim_dash_manifest");
    }

    public final boolean b(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83410a).h("android_video_unify_grid_prefetch", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final boolean c(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83410a).h("android_video_reuse", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }
}
