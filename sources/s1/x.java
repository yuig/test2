package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f110569r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0 f110570s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o0 o0Var, bl2.c cVar) {
        super(2, cVar);
        this.f110570s = o0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f110570s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f110569r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f110569r = 1;
            float f13 = s0.f110535a;
            o0 o0Var = this.f110570s;
            if (o0Var.l() - 1 >= 0) {
                obj2 = o0Var.h(o0Var.l() - 1, 0.0f, j1.e.q(0.0f, 0.0f, null, 7), this);
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
