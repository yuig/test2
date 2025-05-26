package rf1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f107742a;

    public d0(p0 p0Var) {
        this.f107742a = p0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull lf1.b event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = this.f107742a;
        if (p0Var.isBound() && Intrinsics.d(event.f83135a, p0Var.u4())) {
            f30 f30Var = p0Var.Z;
            if (f30Var == null || f30Var.u6() == null) {
                unit = null;
            } else {
                String a13 = qf1.p.a(p0Var.Z);
                wy0 wy0Var = event.f83136b;
                String uid = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                p0Var.l4(new qf1.d(a13, uid, lf1.a.f83132f), wy0Var);
                unit = Unit.f80348a;
            }
            if (unit == null) {
                p0Var.l4(qf1.a.f103640a, null);
            }
        }
    }
}
