package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class os1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws1 f9424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.e9 f9425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os1(ws1 ws1Var, a.e9 e9Var, bl2.c cVar) {
        super(2, cVar);
        this.f9424a = ws1Var;
        this.f9425b = e9Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new os1(this.f9424a, this.f9425b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new os1(this.f9424a, this.f9425b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        zq1 zq1Var = this.f9424a.f13229e;
        a.e9 adSession = this.f9425b;
        zq1Var.getClass();
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        return (Unit) zq1Var.f14866g.b(new oq1(adSession), "FinishOmidSession");
    }
}
