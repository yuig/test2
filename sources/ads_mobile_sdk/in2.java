package ads_mobile_sdk;

import a.j4;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class in2 implements j4 {

    /* renamed from: a, reason: collision with root package name */
    public final u5 f6503a;

    /* renamed from: b, reason: collision with root package name */
    public final kg f6504b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6505c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6506d;

    public in2(u5 adUnitStatsTracker, kg appStatsTracker, String requestId, long j13) {
        Intrinsics.checkNotNullParameter(adUnitStatsTracker, "adUnitStatsTracker");
        Intrinsics.checkNotNullParameter(appStatsTracker, "appStatsTracker");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f6503a = adUnitStatsTracker;
        this.f6504b = appStatsTracker;
        this.f6505c = requestId;
        this.f6506d = j13;
    }

    @Override // a.j4
    public final Object a(wi.k kVar, bl2.c cVar) {
        Unit unit;
        kg kgVar = this.f6504b;
        long j13 = this.f6506d;
        synchronized (kgVar.f7288b) {
            try {
                if (kgVar.f7290d.get() == -1) {
                    kgVar.f7292f = Long.valueOf(j13);
                }
                kgVar.f7290d.incrementAndGet();
                kgVar.f7291e.incrementAndGet();
                unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return unit;
    }

    @Override // a.j4
    public final Object b(bl2.c cVar) {
        u5 u5Var = this.f6503a;
        String requestId = this.f6505c;
        long j13 = this.f6506d;
        u5Var.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        ConcurrentHashMap concurrentHashMap = u5Var.f11835c;
        zn2.a aVar = zn2.b.f142311b;
        concurrentHashMap.put(requestId, new zn2.b(dl2.b.Q2(j13, zn2.d.MILLISECONDS)));
        return Unit.f80348a;
    }
}
