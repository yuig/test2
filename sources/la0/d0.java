package la0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f82386r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f82387s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, bl2.c cVar) {
        super(2, cVar);
        this.f82387s = f0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d0(this.f82387s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f82386r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = f0.V0;
            f0 f0Var = this.f82387s;
            do2.i d2 = f0Var.l9().f82454p.d();
            c0 c0Var = new c0(f0Var, null);
            this.f82386r = 1;
            if (lb.l0.I(d2, c0Var, this) == aVar) {
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
