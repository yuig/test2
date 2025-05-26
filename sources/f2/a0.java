package f2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class a0 extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f60811r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f60812s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, bl2.c cVar) {
        super(3, cVar);
        this.f60812s = e0Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j13 = ((a3.c) obj2).f482a;
        a0 a0Var = new a0(this.f60812s, (bl2.c) obj3);
        a0Var.f60811r = j13;
        return a0Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        long j13 = this.f60811r;
        e0 e0Var = this.f60812s;
        e0Var.f60847n.i((e0Var.f60841h ? e0Var.f60840g.h() - a3.c.d(j13) : a3.c.d(j13)) - e0Var.f60846m.h());
        return Unit.f80348a;
    }
}
