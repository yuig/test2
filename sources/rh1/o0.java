package rh1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f108260a;

    public o0(q0 q0Var) {
        this.f108260a = q0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f108260a.f108271u1 = true;
    }
}
