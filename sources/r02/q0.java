package r02;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class q0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f105788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f105789s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, bl2.c cVar) {
        super(2, cVar);
        this.f105789s = s0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q0(this.f105789s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f105788r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = s0.f105802t0;
            s0 s0Var = this.f105789s;
            do2.i d2 = ((s02.x) s0Var.f105804d0.getValue()).f110363d.d();
            p0 p0Var = new p0(s0Var, null);
            this.f105788r = 1;
            if (lb.l0.I(d2, p0Var, this) == aVar) {
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
