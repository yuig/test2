package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j1 f85332r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(j1 j1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85332r = j1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e3(this.f85332r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j1 j1Var = this.f85332r;
        j1Var.f85393b = true;
        j1Var.f85395d.i(null);
        return Unit.f80348a;
    }
}
