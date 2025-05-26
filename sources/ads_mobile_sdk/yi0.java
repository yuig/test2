package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class yi0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj0 f14264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(cj0 cj0Var, bl2.c cVar) {
        super(2, cVar);
        this.f14264b = cj0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new yi0(this.f14264b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yi0(this.f14264b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14263a;
        if (i13 == 0) {
            ue.c.H(obj);
            n1 n1Var = this.f14264b.L;
            this.f14263a = 1;
            if (n1Var.g(this) == aVar) {
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
