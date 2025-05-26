package k92;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f78885r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f78886s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f78885r = oVar;
        this.f78886s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f78885r, this.f78886s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o oVar = this.f78885r;
        boolean z13 = oVar instanceof n;
        l lVar = this.f78886s;
        if (z13) {
            b20.c.B(lVar.f78887a, new b(((n) oVar).f78890a), null, null, 30);
        } else if (oVar instanceof m) {
            b20.c.B(lVar.f78887a, ((m) oVar).f78888a, null, null, 30);
        }
        return Unit.f80348a;
    }
}
