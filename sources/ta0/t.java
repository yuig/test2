package ta0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x f116906r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f116907s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f116908t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f116909u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, v vVar, u50.r rVar, ao2.j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f116906r = xVar;
        this.f116907s = vVar;
        this.f116908t = rVar;
        this.f116909u = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t(this.f116906r, this.f116907s, this.f116908t, this.f116909u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        x xVar = this.f116906r;
        if (xVar instanceof w) {
            v vVar = this.f116907s;
            ao2.j0 j0Var = this.f116909u;
            u50.r rVar = this.f116908t;
            s sVar = new s(vVar, j0Var, xVar, rVar);
            vVar.getClass();
            vVar.f116915c.a(new sv.y(sVar, vVar, rVar, 14));
        }
        return Unit.f80348a;
    }
}
