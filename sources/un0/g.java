package un0;

import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import ls1.n;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f122831a;

    public g(h hVar) {
        this.f122831a = hVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull com.pinterest.feature.board.organize.d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        h hVar = this.f122831a;
        hVar.F.i(e13);
        hVar.f122856x.u(jl0.d.ORGANIZE);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kn0.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        h hVar = this.f122831a;
        hVar.H = false;
        if (k3.B1(event, hVar.f122833a, hVar.f122834b)) {
            hVar.f122856x.s();
            hVar.onRecyclerRefresh();
        }
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84700a;
        h hVar = this.f122831a;
        if (!Intrinsics.d(str, hVar.f122833a)) {
            if (!Intrinsics.d(event.f84701b, hVar.f122834b)) {
                return;
            }
        }
        hVar.F.i(event);
        hVar.f122856x.s();
        hVar.onRecyclerRefresh();
    }
}
