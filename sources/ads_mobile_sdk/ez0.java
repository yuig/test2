package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ez0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yr0 f4991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(yr0 yr0Var, bl2.c cVar) {
        super(2, cVar);
        this.f4991b = yr0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ez0(this.f4991b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ez0(this.f4991b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f4990a;
        if (i13 == 0) {
            ue.c.H(obj);
            yr0 yr0Var = this.f4991b;
            this.f4990a = 1;
            obj = yr0Var.d(this);
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
