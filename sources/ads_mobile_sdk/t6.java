package ads_mobile_sdk;

import ao2.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class t6 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f11405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f11406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(p0 p0Var, bl2.c cVar) {
        super(1, cVar);
        this.f11406b = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new t6(this.f11406b, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new t6(this.f11406b, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11405a;
        if (i13 == 0) {
            ue.c.H(obj);
            p0 p0Var = this.f11406b;
            this.f11405a = 1;
            obj = p0Var.await(this);
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
