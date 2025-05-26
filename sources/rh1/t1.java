package rh1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1 f108292a;

    public t1(v1 v1Var) {
        this.f108292a = v1Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull d0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f108128a;
        v1 v1Var = this.f108292a;
        v1Var.Q0 = str;
        String str2 = event.f108129b;
        com.pinterest.feature.unifiedcomments.g.u4(v1Var, true, null, str2, 2);
        v1Var.P0 = str2;
    }
}
