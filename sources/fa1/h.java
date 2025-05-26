package fa1;

import ao2.j0;
import ea1.g1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f61562r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g1 f61563s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f61564t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, g1 g1Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f61562r = nVar;
        this.f61563s = g1Var;
        this.f61564t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f61562r, this.f61563s, this.f61564t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = this.f61562r;
        xj2.b bVar = nVar.f61587h;
        g1 g1Var = this.f61563s;
        int i13 = 1;
        int i14 = 0;
        kk2.g gVar = new kk2.g(new kk2.g(nVar.f61582c.b(g1Var.f58055a, true), new c(2, new f(nVar, g1Var, i14)), 3), new c(3, new f(nVar, g1Var, i13)), 1);
        r rVar = this.f61564t;
        bVar.a(gVar.o(new c(4, new g(rVar, i14)), new c(5, new g(rVar, i13))));
        return Unit.f80348a;
    }
}
