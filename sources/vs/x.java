package vs;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f126525r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f126526s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e0 f126527t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f126528u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, e0 e0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f126526s = zVar;
        this.f126527t = e0Var;
        this.f126528u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f126526s, this.f126527t, this.f126528u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f126525r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = this.f126526s;
            do2.j0 j0Var = new do2.j0(ve.h.x(zVar.f126534b, ((b0) this.f126527t).f126472a), new w(0, this.f126528u, null));
            y1.b bVar = new y1.b(zVar, 2);
            this.f126525r = 1;
            if (j0Var.collect(bVar, this) == aVar) {
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
