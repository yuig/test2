package com.pinterest.feature.search.results.view;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends qa2.f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nx.d0 pinalytics, y32.f sendShareSurface, nr0.b pinActionHandler, boolean z13) {
        super(pinalytics, sendShareSurface, pinActionHandler, "search");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        this.f47816e = z13;
    }

    @Override // qa2.f
    public final void b(wa2.i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        pinFeatureConfig.f128803w = true;
        pinFeatureConfig.F = true;
        pinFeatureConfig.W = true;
        pinFeatureConfig.f128762b0 = this.f47816e;
    }
}
