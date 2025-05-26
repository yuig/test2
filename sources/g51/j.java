package g51;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f63614a;

    public j(n nVar) {
        this.f63614a = nVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f63614a.N3();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f63614a.onRecyclerRefresh();
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        n nVar = this.f63614a;
        nVar.f63634n.i(new pg0.b());
        nVar.onRecyclerRefresh();
    }
}
