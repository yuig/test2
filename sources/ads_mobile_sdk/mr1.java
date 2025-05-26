package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class mr1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr1 f8359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr1(tr1 tr1Var, bl2.c cVar) {
        super(2, cVar);
        this.f8359b = tr1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new mr1(this.f8359b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mr1(this.f8359b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8358a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var = this.f8359b.f11644e.f7894a;
            this.f8358a = 1;
            if (ym0Var.a(this) == aVar) {
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
