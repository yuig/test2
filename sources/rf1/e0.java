package rf1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f107744a;

    public e0(p0 p0Var) {
        this.f107744a = p0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull lf1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = this.f107744a;
        if (p0Var.isBound() && Intrinsics.d(event.f83137a, p0Var.u4())) {
            p0Var.f4("detail_sheet");
        }
    }
}
