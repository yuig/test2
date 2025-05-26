package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class uz0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx0 f12259a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz0(sx0 sx0Var, bl2.c cVar) {
        super(2, cVar);
        this.f12259a = sx0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new uz0(this.f12259a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new uz0(this.f12259a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        sx0 sx0Var = this.f12259a;
        vi.a h10 = sx0Var.h();
        a.c1.f28a.getClass();
        l92 l92Var = new l92(h10, ((n20) ((a.c1) bk0.f3513c.getValue())).f8511b);
        l92Var.addView(sx0Var.f11274j);
        return l92Var;
    }
}
