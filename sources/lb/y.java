package lb;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class y extends dl2.j implements kl2.m {

    /* renamed from: r, reason: collision with root package name */
    public int f82687r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f82688s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ long f82689t;

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        y yVar = new y(4, (bl2.c) obj4);
        yVar.f82688s = (Throwable) obj2;
        yVar.f82689t = longValue;
        return yVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f82687r;
        if (i13 == 0) {
            ue.c.H(obj);
            Throwable th3 = this.f82688s;
            long j13 = this.f82689t;
            kb.b0.e().d(a0.f82556a, "Cannot check for unfinished work", th3);
            long min = Math.min(j13 * 30000, a0.f82557b);
            this.f82687r = 1;
            if (l0.S(min, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Boolean.TRUE;
    }
}
