package zx1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class i extends p implements Function2 {
    public i(k kVar) {
        super(2, kVar, k.class, "onProductTagSelectorClick", "onProductTagSelectorClick(Ljava/util/List;Lcom/pinterest/partnerAnalytics/feature/analytics/model/MetricTypes;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List metrics = (List) obj;
        ww1.c selected = (ww1.c) obj2;
        Intrinsics.checkNotNullParameter(metrics, "p0");
        Intrinsics.checkNotNullParameter(selected, "p1");
        k kVar = (k) this.receiver;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(selected, "selected");
        gw1.f fVar = kVar.Y;
        if (fVar != null) {
            fVar.c(selected, metrics, new gw1.i(7, kVar, metrics));
            return Unit.f80348a;
        }
        Intrinsics.r("productTagSelectorHandler");
        throw null;
    }
}
