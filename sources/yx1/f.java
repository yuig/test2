package yx1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.u2;
import h32.f1;
import h32.u0;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140355i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f140356j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, int i13) {
        super(0);
        this.f140355i = i13;
        this.f140356j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f140355i;
        j jVar = this.f140356j;
        switch (i13) {
            case 0:
                rg0.s sVar = jVar.f140363m0;
                if (sVar != null) {
                    return ((dh0.d) sVar).b(y0.ANDROID_PIN_STATS_TAKEOVER);
                }
                Intrinsics.r("experiences");
                throw null;
            case 1:
                a11.d dVar = jVar.f140361k0;
                if (dVar == null) {
                    Intrinsics.r("clickThroughHelperFactory");
                    throw null;
                }
                d0 d0Var = ((uk1.d) jVar.f140369s0.getValue()).f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                return dVar.a(d0Var);
            case 2:
                Navigation navigation = jVar.I;
                return Boolean.valueOf(navigation != null ? navigation.S("IS_A_PARTNER", false) : false);
            case 3:
                m297invoke();
                return Unit.f80348a;
            case 4:
                Navigation navigation2 = jVar.I;
                if (navigation2 != null) {
                    return navigation2.v0("PIN_ID");
                }
                return null;
            case 5:
                uk1.e eVar = jVar.f140362l0;
                if (eVar != null) {
                    return uk1.e.c(eVar, jVar);
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            default:
                m297invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m297invoke() {
        int i13 = this.f140355i;
        j jVar = this.f140356j;
        switch (i13) {
            case 3:
                a11.e.e((a11.e) jVar.F0.getValue(), "https://help.pinterest.com/en/business/article/pin-stats", null, 6);
                return;
            default:
                d dVar = jVar.D0;
                if (dVar != null) {
                    p pVar = (p) dVar;
                    pVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CONVERT_TO_BUSINESS_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    pVar.f140393h.d(Navigation.w1((ScreenLocation) u2.f51428e.getValue()));
                    return;
                }
                Intrinsics.r("listener");
                throw null;
        }
    }
}
