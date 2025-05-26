package ads_mobile_sdk;

import a.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ud0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f12026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(z1 z1Var, bl2.c cVar) {
        super(2, cVar);
        this.f12026b = z1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        ud0 ud0Var = new ud0(this.f12026b, cVar);
        ud0Var.f12025a = obj;
        return ud0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ud0 ud0Var = new ud0(this.f12026b, (bl2.c) obj2);
        ud0Var.f12025a = (ym0) obj;
        return ud0Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((ym0) this.f12025a).f14328n = this.f12026b;
        return Unit.f80348a;
    }
}
