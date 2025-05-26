package n60;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f89246r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f89246r = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f89246r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        v vVar = (v) ((bf2.b) ((se2.a) this.f89246r.f89265g.getValue())).get();
        vVar.getClass();
        new t(vVar, 0).run();
        return Unit.f80348a;
    }
}
