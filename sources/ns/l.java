package ns;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f91930r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f91931s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f91931s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f91931s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f91930r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = r.f91954c1;
            r rVar = this.f91931s;
            do2.i d2 = rVar.b9().f91952f.d();
            k kVar = new k(rVar, null);
            this.f91930r = 1;
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
