package b11;

import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import h32.f1;
import h32.v0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedPinActionBarView f21085a;

    public t0(UnifiedPinActionBarView unifiedPinActionBarView) {
        this.f21085a = unifiedPinActionBarView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        UnifiedPinActionBarView unifiedPinActionBarView = this.f21085a;
        if (unifiedPinActionBarView.f47052s <= 0) {
            return;
        }
        wk2.a aVar = unifiedPinActionBarView.C;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        long a13 = ((pb0.g) ((pb0.a) aVar.get())).a() - unifiedPinActionBarView.f47052s;
        unifiedPinActionBarView.f47052s = 0L;
        nx.d0 d0Var = unifiedPinActionBarView.f47037d;
        if (d0Var != null) {
            f1 f1Var = f1.PIN_IAB_DURATION;
            String str = event.f134109a;
            v0 v0Var = new v0();
            v0Var.C = Long.valueOf(a13);
            d0Var.H(f1Var, str, null, null, v0Var, false);
        }
    }
}
