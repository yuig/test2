package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f110571r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0 f110572s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(o0 o0Var, bl2.c cVar) {
        super(2, cVar);
        this.f110572s = o0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y(this.f110572s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f110571r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f110571r = 1;
            float f13 = s0.f110535a;
            o0 o0Var = this.f110572s;
            if (o0Var.l() + 1 < o0Var.n()) {
                obj2 = o0Var.h(o0Var.l() + 1, 0.0f, j1.e.q(0.0f, 0.0f, null, 7), this);
                if (obj2 != obj3) {
                    obj2 = Unit.f80348a;
                }
            } else {
                obj2 = Unit.f80348a;
            }
            if (obj2 == obj3) {
                return obj3;
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
