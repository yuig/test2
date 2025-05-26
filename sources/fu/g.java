package fu;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f62947a;

    public g(h hVar) {
        this.f62947a = hVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dc2.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        h.i8(this.f62947a, true);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dc2.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        h.i8(this.f62947a, false);
    }
}
