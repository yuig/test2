package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x62 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c72 f13512b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x62(c72 c72Var, bl2.c cVar) {
        super(2, cVar);
        this.f13512b = c72Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x62(this.f13512b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new x62(this.f13512b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f13511a;
        if (i13 == 0) {
            ue.c.H(obj);
            c72 c72Var = this.f13512b;
            this.f13511a = 1;
            if (c72.a(c72Var, this) == aVar) {
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
