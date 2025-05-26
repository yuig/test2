package ads_mobile_sdk;

import a.q2;
import android.content.Context;
import ao2.j0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pz2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9862a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f9863b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f9864c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f9865d;

    /* renamed from: e, reason: collision with root package name */
    public final sb2 f9866e;

    /* renamed from: f, reason: collision with root package name */
    public final y4 f9867f;

    /* renamed from: g, reason: collision with root package name */
    public final a.j3 f9868g;

    /* renamed from: h, reason: collision with root package name */
    public final cm0 f9869h;

    /* renamed from: i, reason: collision with root package name */
    public final q2 f9870i;

    /* renamed from: j, reason: collision with root package name */
    public final tp0 f9871j;

    /* renamed from: k, reason: collision with root package name */
    public final a.r6 f9872k;

    /* renamed from: l, reason: collision with root package name */
    public final oh0 f9873l;

    public pz2(Context context, CoroutineContext backgroundContext, j0 backgroundScope, j0 uiScope, CoroutineContext uiContext, sb2 rootTraceCreator, y4 adSpamClient, a.j3 traceLogger, cm0 gmaUtil, q2 userAgentProvider, tp0 htmlUtil, a.r6 bridgeFactory, oh0 flags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
        Intrinsics.checkNotNullParameter(bridgeFactory, "bridgeFactory");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f9862a = context;
        this.f9863b = backgroundScope;
        this.f9864c = uiScope;
        this.f9865d = uiContext;
        this.f9866e = rootTraceCreator;
        this.f9867f = adSpamClient;
        this.f9868g = traceLogger;
        this.f9869h = gmaUtil;
        this.f9870i = userAgentProvider;
        this.f9871j = htmlUtil;
        this.f9872k = bridgeFactory;
        this.f9873l = flags;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f A[PHI: r1
      0x008f: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v1 java.lang.Object) binds: [B:17:0x008c, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.l03 r16, ads_mobile_sdk.ss2 r17, ads_mobile_sdk.dz r18, a.ce r19, bl2.c r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof ads_mobile_sdk.mz2
            if (r2 == 0) goto L16
            r2 = r1
            ads_mobile_sdk.mz2 r2 = (ads_mobile_sdk.mz2) r2
            int r3 = r2.f8464h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f8464h = r3
            goto L1b
        L16:
            ads_mobile_sdk.mz2 r2 = new ads_mobile_sdk.mz2
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.f8462f
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r2.f8464h
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L49
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            ue.c.H(r1)
            goto L8f
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            a.ce r4 = r2.f8461e
            ads_mobile_sdk.dz r6 = r2.f8460d
            ads_mobile_sdk.ss2 r7 = r2.f8459c
            ads_mobile_sdk.l03 r8 = r2.f8458b
            ads_mobile_sdk.pz2 r9 = r2.f8457a
            ue.c.H(r1)
            r10 = r6
            r12 = r8
            r8 = r9
            r9 = r7
            r7 = r4
            goto L6f
        L49:
            ue.c.H(r1)
            a.q2 r1 = r0.f9870i
            r2.f8457a = r0
            r4 = r16
            r2.f8458b = r4
            r7 = r17
            r2.f8459c = r7
            r8 = r18
            r2.f8460d = r8
            r9 = r19
            r2.f8461e = r9
            r2.f8464h = r6
            java.lang.Object r1 = r1.a(r2)
            if (r1 != r3) goto L69
            return r3
        L69:
            r12 = r4
            r10 = r8
            r8 = r0
            r14 = r9
            r9 = r7
            r7 = r14
        L6f:
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            kotlin.coroutines.CoroutineContext r1 = r8.f9865d
            ads_mobile_sdk.nz2 r4 = new ads_mobile_sdk.nz2
            r13 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            r2.f8457a = r6
            r2.f8458b = r6
            r2.f8459c = r6
            r2.f8460d = r6
            r2.f8461e = r6
            r2.f8464h = r5
            java.lang.Object r1 = kotlin.jvm.internal.j.M(r2, r1, r4)
            if (r1 != r3) goto L8f
            return r3
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pz2.a(ads_mobile_sdk.l03, ads_mobile_sdk.ss2, ads_mobile_sdk.dz, a.ce, bl2.c):java.lang.Object");
    }
}
