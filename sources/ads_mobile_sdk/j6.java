package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j6 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f6701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nm.u f6702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(ym0 ym0Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f6701b = ym0Var;
        this.f6702c = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j6(this.f6701b, this.f6702c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j6(this.f6701b, this.f6702c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6700a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var = this.f6701b;
            nm.u uVar = this.f6702c;
            this.f6700a = 1;
            if (ym0Var.a(uVar, "onAdVisibilityChanged", this) == aVar) {
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
