package ea1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f58083r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v0 f58084s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(v0 v0Var, bl2.c cVar) {
        super(2, cVar);
        this.f58084s = v0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f58084s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58083r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = v0.F0;
            v0 v0Var = this.f58084s;
            do2.i d2 = v0Var.b8().f58123h.d();
            l0 l0Var = new l0(v0Var, null);
            this.f58083r = 1;
            if (lb.l0.I(d2, l0Var, this) == aVar) {
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
