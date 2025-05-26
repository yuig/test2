package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class dz0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.l3 f4526b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(a.l3 l3Var, bl2.c cVar) {
        super(2, cVar);
        this.f4526b = l3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new dz0(this.f4526b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new dz0(this.f4526b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f4525a;
        if (i13 == 0) {
            ue.c.H(obj);
            a.l3 l3Var = this.f4526b;
            this.f4525a = 1;
            obj = l3Var.d(this);
            if (obj == aVar) {
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
