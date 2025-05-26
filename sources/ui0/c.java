package ui0;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import rg0.n;

/* loaded from: classes5.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f122258a;

    public c(e eVar) {
        this.f122258a = eVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = b.f122257a[event.f54926a.ordinal()];
        e eVar = this.f122258a;
        if (i13 == 1) {
            n nVar = eVar.J0;
            if (nVar != null) {
                nVar.c(null, null);
            }
            eVar.J0 = null;
            return;
        }
        if (i13 != 2) {
            return;
        }
        n nVar2 = eVar.J0;
        if (nVar2 != null) {
            nVar2.a(null, null);
        }
        eVar.J0 = null;
    }
}
