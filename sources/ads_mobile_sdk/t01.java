package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11304a;

    public t01(a.o8 o8Var) {
        this.f11304a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        kg appStatsTracker = (kg) this.f11304a.get();
        Intrinsics.checkNotNullParameter(appStatsTracker, "appStatsTracker");
        return Integer.valueOf(appStatsTracker.f7289c.incrementAndGet());
    }
}
