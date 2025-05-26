package mq;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f87977a;

    public g(u uVar) {
        this.f87977a = uVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = f.f87973a[event.f84698i.ordinal()];
        u uVar = this.f87977a;
        if (i13 == 1) {
            int i14 = u.P0;
            b20.c cVar = uVar.X;
            if (cVar == null) {
                return;
            }
            cVar.x(true);
            return;
        }
        if (i13 != 2) {
            return;
        }
        int i15 = u.P0;
        b20.c cVar2 = uVar.X;
        if (cVar2 == null) {
            return;
        }
        cVar2.x(false);
    }
}
