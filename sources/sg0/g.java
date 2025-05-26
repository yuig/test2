package sg0;

import kotlin.jvm.internal.Intrinsics;
import ls1.h;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import rg0.i0;
import sp2.k;
import uj2.r;

/* loaded from: classes5.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f112869a;

    public g(fk2.f fVar) {
        this.f112869a = fVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jo1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((fk2.f) this.f112869a).c(new b(event));
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull lq.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((fk2.f) this.f112869a).c(new c(event));
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((fk2.f) this.f112869a).c(new a(event));
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((fk2.f) this.f112869a).c(new d(event));
    }
}
