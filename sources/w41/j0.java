package w41;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class j0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128020r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f128021s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, bl2.c cVar) {
        super(2, cVar);
        this.f128021s = n0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j0(this.f128021s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128020r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = n0.f128044e1;
            n0 n0Var = this.f128021s;
            do2.i d2 = n0Var.l9().f128084j.d();
            i0 i0Var = new i0(n0Var, null);
            this.f128020r = 1;
            if (lb.l0.I(d2, i0Var, this) == aVar) {
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
