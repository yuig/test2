package ads_mobile_sdk;

import a.l0;
import ao2.g0;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l42 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o42 f7670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ad f7671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wi.b0 f7672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l42(wi.b0 b0Var, o42 o42Var, a.ad adVar, bl2.c cVar) {
        super(2, cVar);
        this.f7670a = o42Var;
        this.f7671b = adVar;
        this.f7672c = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l42(this.f7672c, this.f7670a, this.f7671b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l42) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l0 l0Var = cm0.f3958f;
        o42 o42Var = this.f7670a;
        a.ad adVar = this.f7671b;
        kotlin.jvm.internal.j.z(dl2.b.b(getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new k42(this.f7672c, o42Var, adVar, null), 3);
        return Unit.f80348a;
    }
}
