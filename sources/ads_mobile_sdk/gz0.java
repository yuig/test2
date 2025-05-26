package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class gz0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz0 f5770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi.d f5771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(xi.d dVar, mz0 mz0Var, bl2.c cVar) {
        super(2, cVar);
        this.f5770b = mz0Var;
        this.f5771c = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new gz0(this.f5771c, this.f5770b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mz0 mz0Var = this.f5770b;
        return new gz0(this.f5771c, mz0Var, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5769a;
        if (i13 == 0) {
            ue.c.H(obj);
            mz0 mz0Var = this.f5770b;
            xi.d dVar = this.f5771c;
            this.f5769a = 1;
            if (mz0Var.a(dVar, this) == aVar) {
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
