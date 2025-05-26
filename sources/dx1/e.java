package dx1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.graphComponents.MetricsSelectorView;
import ex1.l;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes4.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f56490j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f56489i = i13;
        this.f56490j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56489i;
        f fVar = this.f56490j;
        switch (i13) {
            case 0:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fVar.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_VIEW_PIN_LINK, (r18 & 4) != 0 ? null : g0.ANALYTICS_PIN_TABLE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                fVar.f7().d(Navigation.z0((ScreenLocation) ex1.b.f60386a.getValue(), it.getUid()));
                return Unit.f80348a;
            default:
                int intValue = ((Number) obj).intValue();
                fVar.f56493l0 = intValue;
                l lVar = fVar.f56506y0;
                if (lVar != null) {
                    ww1.c metric = (ww1.c) fVar.f56492k0.get(intValue);
                    Intrinsics.checkNotNullParameter(metric, "metric");
                    d0 pinalytics = lVar.getPinalytics();
                    f1 f1Var = f1.TAP;
                    g0 g0Var = g0.ANALYTICS_PIN_TABLE;
                    u0 u0Var = u0.ANALYTICS_METRIC_SELECTLIST;
                    HashMap hashMap = new HashMap();
                    hashMap.put("analytics_previous_value", lVar.f60410d.name());
                    hashMap.put("analytics_next_value", metric.name());
                    pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    if (lVar.f60410d != metric) {
                        lVar.f60410d = metric;
                        lVar.q3();
                    }
                }
                MetricsSelectorView metricsSelectorView = fVar.f56499r0;
                if (metricsSelectorView != null) {
                    metricsSelectorView.a(((ww1.c) fVar.f56492k0.get(intValue)).getDescription());
                    return Unit.f80348a;
                }
                Intrinsics.r("metricsSelector");
                throw null;
        }
    }
}
