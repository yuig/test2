package y52;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class u0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f137854r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0 f137855s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, bl2.c cVar) {
        super(2, cVar);
        this.f137855s = x0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u0(this.f137855s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f137854r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = x0.f137870v0;
            x0 x0Var = this.f137855s;
            do2.i V = lb.l0.V(new w41.g0(x0Var.e8().f137820l.d(), 19));
            s0 s0Var = new s0(x0Var, null);
            this.f137854r = 1;
            if (lb.l0.I(V, s0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
