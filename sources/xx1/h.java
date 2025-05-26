package xx1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.SaveToBoardCard;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import nx.d0;

/* loaded from: classes4.dex */
public final /* synthetic */ class h extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sx.a p03 = (sx.a) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        SaveToBoardCard saveToBoardCard = (SaveToBoardCard) this.receiver;
        d0 d0Var = saveToBoardCard.f50224a;
        if (d0Var != null) {
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_VIEW_BOARD_LINK, (r18 & 4) != 0 ? null : g0.ANALYTICS_TOP_BOARDS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        g70.h hVar = saveToBoardCard.f50225b;
        if (hVar != null) {
            g70.h.g(hVar, p03.f115602a, null, null, 6);
        }
        return Unit.f80348a;
    }
}
