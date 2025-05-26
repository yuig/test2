package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ng0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tg0 f8783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng0(tg0 tg0Var, bl2.c cVar) {
        super(2, cVar);
        this.f8783b = tg0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ng0(this.f8783b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ng0(this.f8783b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8782a;
        if (i13 == 0) {
            ue.c.H(obj);
            eg0 eg0Var = this.f8783b.f11535a;
            this.f8782a = 1;
            if (((a6.h) eg0Var.f4851a.get()).a(new wf0(null), this) == aVar) {
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
