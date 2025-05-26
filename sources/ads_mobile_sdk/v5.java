package ads_mobile_sdk;

import a.hb;
import a.zb;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v5 implements hb {

    /* renamed from: a, reason: collision with root package name */
    public final String f12348a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.k f12349b;

    /* renamed from: c, reason: collision with root package name */
    public final u5 f12350c;

    /* renamed from: d, reason: collision with root package name */
    public final zb f12351d;

    public v5(String requestId, wi.k baseRequest, u5 adUnitStatsTracker, zb clock) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(adUnitStatsTracker, "adUnitStatsTracker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f12348a = requestId;
        this.f12349b = baseRequest;
        this.f12350c = adUnitStatsTracker;
        this.f12351d = clock;
    }

    @Override // a.hb
    public final Object a(cf2 cf2Var, r0 r0Var, wi.b0 b0Var, bl2.c cVar) {
        u5 u5Var = this.f12350c;
        String requestId = this.f12348a;
        String l13 = this.f12349b.l();
        this.f12351d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        u5Var.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        zn2.b bVar = (zn2.b) u5Var.f11835c.get(requestId);
        if (bVar != null && l13 != null) {
            ConcurrentHashMap concurrentHashMap = u5Var.f11836d;
            zn2.a aVar = zn2.b.f142311b;
            concurrentHashMap.put(l13, new zn2.b(zn2.b.j(dl2.b.Q2(elapsedRealtime, zn2.d.MILLISECONDS), bVar.f142314a)));
        }
        return Unit.f80348a;
    }
}
