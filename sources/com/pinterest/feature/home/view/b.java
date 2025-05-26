package com.pinterest.feature.home.view;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.q1;
import lh0.z3;
import nx.d0;

/* loaded from: classes.dex */
public final class b extends qa2.f {

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f45844e;

    /* renamed from: f, reason: collision with root package name */
    public final q1 f45845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d0 pinalytics, y32.f sendShareSurface, nr0.b pinActionHandler, b60.b activeUserManager, q1 experiments) {
        super(pinalytics, sendShareSurface, pinActionHandler, "feed_home");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f45844e = activeUserManager;
        this.f45845f = experiments;
    }

    @Override // qa2.f
    public final void b(wa2.i pinFeatureConfig) {
        wy0 f13;
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        b60.d dVar = (b60.d) this.f45844e;
        wy0 f14 = dVar.f();
        boolean z13 = (f14 == null || !dl2.b.O1(f14, false)) && ((f13 = dVar.f()) == null || !dl2.b.R1(f13));
        pinFeatureConfig.f128761b = true;
        pinFeatureConfig.f128787o = true;
        pinFeatureConfig.f128801v = z13;
        pinFeatureConfig.f128803w = true;
        pinFeatureConfig.F = true;
        pinFeatureConfig.Y = true;
        q1 q1Var = this.f45845f;
        q1Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) q1Var.f83462a;
        pinFeatureConfig.f128762b0 = g1Var.o("android_grid_inline_actions_phase_1", "enabled", z3Var) || g1Var.l("android_grid_inline_actions_phase_1");
    }
}
