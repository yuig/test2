package yx1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.p implements Function2 {
    public g(Object obj) {
        super(2, obj, j.class, "onProductTagSelectorClick", "onProductTagSelectorClick(Ljava/util/List;Lcom/pinterest/partnerAnalytics/feature/analytics/model/MetricTypes;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List p03 = (List) obj;
        ww1.c p13 = (ww1.c) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        j jVar = (j) this.receiver;
        gw1.f fVar = jVar.f140364n0;
        if (fVar != null) {
            fVar.c(p13, p03, new gw1.i(8, jVar, p03));
            return Unit.f80348a;
        }
        Intrinsics.r("productTagSelectorHandler");
        throw null;
    }
}
