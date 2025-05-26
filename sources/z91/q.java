package z91;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f141395r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f141396s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p70.e f141397t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f141398u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, j0 j0Var, p70.e eVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f141395r = tVar;
        this.f141396s = j0Var;
        this.f141397t = eVar;
        this.f141398u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q(this.f141395r, this.f141396s, this.f141397t, this.f141398u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        t tVar = this.f141395r;
        boolean z13 = tVar instanceof s;
        j0 j0Var = this.f141396s;
        p70.e eVar = this.f141397t;
        if (z13) {
            kotlin.jvm.internal.j.z(j0Var, null, null, new o(eVar, this.f141398u, null), 3);
        } else if (tVar instanceof r) {
            kotlin.jvm.internal.j.z(j0Var, null, null, new p(eVar, null), 3);
        }
        return Unit.f80348a;
    }
}
