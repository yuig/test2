package zw1;

import com.pinterest.api.model.o4;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import com.pinterest.screens.u2;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mw1.j;
import mw1.l;
import mw1.m;
import nx.d0;
import so.a1;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142938i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f142939j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i13) {
        super(1);
        this.f142938i = i13;
        this.f142939j = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142938i;
        Object obj2 = this.f142939j;
        switch (i13) {
            case 0:
                ww1.c metricType = (ww1.c) obj;
                Intrinsics.checkNotNullParameter(metricType, "it");
                i iVar = ((c) obj2).f142949p0;
                if (iVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(metricType, "metricType");
                d0 pinalytics = iVar.getPinalytics();
                f1 f1Var = f1.TAP;
                g0 g0Var = g0.ANALYTICS_TOPLINE_METRIC;
                u0 u0Var = u0.ANALYTICS_GRAPH_CLOSEUP_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("analytics_next_value", metricType.name());
                pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                NavigationImpl w13 = Navigation.w1((ScreenLocation) u2.f51426c.getValue());
                List j13 = f0.j(ww1.c.IMPRESSION, ww1.c.ENGAGEMENT, ww1.c.PIN_CLICK, ww1.c.OUTBOUND_CLICK, ww1.c.SAVE, ww1.c.ENGAGEMENT_RATE, ww1.c.PIN_CLICK_RATE, ww1.c.OUTBOUND_CLICK_RATE, ww1.c.SAVE_RATE, ww1.c.TOTAL_AUDIENCE, ww1.c.ENGAGERS);
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(j13, 10));
                Iterator it = j13.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ww1.c) it.next()).name());
                }
                w13.d("METRIC_TYPES_EXTRA_KEY", arrayList);
                ArrayList l13 = f0.l(j.f88439c);
                if (yb2.a.b(((b60.d) iVar.f142963e).f())) {
                    l13.add(new mw1.i());
                }
                l13.add(new mw1.h());
                l13.add(new l());
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(l13, 10));
                Iterator it2 = l13.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((m) it2.next()).f88442a);
                }
                w13.d("SPLIT_TYPES_EXTRA_KEY", arrayList2);
                w13.m0("METRIC_TYPE_EXTRA_KEY", metricType.name());
                iVar.f142960b.d(w13);
                return Unit.f80348a;
            default:
                i iVar2 = (i) obj2;
                yw1.d adapter = ((a1) iVar2.f142962d).a((o4) obj, iVar2.f142964f.f136124b);
                c cVar = (c) ((f) iVar2.getView());
                cVar.getClass();
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                ToplineMetricsCard toplineMetricsCard = cVar.f142947n0;
                if (toplineMetricsCard != null) {
                    toplineMetricsCard.a(adapter);
                    return Unit.f80348a;
                }
                Intrinsics.r("topLineMetricsView");
                throw null;
        }
    }
}
