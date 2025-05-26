package ky;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import uj2.v;

/* loaded from: classes3.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v f81118a;

    public j(v observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f81118a = observer;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f81118a.c(Boolean.TRUE);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull py.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f81118a.c(Boolean.TRUE);
    }
}
