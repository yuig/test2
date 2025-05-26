package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f71129r;

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i2 i2Var = new i2(2, cVar);
        i2Var.f71129r = obj;
        return i2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((h2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return Boolean.valueOf(((h2) this.f71129r) == h2.ShutDown);
    }
}
