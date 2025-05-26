package q31;

import kotlin.jvm.internal.Intrinsics;
import nr0.b;
import nx.d0;
import qa2.f;
import wa2.i;

/* loaded from: classes5.dex */
public final class a extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d0 pinalytics, y32.f sendShareSurface, b pinActionHandler) {
        super(pinalytics, sendShareSurface, pinActionHandler, 8);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
    }

    @Override // qa2.f
    public final void b(i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        pinFeatureConfig.f128797t = true;
    }
}
