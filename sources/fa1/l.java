package fa1;

import ao2.j0;
import ea1.k1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f61574r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k1 f61575s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f61576t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, k1 k1Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f61574r = nVar;
        this.f61575s = k1Var;
        this.f61576t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f61574r, this.f61575s, this.f61576t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = this.f61574r;
        xj2.b bVar = nVar.f61587h;
        k1 k1Var = this.f61575s;
        kk2.g gVar = new kk2.g(new kk2.g(nVar.f61582c.b(k1Var.f58074a, false), new c(8, new k(nVar, k1Var, 0)), 3), new c(9, new k(nVar, k1Var, 1)), 1);
        r rVar = this.f61576t;
        bVar.a(gVar.o(new c(10, new y71.b(15, rVar, k1Var)), new c(11, new g(rVar, 3))));
        return Unit.f80348a;
    }
}
