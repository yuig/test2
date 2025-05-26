package ads_mobile_sdk;

import a.l0;
import ao2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x70 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f80 f13516a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x70(f80 f80Var, bl2.c cVar) {
        super(2, cVar);
        this.f13516a = f80Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x70(this.f13516a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new x70(this.f13516a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new w70(this.f13516a, null), 3);
        return Unit.f80348a;
    }
}
