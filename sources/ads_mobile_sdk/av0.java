package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class av0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv0 f2557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(dv0 dv0Var, bl2.c cVar) {
        super(2, cVar);
        this.f2557a = dv0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new av0(this.f2557a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new av0(this.f2557a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f2557a.D.a(ku0.K);
        return Unit.f80348a;
    }
}
