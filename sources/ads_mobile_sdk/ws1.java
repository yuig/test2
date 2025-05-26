package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import ao2.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ws1 implements a.e4 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f13225a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f13226b;

    /* renamed from: c, reason: collision with root package name */
    public final nm.u f13227c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f13228d;

    /* renamed from: e, reason: collision with root package name */
    public final zq1 f13229e;

    /* renamed from: f, reason: collision with root package name */
    public final if1 f13230f;

    /* renamed from: g, reason: collision with root package name */
    public final oh0 f13231g;

    /* renamed from: h, reason: collision with root package name */
    public final mo2.a f13232h;

    /* renamed from: i, reason: collision with root package name */
    public ao2.o1 f13233i;

    /* renamed from: j, reason: collision with root package name */
    public ym0 f13234j;

    /* renamed from: k, reason: collision with root package name */
    public a.e9 f13235k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13236l;

    /* renamed from: m, reason: collision with root package name */
    public final List f13237m;

    public ws1(CoroutineContext uiContext, j0 backgroundScope, nm.u nativeAdJson, r0 adConfiguration, zq1 omid, if1 nativeAdAssets, oh0 flags) {
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeAdJson, "nativeAdJson");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(omid, "omid");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f13225a = uiContext;
        this.f13226b = backgroundScope;
        this.f13227c = nativeAdJson;
        this.f13228d = adConfiguration;
        this.f13229e = omid;
        this.f13230f = nativeAdAssets;
        this.f13231g = flags;
        this.f13232h = mo2.d.a();
        dt1 dt1Var = nativeAdAssets.f6381n;
        this.f13236l = (dt1Var != null ? dt1Var.f4433a : null) == ct1.f4028a;
        this.f13237m = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v6, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(ads_mobile_sdk.ws1 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ps1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ps1 r0 = (ads_mobile_sdk.ps1) r0
            int r1 = r0.f9800e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9800e = r1
            goto L18
        L13:
            ads_mobile_sdk.ps1 r0 = new ads_mobile_sdk.ps1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9798c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9800e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo2.a r5 = r0.f9797b
            ads_mobile_sdk.ws1 r0 = r0.f9796a
            ue.c.H(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r6)
            mo2.a r6 = r5.f13232h
            r0.f9796a = r5
            r0.f9797b = r6
            r0.f9800e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            a.e9 r0 = r5.f13235k     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L57
            ao2.o1 r5 = r5.f13233i     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L53
            goto L57
        L53:
            r3 = 0
            goto L57
        L55:
            r5 = move-exception
            goto L61
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L55
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            return r5
        L61:
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws1.c(ads_mobile_sdk.ws1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if ((r8 != null ? r8.f4433a : null) == ads_mobile_sdk.ct1.f4029b) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(ads_mobile_sdk.ws1 r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.ts1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ts1 r0 = (ads_mobile_sdk.ts1) r0
            int r1 = r0.f11666d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11666d = r1
            goto L18
        L13:
            ads_mobile_sdk.ts1 r0 = new ads_mobile_sdk.ts1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f11664b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11666d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            ue.c.H(r8)
            goto La8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ads_mobile_sdk.ws1 r7 = r0.f11663a
            ue.c.H(r8)
            goto L7b
        L39:
            ue.c.H(r8)
            ads_mobile_sdk.zq1 r8 = r7.f13229e
            a.j3 r8 = r8.f14866g
            ads_mobile_sdk.uq1 r2 = ads_mobile_sdk.uq1.f12157a
            java.lang.String r5 = "IsActive"
            java.lang.Object r8 = r8.b(r2, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto Lab
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lab
            nm.u r8 = r7.f13227c
            java.lang.String r2 = "enable_omid"
            java.lang.String r5 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            if (r8 != 0) goto L5e
            goto Lab
        L5e:
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r6)     // Catch: java.lang.Exception -> Lab
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)     // Catch: java.lang.Exception -> Lab
            nm.s r8 = r8.v(r2)     // Catch: java.lang.Exception -> Lab
            boolean r8 = r8.b()     // Catch: java.lang.Exception -> Lab
            if (r8 == 0) goto Lab
            r0.f11663a = r7
            r0.f11666d = r4
            java.lang.Object r8 = c(r7, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lab
            ads_mobile_sdk.if1 r8 = r7.f13230f
            ads_mobile_sdk.gf1 r2 = r8.f6369b
            ads_mobile_sdk.gf1 r5 = ads_mobile_sdk.gf1.f5555b
            r6 = 0
            if (r2 != r5) goto L99
            ads_mobile_sdk.dt1 r8 = r8.f6381n
            if (r8 == 0) goto L93
            ads_mobile_sdk.ct1 r8 = r8.f4433a
            goto L94
        L93:
            r8 = r6
        L94:
            ads_mobile_sdk.ct1 r2 = ads_mobile_sdk.ct1.f4029b
            if (r8 != r2) goto L99
            goto Lab
        L99:
            r0.f11663a = r6
            r0.f11666d = r3
            java.lang.String r8 = "Google"
            ads_mobile_sdk.fr0 r2 = ads_mobile_sdk.fr0.f5249e
            java.lang.Object r7 = r7.a(r8, r4, r2, r0)
            if (r7 != r1) goto La8
            return r1
        La8:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        Lab:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws1.d(ads_mobile_sdk.ws1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0066, B:13:0x006c, B:17:0x0077, B:21:0x0093, B:24:0x00a0, B:25:0x00a5, B:26:0x00a6, B:28:0x00ac, B:31:0x00b9, B:32:0x00fe, B:35:0x00c4, B:37:0x00ca, B:40:0x00d7, B:42:0x00dd, B:45:0x00ea), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0066, B:13:0x006c, B:17:0x0077, B:21:0x0093, B:24:0x00a0, B:25:0x00a5, B:26:0x00a6, B:28:0x00ac, B:31:0x00b9, B:32:0x00fe, B:35:0x00c4, B:37:0x00ca, B:40:0x00d7, B:42:0x00dd, B:45:0x00ea), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, boolean r18, ads_mobile_sdk.fr0 r19, bl2.c r20) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws1.a(java.lang.String, boolean, ads_mobile_sdk.fr0, bl2.c):java.lang.Object");
    }

    @Override // a.e4
    public final Object b(c03 c03Var) {
        return b(this, c03Var);
    }

    @Override // a.q6
    public final Object i(bl2.c cVar) {
        return d(this, cVar);
    }

    @Override // a.e4
    public final Object k(bl2.c cVar) {
        Object a13 = a("measurePreviousView", new qs1(this, null), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.q6
    public final Object l(bl2.c cVar) {
        Object a13;
        dt1 dt1Var = this.f13230f.f6381n;
        return ((dt1Var != null ? dt1Var.f4433a : null) == ct1.f4028a && (a13 = a("onAdClicked", new rs1(null), cVar)) == cl2.a.COROUTINE_SUSPENDED) ? a13 : Unit.f80348a;
    }

    @Override // a.q6
    public final Object o(bl2.c cVar) {
        Object a13 = a("onAdImpression", new ss1(null), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:15:0x00d7, B:23:0x0045, B:24:0x00c5, B:26:0x00c9, B:31:0x004e, B:32:0x00a3), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:37:0x0070, B:39:0x0074, B:40:0x007b, B:42:0x0081, B:43:0x0084, B:45:0x008d), top: B:36:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:37:0x0070, B:39:0x0074, B:40:0x007b, B:42:0x0081, B:43:0x0084, B:45:0x008d), top: B:36:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:37:0x0070, B:39:0x0074, B:40:0x007b, B:42:0x0081, B:43:0x0084, B:45:0x008d), top: B:36:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.ws1] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r11v14, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r11v15, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.ws1 r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws1.b(ads_mobile_sdk.ws1, bl2.c):java.lang.Object");
    }

    public final Object a(ViewGroup viewGroup, xh0 xh0Var, String str, bl2.c cVar) {
        Object a13 = a("addFriendlyObstruction", new hs1(this, viewGroup, xh0Var, str, null), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(8:5|6|7|(1:(1:(1:(1:(8:13|14|15|16|18|19|20|21)(2:33|34))(5:35|36|37|38|(3:40|41|42)(2:43|(3:45|46|47)(2:48|(1:50)(6:51|16|18|19|20|21)))))(5:55|56|57|58|(1:60)(4:61|37|38|(0)(0))))(1:62))(2:76|(1:78)(1:79))|63|64|65|(2:67|68)(4:69|(1:71)|58|(0)(0))))|63|64|65|(0)(0))|81|6|7|(0)(0)|(2:(0)|(1:31))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:38:0x00c5, B:40:0x00c9, B:43:0x00d4, B:45:0x00d8, B:48:0x00e0), top: B:37:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4 A[Catch: all -> 0x00d1, TRY_ENTER, TryCatch #0 {all -> 0x00d1, blocks: (B:38:0x00c5, B:40:0x00c9, B:43:0x00d4, B:45:0x00d8, B:48:0x00e0), top: B:37:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009e A[Catch: CancellationException -> 0x0103, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0103, blocks: (B:36:0x0051, B:41:0x00cb, B:46:0x00da, B:56:0x0061, B:58:0x00af, B:69:0x009e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r9, kl2.l r10, bl2.c r11) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws1.a(java.lang.String, kl2.l, bl2.c):java.lang.Object");
    }

    @Override // a.e4
    public final Object a(c03 c03Var) {
        return c(this, c03Var);
    }

    @Override // a.q6
    public final Object a(bl2.c cVar) {
        Object b13 = b(this, cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
    }

    public final Object a(View view, bl2.c cVar) {
        if (this.f13236l) {
            return Unit.f80348a;
        }
        Object a13 = a("updateRegisteredAdView", new vs1(this, view, null), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
