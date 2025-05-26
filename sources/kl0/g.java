package kl0;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f80085a;

    public g(z zVar) {
        this.f80085a = zVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.q event) {
        rk0.j jVar;
        Intrinsics.checkNotNullParameter(event, "event");
        z zVar = this.f80085a;
        lh0.r q93 = zVar.q9();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) q93.f83466a;
        if ((g1Var.o("visual_search_in_long_press_android", "enabled", z3Var) || g1Var.l("visual_search_in_long_press_android")) && (jVar = zVar.B1) != null) {
            xj2.c cVar = jVar.f108452l;
            if (cVar != null) {
                cVar.dispose();
            }
            jVar.c(false);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull m10.a event) {
        rk0.j jVar;
        Intrinsics.checkNotNullParameter(event, "event");
        z zVar = this.f80085a;
        lh0.r q93 = zVar.q9();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) q93.f83466a;
        if ((g1Var.o("visual_search_in_long_press_android", "enabled", z3Var) || g1Var.l("visual_search_in_long_press_android")) && (jVar = zVar.B1) != null) {
            jVar.c(true);
        }
    }
}
