package rf1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f107754a;

    public i0(p0 p0Var) {
        this.f107754a = p0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = this.f107754a;
        if (p0Var.f107862r0 <= 0) {
            return;
        }
        long a13 = ((pb0.g) p0Var.f107859q).a() - p0Var.f107862r0;
        p0Var.f107862r0 = 0L;
        nx.d0 pinalytics = p0Var.getPinalytics();
        String str = event.f134109a;
        if (str == null) {
            str = "";
        }
        oe.f.b1(pinalytics, str, a13, p0Var.f107836e0, ((es.c) p0Var.B).g(p0Var.Z), 8);
    }
}
