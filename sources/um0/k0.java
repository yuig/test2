package um0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f122725r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f122726s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n0 f122727t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f0 f122728u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f122729v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, f0 f0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f122727t = n0Var;
        this.f122728u = f0Var;
        this.f122729v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k0 k0Var = new k0(this.f122727t, this.f122728u, this.f122729v, cVar);
        k0Var.f122726s = obj;
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r12.f122725r
            um0.h r2 = um0.h.f122712a
            java.lang.String r3 = "getReorderedModelId(...)"
            u50.r r4 = r12.f122729v
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 != r5) goto L1b
            java.lang.Object r0 = r12.f122726s
            ym0.a r0 = (ym0.a) r0
            ue.c.H(r13)     // Catch: java.lang.Throwable -> L18
            goto L99
        L18:
            r13 = move-exception
            goto La0
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            ue.c.H(r13)
            java.lang.Object r13 = r12.f122726s
            ao2.j0 r13 = (ao2.j0) r13
            um0.n0 r13 = r12.f122727t
            xk2.v r1 = r13.f122745g
            java.lang.Object r1 = r1.getValue()
            ym0.b r1 = (ym0.b) r1
            um0.f0 r6 = r12.f122728u
            java.util.List r7 = r6.f122707b
            r1.getClass()
            int r1 = r6.f122708c
            ym0.a r1 = ym0.b.a(r1, r7)
            if (r1 == 0) goto Lbd
            java.lang.String r7 = "boardRepository"
            x02.x0 r13 = r13.f122743e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r7)
            java.lang.String r7 = "board"
            com.pinterest.api.model.v7 r6 = r6.f122706a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            xk2.q r7 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L9e
            java.lang.String r7 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r7 = r1.f139397a     // Catch: java.lang.Throwable -> L9e
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)     // Catch: java.lang.Throwable -> L9e
            r13.getClass()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r8 = "movedPinParentBoard"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r8 = "movedPinId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)     // Catch: java.lang.Throwable -> L9e
            x02.r0 r8 = new x02.r0     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = r6.getId()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r10 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r10 = r1.f139398b     // Catch: java.lang.Throwable -> L9e
            java.lang.String r11 = r1.f139399c     // Catch: java.lang.Throwable -> L9e
            r8.<init>(r9, r7, r10, r11)     // Catch: java.lang.Throwable -> L9e
            uj2.l r13 = r13.G(r8, r6)     // Catch: java.lang.Throwable -> L9e
            r13.getClass()     // Catch: java.lang.Throwable -> L9e
            hk2.u r6 = new hk2.u     // Catch: java.lang.Throwable -> L9e
            r6.<init>(r13)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r13 = "ignoreElement(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r13)     // Catch: java.lang.Throwable -> L9e
            r12.f122726s = r1     // Catch: java.lang.Throwable -> L9e
            r12.f122725r = r5     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r13 = kh2.j.o(r6, r12)     // Catch: java.lang.Throwable -> L9e
            if (r13 != r0) goto L98
            return r0
        L98:
            r0 = r1
        L99:
            kotlin.Unit r13 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L18
            xk2.q r1 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L18
            goto La6
        L9e:
            r13 = move-exception
            r0 = r1
        La0:
            xk2.q r1 = xk2.s.f135225b
            xk2.r r13 = ue.c.m(r13)
        La6:
            boolean r13 = r13 instanceof xk2.r
            r13 = r13 ^ r5
            if (r13 == 0) goto Lb9
            um0.g r13 = new um0.g
            java.lang.String r0 = r0.f139397a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r13.<init>(r0)
            r4.a(r13)
            goto Lc0
        Lb9:
            r4.a(r2)
            goto Lc0
        Lbd:
            r4.a(r2)
        Lc0:
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: um0.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
