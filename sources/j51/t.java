package j51;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f74771a;

    public t(d0 d0Var) {
        this.f74771a = d0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull q70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = d0.f74720s1;
        d0 d0Var = this.f74771a;
        if (d0Var.q9() && d0Var.f74730j1 != null && d0Var.f76939c) {
            d0Var.m9().f71578e.e().a(i51.j.f71593a);
        }
    }
}
