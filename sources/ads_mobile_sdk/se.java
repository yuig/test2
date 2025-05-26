package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class se {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11061a;

    /* renamed from: b, reason: collision with root package name */
    public final a.j3 f11062b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f11063c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.k f11064d;

    public se(Context applicationContext, a.j3 traceLogger, zb clock) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f11061a = applicationContext;
        this.f11062b = traceLogger;
        this.f11063c = clock;
        this.f11064d = xk2.m.b(new pe(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.se r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.qe
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.qe r0 = (ads_mobile_sdk.qe) r0
            int r1 = r0.f10054d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10054d = r1
            goto L18
        L13:
            ads_mobile_sdk.qe r0 = new ads_mobile_sdk.qe
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10052b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10054d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.se r4 = r0.f10051a
            ue.c.H(r5)     // Catch: java.lang.Exception -> L29
            goto L68
        L29:
            r5 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ue.c.H(r5)
            r0.f10051a = r4     // Catch: java.lang.Exception -> L29
            r0.f10054d = r3     // Catch: java.lang.Exception -> L29
            ao2.o r5 = new ao2.o     // Catch: java.lang.Exception -> L29
            bl2.c r2 = cl2.h.b(r0)     // Catch: java.lang.Exception -> L29
            r5.<init>(r3, r2)     // Catch: java.lang.Exception -> L29
            r5.v()     // Catch: java.lang.Exception -> L29
            xk2.k r2 = r4.f11064d     // Catch: java.lang.Exception -> L29
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L29
            ah.a r2 = (ah.a) r2     // Catch: java.lang.Exception -> L29
            com.google.android.gms.tasks.Task r2 = r2.a()     // Catch: java.lang.Exception -> L29
            ads_mobile_sdk.re r3 = new ads_mobile_sdk.re     // Catch: java.lang.Exception -> L29
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L29
            r2.addOnCompleteListener(r3)     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r5.u()     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L65
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)     // Catch: java.lang.Exception -> L29
        L65:
            if (r5 != r1) goto L68
            return r1
        L68:
            a.ad r5 = (a.ad) r5     // Catch: java.lang.Exception -> L29
            goto L7c
        L6b:
            a.j3 r4 = r4.f11062b
            ads_mobile_sdk.ks2 r4 = (ads_mobile_sdk.ks2) r4
            java.lang.String r0 = "Exception while getting AppSet Id"
            r4.a(r0, r5)
            ads_mobile_sdk.kk0 r4 = new ads_mobile_sdk.kk0
            r0 = 6
            r1 = 0
            r4.<init>(r5, r1, r1, r0)
            r5 = r4
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.se.a(ads_mobile_sdk.se, bl2.c):java.lang.Object");
    }
}
