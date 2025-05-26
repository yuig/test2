package fd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class e extends dl2.j implements Function1 {
    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new e(1, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((e) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
        return null;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return null;
    }
}
