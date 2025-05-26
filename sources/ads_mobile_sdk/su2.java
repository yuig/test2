package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class su2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11244a;

    public su2(bl2.c cVar) {
        super(2, cVar);
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        su2 su2Var = new su2(cVar);
        su2Var.f11244a = obj;
        return su2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        su2 su2Var = new su2((bl2.c) obj2);
        su2Var.f11244a = (ym0) obj;
        return su2Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        kn0 a13 = ((ym0) this.f11244a).a();
        a13.f7406l.setValue(a13, kn0.f7394t[2], Boolean.TRUE);
        return Unit.f80348a;
    }
}
