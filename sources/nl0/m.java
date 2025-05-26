package nl0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tu.d0;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f91274r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f91274r = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f91274r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((ll.j) this.f91274r.f119283e).B();
        return Unit.f80348a;
    }
}
