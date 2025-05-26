package rf1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f107757a;

    public j0(p0 p0Var) {
        this.f107757a = p0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull defpackage.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = this.f107757a;
        if (p0Var.isBound()) {
            p0Var.f107870v0 = s.DO_NOT_RESTART;
        }
    }
}
