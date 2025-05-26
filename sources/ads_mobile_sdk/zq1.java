package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zq1 extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f14863d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f14864e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f14865f;

    /* renamed from: g, reason: collision with root package name */
    public final a.j3 f14866g;

    /* renamed from: h, reason: collision with root package name */
    public final sb2 f14867h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14868i;

    /* renamed from: j, reason: collision with root package name */
    public final ao2.x f14869j;

    /* renamed from: k, reason: collision with root package name */
    public final rv1 f14870k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq1(Context applicationContext, CoroutineContext uiContext, j0 backgroundScope, a.j3 traceLogger, sb2 rootTraceCreator, String gmaVersion) {
        super((il0) null, false, 7);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        this.f14863d = applicationContext;
        this.f14864e = uiContext;
        this.f14865f = backgroundScope;
        this.f14866g = traceLogger;
        this.f14867h = rootTraceCreator;
        this.f14868i = gmaVersion;
        this.f14869j = m0.b();
        this.f14870k = rv1.a("Google", gmaVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.zq1 r11, ads_mobile_sdk.ym0 r12, ads_mobile_sdk.lu1 r13, ads_mobile_sdk.fr0 r14, ads_mobile_sdk.ts r15, ads_mobile_sdk.lu1 r16, java.lang.String r17, bl2.c r18) {
        /*
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.jq1
            if (r2 == 0) goto L16
            r2 = r1
            ads_mobile_sdk.jq1 r2 = (ads_mobile_sdk.jq1) r2
            int r3 = r2.f6925j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f6925j = r3
            goto L1b
        L16:
            ads_mobile_sdk.jq1 r2 = new ads_mobile_sdk.jq1
            r2.<init>(r11, r1)
        L1b:
            java.lang.Object r1 = r2.f6923h
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r2.f6925j
            r5 = 1
            if (r4 == 0) goto L45
            if (r4 != r5) goto L3d
            java.lang.String r0 = r2.f6922g
            ads_mobile_sdk.lu1 r3 = r2.f6921f
            ads_mobile_sdk.ts r4 = r2.f6920e
            ads_mobile_sdk.fr0 r5 = r2.f6919d
            ads_mobile_sdk.lu1 r6 = r2.f6918c
            ads_mobile_sdk.ym0 r7 = r2.f6917b
            ads_mobile_sdk.zq1 r2 = r2.f6916a
            ue.c.H(r1)
            r10 = r0
            r0 = r2
            r9 = r3
            r8 = r4
            r4 = r7
            goto L6a
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L45:
            ue.c.H(r1)
            ao2.x r1 = r0.f14869j
            r2.f6916a = r0
            r4 = r12
            r2.f6917b = r4
            r6 = r13
            r2.f6918c = r6
            r7 = r14
            r2.f6919d = r7
            r8 = r15
            r2.f6920e = r8
            r9 = r16
            r2.f6921f = r9
            r10 = r17
            r2.f6922g = r10
            r2.f6925j = r5
            java.lang.Object r1 = r1.join(r2)
            if (r1 != r3) goto L69
            return r3
        L69:
            r5 = r7
        L6a:
            ads_mobile_sdk.vr1 r1 = a.ng.f126a
            boolean r1 = r1.f12616a
            if (r1 != 0) goto L72
            r0 = 0
            return r0
        L72:
            a.j3 r1 = r0.f14866g
            ads_mobile_sdk.kq1 r2 = new ads_mobile_sdk.kq1
            r11 = r2
            r12 = r0
            r13 = r4
            r14 = r10
            r15 = r8
            r16 = r5
            r17 = r6
            r18 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = "CreateOmidSession"
            java.lang.Object r0 = r1.b(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zq1.a(ads_mobile_sdk.zq1, ads_mobile_sdk.ym0, ads_mobile_sdk.lu1, ads_mobile_sdk.fr0, ads_mobile_sdk.ts, ads_mobile_sdk.lu1, java.lang.String, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        j0 j0Var = this.f14865f;
        wq1 block = new wq1(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        return new pk0(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.zq1 r13, ads_mobile_sdk.ym0 r14, java.lang.String r15, java.lang.String r16, ads_mobile_sdk.ts r17, ads_mobile_sdk.fr0 r18, ads_mobile_sdk.lu1 r19, ads_mobile_sdk.lu1 r20, bl2.c r21) {
        /*
            r0 = r13
            r1 = r21
            boolean r2 = r1 instanceof ads_mobile_sdk.mq1
            if (r2 == 0) goto L16
            r2 = r1
            ads_mobile_sdk.mq1 r2 = (ads_mobile_sdk.mq1) r2
            int r3 = r2.f8348k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f8348k = r3
            goto L1b
        L16:
            ads_mobile_sdk.mq1 r2 = new ads_mobile_sdk.mq1
            r2.<init>(r13, r1)
        L1b:
            java.lang.Object r1 = r2.f8346i
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r2.f8348k
            r5 = 1
            if (r4 == 0) goto L46
            if (r4 != r5) goto L3e
            ads_mobile_sdk.lu1 r0 = r2.f8345h
            ads_mobile_sdk.lu1 r3 = r2.f8344g
            ads_mobile_sdk.fr0 r4 = r2.f8343f
            ads_mobile_sdk.ts r5 = r2.f8342e
            java.lang.String r6 = r2.f8341d
            java.lang.String r7 = r2.f8340c
            ads_mobile_sdk.ym0 r8 = r2.f8339b
            ads_mobile_sdk.zq1 r2 = r2.f8338a
            ue.c.H(r1)
            r11 = r0
            r0 = r2
            r10 = r3
            r9 = r4
            goto L75
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L46:
            ue.c.H(r1)
            ao2.x r1 = r0.f14869j
            r2.f8338a = r0
            r4 = r14
            r2.f8339b = r4
            r6 = r15
            r2.f8340c = r6
            r7 = r16
            r2.f8341d = r7
            r8 = r17
            r2.f8342e = r8
            r9 = r18
            r2.f8343f = r9
            r10 = r19
            r2.f8344g = r10
            r11 = r20
            r2.f8345h = r11
            r2.f8348k = r5
            java.lang.Object r1 = r1.join(r2)
            if (r1 != r3) goto L70
            return r3
        L70:
            r5 = r8
            r8 = r4
            r12 = r7
            r7 = r6
            r6 = r12
        L75:
            ads_mobile_sdk.vr1 r1 = a.ng.f126a
            boolean r1 = r1.f12616a
            if (r1 != 0) goto L7d
            r0 = 0
            return r0
        L7d:
            a.j3 r1 = r0.f14866g
            ads_mobile_sdk.nq1 r2 = new ads_mobile_sdk.nq1
            r13 = r2
            r14 = r7
            r15 = r0
            r16 = r8
            r17 = r6
            r18 = r5
            r19 = r9
            r20 = r10
            r21 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r0 = "CreateJavascriptAdSession"
            java.lang.Object r0 = r1.b(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zq1.a(ads_mobile_sdk.zq1, ads_mobile_sdk.ym0, java.lang.String, java.lang.String, ads_mobile_sdk.ts, ads_mobile_sdk.fr0, ads_mobile_sdk.lu1, ads_mobile_sdk.lu1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.zq1 r5, bl2.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof ads_mobile_sdk.rq1
            if (r0 == 0) goto L16
            r0 = r6
            ads_mobile_sdk.rq1 r0 = (ads_mobile_sdk.rq1) r0
            int r1 = r0.f10755c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f10755c = r1
            goto L1b
        L16:
            ads_mobile_sdk.rq1 r0 = new ads_mobile_sdk.rq1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f10753a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10755c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            ue.c.H(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r6)
            a.j3 r6 = r5.f14866g
            ads_mobile_sdk.tq1 r2 = new ads_mobile_sdk.tq1
            r2.<init>(r5, r3)
            r0.f10755c = r4
            r6.getClass()
            java.lang.String r5 = "ActivateOmid"
            java.lang.Object r5 = a.j3.a(r6, r5, r2, r0)
            if (r5 != r1) goto L4b
            goto L5d
        L4b:
            ads_mobile_sdk.vr1 r5 = a.ng.f126a
            boolean r5 = r5.f12616a
            if (r5 != 0) goto L5b
            java.lang.String r5 = "message"
            java.lang.String r6 = "OMSDK failed to activate."
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            ads_mobile_sdk.ft2.a(r4, r6, r3)
        L5b:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zq1.a(ads_mobile_sdk.zq1, bl2.c):java.lang.Object");
    }

    public final void a(a.e9 adSession, View view) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
