package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class et2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4943a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f4945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et2(Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f4945c = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        et2 et2Var = new et2(this.f4945c, cVar);
        et2Var.f4944b = obj;
        return et2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        et2 et2Var = new et2(this.f4945c, (bl2.c) obj2);
        et2Var.f4944b = (j0) obj;
        return et2Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f4943a;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f4944b;
            qs2.a(qs2.b(), null);
            Function2 function2 = this.f4945c;
            this.f4943a = 1;
            if (function2.invoke(j0Var, this) == aVar) {
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
