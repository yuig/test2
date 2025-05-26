package wt;

import h32.f1;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import nx.d0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import vu.l;
import vu.n;
import vu.o;

/* loaded from: classes3.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f131083a;

    public b(f fVar) {
        this.f131083a = fVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f131083a.I = e13.f126651a;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        d0.B(this.f131083a.getPinalytics(), f1.TAP, g0.PIN_CLOSEUP_PRODUCT_DETAILS, null, null, 28);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull o e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        d0 pinalytics = this.f131083a.getPinalytics();
        f1 f1Var = f1.PIN_CLICK;
        g0 g0Var = g0.PIN_CLOSEUP_TITLE;
        d0.B(pinalytics, f1Var, g0Var, null, null, 28);
        d0.B(pinalytics, f1.PIN_CLICKTHROUGH, g0Var, null, null, 28);
    }
}
