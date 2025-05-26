package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class nf1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f8765a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f8766b;

    /* renamed from: c, reason: collision with root package name */
    public if1 f8767c;

    /* renamed from: d, reason: collision with root package name */
    public int f8768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if1 f8769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf1 f8770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nm.u f8771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf1(if1 if1Var, uf1 uf1Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f8769e = if1Var;
        this.f8770f = uf1Var;
        this.f8771g = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nf1(this.f8769e, this.f8770f, this.f8771g, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nf1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0077, blocks: (B:17:0x0060, B:19:0x0067, B:21:0x006e, B:23:0x0072, B:25:0x0076, B:26:0x0079, B:27:0x007e, B:28:0x007f, B:29:0x0086, B:30:0x0087, B:31:0x008e, B:32:0x008f), top: B:16:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #2 {all -> 0x0077, blocks: (B:17:0x0060, B:19:0x0067, B:21:0x006e, B:23:0x0072, B:25:0x0076, B:26:0x0079, B:27:0x007e, B:28:0x007f, B:29:0x0086, B:30:0x0087, B:31:0x008e, B:32:0x008f), top: B:16:0x0060 }] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f8768d
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            ads_mobile_sdk.if1 r0 = r6.f8767c
            ads_mobile_sdk.cs2 r1 = r6.f8766b
            ads_mobile_sdk.cs2 r2 = r6.f8765a
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L13
            goto L46
        L13:
            r7 = move-exception
            goto L5b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            ue.c.H(r7)
            ads_mobile_sdk.if1 r7 = r6.f8769e
            ads_mobile_sdk.il0 r1 = ads_mobile_sdk.il0.CUI_NAME_LOAD_NATIVE_ATTRIBUTION_INFO
            ads_mobile_sdk.uf1 r3 = r6.f8770f
            nm.u r4 = r6.f8771g
            java.util.WeakHashMap r5 = ads_mobile_sdk.qs2.f10249a
            kotlin.collections.q0 r5 = kotlin.collections.q0.f80391a
            ads_mobile_sdk.cs2 r1 = ads_mobile_sdk.qs2.a(r1, r5, r2)
            ads_mobile_sdk.dj1 r3 = r3.f12064c     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "attribution"
            r6.f8765a = r1     // Catch: java.lang.Throwable -> L5e
            r6.f8766b = r1     // Catch: java.lang.Throwable -> L5e
            r6.f8767c = r7     // Catch: java.lang.Throwable -> L5e
            r6.f8768d = r2     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r2 = r3.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L5e
            if (r2 != r0) goto L43
            return r0
        L43:
            r0 = r7
            r7 = r2
            r2 = r1
        L46:
            ads_mobile_sdk.qx0 r7 = (ads_mobile_sdk.qx0) r7     // Catch: java.lang.Throwable -> L13
            boolean r3 = r7 instanceof ads_mobile_sdk.jk0     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L52
            r3 = r7
            ads_mobile_sdk.jk0 r3 = (ads_mobile_sdk.jk0) r3     // Catch: java.lang.Throwable -> L13
            ads_mobile_sdk.ft2.a(r3)     // Catch: java.lang.Throwable -> L13
        L52:
            r2 = 0
            dl2.b.J(r1, r2)
            r0.f6375h = r7
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L5b:
            r0 = r1
            r1 = r2
            goto L60
        L5e:
            r7 = move-exception
            r0 = r1
        L60:
            r1.b(r7)     // Catch: java.lang.Throwable -> L77
            boolean r2 = r7 instanceof a.jf     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L8f
            r1.a(r7)     // Catch: java.lang.Throwable -> L77
            boolean r1 = r7 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L87
            boolean r1 = r7 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L7f
            boolean r1 = r7 instanceof ads_mobile_sdk.uk0     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L79
            throw r7     // Catch: java.lang.Throwable -> L77
        L77:
            r7 = move-exception
            goto L90
        L79:
            ads_mobile_sdk.dk0 r1 = new ads_mobile_sdk.dk0     // Catch: java.lang.Throwable -> L77
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r1     // Catch: java.lang.Throwable -> L77
        L7f:
            ads_mobile_sdk.yj0 r1 = new ads_mobile_sdk.yj0     // Catch: java.lang.Throwable -> L77
            java.util.concurrent.CancellationException r7 = (java.util.concurrent.CancellationException) r7     // Catch: java.lang.Throwable -> L77
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r1     // Catch: java.lang.Throwable -> L77
        L87:
            ads_mobile_sdk.xl0 r1 = new ads_mobile_sdk.xl0     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.TimeoutCancellationException r7 = (kotlinx.coroutines.TimeoutCancellationException) r7     // Catch: java.lang.Throwable -> L77
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r1     // Catch: java.lang.Throwable -> L77
        L8f:
            throw r7     // Catch: java.lang.Throwable -> L77
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r1 = move-exception
            dl2.b.J(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
