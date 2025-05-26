package eq0;

import a.z0;
import kotlin.jvm.internal.Intrinsics;
import qa2.d0;

/* loaded from: classes5.dex */
public final class d extends qa2.f {

    /* renamed from: e, reason: collision with root package name */
    public final d0 f59916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nx.d0 pinalytics, y32.f sendShareSurface, z0 providedPinActionHandler) {
        super(pinalytics, sendShareSurface, providedPinActionHandler, "messages");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(providedPinActionHandler, "providedPinActionHandler");
        this.f59916e = providedPinActionHandler;
    }

    @Override // qa2.f
    public final void b(wa2.i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        pinFeatureConfig.f128759a = false;
        pinFeatureConfig.f128803w = false;
        pinFeatureConfig.f128770f0 = true;
        pinFeatureConfig.f128768e0 = this.f59916e;
        pinFeatureConfig.f128799u = true;
    }
}
