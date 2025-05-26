package sr;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.u0;
import lh0.z3;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final us1.a f115044a;

    /* renamed from: b, reason: collision with root package name */
    public final vy.m f115045b;

    /* renamed from: c, reason: collision with root package name */
    public final lu1.b f115046c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f115047d;

    /* renamed from: e, reason: collision with root package name */
    public final g70.h f115048e;

    public d(us1.a activity, vy.m analyticsApi, lu1.b baseActivityHelper, u0 experiments, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f115044a = activity;
        this.f115045b = analyticsApi;
        this.f115046c = baseActivityHelper;
        this.f115047d = experiments;
        this.f115048e = boardNavigator;
    }

    public final void a(String boardId, boolean z13, boolean z14, boolean z15, boolean z16) {
        g70.b override;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        if (z16) {
            u0 u0Var = this.f115047d;
            u0Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) u0Var.f83485a;
            if (g1Var.o("android_automagical_board_surface", "enabled", z3Var) || g1Var.l("android_automagical_board_surface")) {
                override = g70.b.AUTOMAGICAL_BOARD;
                c applyExtras = new c(z14, z15, this, z16);
                r1.f customNavigation = new r1.f(this, z13, 5);
                g70.h hVar = this.f115048e;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(boardId, "boardId");
                Intrinsics.checkNotNullParameter(override, "override");
                Intrinsics.checkNotNullParameter(applyExtras, "applyExtras");
                Intrinsics.checkNotNullParameter(customNavigation, "customNavigation");
                hVar.d(boardId, override, applyExtras, customNavigation);
            }
        }
        override = z16 ? g70.b.PUBLIC_BOARD : g70.b.NONE;
        c applyExtras2 = new c(z14, z15, this, z16);
        r1.f customNavigation2 = new r1.f(this, z13, 5);
        g70.h hVar2 = this.f115048e;
        hVar2.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(override, "override");
        Intrinsics.checkNotNullParameter(applyExtras2, "applyExtras");
        Intrinsics.checkNotNullParameter(customNavigation2, "customNavigation");
        hVar2.d(boardId, override, applyExtras2, customNavigation2);
    }
}
