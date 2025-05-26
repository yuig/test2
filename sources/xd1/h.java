package xd1;

import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import wa2.g0;
import wa2.i;

/* loaded from: classes5.dex */
public final class h extends qa2.f {

    /* renamed from: e, reason: collision with root package name */
    public final int f134637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d0 pinalytics, y32.f sendShareSurface, nr0.b pinActionHandler, String trafficSource) {
        super(pinalytics, sendShareSurface, pinActionHandler, trafficSource);
        int i13 = eo1.b.color_themed_background_default;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        this.f134637e = i13;
    }

    @Override // qa2.f
    public final void b(i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        pinFeatureConfig.f128797t = false;
        pinFeatureConfig.f128759a = true;
        pinFeatureConfig.f128783m = true;
        pinFeatureConfig.f128795s = true;
        pinFeatureConfig.f128772g0 = this.f134637e;
        pinFeatureConfig.f128764c0 = new g0(false, false, false, false, false, false, null, null, null, false, false, false, false, 0, false, false, false, false, false, false, false, false, 33554431);
    }
}
