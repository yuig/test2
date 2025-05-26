package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f55913r;

    /* renamed from: s, reason: collision with root package name */
    public int f55914s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f55915t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55916u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f55917v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bl2.c cVar, kotlin.jvm.internal.j0 j0Var, j jVar) {
        super(2, cVar);
        this.f55916u = j0Var;
        this.f55917v = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(cVar, this.f55916u, this.f55917v);
        rVar.f55915t = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create(new co2.t(((co2.t) obj).f28348a), (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.j0 j0Var;
        kotlin.jvm.internal.j0 j0Var2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55914s;
        if (i13 == 0) {
            ue.c.H(obj);
            Object obj2 = ((co2.t) this.f55915t).f28348a;
            boolean z13 = obj2 instanceof co2.s;
            j0Var = this.f55916u;
            if (!z13) {
                j0Var.f80434a = obj2;
            }
            if (z13) {
                Throwable a13 = co2.t.a(obj2);
                if (a13 != null) {
                    throw a13;
                }
                Object obj3 = j0Var.f80434a;
                if (obj3 != null) {
                    if (obj3 == eo2.j0.f59783a) {
                        obj3 = null;
                    }
                    this.f55915t = obj2;
                    this.f55913r = j0Var;
                    this.f55914s = 1;
                    if (this.f55917v.emit(obj3, this) == aVar) {
                        return aVar;
                    }
                    j0Var2 = j0Var;
                }
                j0Var.f80434a = eo2.j0.f59785c;
            }
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j0Var2 = this.f55913r;
        ue.c.H(obj);
        j0Var = j0Var2;
        j0Var.f80434a = eo2.j0.f59785c;
        return Unit.f80348a;
    }
}
