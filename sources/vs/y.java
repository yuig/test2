package vs;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f126529r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f126530s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e0 f126531t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f126532u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, e0 e0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f126530s = zVar;
        this.f126531t = e0Var;
        this.f126532u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y(this.f126530s, this.f126531t, this.f126532u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f126529r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = this.f126530s;
            do2.c x13 = ve.h.x(zVar.f126534b, ((c0) this.f126531t).f126476a);
            u50.r rVar = this.f126532u;
            do2.j0 j0Var = new do2.j0(x13, new w(1, rVar, null));
            o1.f fVar = new o1.f(8, zVar, rVar);
            this.f126529r = 1;
            if (j0Var.collect(fVar, this) == aVar) {
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
