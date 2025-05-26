package yq1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f139867r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m1 f139868s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m1 m1Var, bl2.c cVar) {
        super(2, cVar);
        this.f139868s = m1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i1(this.f139868s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f139867r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = m1.X0;
            m1 m1Var = this.f139868s;
            do2.i d2 = m1Var.d9().f130960h.d();
            h1 h1Var = new h1(m1Var, null);
            this.f139867r = 1;
            if (lb.l0.I(d2, h1Var, this) == aVar) {
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
