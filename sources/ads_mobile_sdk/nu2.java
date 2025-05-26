package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nu2 extends cj0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f8995p = 0;
    public final dz O;
    public final ss2 P;
    public final lz2 Q;
    public final a.ia R;
    public ym0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu2(Context applicationContext, j0 uiScope, CoroutineContext uiContext, j0 backgroundScope, oh0 flags, a.j3 traceLogger, String afmaVersion, h92 requestType, r0 adConfiguration, x activityTracker, n1 adEventEmitter, a.e4 omidMonitor, cm0 gmaUtil, dz csiTicker, ss2 traceMetaSet, lz2 webViewFactory, a.ia twoPieceExpandedWebViewConfigurator) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, requestType, adConfiguration, activityTracker, adEventEmitter, omidMonitor, gmaUtil);
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
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(twoPieceExpandedWebViewConfigurator, "twoPieceExpandedWebViewConfigurator");
        this.O = csiTicker;
        this.P = traceMetaSet;
        this.Q = webViewFactory;
        this.R = twoPieceExpandedWebViewConfigurator;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r24, int r25, boolean r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, ads_mobile_sdk.ym0 r30, boolean r31, bl2.c r32) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nu2.a(boolean, int, boolean, java.lang.String, java.lang.String, java.lang.String, ads_mobile_sdk.ym0, boolean, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wi0
    public final Object b(bl2.c cVar) {
        return b(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.nu2 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.hu2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.hu2 r0 = (ads_mobile_sdk.hu2) r0
            int r1 = r0.f6103d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6103d = r1
            goto L18
        L13:
            ads_mobile_sdk.hu2 r0 = new ads_mobile_sdk.hu2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f6101b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6103d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r6)
            goto L68
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ads_mobile_sdk.nu2 r5 = r0.f6100a
            ue.c.H(r6)
            goto L49
        L38:
            ue.c.H(r6)
            r0.f6100a = r5
            r0.f6103d = r4
            r5.getClass()
            java.lang.Object r6 = ads_mobile_sdk.cj0.b(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L67
            ads_mobile_sdk.ym0 r6 = r5.S
            r2 = 0
            if (r6 == 0) goto L61
            r0.f6100a = r2
            r0.f6103d = r3
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L68
            return r1
        L61:
            java.lang.String r5 = "previousWebView"
            kotlin.jvm.internal.Intrinsics.r(r5)
            throw r2
        L67:
            r4 = 0
        L68:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nu2.b(ads_mobile_sdk.nu2, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.cj0, ads_mobile_sdk.wi0
    public final Object a(bl2.c cVar) {
        return a(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.nu2 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.gu2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.gu2 r0 = (ads_mobile_sdk.gu2) r0
            int r1 = r0.f5702d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5702d = r1
            goto L18
        L13:
            ads_mobile_sdk.gu2 r0 = new ads_mobile_sdk.gu2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5700b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5702d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r6)
            goto L5d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ads_mobile_sdk.nu2 r5 = r0.f5699a
            ue.c.H(r6)
            goto L49
        L38:
            ue.c.H(r6)
            r0.f5699a = r5
            r0.f5702d = r4
            r5.getClass()
            java.lang.Object r6 = ads_mobile_sdk.cj0.a(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            xk2.k r5 = r5.F
            java.lang.Object r5 = r5.getValue()
            ads_mobile_sdk.ym0 r5 = (ads_mobile_sdk.ym0) r5
            r6 = 0
            r0.f5699a = r6
            r0.f5702d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nu2.a(ads_mobile_sdk.nu2, bl2.c):java.lang.Object");
    }
}
