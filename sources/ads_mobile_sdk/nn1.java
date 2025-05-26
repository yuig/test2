package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class nn1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ un1 f8880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn1(un1 un1Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f8880b = un1Var;
        this.f8881c = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nn1(this.f8880b, this.f8881c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new nn1(this.f8880b, this.f8881c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8879a;
        if (i13 == 0) {
            ue.c.H(obj);
            un1 un1Var = this.f8880b;
            long j13 = this.f8881c;
            this.f8879a = 1;
            if (un1Var.a(j13, null, null, false, this) == aVar) {
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
