package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class bx2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cx2 f3640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx2(cx2 cx2Var, bl2.c cVar) {
        super(2, cVar);
        this.f3640b = cx2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new bx2(this.f3640b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bx2(this.f3640b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f3639a;
        if (i13 == 0) {
            ue.c.H(obj);
            cx2 cx2Var = this.f3640b;
            this.f3639a = 1;
            if (cx2Var.f(this) == aVar) {
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
