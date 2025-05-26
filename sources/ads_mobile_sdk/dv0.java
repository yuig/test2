package ads_mobile_sdk;

import a.l0;
import android.content.Context;
import ao2.g0;
import ao2.j0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dv0 extends wi0 {
    public final ku0 C;
    public final wi.t D;
    public final x E;
    public final ym0 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ku0 inspectorManager, ym0 webView, wi.t listener, x activityTracker, Context applicationContext, j0 uiScope, CoroutineContext uiContext, j0 backgroundScope, oh0 flags, a.j3 traceLogger, String afmaVersion, cm0 gmaUtil) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, gmaUtil);
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.C = inspectorManager;
        this.D = listener;
        this.E = activityTracker;
        this.F = webView;
        this.G = -1;
        a(webView);
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ads_mobile_sdk.wi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.yu0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.yu0 r0 = (ads_mobile_sdk.yu0) r0
            int r1 = r0.f14411d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14411d = r1
            goto L18
        L13:
            ads_mobile_sdk.yu0 r0 = new ads_mobile_sdk.yu0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f14409b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14411d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            ads_mobile_sdk.dv0 r1 = r0.f14408a
            ue.c.H(r6)
            goto L45
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ue.c.H(r6)
            r0.f14408a = r5
            r0.f14411d = r4
            ads_mobile_sdk.ym0 r6 = r5.h()
            r6.f14327m = r3
            kotlin.Unit r6 = kotlin.Unit.f80348a
            if (r6 != r1) goto L44
            return r1
        L44:
            r1 = r5
        L45:
            java.util.concurrent.atomic.AtomicBoolean r6 = r1.f13057l
            boolean r6 = r6.get()
            if (r6 == 0) goto L75
            a.l0 r6 = ads_mobile_sdk.cm0.f3958f
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            a.pg r0 = ads_mobile_sdk.zs2.f14913b
            kotlin.coroutines.CoroutineContext r6 = r6.minusKey(r0)
            ao2.g0 r0 = ao2.g0.f20153a
            kotlin.coroutines.CoroutineContext r6 = r6.minusKey(r0)
            ao2.g0 r0 = ao2.g0.f20154b
            kotlin.coroutines.CoroutineContext r6 = r6.minusKey(r0)
            ho2.c r6 = dl2.b.b(r6)
            ads_mobile_sdk.xu0 r0 = new ads_mobile_sdk.xu0
            r0.<init>(r1, r3)
            r1 = 3
            kotlin.jvm.internal.j.z(r6, r3, r3, r0, r1)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L75:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dv0.a(bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wi0
    public final Object c(bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new av0(this, null), 3);
        return Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.cv0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.cv0 r0 = (ads_mobile_sdk.cv0) r0
            int r1 = r0.f4045d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4045d = r1
            goto L18
        L13:
            ads_mobile_sdk.cv0 r0 = new ads_mobile_sdk.cv0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4043b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4045d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.dv0 r0 = r0.f4042a
            ue.c.H(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ue.c.H(r5)
            r0.f4042a = r4
            r0.f4045d = r3
            r5 = 0
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            r0 = r4
        L41:
            ads_mobile_sdk.x r5 = r0.E
            android.app.Activity r5 = r5.c()
            if (r5 == 0) goto L4a
            goto L4c
        L4a:
            android.content.Context r5 = r0.f13046a
        L4c:
            boolean r5 = r0.a(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dv0.d(bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wi0
    public final ym0 h() {
        return this.F;
    }

    @Override // ads_mobile_sdk.wi0
    public final int i() {
        return this.G;
    }

    @Override // ads_mobile_sdk.wi0
    public final Object a(wi.o oVar, bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new zu0(this, null), 3);
        return Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.bv0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.bv0 r0 = (ads_mobile_sdk.bv0) r0
            int r1 = r0.f3612e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3612e = r1
            goto L18
        L13:
            ads_mobile_sdk.bv0 r0 = new ads_mobile_sdk.bv0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f3610c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f3612e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L6c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm.o r7 = r0.f3609b
            ads_mobile_sdk.dv0 r2 = r0.f3608a
            ue.c.H(r8)
            goto L55
        L3a:
            ue.c.H(r8)
            nm.o r8 = new nm.o
            r8.<init>()
            ads_mobile_sdk.ku0 r2 = r6.C
            r0.f3608a = r6
            r0.f3609b = r8
            r0.f3612e = r4
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            r2 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L55:
            java.lang.String r7 = r7.k(r8)
            ads_mobile_sdk.ym0 r8 = r2.F
            kotlin.jvm.internal.Intrinsics.f(r7)
            r2 = 0
            r0.f3608a = r2
            r0.f3609b = r2
            r0.f3612e = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dv0.a(java.lang.String, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wi0
    public final void a(int i13) {
        this.G = i13;
    }
}
