package ads_mobile_sdk;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class rs1 extends dl2.j implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public int f10773a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ ym0 f10774b;

    public rs1(bl2.c cVar) {
        super(3, cVar);
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rs1 rs1Var = new rs1((bl2.c) obj3);
        rs1Var.f10774b = (ym0) obj;
        return rs1Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10773a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var = this.f10774b;
            nm.u uVar = new nm.u();
            this.f10773a = 1;
            if (ym0Var.a(uVar, "onSdkAdUserInteractionClick", this) == aVar) {
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
