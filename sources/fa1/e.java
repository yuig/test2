package fa1;

import ao2.j0;
import ea1.e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f61555r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e1 f61556s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, e1 e1Var, bl2.c cVar) {
        super(2, cVar);
        this.f61555r = nVar;
        this.f61556s = e1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f61555r, this.f61556s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = this.f61555r;
        nVar.f61587h.a(nVar.f61582c.a(this.f61556s.f58047a));
        return Unit.f80348a;
    }
}
