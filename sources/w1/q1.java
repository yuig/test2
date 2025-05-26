package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127454r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n3.w f127455s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1 f127456t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(n3.w wVar, y1 y1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127455s = wVar;
        this.f127456t = y1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q1 q1Var = new q1(this.f127455s, this.f127456t, cVar);
        q1Var.f127454r = obj;
        return q1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ao2.j0 j0Var = (ao2.j0) this.f127454r;
        ao2.l0 l0Var = ao2.l0.UNDISPATCHED;
        n3.w wVar = this.f127455s;
        y1 y1Var = this.f127456t;
        kotlin.jvm.internal.j.z(j0Var, null, l0Var, new o1(wVar, y1Var, null), 1);
        return kotlin.jvm.internal.j.z(j0Var, null, l0Var, new p1(wVar, y1Var, null), 1);
    }
}
