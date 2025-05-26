package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class rc1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc1 f10583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f10584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc1(sc1 sc1Var, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f10583b = sc1Var;
        this.f10584c = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new rc1(this.f10583b, this.f10584c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rc1(this.f10583b, this.f10584c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10582a;
        if (i13 == 0) {
            ue.c.H(obj);
            sc1 sc1Var = this.f10583b;
            ub1 ub1Var = sc1Var.f11040c;
            ym0 ym0Var = this.f10584c;
            String str = sc1Var.f11041d;
            this.f10582a = 1;
            ub1Var.getClass();
            nm.u uVar = new nm.u();
            uVar.u("js", str);
            Object a13 = ym0Var.a(uVar, "onReadyEventReceived", this);
            if (a13 != aVar) {
                a13 = Unit.f80348a;
            }
            if (a13 == aVar) {
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
