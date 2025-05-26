package fa1;

import ao2.j0;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f61553r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f61554s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f61553r = nVar;
        this.f61554s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f61553r, this.f61554s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = this.f61553r;
        xj2.b bVar = nVar.f61587h;
        t l13 = nVar.f61580a.D("").r(tk2.e.f118017c).l(wj2.c.a());
        r rVar = this.f61554s;
        bVar.a(l13.o(new c(0, new p70.a(rVar, 28)), new c(1, new p70.a(rVar, 29))));
        return Unit.f80348a;
    }
}
