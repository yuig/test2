package ps0;

import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101291a;

    public p0(r0 r0Var) {
        this.f101291a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.j event) {
        e W3;
        Intrinsics.checkNotNullParameter(event, "event");
        if (d4.FEED != event.f84697j || (W3 = this.f101291a.W3()) == null) {
            return;
        }
        ((HomeFeedFragment) W3).E8(event.f84696i, true);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.v event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f101291a.W3() != null) {
            throw null;
        }
    }
}
