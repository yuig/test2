package ow1;

import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.graphComponents.MetricsSelectorView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mw1.m;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97939i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f97940j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i13) {
        super(1);
        this.f97939i = i13;
        this.f97940j = gVar;
    }

    public final void b(int i13) {
        int i14 = this.f97939i;
        g gVar = this.f97940j;
        switch (i14) {
            case 0:
                ww1.c cVar = (ww1.c) gVar.e8().get(i13);
                gVar.f97945n0 = Integer.valueOf(i13);
                ((j) gVar.f8()).D3(cVar);
                MetricsSelectorView metricsSelectorView = gVar.F0;
                if (metricsSelectorView == null) {
                    Intrinsics.r("metricsSelector");
                    throw null;
                }
                metricsSelectorView.a(cVar.getDescription());
                if (cVar.isProductTagMetric()) {
                    return;
                }
                ProductTagCard productTagCard = gVar.M0;
                if (productTagCard != null) {
                    bs1.c.X0(productTagCard);
                    return;
                } else {
                    Intrinsics.r("productTagCard");
                    throw null;
                }
            default:
                gVar.f97946o0 = Integer.valueOf(i13);
                ((j) gVar.f8()).F3((m) gVar.i8().get(i13));
                MetricsSelectorView metricsSelectorView2 = gVar.G0;
                if (metricsSelectorView2 != null) {
                    metricsSelectorView2.a(((m) gVar.i8().get(i13)).f88443b);
                    return;
                } else {
                    Intrinsics.r("splitsSelector");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f97939i) {
            case 0:
                b(((Number) obj).intValue());
                break;
            default:
                b(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
