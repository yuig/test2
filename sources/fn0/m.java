package fn0;

import ao2.i1;
import ao2.j0;
import co2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62640r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ hn0.e f62641s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0 f62642t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f62643u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f62644v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hn0.e eVar, b0 b0Var, t tVar, c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f62641s = eVar;
        this.f62642t = b0Var;
        this.f62643u = tVar;
        this.f62644v = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f62641s, this.f62642t, this.f62643u, this.f62644v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62640r;
        if (i13 == 0) {
            ue.c.H(obj);
            i1 i1Var = this.f62643u.f62670g;
            this.f62640r = 1;
            hn0.e eVar = this.f62641s;
            eVar.getClass();
            Object M = kotlin.jvm.internal.j.M(this, i1Var, new hn0.c(eVar, this.f62642t, null));
            if (M != obj2) {
                M = Unit.f80348a;
            }
            if (M == obj2) {
                return obj2;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f62644v.f62608b.signalEndOfInputStream();
        return Unit.f80348a;
    }
}
