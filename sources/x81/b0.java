package x81;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f134168a;

    public b0(f0 f0Var) {
        this.f134168a = f0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.d pinCellTappedEvent) {
        Intrinsics.checkNotNullParameter(pinCellTappedEvent, "pinCellTappedEvent");
        this.f134168a.V1 = true;
    }
}
