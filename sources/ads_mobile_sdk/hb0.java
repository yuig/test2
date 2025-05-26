package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class hb0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sy0 f5911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb0(sy0 sy0Var, bl2.c cVar) {
        super(2, cVar);
        this.f5911b = sy0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new hb0(this.f5911b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hb0(this.f5911b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5910a;
        if (i13 == 0) {
            ue.c.H(obj);
            sy0 sy0Var = this.f5911b;
            this.f5910a = 1;
            if (sy0Var.b(this) == aVar) {
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
