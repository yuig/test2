package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class az0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xi.d f2601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz0 f2602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(xi.d dVar, mz0 mz0Var, bl2.c cVar) {
        super(2, cVar);
        this.f2601a = dVar;
        this.f2602b = mz0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new az0(this.f2601a, this.f2602b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new az0(this.f2601a, this.f2602b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((gw.e) this.f2601a).a(this.f2602b.a());
        return Unit.f80348a;
    }
}
