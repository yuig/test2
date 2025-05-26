package rf1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class n0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f107794a;

    public n0(p0 p0Var) {
        this.f107794a = p0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull qf1.n0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f103758a;
        p0 p0Var = this.f107794a;
        if (Intrinsics.d(str, p0Var.u4()) && p0.s3(p0Var) && p0Var.x3() != null) {
            qf1.t state = new qf1.t(event.f103758a);
            Intrinsics.checkNotNullParameter(state, "state");
        }
    }
}
