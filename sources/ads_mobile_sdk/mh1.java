package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class mh1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nh1 f8226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh1(nh1 nh1Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f8226b = nh1Var;
        this.f8227c = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new mh1(this.f8226b, this.f8227c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mh1(this.f8226b, this.f8227c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8225a;
        if (i13 == 0) {
            ue.c.H(obj);
            dh1 dh1Var = this.f8226b.f8803c;
            long j13 = this.f8227c;
            this.f8225a = 1;
            if (dh1Var.e(j13, this) == aVar) {
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
