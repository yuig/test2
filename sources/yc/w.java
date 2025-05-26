package yc;

import kotlin.Unit;
import vc.b0;

/* loaded from: classes3.dex */
public final class w extends dl2.j implements kl2.m {

    /* renamed from: r, reason: collision with root package name */
    public int f138688r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f138689s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ long f138690t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b0 f138691u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, bl2.c cVar) {
        super(4, cVar);
        this.f138691u = b0Var;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        w wVar = new w(this.f138691u, (bl2.c) obj4);
        wVar.f138689s = (Throwable) obj2;
        wVar.f138690t = longValue;
        return wVar.invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L17;
     */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f138688r
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            ue.c.H(r7)
            goto L32
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            ue.c.H(r7)
            java.lang.Throwable r7 = r6.f138689s
            long r3 = r6.f138690t
            boolean r1 = r7 instanceof com.apollographql.apollo3.exception.ApolloException
            if (r1 == 0) goto L3b
            vc.b0 r1 = r6.f138691u
            kl2.l r1 = r1.f125508c
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            r6.f138688r = r2
            java.lang.Object r7 = r1.invoke(r7, r5, r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3b
            goto L3c
        L3b:
            r2 = 0
        L3c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
