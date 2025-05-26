package rf1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f107753a;

    public i(p pVar) {
        this.f107753a = pVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p pVar = this.f107753a;
        if (pVar.f107822t <= 0) {
            return;
        }
        long a13 = ((pb0.g) pVar.f107813k).a() - pVar.f107822t;
        pVar.f107822t = 0L;
        nx.d0 pinalytics = pVar.getPinalytics();
        String str = event.f134109a;
        if (str == null) {
            str = "";
        }
        oe.f.b1(pinalytics, str, a13, 0, null, 28);
    }
}
