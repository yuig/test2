package bk1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m2 f23250r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i1 f23251s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(m2 m2Var, i1 i1Var, bl2.c cVar) {
        super(2, cVar);
        this.f23250r = m2Var;
        this.f23251s = i1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k2(this.f23250r, this.f23251s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h1 h1Var = (h1) this.f23251s;
        m2 m2Var = this.f23250r;
        m2Var.getClass();
        m2Var.f23269a.x(h1Var.j(), h1Var.l(), h1Var.k(), true);
        return Unit.f80348a;
    }
}
