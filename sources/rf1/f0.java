package rf1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f107747a;

    public f0(p0 p0Var) {
        this.f107747a = p0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull lf1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = this.f107747a;
        if (p0Var.isBound() && Intrinsics.d(event.f83138a, p0Var.u4())) {
            wy0 wy0Var = event.f83139b;
            p0Var.D4(wy0Var);
            p0Var.l4(qf1.b.f103642a, wy0Var);
        }
    }
}
