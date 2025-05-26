package lq0;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class p1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f84405a;

    public p1(r1 r1Var) {
        this.f84405a = r1Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f80540a != null) {
            int i13 = r1.f84415d1;
            this.f84405a.getClass();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(kp.j jVar) {
        this.f84405a.f7().j(this);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(pg0.h0 h0Var) {
        int i13 = r1.f84415d1;
        this.f84405a.getClass();
    }
}
