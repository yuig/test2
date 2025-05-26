package na0;

import kotlin.jvm.internal.Intrinsics;
import la0.p;
import m60.t;
import o82.d0;
import o82.f0;
import o82.l1;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import u50.r;
import y42.i;

/* loaded from: classes5.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f90090a;

    public d(r rVar) {
        this.f90090a = rVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ma0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f90090a.a(new p(new f0(0, new l1(event.f86765a))));
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull y42.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f90090a.a(new p(d0.f93560a));
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f90090a.a(new p(d0.f93560a));
    }
}
