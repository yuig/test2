package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class hd1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd1 f5927b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd1(kd1 kd1Var, bl2.c cVar) {
        super(2, cVar);
        this.f5927b = kd1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new hd1(this.f5927b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hd1(this.f5927b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5926a;
        if (i13 == 0) {
            ue.c.H(obj);
            a.y4 y4Var = (a.y4) this.f5927b.f7240f.get();
            this.f5926a = 1;
            if (y4Var.d(this) == aVar) {
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
