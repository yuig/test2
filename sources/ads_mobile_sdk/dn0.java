package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class dn0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn0 f4354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(kn0 kn0Var, bl2.c cVar) {
        super(2, cVar);
        this.f4354b = kn0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new dn0(this.f4354b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new dn0(this.f4354b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f4353a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var = this.f4354b.f7396b;
            this.f4353a = 1;
            Object M = kotlin.jvm.internal.j.M(this, ym0Var.f14315a, new lm0(ym0Var, null));
            if (M != obj2) {
                M = Unit.f80348a;
            }
            if (M == obj2) {
                return obj2;
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
