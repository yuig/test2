package ed0;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f58516a;

    public j(k kVar) {
        this.f58516a = kVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull q e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        int i13 = k.f58517f0;
        this.f58516a.P7();
    }
}
