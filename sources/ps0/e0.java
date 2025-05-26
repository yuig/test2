package ps0;

import ey.f5;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101251a;

    public e0(r0 r0Var) {
        this.f101251a = r0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull f5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f101251a.V = event.f60486d;
    }
}
