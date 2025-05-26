package ba1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e0 f22348r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f22349s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f22348r = e0Var;
        this.f22349s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b0(this.f22348r, this.f22349s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        e0 e0Var = this.f22348r;
        e0Var.f22359c.a(e0Var.f22357a.f57839i.H(tk2.e.f118017c).A(wj2.c.a()).F(new p91.y(12, new a0(e0Var, this.f22349s, 0)), new p91.y(13, x.f22409l), ck2.i.f27923c, ck2.i.f27924d));
        return Unit.f80348a;
    }
}
