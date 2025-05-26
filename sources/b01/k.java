package b01;

import h32.f1;
import is1.w;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f20743a;

    public k(l lVar) {
        this.f20743a = lVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        l lVar = this.f20743a;
        lVar.f20760p1.getClass();
        if (rw0.f.h().containsKey(event.f73653b)) {
            return;
        }
        lVar.f20760p1.getClass();
        rw0.f.b(event.f73653b);
        c0.d.u2(lVar.s7(), f1.PEAR_SCREENSHOT, null, null, null, 14);
    }
}
