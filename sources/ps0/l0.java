package ps0;

import kotlin.jvm.internal.Intrinsics;
import lq0.g1;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101281a;

    public l0(r0 r0Var) {
        this.f101281a = r0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull z forceLoadMoreDataEvent) {
        Intrinsics.checkNotNullParameter(forceLoadMoreDataEvent, "forceLoadMoreDataEvent");
        this.f101281a.F3();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rg0.i0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        r0 r0Var = this.f101281a;
        hk2.h h10 = r0Var.A.M(event.f108030a).e(wj2.c.a()).h(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(h10, "subscribeOn(...)");
        r0Var.addDisposable(nl.b.o(h10, new g1(15, r0Var, event), is1.v.f73649j));
    }
}
