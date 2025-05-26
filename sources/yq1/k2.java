package yq1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class k2 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f139896a;

    public k2(l2 l2Var) {
        this.f139896a = l2Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ar1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f139896a.G1(event.f20413a, false);
    }
}
