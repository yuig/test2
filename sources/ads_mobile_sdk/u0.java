package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f11764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, bl2.c cVar) {
        super(2, cVar);
        this.f11764b = v0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u0(this.f11764b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u0(this.f11764b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11763a;
        if (i13 == 0) {
            ue.c.H(obj);
            v0 v0Var = this.f11764b;
            this.f11763a = 1;
            obj = v0Var.a(false, (bl2.c) this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
