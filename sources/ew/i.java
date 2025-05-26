package ew;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import m60.u;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f60314a;

    public i(j jVar) {
        this.f60314a = jVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        j jVar = this.f60314a;
        jVar.getClass();
        u.f85943a.d(new z.a("[QueryInfo] QueryInfo consumed", 12));
        if (jVar.f60318d.f66200d) {
            ((lw.c) jVar.f60326l).b(true);
        }
    }
}
