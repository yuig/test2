package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class fd1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kd1 f5114c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym0 f5115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(String str, kd1 kd1Var, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f5113b = str;
        this.f5114c = kd1Var;
        this.f5115d = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new fd1(this.f5113b, this.f5114c, this.f5115d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fd1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5112a;
        if (i13 == 0) {
            ue.c.H(obj);
            ft2.b(this.f5113b);
            ub1 ub1Var = this.f5114c.f7235a;
            ym0 ym0Var = this.f5115d;
            String str = this.f5113b;
            this.f5112a = 1;
            ub1Var.getClass();
            if (ub1.a(ym0Var, str, "resize", this) == aVar) {
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
