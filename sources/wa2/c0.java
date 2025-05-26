package wa2;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.l1;
import lh0.z3;

/* loaded from: classes4.dex */
public final class c0 extends qa2.f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f128683e;

    /* renamed from: f, reason: collision with root package name */
    public final int f128684f;

    /* renamed from: g, reason: collision with root package name */
    public final l1 f128685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(nx.d0 pinalytics, y32.f sendShareSurface, nr0.b pinActionHandler, boolean z13, int i13, l1 experiments) {
        super(pinalytics, sendShareSurface, pinActionHandler, "pin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f128683e = z13;
        this.f128684f = i13;
        this.f128685g = experiments;
    }

    @Override // qa2.f
    public final void b(i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        boolean z13 = true;
        pinFeatureConfig.f128779k = true;
        pinFeatureConfig.f128803w = true;
        pinFeatureConfig.f128772g0 = this.f128684f;
        pinFeatureConfig.f128797t = this.f128683e;
        pinFeatureConfig.F = true;
        pinFeatureConfig.X = true;
        pinFeatureConfig.Y = true;
        l1 l1Var = this.f128685g;
        l1Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) l1Var.f83416a;
        if (!g1Var.o("android_grid_inline_actions_phase_1", "enabled", z3Var) && !g1Var.l("android_grid_inline_actions_phase_1")) {
            z13 = false;
        }
        pinFeatureConfig.f128762b0 = z13;
    }
}
