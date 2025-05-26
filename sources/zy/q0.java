package zy;

import kotlin.jvm.internal.Intrinsics;
import nx.d1;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final bz.i f143110a;

    /* renamed from: b, reason: collision with root package name */
    public final rd.j f143111b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f143112c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.o0 f143113d;

    /* renamed from: e, reason: collision with root package name */
    public final ao2.j0 f143114e;

    public q0(bz.i timeSpentLoggingManager, rd.j stateBasedPinalytics, d1 trackingParamAttacher, nx.o0 pinalyticsManager, ao2.j0 appScope) {
        Intrinsics.checkNotNullParameter(timeSpentLoggingManager, "timeSpentLoggingManager");
        Intrinsics.checkNotNullParameter(stateBasedPinalytics, "stateBasedPinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        this.f143110a = timeSpentLoggingManager;
        this.f143111b = stateBasedPinalytics;
        this.f143112c = trackingParamAttacher;
        this.f143113d = pinalyticsManager;
        this.f143114e = appScope;
    }

    public final d0 a() {
        return new d0(this.f143110a, this.f143111b, this.f143112c, this.f143113d, this.f143114e);
    }
}
