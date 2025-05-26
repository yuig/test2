package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import java.util.Optional;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pt1 extends cj0 {
    public final Optional O;
    public f03 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt1(Context applicationContext, j0 uiScope, CoroutineContext uiContext, j0 backgroundScope, oh0 flags, a.j3 traceLogger, String afmaVersion, Optional adWebViewContainer, h92 requestType, r0 adConfiguration, x activityTracker, n1 adEventEmitter, a.e4 omidMonitor, cm0 gmaUtil) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, requestType, adConfiguration, activityTracker, adEventEmitter, omidMonitor, gmaUtil);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adWebViewContainer, "adWebViewContainer");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.O = adWebViewContainer;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.pt1 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.lt1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.lt1 r0 = (ads_mobile_sdk.lt1) r0
            int r1 = r0.f7958d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7958d = r1
            goto L18
        L13:
            ads_mobile_sdk.lt1 r0 = new ads_mobile_sdk.lt1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7956b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7958d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r6)
            goto L64
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ads_mobile_sdk.pt1 r5 = r0.f7955a
            ue.c.H(r6)
            goto L49
        L38:
            ue.c.H(r6)
            r0.f7955a = r5
            r0.f7958d = r4
            r5.getClass()
            java.lang.Object r6 = ads_mobile_sdk.cj0.b(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L67
            r6 = 0
            r0.f7955a = r6
            r0.f7958d = r3
            kotlin.coroutines.CoroutineContext r2 = r5.f13048c
            ads_mobile_sdk.mt1 r3 = new ads_mobile_sdk.mt1
            r3.<init>(r5, r6)
            java.lang.Object r5 = kotlin.jvm.internal.j.M(r0, r2, r3)
            if (r5 != r1) goto L64
            return r1
        L64:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pt1.a(ads_mobile_sdk.pt1, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wi0
    public final Object b(bl2.c cVar) {
        return a(this, cVar);
    }

    @Override // ads_mobile_sdk.cj0, ads_mobile_sdk.wi0
    public final Object a(wi.o oVar, bl2.c cVar) {
        return a(this, oVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.pt1 r6, wi.o r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.nt1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.nt1 r0 = (ads_mobile_sdk.nt1) r0
            int r1 = r0.f8990e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8990e = r1
            goto L18
        L13:
            ads_mobile_sdk.nt1 r0 = new ads_mobile_sdk.nt1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8988c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f8990e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            ue.c.H(r8)
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            wi.o r7 = r0.f8987b
            ads_mobile_sdk.pt1 r6 = r0.f8986a
            ue.c.H(r8)
            goto L52
        L3b:
            ue.c.H(r8)
            r0.f8986a = r6
            r0.f8987b = r7
            r0.f8990e = r4
            kotlin.coroutines.CoroutineContext r8 = r6.f13048c
            ads_mobile_sdk.mt1 r2 = new ads_mobile_sdk.mt1
            r2.<init>(r6, r5)
            java.lang.Object r8 = kotlin.jvm.internal.j.M(r0, r8, r2)
            if (r8 != r1) goto L52
            return r1
        L52:
            r0.f8986a = r5
            r0.f8987b = r5
            r0.f8990e = r3
            java.lang.Object r6 = super.a(r7, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pt1.a(ads_mobile_sdk.pt1, wi.o, bl2.c):java.lang.Object");
    }
}
