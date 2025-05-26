package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f77871r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f77871r = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f77871r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j jVar = this.f77871r;
        o1.h hVar = jVar.A;
        if (hVar != null) {
            o1.i iVar = new o1.i(hVar);
            o1.l lVar = jVar.f77890p;
            if (lVar != null) {
                kotlin.jvm.internal.j.z(jVar.z0(), null, null, new b(lVar, iVar, null), 3);
            }
            jVar.A = null;
        }
        return Unit.f80348a;
    }
}
