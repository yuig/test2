package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55899r;

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p2 p2Var = new p2(2, cVar);
        p2Var.f55899r = obj;
        return p2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p2) create((i2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return Boolean.valueOf(((i2) this.f55899r) != i2.START);
    }
}
