package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m1 f127497s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.l f127498t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(m1 m1Var, o1.l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f127497s = m1Var;
        this.f127498t = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s2(this.f127497s, this.f127498t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127496r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f127496r = 1;
            m1 m1Var = this.f127497s;
            m1Var.getClass();
            g1.a0 a0Var = new g1.a0();
            do2.f2 f2Var = this.f127498t.f92764a;
            o1.f fVar = new o1.f(i14, a0Var, m1Var);
            f2Var.getClass();
            Object j13 = do2.f2.j(f2Var, fVar, this);
            if (j13 != obj2) {
                j13 = Unit.f80348a;
            }
            if (j13 == obj2) {
                return obj2;
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
