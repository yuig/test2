package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class vu2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12661a;

    public vu2(bl2.c cVar) {
        super(2, cVar);
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        vu2 vu2Var = new vu2(cVar);
        vu2Var.f12661a = obj;
        return vu2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vu2 vu2Var = new vu2((bl2.c) obj2);
        vu2Var.f12661a = (ym0) obj;
        return vu2Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((ym0) this.f12661a).f14326l.set(true);
        return Unit.f80348a;
    }
}
