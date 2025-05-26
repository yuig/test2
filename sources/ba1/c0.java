package ba1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e0 f22351r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f22352s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f22351r = e0Var;
        this.f22352s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f22351r, this.f22352s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        e0 e0Var = this.f22351r;
        e0Var.f22359c.a(e0Var.f22358b.D("").r(tk2.e.f118017c).l(wj2.c.a()).o(new p91.y(14, new a0(e0Var, this.f22352s, 1)), new p91.y(15, x.f22410m)));
        return Unit.f80348a;
    }
}
