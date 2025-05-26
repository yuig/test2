package xu1;

import ao2.j0;
import do2.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f135968r;

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(2, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f135968r;
        if (i13 == 0) {
            ue.c.H(obj);
            t2 t2Var = y.f135992f;
            i iVar = i.NONE;
            this.f135968r = 1;
            t2Var.i(iVar);
            if (Unit.f80348a == aVar) {
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
