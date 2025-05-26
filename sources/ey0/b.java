package ey0;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f60640r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f60641s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f60640r = gVar;
        this.f60641s = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f60640r, this.f60641s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        g gVar = this.f60640r;
        gVar.getClass();
        d dVar = new d(gVar, null);
        j0 j0Var = this.f60641s;
        kotlin.jvm.internal.j.z(j0Var, null, null, dVar, 3);
        kotlin.jvm.internal.j.z(j0Var, null, null, new e(gVar, null), 3);
        return Unit.f80348a;
    }
}
