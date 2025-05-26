package dy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56591r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f56592s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f56592s = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f56592s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56591r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = o.f56602h0;
            o oVar = this.f56592s;
            do2.i d2 = oVar.Y7().f56610e.d();
            k kVar = new k(oVar, null);
            this.f56591r = 1;
            if (lb.l0.I(d2, kVar, this) == aVar) {
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
