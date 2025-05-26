package dt0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56245r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f56246s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f56246s = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f56246s, cVar);
        kVar.f56245r = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f56245r;
        n nVar = this.f56246s;
        if (!Intrinsics.d(nVar.P0, Boolean.valueOf(aVar2.f56223e))) {
            nVar.P0 = Boolean.valueOf(aVar2.f56223e);
            nVar.k9().f56235h.e().a(b.f56228a);
        }
        return Unit.f80348a;
    }
}
