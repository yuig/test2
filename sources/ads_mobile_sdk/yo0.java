package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class yo0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zo0 f14345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(zo0 zo0Var, bl2.c cVar) {
        super(2, cVar);
        this.f14345a = zo0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new yo0(this.f14345a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yo0(this.f14345a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ym0 ym0Var = (ym0) this.f14345a.f14847b.f13641c.get();
        if (ym0Var != null) {
            ym0Var.setVisibility(8);
        }
        this.f14345a.f14848c.f3979h.getAndSet(false);
        return Unit.f80348a;
    }
}
