package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f138138r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f138139s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f138139s = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f138139s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f138138r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = d0.f138146w0;
            d0 d0Var = this.f138139s;
            do2.i d2 = ((y0) d0Var.f138150f0.getValue()).f138279j.d();
            b0 b0Var = new b0(d0Var, null);
            this.f138138r = 1;
            if (lb.l0.I(d2, b0Var, this) == aVar) {
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
