package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i42 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o42 f6230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i42(o42 o42Var, bl2.c cVar) {
        super(2, cVar);
        this.f6230a = o42Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i42(this.f6230a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i42(this.f6230a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o42 o42Var = this.f6230a;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(o42Var.f9134s.getValue(o42Var, o42.f9125u[0]));
        return Unit.f80348a;
    }
}
