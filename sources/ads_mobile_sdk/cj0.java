package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import wi.n;

/* loaded from: classes2.dex */
public abstract class cj0 extends di0 {
    public final x K;
    public final n1 L;
    public boolean M;
    public boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(Context applicationContext, j0 uiScope, CoroutineContext uiContext, j0 backgroundScope, oh0 flags, a.j3 traceLogger, String afmaVersion, h92 requestType, r0 adConfiguration, x activityTracker, n1 adEventEmitter, a.e4 omidMonitor, cm0 gmaUtil) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, requestType, adConfiguration, omidMonitor, gmaUtil);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.K = activityTracker;
        this.L = adEventEmitter;
        this.M = true;
        this.N = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.cj0 r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.zi0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.zi0 r0 = (ads_mobile_sdk.zi0) r0
            int r1 = r0.f14791d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14791d = r1
            goto L18
        L13:
            ads_mobile_sdk.zi0 r0 = new ads_mobile_sdk.zi0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f14789b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14791d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.cj0 r4 = r0.f14788a
            ue.c.H(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r5)
            r0.f14788a = r4
            r0.f14791d = r3
            r4.getClass()
            java.lang.Object r5 = ads_mobile_sdk.wi0.a(r4, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L6f
            ao2.j0 r5 = r4.f13049d
            ads_mobile_sdk.aj0 r0 = new ads_mobile_sdk.aj0
            r1 = 0
            r0.<init>(r4, r1)
            kotlin.coroutines.j r4 = kotlin.coroutines.j.f80412a
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            ads_mobile_sdk.et2 r2 = new ads_mobile_sdk.et2
            r2.<init>(r0, r1)
            r0 = 2
            kotlin.jvm.internal.j.z(r5, r4, r1, r2, r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L6f:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cj0.b(ads_mobile_sdk.cj0, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wi0
    public Object a(bl2.c cVar) {
        return a(this, cVar);
    }

    @Override // ads_mobile_sdk.wi0
    public final Object c(bl2.c cVar) {
        Object a13 = a(new wi.o(n.INTERNAL_ERROR, "There was an internal error when attempting to show fullscreen content."), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.cj0 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.xi0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.xi0 r0 = (ads_mobile_sdk.xi0) r0
            int r1 = r0.f13682d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13682d = r1
            goto L18
        L13:
            ads_mobile_sdk.xi0 r0 = new ads_mobile_sdk.xi0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13680b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13682d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            ads_mobile_sdk.cj0 r5 = r0.f13679a
            ue.c.H(r6)
            goto L44
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ue.c.H(r6)
            r0.f13679a = r5
            r0.f13682d = r4
            ads_mobile_sdk.ym0 r6 = r5.h()
            r6.f14327m = r3
            kotlin.Unit r6 = kotlin.Unit.f80348a
            if (r6 != r1) goto L44
            return r1
        L44:
            boolean r6 = r5.N
            if (r6 == 0) goto L71
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f13057l
            boolean r6 = r6.get()
            if (r6 == 0) goto L71
            ao2.j0 r6 = r5.f13049d
            ads_mobile_sdk.yi0 r0 = new ads_mobile_sdk.yi0
            r0.<init>(r5, r3)
            kotlin.coroutines.j r5 = kotlin.coroutines.j.f80412a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            ads_mobile_sdk.et2 r1 = new ads_mobile_sdk.et2
            r1.<init>(r0, r3)
            r0 = 2
            kotlin.jvm.internal.j.z(r6, r5, r3, r1, r0)
        L71:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cj0.a(ads_mobile_sdk.cj0, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wi0
    public Object a(wi.o oVar, bl2.c cVar) {
        if (this.N) {
            Object a13 = this.L.a(oVar, cVar);
            return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
        }
        return Unit.f80348a;
    }
}
