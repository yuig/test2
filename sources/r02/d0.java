package r02;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f105726a;

    public d0(e0 e0Var) {
        this.f105726a = e0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event instanceof v;
        e0 e0Var = this.f105726a;
        if (!z13) {
            if (event instanceof u) {
                int i13 = e0.P0;
                e0Var.c9(false);
                return;
            }
            return;
        }
        String str = ((v) event).f105823a;
        if (str != null) {
            int i14 = e0.P0;
            kh2.j.x2(e0Var.b9(), new p02.l(str, e0Var.d9()));
        }
    }
}
