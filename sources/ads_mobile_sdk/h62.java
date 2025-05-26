package ads_mobile_sdk;

import a.pd;
import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h62 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final Context f5864f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f5865g;

    public h62(pd pdVar, a.m mVar, Map map, Context context, bt2 bt2Var) {
        super("r0lkQRJJwM6tWsz4k9yUUueC0uhM0kMCZHl4/WGekN1w3GaOlPoiQS6wcs1N9NEM", "lu7ey/s51kcpSt1wKr4P6tYWg+dQz8/cyQBcN+R76Vw=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_RECENT_FOREGROUND_TIME_SIGNALS_TASK));
        this.f5864f = context;
        this.f5865g = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ads_mobile_sdk.xk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.reflect.Method r6, a.pd r7) {
        /*
            r5 = this;
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L42
            r2 = 30
            if (r1 < r2) goto L21
            java.lang.String r1 = ""
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L42
            android.content.Context r3 = r5.f5864f     // Catch: java.lang.Throwable -> L42
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r6 = r6.invoke(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L42
            r6.getClass()     // Catch: java.lang.Throwable -> L42
        L1f:
            r0 = r6
            goto L42
        L21:
            java.util.Map r6 = r5.f5865g     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "gs"
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L42
            com.google.common.util.concurrent.c0 r6 = (com.google.common.util.concurrent.c0) r6     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L42
            boolean r1 = r6.isDone()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L42
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L42
            ads_mobile_sdk.wb r6 = (ads_mobile_sdk.wb) r6     // Catch: java.lang.Throwable -> L42
            long r1 = r6.t()     // Catch: java.lang.Throwable -> L42
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L42
            goto L1f
        L42:
            monitor-enter(r7)
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L5d
            r7.b()     // Catch: java.lang.Throwable -> L5d
            ads_mobile_sdk.sj0 r6 = r7.f10110b     // Catch: java.lang.Throwable -> L5d
            ads_mobile_sdk.wb r6 = (ads_mobile_sdk.wb) r6     // Catch: java.lang.Throwable -> L5d
            int r2 = ads_mobile_sdk.wb.s(r6)     // Catch: java.lang.Throwable -> L5d
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 | r3
            ads_mobile_sdk.wb.G(r6, r2)     // Catch: java.lang.Throwable -> L5d
            ads_mobile_sdk.wb.e0(r6, r0)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h62.a(java.lang.reflect.Method, a.pd):void");
    }
}
