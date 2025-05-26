package kl0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends qa2.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80057e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f80058f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f80059g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f80060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nx.d0 pinalytics, y32.f sendShareSurface, nr0.b pinActionHandler, boolean z13, boolean z14, boolean z15, int i13) {
        super(pinalytics, sendShareSurface, pinActionHandler, 8);
        this.f80057e = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
            Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
            this.f80058f = z13;
            this.f80059g = z14;
            this.f80060h = z15;
            return;
        }
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        super(pinalytics, sendShareSurface, pinActionHandler, 8);
        this.f80058f = z13;
        this.f80059g = z14;
        this.f80060h = z15;
    }

    @Override // qa2.f
    public final void b(wa2.i pinFeatureConfig) {
        int i13 = this.f80057e;
        boolean z13 = this.f80059g;
        boolean z14 = this.f80058f;
        boolean z15 = this.f80060h;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                pinFeatureConfig.f128769f = true;
                pinFeatureConfig.f128781l = true;
                pinFeatureConfig.f128763c = true;
                pinFeatureConfig.f128773h = true;
                if (z13) {
                    pinFeatureConfig.f128797t = true;
                    pinFeatureConfig.F = true;
                } else if (z14) {
                    pinFeatureConfig.f128797t = false;
                }
                Intrinsics.checkNotNullParameter("board", "<set-?>");
                pinFeatureConfig.f128792q0 = "board";
                pinFeatureConfig.Y = z15;
                break;
            default:
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                pinFeatureConfig.f128789p = true;
                pinFeatureConfig.f128795s = !z15;
                pinFeatureConfig.f128793r = z14;
                pinFeatureConfig.B = true;
                pinFeatureConfig.f128797t = z13;
                pinFeatureConfig.F = z13;
                if (z15) {
                    pinFeatureConfig.A = false;
                    pinFeatureConfig.f128764c0 = new wa2.g0(false, false, false, false, false, false, null, null, h32.g0.TODAY_ARTICLE, false, false, false, false, 0, false, false, false, false, false, false, false, false, 33554175);
                    break;
                }
                break;
        }
    }
}
