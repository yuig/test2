package tq;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f118891a;

    public m(n nVar) {
        this.f118891a = nVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l01.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f81297a;
        n nVar = this.f118891a;
        f30 pin = nVar.getPin();
        if (Intrinsics.d(str, pin != null ? pin.getUid() : null)) {
            nVar.openPinOverflowMenuModal(false);
        }
    }
}
