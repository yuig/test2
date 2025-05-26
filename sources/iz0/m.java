package iz0;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f73928a;

    public m(n nVar) {
        this.f73928a = nVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull is1.w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        n nVar = this.f73928a;
        nVar.N0.getClass();
        if (rw0.f.h().containsKey(event.f73653b)) {
            return;
        }
        nVar.N0.getClass();
        rw0.f.b(event.f73653b);
        c0.d.u2(nVar.s7(), f1.PEAR_SCREENSHOT, null, null, null, 14);
    }
}
