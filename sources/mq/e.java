package mq;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f87970a;

    public e(u uVar) {
        this.f87970a = uVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jy.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = u.P0;
        this.f87970a.k8();
    }
}
