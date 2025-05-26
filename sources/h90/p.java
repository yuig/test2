package h90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f68281r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f68282s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f68282s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f68282s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f68281r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = r.f68289p1;
            r rVar = this.f68282s;
            do2.i d2 = rVar.k9().f68267f.d();
            o oVar = new o(rVar, null);
            this.f68281r = 1;
            if (lb.l0.I(d2, oVar, this) == aVar) {
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
