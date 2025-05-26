package ads_mobile_sdk;

import a.yd;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class js2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ks2 f6948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js2(ks2 ks2Var, bl2.c cVar) {
        super(2, cVar);
        this.f6948b = ks2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new js2(this.f6948b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new js2(this.f6948b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6947a;
        if (i13 == 0) {
            ue.c.H(obj);
            cc0 cc0Var = this.f6948b.f7481e;
            this.f6947a = 1;
            if (cc0Var.a((bl2.c) this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        yd ydVar = this.f6948b.f7480d;
        this.f6947a = 2;
        if (ydVar.a((bl2.c) this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
