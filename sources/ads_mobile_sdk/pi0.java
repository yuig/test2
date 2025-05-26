package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class pi0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi0 f9696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(wi0 wi0Var, bl2.c cVar) {
        super(2, cVar);
        this.f9696b = wi0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new pi0(this.f9696b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pi0(this.f9696b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9695a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 h10 = this.f9696b.h();
            nm.u uVar = new nm.u();
            this.f9695a = 1;
            if (h10.a(uVar, "onbackblocked", this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
