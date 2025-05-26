package tc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import uc0.w2;

/* loaded from: classes5.dex */
public final class t0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w2 f117325r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(w2 w2Var, bl2.c cVar) {
        super(2, cVar);
        this.f117325r = w2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t0(this.f117325r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f117325r.i(uc0.h.f121787a);
        return Unit.f80348a;
    }
}
