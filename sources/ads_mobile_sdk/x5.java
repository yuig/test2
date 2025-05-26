package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x5 implements a.q6 {

    /* renamed from: a, reason: collision with root package name */
    public final u5 f13482a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.k f13483b;

    public x5(u5 adUnitStatsTracker, wi.k baseRequest) {
        Intrinsics.checkNotNullParameter(adUnitStatsTracker, "adUnitStatsTracker");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        this.f13482a = adUnitStatsTracker;
        this.f13483b = baseRequest;
    }

    @Override // a.q6
    public final Object l(bl2.c cVar) {
        u5 u5Var = this.f13482a;
        String l13 = this.f13483b.l();
        if (l13 != null) {
            synchronized (u5Var.f11833a) {
                try {
                    Integer num = (Integer) u5Var.f11834b.get(l13);
                    if (num == null) {
                        num = 0;
                    }
                    u5Var.f11834b.put(l13, Integer.valueOf(num.intValue() + 1));
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            u5Var.getClass();
        }
        return Unit.f80348a;
    }
}
