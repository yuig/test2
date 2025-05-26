package z01;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import u50.r;
import y01.u0;

/* loaded from: classes5.dex */
public final class n implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f140578a;

    public n(r rVar) {
        this.f140578a = rVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jy.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f140578a.a(u0.f136497a);
    }
}
