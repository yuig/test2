package z01;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import u50.r;
import y01.w0;

/* loaded from: classes5.dex */
public final class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f140579a;

    public o(r rVar) {
        this.f140579a = rVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f140579a.a(new w0(event.f84698i));
    }
}
