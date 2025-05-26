package ht0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.a2;
import h32.f1;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.p implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d0 d0Var = ((ws0.a) this.receiver).getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.DSA_TURN_PROFILING_ON_BANNER_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        os0.b bVar = os0.b.f97497a;
        os0.b.d().d(Navigation.L((ScreenLocation) a2.f50512f.getValue(), "", ml1.b.DEFAULT_TRANSITION.getValue()));
        return Unit.f80348a;
    }
}
