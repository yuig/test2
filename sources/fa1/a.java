package fa1;

import ao2.j0;
import jk2.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p91.y;
import u50.r;
import uj2.a0;
import x02.a2;

/* loaded from: classes5.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f61545r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f61546s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n nVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f61545r = nVar;
        this.f61546s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f61545r, this.f61546s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = this.f61545r;
        xj2.b bVar = nVar.f61587h;
        e82.f fVar = nVar.f61582c;
        uk2.f fVar2 = fVar.f57840j;
        a0 a0Var = tk2.e.f118017c;
        l1 A = fVar2.H(a0Var).A(wj2.c.a());
        r rVar = this.f61546s;
        y yVar = new y(26, new p70.a(rVar, 25));
        y yVar2 = new y(27, new p70.a(rVar, 26));
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        bVar.a(A.F(yVar, yVar2, cVar, a2Var));
        nVar.f61587h.a(fVar.f57839i.H(a0Var).A(wj2.c.a()).F(new y(28, new y71.b(13, rVar, nVar)), new y(29, new p70.a(rVar, 27)), cVar, a2Var));
        return Unit.f80348a;
    }
}
