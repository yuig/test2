package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127465r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n3.w f127466s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1 f127467t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127468u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(n3.w wVar, y1 y1Var, b2.t0 t0Var, bl2.c cVar) {
        super(2, cVar);
        this.f127466s = wVar;
        this.f127467t = y1Var;
        this.f127468u = t0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r0 r0Var = new r0(this.f127466s, this.f127467t, this.f127468u, cVar);
        r0Var.f127465r = obj;
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ao2.j0 j0Var = (ao2.j0) this.f127465r;
        ao2.l0 l0Var = ao2.l0.UNDISPATCHED;
        n3.w wVar = this.f127466s;
        kotlin.jvm.internal.j.z(j0Var, null, l0Var, new p0(wVar, this.f127467t, null), 1);
        kotlin.jvm.internal.j.z(j0Var, null, l0Var, new q0(wVar, this.f127468u, null), 1);
        return Unit.f80348a;
    }
}
