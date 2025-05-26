package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class bi1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ci1 f2886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.pf f2887b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi1(ci1 ci1Var, a.pf pfVar, bl2.c cVar) {
        super(2, cVar);
        this.f2886a = ci1Var;
        this.f2887b = pfVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new bi1(this.f2886a, this.f2887b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bi1(this.f2886a, this.f2887b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ci1.a(this.f2886a, this.f2887b);
        this.f2886a.a(this.f2887b);
        return Unit.f80348a;
    }
}
