package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class a31 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f2225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a31(j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f2225b = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a31(this.f2225b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a31(this.f2225b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2224a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var = (ym0) this.f2225b.f80434a;
            if (ym0Var != null) {
                this.f2224a = 1;
                if (ym0Var.a(this) == aVar) {
                    return aVar;
                }
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
