package rq;

import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCloseupLegoActionButtonModule f109424a;

    public o1(PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule) {
        this.f109424a = pinCloseupLegoActionButtonModule;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84723a;
        f30 pin = this.f109424a.getPin();
        if (!Intrinsics.d(str, pin != null ? pin.getUid() : null) || event.f84724b) {
            return;
        }
        event.f84724b = true;
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = this.f109424a;
        PinCloseupBaseModule.handleWebsiteClicked$default(pinCloseupLegoActionButtonModule, pinCloseupLegoActionButtonModule.f35031v, null, null, 6, null);
    }
}
