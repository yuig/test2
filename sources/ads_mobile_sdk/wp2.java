package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class wp2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yp2 f13172b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp2(yp2 yp2Var, bl2.c cVar) {
        super(2, cVar);
        this.f13172b = yp2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new wp2(this.f13172b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new wp2(this.f13172b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f13171a;
        if (i13 == 0) {
            ue.c.H(obj);
            n1 n1Var = this.f13172b.f14356h;
            this.f13171a = 1;
            if (n1Var.l(this) == aVar) {
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
