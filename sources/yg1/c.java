package yg1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import n70.o;
import nx.d0;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f139014i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f139014i = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        g gVar = this.f139014i.f139019e;
        if (gVar != null) {
            d0 pinalytics = gVar.getPinalytics();
            f1 f1Var = f1.TAP;
            u0 u0Var = u0.USER_FOLLOW;
            g0 g0Var = ((d) ((e) gVar.getView())).f139023i;
            o oVar = gVar.f139025a;
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : (String) oVar.f89634h, (r18 & 32) != 0 ? null : oVar.l(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        return Unit.f80348a;
    }
}
