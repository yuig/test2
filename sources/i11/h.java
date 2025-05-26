package i11;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f70974a;

    public h(m mVar) {
        this.f70974a = mVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull gy.a e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (e13.f66309c != s92.o.COMPLETE) {
            this.f70974a.f71008j0 = true;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull gy.e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f70974a.f71008j0 = true;
    }
}
