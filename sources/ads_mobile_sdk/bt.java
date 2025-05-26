package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class bt extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ad1 f3588b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(ad1 ad1Var, bl2.c cVar) {
        super(2, cVar);
        this.f3588b = ad1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        bt btVar = new bt(this.f3588b, cVar);
        btVar.f3587a = obj;
        return btVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        bt btVar = new bt(this.f3588b, (bl2.c) obj2);
        btVar.f3587a = (ym0) obj;
        return btVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((ym0) this.f3587a).a().f7408n = this.f3588b;
        return Unit.f80348a;
    }
}
