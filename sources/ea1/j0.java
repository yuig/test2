package ea1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f58067a;

    public j0(v0 v0Var) {
        this.f58067a = v0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.v event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = v0.F0;
        kh2.j.x2(this.f58067a.b8(), y.f58170a);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.y event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = v0.F0;
        kh2.j.x2(this.f58067a.b8(), o.f58090a);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        v0 v0Var = this.f58067a;
        if (v0Var.f76939c) {
            if (event.f57894b) {
                String str = event.f57895c;
                if (str == null) {
                    str = v0Var.requireContext().getString(m60.x0.generic_error);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                }
                if (v0Var.isResumed()) {
                    kh2.j.x2(v0Var.b8(), new r(str));
                } else {
                    v0Var.C0 = str;
                }
            }
            int i13 = v0.F0;
            kh2.j.x2(v0Var.b8(), new v(event.f57893a));
            v0Var.f7().f(new e82.x());
            if (event.f57896d != null) {
                kh2.j.x2(v0Var.b8(), new w(event));
            }
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp1.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        v0 v0Var = this.f58067a;
        v0Var.f7().i(event);
        kh2.j.x2(v0Var.b8(), new l(event.f80578a, event.f80579b));
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        v0 v0Var = this.f58067a;
        v0Var.f7().i(event);
        kh2.j.x2(v0Var.b8(), new l(event.f80580a, null));
    }
}
