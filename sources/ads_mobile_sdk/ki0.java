package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ki0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public mo2.a f7326a;

    /* renamed from: b, reason: collision with root package name */
    public wi0 f7327b;

    /* renamed from: c, reason: collision with root package name */
    public int f7328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi0 f7329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki0(wi0 wi0Var, bl2.c cVar) {
        super(2, cVar);
        this.f7329d = wi0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ki0(this.f7329d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ki0(this.f7329d, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:22:0x0062, B:24:0x0066), top: B:21:0x0062 }] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r3v3, types: [mo2.a] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f7328c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            mo2.a r0 = r9.f7326a
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L16
            goto L76
        L16:
            r10 = move-exception
            goto L7e
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            ads_mobile_sdk.wi0 r1 = r9.f7327b
            mo2.a r3 = r9.f7326a
            ue.c.H(r10)
            r10 = r3
            goto L62
        L29:
            ue.c.H(r10)
            goto L4f
        L2d:
            ue.c.H(r10)
            ads_mobile_sdk.wi0 r10 = r9.f7329d
            ads_mobile_sdk.oh0 r10 = r10.f13050e
            r10.getClass()
            zn2.a r1 = zn2.b.f142311b
            zn2.d r1 = zn2.d.SECONDS
            r6 = 5
            long r6 = dl2.b.P2(r6, r1)
            java.lang.String r1 = "gads:ad_overlay:delay_page_close_timeout_ms"
            long r6 = r10.a(r6, r1)
            r9.f7328c = r4
            java.lang.Object r10 = lb.l0.T(r6, r9)
            if (r10 != r0) goto L4f
            return r0
        L4f:
            ads_mobile_sdk.wi0 r1 = r9.f7329d
            mo2.a r10 = r1.f13067x
            r9.f7326a = r10
            r9.f7327b = r1
            r9.f7328c = r3
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r3 = r10.f(r5, r9)
            if (r3 != r0) goto L62
            return r0
        L62:
            boolean r3 = r1.A     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto L75
            r9.f7326a = r10     // Catch: java.lang.Throwable -> L73
            r9.f7327b = r5     // Catch: java.lang.Throwable -> L73
            r9.f7328c = r2     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r1.a(r9)     // Catch: java.lang.Throwable -> L73
            if (r1 != r0) goto L75
            return r0
        L73:
            r0 = move-exception
            goto L81
        L75:
            r0 = r10
        L76:
            kotlin.Unit r10 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L16
            mo2.c r0 = (mo2.c) r0
            r0.i(r5)
            return r10
        L7e:
            r8 = r0
            r0 = r10
            r10 = r8
        L81:
            mo2.c r10 = (mo2.c) r10
            r10.i(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ki0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
