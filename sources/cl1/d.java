package cl1;

import kotlin.jvm.internal.Intrinsics;
import ly.i;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import uj2.v;

/* loaded from: classes5.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v f27988a;

    public d(v observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f27988a = observer;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27988a.c(event);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull py.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27988a.c(event);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ty.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27988a.c(event);
    }
}
