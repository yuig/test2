package r02;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class z extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f105829r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f105830s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, bl2.c cVar) {
        super(2, cVar);
        this.f105830s = e0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z(this.f105830s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f105829r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = e0.P0;
            e0 e0Var = this.f105830s;
            do2.i d2 = e0Var.b9().f110331e.d();
            y yVar = new y(e0Var, null);
            this.f105829r = 1;
            if (lb.l0.I(d2, yVar, this) == aVar) {
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
