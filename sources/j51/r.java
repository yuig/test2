package j51;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class r implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f74768a;

    public r(d0 d0Var) {
        this.f74768a = d0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d0 d0Var = this.f74768a;
        if (d0Var.f76939c) {
            d0Var.f74732l1 = false;
            d0Var.m9().f71578e.e().a(i51.h.f71591a);
        }
    }
}
