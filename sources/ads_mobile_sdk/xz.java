package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class xz extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a00 f13898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(a00 a00Var, bl2.c cVar) {
        super(2, cVar);
        this.f13898b = a00Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new xz(this.f13898b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xz(this.f13898b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f13897a;
        if (i13 == 0) {
            ue.c.H(obj);
            a00 a00Var = this.f13898b;
            this.f13897a = 1;
            if (a00.a(a00Var, this) == aVar) {
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
