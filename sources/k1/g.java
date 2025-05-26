package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f77864r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f77864r = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f77864r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j jVar = this.f77864r;
        if (jVar.A == null) {
            o1.h hVar = new o1.h();
            o1.l lVar = jVar.f77890p;
            if (lVar != null) {
                kotlin.jvm.internal.j.z(jVar.z0(), null, null, new a(lVar, hVar, null), 3);
            }
            jVar.A = hVar;
        }
        return Unit.f80348a;
    }
}
