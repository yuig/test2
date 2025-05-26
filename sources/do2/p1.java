package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f55894r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k2 f55895s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f55896t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x1 f55897u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f55898v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(k2 k2Var, i iVar, x1 x1Var, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f55895s = k2Var;
        this.f55896t = iVar;
        this.f55897u = x1Var;
        this.f55898v = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p1(this.f55895s, this.f55896t, this.f55897u, this.f55898v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f55894r
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            do2.i r6 = r8.f55896t
            do2.x1 r7 = r8.f55897u
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            ue.c.H(r9)
            goto L52
        L23:
            ue.c.H(r9)
            goto L7b
        L27:
            ue.c.H(r9)
            do2.l2 r9 = do2.j2.f55827a
            do2.k2 r1 = r8.f55895s
            if (r1 != r9) goto L39
            r8.f55894r = r5
            java.lang.Object r9 = r6.collect(r7, r8)
            if (r9 != r0) goto L7b
            return r0
        L39:
            do2.l2 r9 = do2.j2.f55828b
            if (r1 != r9) goto L5b
            r9 = r7
            eo2.a r9 = (eo2.a) r9
            eo2.q0 r9 = r9.g()
            do2.m1 r1 = new do2.m1
            r1.<init>()
            r8.f55894r = r4
            java.lang.Object r9 = lb.l0.g0(r9, r1, r8)
            if (r9 != r0) goto L52
            return r0
        L52:
            r8.f55894r = r3
            java.lang.Object r9 = r6.collect(r7, r8)
            if (r9 != r0) goto L7b
            return r0
        L5b:
            r9 = r7
            eo2.a r9 = (eo2.a) r9
            eo2.q0 r9 = r9.g()
            do2.i r9 = r1.a(r9)
            do2.i r9 = lb.l0.V(r9)
            do2.o1 r1 = new do2.o1
            java.lang.Object r3 = r8.f55898v
            r4 = 0
            r1.<init>(r6, r7, r3, r4)
            r8.f55894r = r2
            java.lang.Object r9 = lb.l0.I(r9, r1, r8)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
