package zp;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f142340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aq.j f142341b;

    public b1(d1 d1Var, aq.j jVar) {
        this.f142340a = d1Var;
        this.f142341b = jVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull f11.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d1 d1Var = this.f142340a;
        d1Var.getEventManager().i(event);
        String str = event.f60780a;
        boolean d2 = Intrinsics.d(str, d1Var.M);
        boolean d13 = Intrinsics.d(str, d1Var.Q);
        if (!d2 || !d13) {
            d1Var.Q = str;
            x02.x0 x0Var = d1Var.f142388z;
            if (x0Var == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            d1Var.R = (v7) x0Var.O(str);
            d1Var.O = null;
            d1Var.P = null;
            d1Var.S = null;
            d1Var.T = null;
        }
        d1Var.G0(d1Var.R);
        d1Var.H0(d1Var.R, null);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v11.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d1 d1Var = this.f142340a;
        d1Var.getEventManager().i(event);
        ba baVar = event.f123843a;
        d1Var.T = baVar;
        d1Var.S = baVar.getUid();
        d1Var.H0(d1Var.z0(), d1Var.T);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d1 d1Var = this.f142340a;
        d1Var.getEventManager().i(event);
        boolean z13 = event.f142331a;
        d1Var.U = z13;
        this.f142341b.b0(aq.d.IS_SHOPPING_REC_ALLOWED, String.valueOf(!z13), false);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(v11.e eVar) {
        d1 d1Var = this.f142340a;
        d1Var.getEventManager().i(eVar);
        d1Var.V = true;
        d1Var.P = null;
        d1Var.O = null;
        d1Var.T = null;
        d1Var.S = null;
        d1Var.H0(d1Var.z0(), null);
    }
}
