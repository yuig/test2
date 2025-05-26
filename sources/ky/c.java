package ky;

import ao2.m0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import my.l;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import uj2.v;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v f81116a;

    public c(v observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f81116a = observer;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (m0.f20172b) {
            return;
        }
        this.f81116a.c(Boolean.TRUE);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull my.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f81116a.c(Boolean.TRUE);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!m0.f20172b || m0.f20174d) {
            return;
        }
        this.f81116a.c(Boolean.TRUE);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull py.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f81116a.c(Boolean.TRUE);
    }
}
