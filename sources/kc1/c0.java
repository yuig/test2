package kc1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import w41.g0;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f79141r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f79142s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f79142s = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f79142s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f79141r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = d0.L0;
            d0 d0Var = this.f79142s;
            g0 g0Var = new g0(d0Var.b9().f79161e.d(), 8);
            a0 a0Var = new a0(d0Var, null);
            this.f79141r = 1;
            if (l0.I(g0Var, a0Var, this) == aVar) {
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
