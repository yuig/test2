package h90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f68279r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f68280s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f68280s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        o oVar = new o(this.f68280s, cVar);
        oVar.f68279r = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((d) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d dVar = (d) this.f68279r;
        int i13 = r.f68289p1;
        r rVar = this.f68280s;
        rVar.getClass();
        rVar.f68296g1 = dVar.f();
        return Unit.f80348a;
    }
}
