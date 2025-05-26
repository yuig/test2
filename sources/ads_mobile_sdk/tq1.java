package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class tq1 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f11635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zq1 f11636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq1(zq1 zq1Var, bl2.c cVar) {
        super(1, cVar);
        this.f11636b = zq1Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new tq1(this.f11636b, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new tq1(this.f11636b, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11635a;
        if (i13 == 0) {
            ue.c.H(obj);
            if (wk.f13103a != xk.f13703d) {
                zq1 zq1Var = this.f11636b;
                CoroutineContext coroutineContext = zq1Var.f14864e;
                sq1 sq1Var = new sq1(zq1Var, null);
                this.f11635a = 1;
                if (kotlin.jvm.internal.j.M(this, coroutineContext, sq1Var) == aVar) {
                    return aVar;
                }
            }
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ue.c.H(obj);
        ((ao2.p1) this.f11636b.f14869j).e0();
        return Unit.f80348a;
    }
}
