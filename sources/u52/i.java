package u52;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f120699r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f120700s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f120700s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f120700s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f120699r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = l.f120709l0;
            l lVar = this.f120700s;
            do2.i a13 = do2.c0.a(new w41.g0(lVar.d8().f120724h.d(), 17), f.f120687j);
            g gVar = new g(lVar, null);
            this.f120699r = 1;
            if (lb.l0.I(a13, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
