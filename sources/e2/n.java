package e2;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56883r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f56884s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f56884s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f56884s, cVar);
        nVar.f56883r = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f56883r;
        q qVar = this.f56884s;
        kotlin.jvm.internal.j.z(j0Var, null, null, new k(qVar, null), 3);
        kotlin.jvm.internal.j.z(j0Var, null, null, new l(qVar, null), 3);
        return kotlin.jvm.internal.j.z(j0Var, null, null, new m(qVar, null), 3);
    }
}
