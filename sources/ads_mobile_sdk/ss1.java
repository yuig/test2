package ads_mobile_sdk;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ss1 extends dl2.j implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public int f11213a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ ym0 f11214b;

    public ss1(bl2.c cVar) {
        super(3, cVar);
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ss1 ss1Var = new ss1((bl2.c) obj3);
        ss1Var.f11214b = (ym0) obj;
        return ss1Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11213a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var = this.f11214b;
            nm.u uVar = new nm.u();
            this.f11213a = 1;
            if (ym0Var.a(uVar, "onSdkImpression", this) == aVar) {
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
