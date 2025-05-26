package yc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;
import lb.l0;
import pc.n0;

/* loaded from: classes3.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138683r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f138684s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f138685t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pc.f f138686u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pc.v f138687v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j0 j0Var, x xVar, pc.f fVar, pc.v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f138684s = j0Var;
        this.f138685t = xVar;
        this.f138686u = fVar;
        this.f138687v = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v vVar = new v(this.f138684s, this.f138685t, this.f138686u, this.f138687v, cVar);
        vVar.f138683r = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((pc.h) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n0 n0Var = ((pc.h) this.f138683r).f99563c;
        if (n0Var != null) {
            this.f138684s.f80434a = l0.U(this.f138685t.f138692a.c(this.f138686u.f99541a, n0Var, this.f138687v).values());
        }
        return Unit.f80348a;
    }
}
