package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class bn0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn0 f3533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(kn0 kn0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f3533b = kn0Var;
        this.f3534c = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new bn0(this.f3533b, this.f3534c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bn0(this.f3533b, this.f3534c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f3532a;
        if (i13 == 0) {
            ue.c.H(obj);
            kn0 kn0Var = this.f3533b;
            a.ce ceVar = kn0Var.f7395a;
            ym0 ym0Var = kn0Var.f7396b;
            String str = this.f3534c;
            this.f3532a = 1;
            if (ceVar.a(ym0Var, str, this) == aVar) {
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
