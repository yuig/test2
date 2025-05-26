package ps0;

import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101257a;

    public f0(r0 r0Var) {
        this.f101257a = r0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.o startLibraryEvent) {
        Intrinsics.checkNotNullParameter(startLibraryEvent, "startLibraryEvent");
        r0 r0Var = this.f101257a;
        b60.b bVar = r0Var.f101295J;
        if (((b60.d) bVar).i()) {
            r0Var.getPinalytics().F(h32.g0.NAVIGATION, u0.PROFILE_BUTTON);
            if (r0Var.W3() != null) {
                String userId = com.bumptech.glide.d.Q(bVar).getUid();
                Intrinsics.checkNotNullExpressionValue(userId, "getUid(...)");
                Intrinsics.checkNotNullParameter(userId, "userId");
                r41.k.f106176a.d(userId, r41.b.HomeFeed);
            }
        }
    }
}
