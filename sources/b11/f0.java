package b11;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import nx.d1;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import x02.i2;

/* loaded from: classes5.dex */
public final class f0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f20987a;

    public f0(j0 j0Var) {
        this.f20987a = j0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull cb2.r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f27359a;
        j0 j0Var = this.f20987a;
        f30 f30Var = j0Var.f21042t;
        if (Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null)) {
            v32.c cVar = j0Var.f21047y;
            v32.c cVar2 = v32.c.NONE;
            if (cVar == cVar2) {
                cVar2 = j0Var.f21046x;
            }
            f1 f1Var = f1.TAP;
            h32.u0 u0Var = h32.u0.PIN_REACTION_BUTTON;
            String str2 = j0Var.f21043u;
            HashMap hashMap = new HashMap();
            hashMap.put("reaction_type", String.valueOf(cVar2.getValue()));
            hashMap.put("secondary_action_bar_type", j0Var.f21026d.name());
            Unit unit = Unit.f80348a;
            j0Var.f21025c.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : str2, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            j0Var.z0(cVar2, Boolean.TRUE);
            j0.T(j0Var.A);
            i2 i2Var = j0Var.N;
            if (i2Var == null) {
                Intrinsics.r("pinRepository");
                throw null;
            }
            d1 d1Var = j0Var.M;
            if (d1Var != null) {
                j0Var.A = new a21.c(i2Var, j0Var.f21025c, d1Var, j0Var.getEventManager(), false).a(cVar2, event.f27359a);
            } else {
                Intrinsics.r("trackingParamAttacher");
                throw null;
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ed1.i0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        j0 j0Var = this.f20987a;
        f30 f30Var = j0Var.f21042t;
        if (f30Var != null && Intrinsics.d(event.f58646a, f30Var.getUid())) {
            lh0.z Z = j0Var.Z();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) Z.f83517a;
            if (g1Var.o("sg_android_share_count_on_closeup", "enabled", z3Var) || g1Var.l("sg_android_share_count_on_closeup")) {
                j0Var.D++;
                j0Var.B0();
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull fd1.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f20987a.f21035m.T();
    }
}
