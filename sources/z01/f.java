package z01;

import is1.w;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import u50.r;
import y01.s0;

/* loaded from: classes5.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f140545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f140546b;

    public f(k kVar, r rVar) {
        this.f140545a = kVar;
        this.f140546b = rVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((rw0.f) this.f140545a.f140563b).getClass();
        this.f140546b.a(new s0(event.f73652a, rw0.f.h().containsKey(event.f73653b)));
    }
}
