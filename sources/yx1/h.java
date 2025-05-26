package yx1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Object obj, int i13) {
        super(1, obj, j.class, "onInfoButton", "onInfoButton(Ljava/util/List;)V", 0);
        this.f140357a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, j.class, "onSeeDetailsClick", "onSeeDetailsClick(Lcom/pinterest/partnerAnalytics/feature/analytics/model/MetricTypes;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f140357a) {
            case 0:
                List p03 = (List) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                gw1.f fVar = ((j) this.receiver).f140365o0;
                if (fVar != null) {
                    fVar.a(p03);
                    return Unit.f80348a;
                }
                Intrinsics.r("productTagMetricDefinitionModal");
                throw null;
            default:
                ww1.c p04 = (ww1.c) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                d dVar = ((j) this.receiver).D0;
                if (dVar != null) {
                    ((p) dVar).s3(p04);
                    return Unit.f80348a;
                }
                Intrinsics.r("listener");
                throw null;
        }
    }
}
