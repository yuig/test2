package ug1;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f122167a;

    public f(g gVar) {
        this.f122167a = gVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull tg1.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event.f117579a;
        g gVar = this.f122167a;
        if (!z13) {
            ((tg1.j) gVar.getView()).V4();
        }
        ((tg1.j) gVar.getView()).l6(4000L, true);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull tg1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((tg1.j) this.f122167a.getView()).l6(4000L, false);
    }
}
