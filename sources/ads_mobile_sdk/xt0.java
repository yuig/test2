package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class xt0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wi.t f13803a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(bl2.c cVar, wi.t tVar) {
        super(2, cVar);
        this.f13803a = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new xt0(cVar, this.f13803a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xt0((bl2.c) obj2, this.f13803a).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f13803a.a(ku0.K);
        return Unit.f80348a;
    }
}
