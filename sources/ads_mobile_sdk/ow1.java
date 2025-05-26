package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ow1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hk0 f9470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow1(hk0 hk0Var, bl2.c cVar) {
        super(2, cVar);
        this.f9470b = hk0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ow1(this.f9470b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ow1(this.f9470b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9469a;
        if (i13 == 0) {
            ue.c.H(obj);
            hk0 hk0Var = this.f9470b;
            this.f9469a = 1;
            Object b13 = ((ed2) hk0Var.f6002a).b(this);
            if (b13 != aVar) {
                b13 = Unit.f80348a;
            }
            if (b13 != aVar) {
                b13 = Unit.f80348a;
            }
            if (b13 == aVar) {
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
