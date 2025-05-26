package qa2;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.analytics.loggers.PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z2;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class s implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCellImpl f103353a;

    public s(LegoPinGridCellImpl legoPinGridCellImpl) {
        this.f103353a = legoPinGridCellImpl;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.e pinChipEvent) {
        Intrinsics.checkNotNullParameter(pinChipEvent, "pinChipEvent");
        List list = pinChipEvent.f84688b;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((f30) it.next()).s5());
            }
            LegoPinGridCellImpl legoPinGridCellImpl = this.f103353a;
            f30 f30Var = legoPinGridCellImpl.C0;
            if (arrayList.contains(f30Var != null ? f30Var.s5() : null)) {
                legoPinGridCellImpl.f52483y = pinChipEvent.f84687a;
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84689i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103353a;
        f30 f30Var = legoPinGridCellImpl.C0;
        if (!Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null) || legoPinGridCellImpl.S1 == 0) {
            if (legoPinGridCellImpl.S1 == 0) {
                pi1.b bVar = legoPinGridCellImpl.V0;
                if (bVar != null) {
                    f30 f30Var2 = legoPinGridCellImpl.C0;
                    PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload payload = new PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload(event.f84689i, f30Var2 != null ? f30Var2.getUid() : null, "lego");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    bVar.f100208a.a(new pi1.a(payload));
                    return;
                }
                Intrinsics.r("pinRepIabDurationLogger");
                throw null;
            }
            return;
        }
        nx.d0 d0Var = legoPinGridCellImpl.W1;
        h32.f1 f1Var = h32.f1.PIN_IAB_DURATION;
        HashMap hashMap = new HashMap();
        f30 f30Var3 = legoPinGridCellImpl.C0;
        bs1.c.G1(SbaPinRep.AUX_DATA_VIDEO_ID, f30Var3 != null ? b40.i0(f30Var3) : null, hashMap);
        ((vr.b) legoPinGridCellImpl.getAdsCommonAnalytics()).c(legoPinGridCellImpl.C0, hashMap);
        Unit unit = Unit.f80348a;
        h32.v0 v0Var = new h32.v0();
        v0Var.C = Long.valueOf((System.currentTimeMillis() * 1000000) - legoPinGridCellImpl.S1);
        d0Var.H(f1Var, event.f84689i, null, hashMap, v0Var, false);
        legoPinGridCellImpl.getEventManager().i(event);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84693i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103353a;
        f30 f30Var = legoPinGridCellImpl.C0;
        if (Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null)) {
            legoPinGridCellImpl.getEventManager().i(event);
            long j13 = event.f84694j;
            legoPinGridCellImpl.S1 = j13;
            nx.d0 d0Var = legoPinGridCellImpl.W1;
            h32.f1 f1Var = h32.f1.PIN_IAB_START;
            HashMap hashMap = new HashMap();
            f30 f30Var2 = legoPinGridCellImpl.C0;
            hashMap.put(SbaPinRep.AUX_DATA_IS_MDL_AD, String.valueOf(f30Var2 != null ? ((es.c) legoPinGridCellImpl.getAdFormats()).C(f30Var2) : false));
            Unit unit = Unit.f80348a;
            h32.v0 v0Var = new h32.v0();
            v0Var.C = Long.valueOf(j13);
            d0Var.H(f1Var, event.f84693i, null, hashMap, v0Var, false);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.m e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        String str = e13.f84699a;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103353a;
        if (!Intrinsics.d(str, legoPinGridCellImpl.getPinUid()) || legoPinGridCellImpl.i2(legoPinGridCellImpl.C0, false)) {
            return;
        }
        NavigationImpl r03 = Navigation.r0(z2.a(), legoPinGridCellImpl.C0);
        legoPinGridCellImpl.g(r03);
        legoPinGridCellImpl.getEventManager().d(r03);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103353a;
        f30 f30Var = legoPinGridCellImpl.C0;
        if (Intrinsics.d(f30Var != null ? f30Var.getUid() : null, event.f84702a)) {
            ua2.m0 m0Var = (ua2.m0) legoPinGridCellImpl.f52486y2.getValue();
            m0Var.getClass();
            Map reactions = event.f84704c;
            Intrinsics.checkNotNullParameter(reactions, "reactions");
            v32.c reactionByMe = event.f84705d;
            Intrinsics.checkNotNullParameter(reactionByMe, "reactionByMe");
            m0Var.f121564k.h(event.f84703b, reactionByMe, reactions);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull m10.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f85656a;
        Intrinsics.checkNotNullExpressionValue(str, "getContentId(...)");
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103353a;
        f30 f30Var = legoPinGridCellImpl.C0;
        if (f30Var != null) {
            Intrinsics.f(f30Var);
            if (Intrinsics.d(str, f30Var.getUid())) {
                legoPinGridCellImpl.w2();
            }
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ps.m event) {
        f30 f30Var;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f101245b;
        if (str != null) {
            LegoPinGridCellImpl legoPinGridCellImpl = this.f103353a;
            f30 f30Var2 = legoPinGridCellImpl.C0;
            if (Intrinsics.d(str, f30Var2 != null ? f30Var2.getUid() : null)) {
                legoPinGridCellImpl.getEventManager().i(event);
                legoPinGridCellImpl.K0().f101240c = event.f101244a;
                if (legoPinGridCellImpl.r1() && legoPinGridCellImpl.isPinMediaHalfVisible() && (f30Var = legoPinGridCellImpl.C0) != null) {
                    legoPinGridCellImpl.b3(f30Var);
                }
            }
        }
    }
}
