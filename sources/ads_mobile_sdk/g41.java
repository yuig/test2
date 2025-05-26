package ads_mobile_sdk;

import android.net.Uri;
import ao2.j0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g41 implements a.ce {

    /* renamed from: a, reason: collision with root package name */
    public final sb2 f5391a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f5392b;

    /* renamed from: c, reason: collision with root package name */
    public final cm0 f5393c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f5394d;

    /* renamed from: e, reason: collision with root package name */
    public final oh0 f5395e;

    /* renamed from: f, reason: collision with root package name */
    public final mo2.a f5396f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f5397g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f5398h;

    /* renamed from: i, reason: collision with root package name */
    public final ff1 f5399i;

    public g41(sb2 rootTraceCreator, ss2 traceMetaSet, cm0 gmaUtil, j0 backgroundScope, oh0 flags) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f5391a = rootTraceCreator;
        this.f5392b = traceMetaSet;
        this.f5393c = gmaUtil;
        this.f5394d = backgroundScope;
        this.f5395e = flags;
        this.f5396f = mo2.d.a();
        this.f5397g = new LinkedHashMap();
        this.f5398h = new LinkedHashMap();
        this.f5399i = new ff1(null);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0110 A[Catch: all -> 0x0117, TryCatch #5 {all -> 0x0117, blocks: (B:109:0x0106, B:111:0x0110, B:113:0x011c, B:115:0x0122, B:117:0x0137, B:122:0x0142), top: B:108:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0137 A[Catch: all -> 0x0117, TryCatch #5 {all -> 0x0117, blocks: (B:109:0x0106, B:111:0x0110, B:113:0x011c, B:115:0x0122, B:117:0x0137, B:122:0x0142), top: B:108:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r0v59, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r0v60, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.g41 r22, ads_mobile_sdk.ym0 r23, android.net.Uri r24, bl2.c r25) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.g41.a(ads_mobile_sdk.g41, ads_mobile_sdk.ym0, android.net.Uri, bl2.c):java.lang.Object");
    }

    @Override // a.ce
    public final Object a(ym0 ym0Var, Uri uri, bl2.c cVar) {
        return a(this, ym0Var, uri, cVar);
    }

    @Override // a.ce
    public final Object a(ym0 ym0Var, String str, bl2.c cVar) {
        return a(this, str, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.g41 r4, java.lang.String r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.b41
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.b41 r0 = (ads_mobile_sdk.b41) r0
            int r1 = r0.f2741e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2741e = r1
            goto L18
        L13:
            ads_mobile_sdk.b41 r0 = new ads_mobile_sdk.b41
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2739c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2741e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L34
            r4 = 2
            if (r2 != r4) goto L2c
            ue.c.H(r6)
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            java.lang.String r5 = r0.f2738b
            ads_mobile_sdk.g41 r4 = r0.f2737a
            ue.c.H(r6)
            goto L4e
        L3c:
            ue.c.H(r6)
            ads_mobile_sdk.ff1 r6 = r4.f5399i
            r0.f2737a = r4
            r0.f2738b = r5
            r0.f2741e = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            ads_mobile_sdk.q92 r6 = (ads_mobile_sdk.q92) r6
            r0 = 0
            if (r6 != 0) goto L63
            java.lang.String r4 = "Unknown/Unexpected GMSG without a handler: result"
            ads_mobile_sdk.gk0.d(r4, r0)
            java.lang.String r5 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            ads_mobile_sdk.ft2.a(r3, r4, r0)
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L63:
            nm.o r1 = new nm.o     // Catch: java.lang.Exception -> L71
            r1.<init>()     // Catch: java.lang.Exception -> L71
            java.lang.Class<nm.u> r2 = nm.u.class
            java.lang.Object r5 = r1.b(r2, r5)     // Catch: java.lang.Exception -> L71
            nm.u r5 = (nm.u) r5     // Catch: java.lang.Exception -> L71
            goto L8a
        L71:
            r5 = move-exception
            ads_mobile_sdk.jw1 r1 = c0.d.f(r5, r5)
            java.util.List r1 = r1.f6994p
            java.lang.String r2 = r5.getMessage()
            if (r2 != 0) goto L86
            java.lang.Class r5 = r5.getClass()
            java.lang.String r2 = r5.getName()
        L86:
            r1.add(r2)
            r5 = r0
        L8a:
            if (r5 != 0) goto L8f
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L8f:
            ads_mobile_sdk.d41 r1 = new ads_mobile_sdk.d41
            r1.<init>(r4, r6, r5, r0)
            ao2.j0 r4 = r4.f5394d
            ads_mobile_sdk.c41 r5 = new ads_mobile_sdk.c41
            r5.<init>(r1, r0)
            r6 = 3
            kotlin.jvm.internal.j.z(r4, r0, r0, r5, r6)
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.g41.a(ads_mobile_sdk.g41, java.lang.String, bl2.c):java.lang.Object");
    }

    @Override // a.ce
    public final Object a(String str, a.cd cdVar, bl2.c cVar) {
        return a(this, str, cdVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:26:0x0099, B:28:0x00a3, B:29:0x00ab), top: B:25:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v13, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.g41 r7, java.lang.String r8, a.cd r9, bl2.c r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.g41.a(ads_mobile_sdk.g41, java.lang.String, a.cd, bl2.c):java.lang.Object");
    }

    @Override // a.ce
    public final Object a(String str, ao2.v vVar, fm0 fm0Var) {
        return a(this, str, vVar, fm0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.g41 r5, java.lang.String r6, ao2.v r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.f41
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.f41 r0 = (ads_mobile_sdk.f41) r0
            int r1 = r0.f5039e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5039e = r1
            goto L18
        L13:
            ads_mobile_sdk.f41 r0 = new ads_mobile_sdk.f41
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f5037c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5039e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L61
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ao2.v r7 = r0.f5036b
            java.lang.String r6 = r0.f5035a
            ue.c.H(r8)
            goto L4c
        L3a:
            ue.c.H(r8)
            ads_mobile_sdk.ff1 r5 = r5.f5399i
            r0.f5035a = r6
            r0.f5036b = r7
            r0.f5039e = r4
            java.lang.Object r8 = r5.a(r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            ads_mobile_sdk.q92 r8 = (ads_mobile_sdk.q92) r8
            if (r8 != 0) goto L53
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L53:
            r5 = 0
            r0.f5035a = r5
            r0.f5036b = r5
            r0.f5039e = r3
            java.lang.Object r5 = r8.a(r6, r7, r0)
            if (r5 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.g41.a(ads_mobile_sdk.g41, java.lang.String, ao2.v, bl2.c):java.lang.Object");
    }
}
