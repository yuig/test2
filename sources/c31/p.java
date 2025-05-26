package c31;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f25610r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f25611s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f25611s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f25611s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f25610r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = r.W0;
            r rVar = this.f25611s;
            do2.i d2 = rVar.l9().f25624l.d();
            o oVar = new o(rVar, null);
            this.f25610r = 1;
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
