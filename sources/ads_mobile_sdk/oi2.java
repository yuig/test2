package ads_mobile_sdk;

import a.l0;
import ao2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class oi2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dj.d f9321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ad f9322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi2(a.ad adVar, dj.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f9321a = dVar;
        this.f9322b = adVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new oi2(this.f9322b, this.f9321a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dj.d dVar = this.f9321a;
        return new oi2(this.f9322b, dVar, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l0 l0Var = cm0.f3958f;
        dj.d dVar = this.f9321a;
        kotlin.jvm.internal.j.z(dl2.b.b(getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new ni2(this.f9322b, dVar, null), 3);
        return Unit.f80348a;
    }
}
