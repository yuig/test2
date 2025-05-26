package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class lv0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv0 f8003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(kv0 kv0Var, bl2.c cVar) {
        super(2, cVar);
        this.f8003a = kv0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new lv0(this.f8003a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kv0 kv0Var = this.f8003a;
        new lv0(kv0Var, (bl2.c) obj2);
        Unit unit = Unit.f80348a;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(unit);
        return kv0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return this.f8003a;
    }
}
