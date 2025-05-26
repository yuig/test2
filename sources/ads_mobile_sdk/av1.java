package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class av1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hv1 f2559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ok0 f2560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f2561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av1(hv1 hv1Var, ok0 ok0Var, r0 r0Var, bl2.c cVar) {
        super(2, cVar);
        this.f2559b = hv1Var;
        this.f2560c = ok0Var;
        this.f2561d = r0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new av1(this.f2559b, this.f2560c, this.f2561d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((av1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2558a;
        if (i13 == 0) {
            ue.c.H(obj);
            u72 u72Var = this.f2559b.f6109e;
            ok0 ok0Var = this.f2560c;
            r0 r0Var = this.f2561d;
            zn2.b.f142311b.getClass();
            this.f2558a = 1;
            if (u72Var.a(ok0Var, r0Var, 0L, this) == aVar) {
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
