package rq;

import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCloseupLegoActionButtonModule f109459a;

    public p1(PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule) {
        this.f109459a = pinCloseupLegoActionButtonModule;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = this.f109459a;
        if (pinCloseupLegoActionButtonModule.E <= 0) {
            return;
        }
        wk2.a aVar = pinCloseupLegoActionButtonModule.f35015f;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        long a13 = ((pb0.g) ((pb0.a) aVar.get())).a() - pinCloseupLegoActionButtonModule.E;
        pinCloseupLegoActionButtonModule.E = 0L;
        nx.d0 viewPinalytics = pinCloseupLegoActionButtonModule.getViewPinalytics();
        if (viewPinalytics != null) {
            h32.f1 f1Var = h32.f1.PIN_IAB_DURATION;
            String str = event.f134109a;
            h32.v0 v0Var = new h32.v0();
            v0Var.C = Long.valueOf(a13);
            viewPinalytics.H(f1Var, str, null, null, v0Var, false);
        }
    }
}
