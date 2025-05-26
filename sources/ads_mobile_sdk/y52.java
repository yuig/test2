package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y52 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final kg f14089a;

    /* renamed from: b, reason: collision with root package name */
    public final u5 f14090b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.k f14091c;

    /* renamed from: d, reason: collision with root package name */
    public final fg f14092d;

    public y52(kg appStatsTracker, u5 adUnitStatsTracker, wi.k request, fg appState) {
        Intrinsics.checkNotNullParameter(appStatsTracker, "appStatsTracker");
        Intrinsics.checkNotNullParameter(adUnitStatsTracker, "adUnitStatsTracker");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.f14089a = appStatsTracker;
        this.f14090b = adUnitStatsTracker;
        this.f14091c = request;
        this.f14092d = appState;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.QUALITY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r12 == null) goto L19;
     */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r12) {
        /*
            r11 = this;
            ads_mobile_sdk.kg r12 = r11.f14089a
            java.lang.Object r0 = r12.f7288b
            monitor-enter(r0)
            java.lang.Long r1 = r12.f7292f     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1c
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L19
            a.zb r3 = r12.f7287a     // Catch: java.lang.Throwable -> L19
            r3.getClass()     // Catch: java.lang.Throwable -> L19
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L19
            long r3 = r3 - r1
        L17:
            r9 = r3
            goto L1f
        L19:
            r12 = move-exception
            goto L9b
        L1c:
            r3 = 0
            goto L17
        L1f:
            aj.d r1 = new aj.d     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.atomic.AtomicInteger r2 = r12.f7289c     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.atomic.AtomicInteger r2 = r12.f7290d     // Catch: java.lang.Throwable -> L19
            int r7 = r2.get()     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.atomic.AtomicInteger r12 = r12.f7291e     // Catch: java.lang.Throwable -> L19
            int r8 = r12.get()     // Catch: java.lang.Throwable -> L19
            r5 = r1
            r5.<init>(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            ads_mobile_sdk.u5 r12 = r11.f14090b
            wi.k r0 = r11.f14091c
            java.lang.String r0 = r0.l()
            if (r0 == 0) goto L4d
            java.util.concurrent.ConcurrentHashMap r12 = r12.f11834b
            java.lang.Object r12 = r12.get(r0)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 != 0) goto L55
            goto L50
        L4d:
            r12.getClass()
        L50:
            r12 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
        L55:
            int r12 = r12.intValue()
            ads_mobile_sdk.u5 r0 = r11.f14090b
            wi.k r2 = r11.f14091c
            java.lang.String r2 = r2.l()
            if (r2 == 0) goto L70
            java.util.concurrent.ConcurrentHashMap r0 = r0.f11836d
            java.lang.Object r0 = r0.get(r2)
            zn2.b r0 = (zn2.b) r0
            if (r0 == 0) goto L73
            long r2 = r0.f142314a
            goto L75
        L70:
            r0.getClass()
        L73:
            long r2 = ads_mobile_sdk.u5.f11832e
        L75:
            aj.b r0 = new aj.b
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r12)
            long r2 = zn2.b.e(r2)
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r2)
            r0.<init>(r4, r12)
            ads_mobile_sdk.pk0 r12 = new ads_mobile_sdk.pk0
            ads_mobile_sdk.x52 r2 = new ads_mobile_sdk.x52
            ads_mobile_sdk.fg r3 = r11.f14092d
            java.util.concurrent.atomic.AtomicInteger r3 = r3.f5145e
            int r3 = r3.get()
            r2.<init>(r1, r3, r0)
            r12.<init>(r2)
            return r12
        L9b:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y52.c(bl2.c):java.lang.Object");
    }
}
