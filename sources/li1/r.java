package li1;

import ao2.j0;
import com.pinterest.api.model.wy0;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import zy.l0;

/* loaded from: classes5.dex */
public final class r implements l82.i {

    /* renamed from: a, reason: collision with root package name */
    public final y f83581a;

    public r(String pinUid, j0 scope, d4 d4Var, a4 a4Var, b60.b activeUserManager, m weightLossOptOutSEP) {
        Boolean F4;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(weightLossOptOutSEP, "weightLossOptOutSEP");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(24, "stateTransformer");
        wy0 f13 = ((b60.d) activeUserManager).f();
        this.f83581a = a0.b(a0Var, new q(pinUid, ((f13 == null || (F4 = f13.F4()) == null) ? Boolean.FALSE : F4).booleanValue(), new l0(new i0(d4Var, a4Var, null, g0.PIN_AD_WL_CONTROL_MODAL, null, u0.WL_CONTROL_SEE_LESS), 2)), new bi1.a0(weightLossOptOutSEP, 4), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f83581a.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f83581a.e();
    }
}
