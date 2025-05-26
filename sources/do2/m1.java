package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f55857r;

    public m1() {
        super(2, null);
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m1 m1Var = new m1(2, cVar);
        m1Var.f55857r = ((Number) obj).intValue();
        return m1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create(Integer.valueOf(((Number) obj).intValue()), (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return Boolean.valueOf(this.f55857r > 0);
    }
}
