package n60;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f89247r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f89247r = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f89247r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        v vVar = (v) ((bf2.b) ((se2.a) this.f89247r.f89265g.getValue())).get();
        vVar.getClass();
        new t(vVar, 1).run();
        return Unit.f80348a;
    }
}
