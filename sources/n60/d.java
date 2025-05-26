package n60;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89249r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f89250s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f89250s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f89250s, cVar);
        dVar.f89249r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f89249r;
        j jVar = this.f89250s;
        kotlin.jvm.internal.j.z(j0Var, null, null, new a(jVar, null), 3);
        kotlin.jvm.internal.j.z(j0Var, null, null, new b(jVar, null), 3);
        kotlin.jvm.internal.j.z(j0Var, null, null, new c(jVar, null), 3);
        return Unit.f80348a;
    }
}
