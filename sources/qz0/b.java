package qz0;

import kotlin.jvm.internal.Intrinsics;
import uk1.d;
import wk1.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public final oz0.a f105466a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String insightId, d pinalytics, uj2.q networkStateStream, s20.a pearService) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        this.f105466a = new oz0.a(insightId, pearService, new a(1, this, b.class, "onInsightLoaded", "onInsightLoaded(Lcom/pinterest/api/model/PearInsight;)V", 0));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f105466a);
    }
}
