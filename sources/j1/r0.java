package j1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ float f74217r;

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r0 r0Var = new r0(2, cVar);
        r0Var.f74217r = ((Number) obj).floatValue();
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create(Float.valueOf(((Number) obj).floatValue()), (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return Boolean.valueOf(this.f74217r > 0.0f);
    }
}
