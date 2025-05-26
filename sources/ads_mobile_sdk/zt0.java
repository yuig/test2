package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class zt0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wi.t f14916a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt0(bl2.c cVar, wi.t tVar) {
        super(2, cVar);
        this.f14916a = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new zt0(cVar, this.f14916a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zt0((bl2.c) obj2, this.f14916a).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f14916a.a(ku0.f7511J);
        return Unit.f80348a;
    }
}
