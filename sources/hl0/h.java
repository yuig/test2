package hl0;

import df.j1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f69464a;

    public h(v vVar) {
        this.f69464a = vVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull com.pinterest.feature.board.organize.d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        v vVar = this.f69464a;
        vVar.P.i(e13);
        vVar.G.u(jl0.d.ORGANIZE);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84700a;
        v vVar = this.f69464a;
        if (Intrinsics.d(str, vVar.f69509a) || !j1.U0(event.f84701b)) {
            vVar.P.i(event);
            vVar.G.s();
            vVar.N3();
        }
    }
}
