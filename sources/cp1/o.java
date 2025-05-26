package cp1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f53011r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bl2.c cVar, p pVar) {
        super(2, cVar);
        this.f53011r = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(cVar, this.f53011r);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p pVar = this.f53011r;
        pVar.getDauManager().a(pVar, pVar.getPinalytics().p());
        return Unit.f80348a;
    }
}
