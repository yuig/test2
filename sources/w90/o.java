package w90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128573r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f128574s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f128574s = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f128574s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128573r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = p.V0;
            p pVar = this.f128574s;
            do2.i d2 = pVar.e9().f128555l.d();
            n nVar = new n(pVar, null);
            this.f128573r = 1;
            if (lb.l0.I(d2, nVar, this) == aVar) {
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
