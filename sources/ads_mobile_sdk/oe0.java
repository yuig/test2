package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import ao2.j0;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import wi.n;

/* loaded from: classes2.dex */
public final class oe0 extends di0 implements a.d2 {
    public final y4 K;
    public final n1 L;
    public final sb2 M;
    public final ss2 N;
    public final AtomicBoolean O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe0(Context applicationContext, j0 uiScope, CoroutineContext uiContext, j0 backgroundScope, oh0 flags, a.j3 traceLogger, y4 adSpamClient, String afmaVersion, n1 adEventEmitter, ln0 fullscreenWebViewContainer, sb2 rootTraceCreator, ss2 traceMetaSet, h92 requestType, r0 adConfiguration, a.e4 omidMonitor, cm0 gmaUtil) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, requestType, adConfiguration, omidMonitor, gmaUtil);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(fullscreenWebViewContainer, "fullscreenWebViewContainer");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.K = adSpamClient;
        this.L = adEventEmitter;
        this.M = rootTraceCreator;
        this.N = traceMetaSet;
        a((View) fullscreenWebViewContainer);
        a(fullscreenWebViewContainer);
        this.O = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ads_mobile_sdk.wi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.me0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.me0 r0 = (ads_mobile_sdk.me0) r0
            int r1 = r0.f8190d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8190d = r1
            goto L18
        L13:
            ads_mobile_sdk.me0 r0 = new ads_mobile_sdk.me0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f8188b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f8190d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            ue.c.H(r8)
            goto L77
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            ads_mobile_sdk.oe0 r2 = r0.f8187a
            ue.c.H(r8)
            goto L6a
        L3c:
            ads_mobile_sdk.oe0 r2 = r0.f8187a
            ue.c.H(r8)
            goto L55
        L42:
            ue.c.H(r8)
            r0.f8187a = r7
            r0.f8190d = r6
            ads_mobile_sdk.ym0 r8 = r7.h()
            r8.f14327m = r3
            kotlin.Unit r8 = kotlin.Unit.f80348a
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r7
        L55:
            java.util.concurrent.atomic.AtomicBoolean r8 = r2.f13057l
            boolean r8 = r8.get()
            if (r8 == 0) goto L6a
            ads_mobile_sdk.n1 r8 = r2.L
            r0.f8187a = r2
            r0.f8190d = r5
            kotlin.Unit r8 = r8.g(r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            ads_mobile_sdk.n1 r8 = r2.L
            r0.f8187a = r3
            r0.f8190d = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.oe0.a(bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wi0
    public final Object c(bl2.c cVar) {
        Object a13 = a(new wi.o(n.INTERNAL_ERROR, "There was an internal error when attempting to show fullscreen content."), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    public final boolean n() {
        if (kh2.n3.g(this.f13046a)) {
            gk0.a("Fullscreen ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies", null);
            ft2.a(this.f13049d, new ke0(this, null));
            Intrinsics.checkNotNullParameter("Application process is in background", "message");
            ft2.a(true, "Application process is in background", null);
            return false;
        }
        if (!this.O.getAndSet(true)) {
            return true;
        }
        gk0.a("This ad has already been shown.", null);
        ft2.a(this.f13049d, new le0(this, null));
        Intrinsics.checkNotNullParameter("The ad has already been shown", "message");
        ft2.a(true, "The ad has already been shown", null);
        return false;
    }

    @Override // ads_mobile_sdk.wi0
    public final Object a(wi.o oVar, bl2.c cVar) {
        Object a13 = this.L.a(oVar, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.d2
    public final void a(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        sb2 sb2Var = this.M;
        il0 il0Var = il0.CUI_NAME_ADSHOW;
        List b13 = kotlin.collections.e0.b(this.C.toString());
        ss2 ss2Var = this.N;
        if (qs2.b().f9801a == null) {
            p12 a13 = sb2.a(sb2Var, il0Var, b13, ss2Var);
            try {
                y4 y4Var = this.K;
                StackTraceElement[] stackTrace = new Exception().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                y4Var.b(kotlin.collections.c0.b0(stackTrace));
                if (!n()) {
                    dl2.b.J(a13, null);
                    return;
                }
                this.f13064t = z13;
                a(context);
                Object obj = Unit.f80348a;
                if (obj instanceof jk0) {
                    ft2.a((jk0) obj);
                }
                dl2.b.J(a13, null);
                return;
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (!(th3 instanceof a.jf)) {
                        a13.a(th3);
                        if (!(th3 instanceof TimeoutCancellationException)) {
                            if (!(th3 instanceof CancellationException)) {
                                if (!(th3 instanceof uk0)) {
                                    throw new dk0(th3);
                                }
                                throw th3;
                            }
                            throw new yj0(th3);
                        }
                        throw new xl0(th3);
                    }
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        dl2.b.J(a13, th4);
                        throw th5;
                    }
                }
            }
        }
        cs2 a14 = qs2.a(il0Var, kotlin.collections.q0.f80391a, true);
        try {
            y4 y4Var2 = this.K;
            StackTraceElement[] stackTrace2 = new Exception().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
            y4Var2.b(kotlin.collections.c0.b0(stackTrace2));
            if (!n()) {
                dl2.b.J(a14, null);
                return;
            }
            this.f13064t = z13;
            a(context);
            Object obj2 = Unit.f80348a;
            if (obj2 instanceof jk0) {
                ft2.a((jk0) obj2);
            }
            dl2.b.J(a14, null);
        } catch (Throwable th6) {
            try {
                a14.b(th6);
                if (!(th6 instanceof a.jf)) {
                    a14.a(th6);
                    if (!(th6 instanceof TimeoutCancellationException)) {
                        if (!(th6 instanceof CancellationException)) {
                            if (!(th6 instanceof uk0)) {
                                throw new dk0(th6);
                            }
                            throw th6;
                        }
                        throw new yj0(th6);
                    }
                    throw new xl0(th6);
                }
                throw th6;
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    dl2.b.J(a14, th7);
                    throw th8;
                }
            }
        }
    }
}
