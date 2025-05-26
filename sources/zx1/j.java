package zx1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class j extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143043a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, int i13) {
        super(1, kVar, k.class, "onInfoButton", "onInfoButton$partnerAnalytics_release(Ljava/util/List;)V", 0);
        this.f143043a = i13;
        if (i13 != 1) {
        } else {
            super(1, kVar, k.class, "onSeeDetailsClick", "onSeeDetailsClick(Lcom/pinterest/partnerAnalytics/feature/analytics/model/MetricTypes;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f143043a) {
            case 0:
                List metrics = (List) obj;
                Intrinsics.checkNotNullParameter(metrics, "p0");
                k kVar = (k) this.receiver;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(metrics, "metrics");
                gw1.f fVar = kVar.Z;
                if (fVar != null) {
                    fVar.a(metrics);
                    return Unit.f80348a;
                }
                Intrinsics.r("productTagMetricDefinitionModal");
                throw null;
            default:
                ww1.c metricSelected = (ww1.c) obj;
                Intrinsics.checkNotNullParameter(metricSelected, "p0");
                k kVar2 = (k) this.receiver;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(metricSelected, "metricSelected");
                kVar2.f8().f20692e.e().a(new ay1.j(metricSelected));
                return Unit.f80348a;
        }
    }
}
