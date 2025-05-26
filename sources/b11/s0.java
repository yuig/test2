package b11;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import x02.i2;

/* loaded from: classes5.dex */
public final class s0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedPinActionBarView f21082a;

    public s0(UnifiedPinActionBarView unifiedPinActionBarView) {
        this.f21082a = unifiedPinActionBarView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull cb2.r event) {
        nx.d0 d0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f27359a;
        UnifiedPinActionBarView unifiedPinActionBarView = this.f21082a;
        f30 f30Var = unifiedPinActionBarView.f47049p;
        if (!Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null) || unifiedPinActionBarView.T() || (d0Var = unifiedPinActionBarView.f47037d) == null) {
            return;
        }
        v32.c cVar = unifiedPinActionBarView.f47054u;
        v32.c cVar2 = v32.c.NONE;
        v32.c cVar3 = cVar == cVar2 ? unifiedPinActionBarView.f47053t : cVar2;
        f1 f1Var = f1.TAP;
        h32.u0 u0Var = h32.u0.PIN_REACTION_BUTTON;
        HashMap hashMap = new HashMap();
        hashMap.put("reaction_type", String.valueOf(cVar3.getValue()));
        Unit unit = Unit.f80348a;
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        Boolean bool = Boolean.TRUE;
        if (unifiedPinActionBarView.f47054u != cVar3) {
            unifiedPinActionBarView.f47054u = cVar3;
            if (Intrinsics.d(bool, bool) && cVar3 != cVar2) {
                unifiedPinActionBarView.f47056w.invoke(cVar3);
            }
        }
        ek2.j jVar = unifiedPinActionBarView.f47055v;
        if (jVar != null && !jVar.isDisposed()) {
            jVar.dispose();
        }
        i2 i2Var = unifiedPinActionBarView.E;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        d1 d1Var = unifiedPinActionBarView.D;
        if (d1Var != null) {
            unifiedPinActionBarView.f47055v = new a21.c(i2Var, d0Var, d1Var, unifiedPinActionBarView.getEventManager(), false).a(cVar3, event.f27359a);
        } else {
            Intrinsics.r("trackingParamAttacher");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull fd1.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = UnifiedPinActionBarView.L;
        UnifiedPinActionBarView unifiedPinActionBarView = this.f21082a;
        if (unifiedPinActionBarView.T()) {
            return;
        }
        unifiedPinActionBarView.f47042i.T();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84723a;
        UnifiedPinActionBarView unifiedPinActionBarView = this.f21082a;
        f30 f30Var = unifiedPinActionBarView.f47049p;
        if (!Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null) || event.f84724b) {
            return;
        }
        event.f84724b = true;
        unifiedPinActionBarView.L(unifiedPinActionBarView.f47048o, new HashMap());
    }
}
