package ads_mobile_sdk;

import a.l0;
import ao2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p32 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.j8 f9530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ld f9531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p32(a.j8 j8Var, a.ld ldVar, bl2.c cVar) {
        super(2, cVar);
        this.f9530a = j8Var;
        this.f9531b = ldVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p32(this.f9530a, this.f9531b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p32(this.f9530a, this.f9531b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new o32(this.f9530a, this.f9531b, null), 3);
        return Unit.f80348a;
    }
}
