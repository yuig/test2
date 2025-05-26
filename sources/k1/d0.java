package k1;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class d0 extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f77844r;

    /* renamed from: s, reason: collision with root package name */
    public int f77845s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ m1.g1 f77846t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ long f77847u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f77848v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(j jVar, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f77844r = i13;
        this.f77848v = jVar;
    }

    @Override // kl2.l
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f77844r) {
        }
        return r((m1.g1) obj, ((a3.c) obj2).f482a, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i13 = this.f77844r;
        j jVar = this.f77848v;
        switch (i13) {
            case 0:
                Object obj4 = cl2.a.COROUTINE_SUSPENDED;
                int i14 = this.f77845s;
                if (i14 == 0) {
                    ue.c.H(obj);
                    m1.g1 g1Var = this.f77846t;
                    long j13 = this.f77847u;
                    e0 e0Var = (e0) jVar;
                    if (e0Var.f77894t) {
                        this.f77845s = 1;
                        o1.l lVar = e0Var.f77890p;
                        if (lVar == null || (obj2 = dl2.b.O(new d(g1Var, j13, lVar, e0Var, null), this)) != obj4) {
                            obj2 = Unit.f80348a;
                        }
                        if (obj2 == obj4) {
                            return obj4;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
            default:
                Object obj5 = cl2.a.COROUTINE_SUSPENDED;
                int i15 = this.f77845s;
                if (i15 == 0) {
                    ue.c.H(obj);
                    m1.g1 g1Var2 = this.f77846t;
                    long j14 = this.f77847u;
                    i0 i0Var = (i0) jVar;
                    if (i0Var.f77894t) {
                        this.f77845s = 1;
                        o1.l lVar2 = i0Var.f77890p;
                        if (lVar2 == null || (obj3 = dl2.b.O(new d(g1Var2, j14, lVar2, i0Var, null), this)) != obj5) {
                            obj3 = Unit.f80348a;
                        }
                        if (obj3 == obj5) {
                            return obj5;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
        }
    }

    public final Object r(m1.g1 g1Var, long j13, bl2.c cVar) {
        int i13 = this.f77844r;
        j jVar = this.f77848v;
        switch (i13) {
            case 0:
                d0 d0Var = new d0((e0) jVar, cVar, 0);
                d0Var.f77846t = g1Var;
                d0Var.f77847u = j13;
                return d0Var.invokeSuspend(Unit.f80348a);
            default:
                d0 d0Var2 = new d0((i0) jVar, cVar, 1);
                d0Var2.f77846t = g1Var;
                d0Var2.f77847u = j13;
                return d0Var2.invokeSuspend(Unit.f80348a);
        }
    }
}
