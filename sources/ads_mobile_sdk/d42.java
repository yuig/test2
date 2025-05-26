package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d42 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o42 f4154a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d42(o42 o42Var, bl2.c cVar) {
        super(2, cVar);
        this.f4154a = o42Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d42(this.f4154a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d42(this.f4154a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o42 o42Var = this.f4154a;
        return new l92(o42Var.f9132q.f125862l, o42Var.f9126k);
    }
}
