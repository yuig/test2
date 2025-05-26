package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111478r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e2 f111479s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(e2 e2Var, bl2.c cVar) {
        super(2, cVar);
        this.f111479s = e2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c2 c2Var = new c2(this.f111479s, cVar);
        c2Var.f111478r = obj;
        return c2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j jVar = (j) this.f111478r;
        e2 e2Var = this.f111479s;
        e2Var.f111514g0.setValue(jVar);
        e2Var.f111515h0 = jVar.f111602k;
        return Unit.f80348a;
    }
}
