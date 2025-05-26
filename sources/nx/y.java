package nx;

import do2.v1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92479r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f92480s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f92480s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y(this.f92480s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92479r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = this.f92480s;
            zVar.f92485a.getClass();
            do2.i V = lb.l0.V(new w41.g0(new w41.g0(new v1(xu1.y.f135992f, xu1.y.f135990d, new cn0.t(2, null), 0), 13), 14));
            x xVar = new x(zVar, null);
            this.f92479r = 1;
            if (lb.l0.I(V, xVar, this) == aVar) {
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
