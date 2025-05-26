package dt0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56247r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f56248s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f56248s = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f56248s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56247r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = n.S0;
            n nVar = this.f56248s;
            do2.i d2 = nVar.k9().f56235h.d();
            k kVar = new k(nVar, null);
            this.f56247r = 1;
            if (l0.I(d2, kVar, this) == aVar) {
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
