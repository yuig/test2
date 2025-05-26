package w01;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f127055a;

    public k0(m0 m0Var) {
        this.f127055a = m0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m0 m0Var = this.f127055a;
        f30 f30Var = m0Var.f127062b;
        if (Intrinsics.d(f30Var != null ? b40.g(f30Var) : null, event.f100061b)) {
            f30 f30Var2 = m0Var.f127062b;
            if (f30Var2 == null || !Intrinsics.d(f30Var2.Q3(), Boolean.TRUE)) {
                m0.p3(m0Var, event.f100060a);
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m0 m0Var = this.f127055a;
        f30 f30Var = m0Var.f127062b;
        if (Intrinsics.d(f30Var != null ? b40.g(f30Var) : null, event.f100063a)) {
            f30 f30Var2 = m0Var.f127062b;
            if (f30Var2 == null || !Intrinsics.d(f30Var2.Q3(), Boolean.TRUE)) {
                m0Var.t3();
            }
        }
    }
}
