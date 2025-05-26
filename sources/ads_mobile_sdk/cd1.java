package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class cd1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd1 f3871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd1(kd1 kd1Var, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f3871b = kd1Var;
        this.f3872c = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new cd1(this.f3871b, this.f3872c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new cd1(this.f3871b, this.f3872c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f3870a;
        if (i13 == 0) {
            ue.c.H(obj);
            kd1 kd1Var = this.f3871b;
            boolean z13 = this.f3872c;
            this.f3870a = 1;
            if (kd1.a(kd1Var, z13, this) == aVar) {
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
