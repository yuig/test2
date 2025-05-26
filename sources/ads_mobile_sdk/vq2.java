package ads_mobile_sdk;

import a.l0;
import ao2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class vq2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wi.c0 f12606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq2(wi.c0 c0Var, bl2.c cVar, boolean z13) {
        super(2, cVar);
        this.f12606a = c0Var;
        this.f12607b = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new vq2(this.f12606a, cVar, this.f12607b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new vq2(this.f12606a, (bl2.c) obj2, this.f12607b).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new uq2(this.f12606a, null, this.f12607b), 3);
        return Unit.f80348a;
    }
}
