package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class n0 extends dl2.j implements kl2.m {

    /* renamed from: r, reason: collision with root package name */
    public int f55863r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f55864s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ long f55865t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f55866u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function2 f55867v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(long j13, Function2 function2, bl2.c cVar) {
        super(4, cVar);
        this.f55866u = j13;
        this.f55867v = function2;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        n0 n0Var = new n0(this.f55866u, this.f55867v, (bl2.c) obj4);
        n0Var.f55864s = (Throwable) obj2;
        n0Var.f55865t = longValue;
        return n0Var.invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
     */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f55863r
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            ue.c.H(r8)
            goto L2d
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            ue.c.H(r8)
            java.lang.Throwable r8 = r7.f55864s
            long r3 = r7.f55865t
            long r5 = r7.f55866u
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L36
            r7.f55863r = r2
            kotlin.jvm.functions.Function2 r1 = r7.f55867v
            java.lang.Object r8 = r1.invoke(r8, r7)
            if (r8 != r0) goto L2d
            return r0
        L2d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L36
            goto L37
        L36:
            r2 = 0
        L37:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
