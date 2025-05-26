package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class pc1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc1 f9622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f9623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc1(sc1 sc1Var, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f9622b = sc1Var;
        this.f9623c = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new pc1(this.f9622b, this.f9623c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pc1(this.f9622b, this.f9623c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9621a;
        if (i13 == 0) {
            ue.c.H(obj);
            ub1 ub1Var = this.f9622b.f11040c;
            ym0 ym0Var = this.f9623c;
            this.f9621a = 1;
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
