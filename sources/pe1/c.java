package pe1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f99937a;

    public c(d dVar) {
        this.f99937a = dVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull te1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d dVar = this.f99937a;
        dVar.f7().i(event);
        boolean z13 = event.f117500a;
        if (!z13) {
            if (dVar.C1 != i.RESTORED) {
                dVar.J9();
            }
        } else if (z13) {
            i iVar = dVar.C1;
            i iVar2 = i.TRANSPARENT;
            if (iVar == iVar2 || dVar.B1 != iVar2) {
                return;
            }
            dVar.H9();
        }
    }
}
