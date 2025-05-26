package hl0;

import com.pinterest.api.model.ld0;
import com.pinterest.api.model.md0;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f69463a;

    public g(v vVar) {
        this.f69463a = vVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ld0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f39721a;
        v vVar = this.f69463a;
        if (Intrinsics.d(str, vVar.f69509a)) {
            vVar.I3();
            vVar.onRecyclerRefresh();
            vVar.J3();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull md0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f69463a.N3();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kn0.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        v vVar = this.f69463a;
        if (k3.B1(event, vVar.f69509a, null)) {
            vVar.N3();
        }
    }
}
