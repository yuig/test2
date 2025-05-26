package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o60 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t60 f9153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(t60 t60Var, bl2.c cVar) {
        super(2, cVar);
        this.f9153b = t60Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o60(this.f9153b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o60(this.f9153b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9152a;
        if (i13 == 0) {
            ue.c.H(obj);
            t60 t60Var = this.f9153b;
            this.f9152a = 1;
            if (t60.a(t60Var, this) == aVar) {
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
