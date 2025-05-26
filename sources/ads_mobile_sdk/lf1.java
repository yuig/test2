package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class lf1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f7812a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f7813b;

    /* renamed from: c, reason: collision with root package name */
    public if1 f7814c;

    /* renamed from: d, reason: collision with root package name */
    public int f7815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if1 f7816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf1 f7817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nm.u f7818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf1(if1 if1Var, uf1 uf1Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f7816e = if1Var;
        this.f7817f = uf1Var;
        this.f7818g = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new lf1(this.f7816e, this.f7817f, this.f7818g, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lf1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[Catch: all -> 0x009a, TryCatch #3 {all -> 0x009a, blocks: (B:17:0x0083, B:19:0x008a, B:21:0x0091, B:23:0x0095, B:25:0x0099, B:26:0x009c, B:27:0x00a1, B:28:0x00a2, B:29:0x00a9, B:30:0x00aa, B:31:0x00b1, B:32:0x00b2), top: B:16:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #3 {all -> 0x009a, blocks: (B:17:0x0083, B:19:0x008a, B:21:0x0091, B:23:0x0095, B:25:0x0099, B:26:0x009c, B:27:0x00a1, B:28:0x00a2, B:29:0x00a9, B:30:0x00aa, B:31:0x00b1, B:32:0x00b2), top: B:16:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0067  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f7815d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            ads_mobile_sdk.if1 r0 = r7.f7814c
            ads_mobile_sdk.cs2 r1 = r7.f7813b
            ads_mobile_sdk.cs2 r2 = r7.f7812a
            ue.c.H(r8)     // Catch: java.lang.Throwable -> L14
            goto L6a
        L14:
            r8 = move-exception
            goto L7e
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            ue.c.H(r8)
            ads_mobile_sdk.if1 r8 = r7.f7816e
            ads_mobile_sdk.il0 r1 = ads_mobile_sdk.il0.CUI_NAME_LOAD_NATIVE_IMAGE
            ads_mobile_sdk.uf1 r4 = r7.f7817f
            nm.u r5 = r7.f7818g
            java.util.WeakHashMap r6 = ads_mobile_sdk.qs2.f10249a
            kotlin.collections.q0 r6 = kotlin.collections.q0.f80391a
            ads_mobile_sdk.cs2 r1 = ads_mobile_sdk.qs2.a(r1, r6, r2)
            ads_mobile_sdk.dj1 r4 = r4.f12064c     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = "images"
            r7.f7812a = r1     // Catch: java.lang.Throwable -> L81
            r7.f7813b = r1     // Catch: java.lang.Throwable -> L81
            r7.f7814c = r8     // Catch: java.lang.Throwable -> L81
            r7.f7815d = r2     // Catch: java.lang.Throwable -> L81
            r4.getClass()     // Catch: java.lang.Throwable -> L81
            nm.q r2 = ads_mobile_sdk.k41.d(r5, r6)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L63
            java.util.ArrayList r5 = r2.f91364a     // Catch: java.lang.Throwable -> L81
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L4f
            goto L63
        L4f:
            r5 = 0
            nm.s r2 = r2.u(r5)     // Catch: java.lang.Throwable -> L81
            nm.u r2 = ads_mobile_sdk.k41.a(r2)     // Catch: java.lang.Throwable -> L81
            bj.n r5 = r4.f4305a     // Catch: java.lang.Throwable -> L81
            boolean r5 = r5.i()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r4.a(r2, r5, r7)     // Catch: java.lang.Throwable -> L81
            goto L64
        L63:
            r2 = r3
        L64:
            if (r2 != r0) goto L67
            return r0
        L67:
            r0 = r8
            r8 = r2
            r2 = r1
        L6a:
            ads_mobile_sdk.rz0 r8 = (ads_mobile_sdk.rz0) r8     // Catch: java.lang.Throwable -> L14
            boolean r4 = r8 instanceof ads_mobile_sdk.jk0     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L76
            r4 = r8
            ads_mobile_sdk.jk0 r4 = (ads_mobile_sdk.jk0) r4     // Catch: java.lang.Throwable -> L14
            ads_mobile_sdk.ft2.a(r4)     // Catch: java.lang.Throwable -> L14
        L76:
            dl2.b.J(r1, r3)
            r0.f6373f = r8
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L7e:
            r0 = r1
            r1 = r2
            goto L83
        L81:
            r8 = move-exception
            r0 = r1
        L83:
            r1.b(r8)     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r8 instanceof a.jf     // Catch: java.lang.Throwable -> L9a
            if (r2 != 0) goto Lb2
            r1.a(r8)     // Catch: java.lang.Throwable -> L9a
            boolean r1 = r8 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L9a
            if (r1 != 0) goto Laa
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L9a
            if (r1 != 0) goto La2
            boolean r1 = r8 instanceof ads_mobile_sdk.uk0     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L9c
            throw r8     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            goto Lb3
        L9c:
            ads_mobile_sdk.dk0 r1 = new ads_mobile_sdk.dk0     // Catch: java.lang.Throwable -> L9a
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L9a
            throw r1     // Catch: java.lang.Throwable -> L9a
        La2:
            ads_mobile_sdk.yj0 r1 = new ads_mobile_sdk.yj0     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8     // Catch: java.lang.Throwable -> L9a
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L9a
            throw r1     // Catch: java.lang.Throwable -> L9a
        Laa:
            ads_mobile_sdk.xl0 r1 = new ads_mobile_sdk.xl0     // Catch: java.lang.Throwable -> L9a
            kotlinx.coroutines.TimeoutCancellationException r8 = (kotlinx.coroutines.TimeoutCancellationException) r8     // Catch: java.lang.Throwable -> L9a
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L9a
            throw r1     // Catch: java.lang.Throwable -> L9a
        Lb2:
            throw r8     // Catch: java.lang.Throwable -> L9a
        Lb3:
            throw r8     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r1 = move-exception
            dl2.b.J(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
