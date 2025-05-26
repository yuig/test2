package ads_mobile_sdk;

import ao2.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tr1 implements a.e4 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f11640a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f11641b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f11642c;

    /* renamed from: d, reason: collision with root package name */
    public final zq1 f11643d;

    /* renamed from: e, reason: collision with root package name */
    public final ln0 f11644e;

    /* renamed from: f, reason: collision with root package name */
    public final cs1 f11645f;

    /* renamed from: g, reason: collision with root package name */
    public final oh0 f11646g;

    /* renamed from: h, reason: collision with root package name */
    public final mo2.a f11647h;

    /* renamed from: i, reason: collision with root package name */
    public a.e9 f11648i;

    /* renamed from: j, reason: collision with root package name */
    public final List f11649j;

    public tr1(CoroutineContext uiContext, j0 uiScope, r0 adConfiguration, zq1 omid, ln0 webViewContainer, cs1 omidJavaScriptSessionService, oh0 flags) {
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(omid, "omid");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(omidJavaScriptSessionService, "omidJavaScriptSessionService");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f11640a = uiContext;
        this.f11641b = uiScope;
        this.f11642c = adConfiguration;
        this.f11643d = omid;
        this.f11644e = webViewContainer;
        this.f11645f = omidJavaScriptSessionService;
        this.f11646g = flags;
        this.f11647h = mo2.d.a();
        this.f11649j = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:14:0x00b7, B:23:0x0092, B:25:0x009a, B:28:0x00a3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x0046, B:33:0x0075, B:35:0x007d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(ads_mobile_sdk.tr1 r8, bl2.c r9) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tr1.c(ads_mobile_sdk.tr1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(ads_mobile_sdk.tr1 r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.rr1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.rr1 r0 = (ads_mobile_sdk.rr1) r0
            int r1 = r0.f10764d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10764d = r1
            goto L18
        L13:
            ads_mobile_sdk.rr1 r0 = new ads_mobile_sdk.rr1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f10762b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10764d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            ue.c.H(r7)
            goto L92
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            ue.c.H(r7)
            goto L76
        L39:
            ads_mobile_sdk.tr1 r6 = r0.f10761a
            ue.c.H(r7)
            goto L5b
        L3f:
            ue.c.H(r7)
            ads_mobile_sdk.r0 r7 = r6.f11642c
            boolean r7 = r7.N
            if (r7 != 0) goto L4b
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L4b:
            ads_mobile_sdk.cs1 r7 = r6.f11645f
            r0.f10761a = r6
            r0.f10764d = r5
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.cs1.a(r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r2 = 0
            if (r7 == 0) goto L79
            ads_mobile_sdk.cs1 r7 = r6.f11645f
            ads_mobile_sdk.ln0 r6 = r6.f11644e
            r0.f10761a = r2
            r0.f10764d = r4
            r7.getClass()
            java.lang.Object r6 = ads_mobile_sdk.cs1.a(r7, r6, r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L79:
            ads_mobile_sdk.ln0 r7 = r6.f11644e
            r0.f10761a = r2
            r0.f10764d = r3
            kotlin.coroutines.CoroutineContext r3 = r6.f11640a
            ads_mobile_sdk.lr1 r4 = new ads_mobile_sdk.lr1
            r4.<init>(r7, r6, r2)
            java.lang.Object r6 = kotlin.jvm.internal.j.M(r0, r3, r4)
            if (r6 != r1) goto L8d
            goto L8f
        L8d:
            kotlin.Unit r6 = kotlin.Unit.f80348a
        L8f:
            if (r6 != r1) goto L92
            return r1
        L92:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tr1.d(ads_mobile_sdk.tr1, bl2.c):java.lang.Object");
    }

    @Override // a.e4
    public final Object a(c03 c03Var) {
        return a(this, c03Var);
    }

    @Override // a.e4
    public final Object b(c03 c03Var) {
        Object M = kotlin.jvm.internal.j.M(c03Var, this.f11640a, new nr1(this, null));
        return M == cl2.a.COROUTINE_SUSPENDED ? M : Unit.f80348a;
    }

    @Override // a.q6
    public final Object i(bl2.c cVar) {
        return d(this, cVar);
    }

    @Override // a.e4
    public final Object k(bl2.c cVar) {
        return b(this, cVar);
    }

    @Override // a.q6
    public final Object o(bl2.c cVar) {
        return c(this, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:31:0x0059, B:33:0x005d), top: B:30:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r7v17, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.tr1 r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.or1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.or1 r0 = (ads_mobile_sdk.or1) r0
            int r1 = r0.f9419e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9419e = r1
            goto L18
        L13:
            ads_mobile_sdk.or1 r0 = new ads_mobile_sdk.or1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f9417c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9419e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f9415a
            mo2.a r7 = (mo2.a) r7
            ue.c.H(r8)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto L8b
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            mo2.a r7 = r0.f9416b
            java.lang.Object r2 = r0.f9415a
            ads_mobile_sdk.tr1 r2 = (ads_mobile_sdk.tr1) r2
            ue.c.H(r8)
            r8 = r7
            r7 = r2
            goto L59
        L45:
            ue.c.H(r8)
            mo2.a r8 = r7.f11647h
            r0.f9415a = r7
            r0.f9416b = r8
            r0.f9419e = r4
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r2 = r8.f(r5, r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            a.e9 r2 = r7.f11648i     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L80
            ads_mobile_sdk.cs1 r7 = r7.f11645f     // Catch: java.lang.Throwable -> L7e
            r0.f9415a = r8     // Catch: java.lang.Throwable -> L7e
            r0.f9416b = r5     // Catch: java.lang.Throwable -> L7e
            r0.f9419e = r3     // Catch: java.lang.Throwable -> L7e
            r7.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r7 = ads_mobile_sdk.cs1.a(r7, r0)     // Catch: java.lang.Throwable -> L7e
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L7c
            r8 = r7
            goto L80
        L7c:
            r4 = 0
            goto L81
        L7e:
            r7 = move-exception
            goto L8e
        L80:
            r7 = r8
        L81:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            return r8
        L8b:
            r6 = r8
            r8 = r7
            r7 = r6
        L8e:
            mo2.c r8 = (mo2.c) r8
            r8.i(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tr1.a(ads_mobile_sdk.tr1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x004c, B:13:0x0050, B:15:0x0065, B:16:0x006a, B:17:0x006f), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v6, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.tr1 r6, bl2.c r7) {
        /*
            java.lang.String r0 = "omidRegisteredViews"
            boolean r1 = r7 instanceof ads_mobile_sdk.pr1
            if (r1 == 0) goto L15
            r1 = r7
            ads_mobile_sdk.pr1 r1 = (ads_mobile_sdk.pr1) r1
            int r2 = r1.f9789e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f9789e = r2
            goto L1a
        L15:
            ads_mobile_sdk.pr1 r1 = new ads_mobile_sdk.pr1
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.f9787c
            cl2.a r2 = cl2.a.COROUTINE_SUSPENDED
            int r3 = r1.f9789e
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            mo2.a r6 = r1.f9786b
            ads_mobile_sdk.tr1 r1 = r1.f9785a
            ue.c.H(r7)
            r7 = r6
            r6 = r1
            goto L4c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            ue.c.H(r7)
            mo2.a r7 = r6.f11647h
            r1.f9785a = r6
            r1.f9786b = r7
            r1.f9789e = r4
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r1 = r7.f(r5, r1)
            if (r1 != r2) goto L4c
            return r2
        L4c:
            a.e9 r1 = r6.f11648i     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L6f
            java.util.List r2 = r6.f11649j     // Catch: java.lang.Throwable -> L68
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.lang.Throwable -> L68
            kotlin.collections.k0.C(r2)     // Catch: java.lang.Throwable -> L68
            java.util.List r2 = r6.f11649j     // Catch: java.lang.Throwable -> L68
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = kotlin.collections.CollectionsKt.d0(r2)     // Catch: java.lang.Throwable -> L68
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L6a
            ads_mobile_sdk.ln0 r0 = r6.f11644e     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r6 = move-exception
            goto L77
        L6a:
            ads_mobile_sdk.zq1 r6 = r6.f11643d     // Catch: java.lang.Throwable -> L68
            r6.a(r1, r0)     // Catch: java.lang.Throwable -> L68
        L6f:
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L68
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            return r6
        L77:
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tr1.b(ads_mobile_sdk.tr1, bl2.c):java.lang.Object");
    }
}
