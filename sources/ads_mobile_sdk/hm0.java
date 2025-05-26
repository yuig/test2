package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class hm0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f6018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm0(ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f6018b = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new hm0(this.f6018b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hm0(this.f6018b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6017a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var = this.f6018b;
            this.f6017a = 1;
            if (ym0Var.a(this) == aVar) {
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
