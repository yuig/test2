package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class zm1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ an1 f14824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f14825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm1(an1 an1Var, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f14824b = an1Var;
        this.f14825c = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new zm1(this.f14824b, this.f14825c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zm1(this.f14824b, this.f14825c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14823a;
        if (i13 == 0) {
            ue.c.H(obj);
            ub1 ub1Var = this.f14824b.f2445a;
            ym0 ym0Var = this.f14825c;
            this.f14823a = 1;
            if (ub1Var.a(ym0Var) == aVar) {
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
