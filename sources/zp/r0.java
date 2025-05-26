package zp;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f142479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f30 f142480b;

    public r0(w0 w0Var, f30 f30Var) {
        this.f142479a = w0Var;
        this.f142480b = f30Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull f11.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        w0 w0Var = this.f142479a;
        w0Var.getEventManager().i(event);
        String str = event.f60780a;
        db.m mVar = new db.m(w0Var, 9);
        boolean d2 = Intrinsics.d(str, w0Var.f142544j0);
        boolean d13 = Intrinsics.d(str, w0Var.f142552n0);
        if (d2 && d13) {
            return;
        }
        w0Var.t0().P(str).F(new n0(1, new e.f(w0Var, str, mVar, 18)), new n0(2, u.f142499m), ck2.i.f27923c, ck2.i.f27924d);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v11.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        w0 w0Var = this.f142479a;
        w0Var.getEventManager().i(event);
        ba baVar = event.f123843a;
        w0Var.f142558q0 = baVar;
        w0Var.f142556p0 = baVar.getUid();
        w0Var.L0(w0Var.F0(), w0Var.f142558q0);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        w0 w0Var = this.f142479a;
        w0Var.getEventManager().i(event);
        w0Var.f142560r0 = event.f142331a;
        e30 R6 = this.f142480b.R6();
        R6.d2(Boolean.valueOf(w0Var.f142560r0));
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        w0Var.f142542i0 = a13;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(v11.e eVar) {
        w0 w0Var = this.f142479a;
        w0Var.getEventManager().i(eVar);
        w0Var.f142562s0 = true;
        w0Var.f142550m0 = null;
        w0Var.f142548l0 = null;
        w0Var.f142558q0 = null;
        w0Var.f142556p0 = null;
        w0Var.L0(w0Var.F0(), null);
    }
}
