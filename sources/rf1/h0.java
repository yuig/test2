package rf1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f107752a;

    public h0(p0 p0Var) {
        this.f107752a = p0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f107752a.I0 = true;
    }
}
