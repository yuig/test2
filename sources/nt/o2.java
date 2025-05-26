package nt;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class o2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f1 f92126r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(f1 f1Var, bl2.c cVar) {
        super(2, cVar);
        this.f92126r = f1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o2(this.f92126r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o2) create((String) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f1 f1Var = this.f92126r;
        f1Var.f92037d = false;
        f1Var.f92036c.X(d1.f92012t);
        return Unit.f80348a;
    }
}
