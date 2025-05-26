package n60;

import ao2.e2;
import ao2.j0;
import ao2.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89253r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f89254s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f89254s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g gVar = new g(this.f89254s, cVar);
        gVar.f89253r = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f89253r;
        ko2.f fVar = v0.f20219a;
        e2 e2Var = ho2.q.f69782a;
        j jVar = this.f89254s;
        kotlin.jvm.internal.j.z(j0Var, e2Var, null, new e(jVar, null), 2);
        kotlin.jvm.internal.j.z(j0Var, null, null, new f(jVar, null), 3);
        return Unit.f80348a;
    }
}
