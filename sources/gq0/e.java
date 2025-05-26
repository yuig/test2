package gq0;

import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import qa2.f;
import wa2.i;

/* loaded from: classes5.dex */
public final class e extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d0 pinalytics, y32.f sendShareSurface, nr0.b pinActionHandler) {
        super(pinalytics, sendShareSurface, pinActionHandler, "user_pins");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
    }

    @Override // qa2.f
    public final void b(i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        pinFeatureConfig.f128797t = false;
        pinFeatureConfig.f128759a = false;
        pinFeatureConfig.f128763c = true;
        pinFeatureConfig.f128773h = true;
    }
}
