package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import wi.n;

/* loaded from: classes2.dex */
public final class le0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe0 f7786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le0(oe0 oe0Var, bl2.c cVar) {
        super(2, cVar);
        this.f7786b = oe0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new le0(this.f7786b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new le0(this.f7786b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7785a;
        if (i13 == 0) {
            ue.c.H(obj);
            oe0 oe0Var = this.f7786b;
            wi.o oVar = new wi.o(n.AD_REUSED, "This ad has already been shown.");
            this.f7785a = 1;
            if (oe0Var.a(oVar, this) == aVar) {
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
