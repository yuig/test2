package zy;

import ao2.v0;
import df.j1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import nx.z0;

/* loaded from: classes.dex */
public final class d0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final bz.i f143064a;

    /* renamed from: b, reason: collision with root package name */
    public final rd.j f143065b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f143066c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.o0 f143067d;

    /* renamed from: e, reason: collision with root package name */
    public final ao2.j0 f143068e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f143069f;

    public d0(bz.i timeSpentLoggingManager, rd.j stateBasedPinalytics, d1 trackingParamAttacher, nx.o0 pinalyticsManager, ao2.j0 appScope) {
        Intrinsics.checkNotNullParameter(timeSpentLoggingManager, "timeSpentLoggingManager");
        Intrinsics.checkNotNullParameter(stateBasedPinalytics, "stateBasedPinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        this.f143064a = timeSpentLoggingManager;
        this.f143065b = stateBasedPinalytics;
        this.f143066c = trackingParamAttacher;
        this.f143067d = pinalyticsManager;
        this.f143068e = appScope;
        h32.i0 loggingContext = new h32.i0(null, null, null, null, null, null);
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        n0 n0Var = new n0();
        n0Var.f143096a = loggingContext;
        n0Var.f143097b = null;
        this.f143069f = n0Var;
    }

    public static final void k(d0 d0Var, HashMap hashMap, String str) {
        d0Var.f143064a.f(d0Var.f143069f.f143096a, new qq2.c(hashMap != null ? j1.R1(hashMap) : new z0(), d0Var.f143066c.c(str)));
    }

    public final n0 l() {
        return this.f143069f;
    }

    @Override // l82.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, k0 effect, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(effect, "effect");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(this.f143068e, ho2.q.f69782a, null, new c0(effect, this, null), 2);
    }
}
