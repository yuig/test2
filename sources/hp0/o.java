package hp0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f69858r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f69859s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f69859s = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f69859s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f69858r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = t.A0;
            t tVar = this.f69859s;
            do2.i d2 = ((f0) tVar.f69870l0.getValue()).f69838g.d();
            n nVar = new n(tVar, null);
            this.f69858r = 1;
            if (l0.I(d2, nVar, this) == aVar) {
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
