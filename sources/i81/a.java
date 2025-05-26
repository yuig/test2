package i81;

import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import wa2.i;

/* loaded from: classes5.dex */
public final class a extends qa2.f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f71724e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d0 pinalytics, y32.f sendShareSurface, nr0.b pinActionHandler, boolean z13, int i13) {
        super(pinalytics, sendShareSurface, pinActionHandler, "flashlight");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        Intrinsics.checkNotNullParameter("flashlight", "trafficSource");
        this.f71724e = z13;
        this.f71725f = i13;
    }

    @Override // qa2.f
    public final void b(i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        pinFeatureConfig.f128772g0 = this.f71725f;
        boolean z13 = this.f71724e;
        pinFeatureConfig.f128797t = z13;
        pinFeatureConfig.F = z13;
    }
}
