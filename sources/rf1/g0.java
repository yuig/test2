package rf1;

import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f107750a;

    public g0(p0 p0Var) {
        this.f107750a = p0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = this.f107750a;
        f30 f30Var = p0Var.Z;
        f30 f30Var2 = null;
        wy0 wy0Var = null;
        if (f30Var != null) {
            boolean z13 = event.f100059a;
            e30 R6 = f30Var.R6();
            boolean z14 = !z13;
            R6.z(Boolean.valueOf(z14));
            wy0 wy0Var2 = R6.H1;
            if (wy0Var2 != null) {
                vy0 H4 = wy0Var2.H4();
                H4.f43100z1 = Boolean.valueOf(z14);
                boolean[] zArr = H4.V1;
                if (zArr.length > 129) {
                    zArr[129] = true;
                }
                wy0Var = H4.a();
            }
            R6.u1(wy0Var);
            f30Var2 = R6.a();
            Intrinsics.checkNotNullExpressionValue(f30Var2, "build(...)");
        }
        p0Var.Z = f30Var2;
    }
}
