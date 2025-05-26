package mu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class n0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f88218s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, bl2.c cVar) {
        super(2, cVar);
        this.f88218s = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n0(this.f88218s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88217r;
        if (i13 == 0) {
            ue.c.H(obj);
            p0 p0Var = this.f88218s;
            wb.c Y7 = p0Var.Y7();
            m0 m0Var = new m0(p0Var, null);
            this.f88217r = 1;
            if (lb.l0.I(Y7, m0Var, this) == aVar) {
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
