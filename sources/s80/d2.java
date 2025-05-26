package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f111493r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e2 f111494s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, bl2.c cVar) {
        super(2, cVar);
        this.f111494s = e2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d2(this.f111494s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f111493r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = e2.f111509k0;
            e2 e2Var = this.f111494s;
            do2.i d2 = ((p6) e2Var.f111513f0.getValue()).f111769o.d();
            c2 c2Var = new c2(e2Var, null);
            this.f111493r = 1;
            if (lb.l0.I(d2, c2Var, this) == aVar) {
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
