package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w60 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y60 f12878b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(y60 y60Var, bl2.c cVar) {
        super(2, cVar);
        this.f12878b = y60Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w60(this.f12878b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w60(this.f12878b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12877a;
        if (i13 == 0) {
            ue.c.H(obj);
            y60 y60Var = this.f12878b;
            this.f12877a = 1;
            if (y60.a(y60Var, this) == aVar) {
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
