package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class bu0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ku0 f3599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(ku0 ku0Var, bl2.c cVar) {
        super(2, cVar);
        this.f3599b = ku0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new bu0(this.f3599b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bu0(this.f3599b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f3598a;
        if (i13 == 0) {
            ue.c.H(obj);
            ku0 ku0Var = this.f3599b;
            this.f3598a = 1;
            obj = ku0Var.h(this);
            if (obj == aVar) {
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
        kv0 kv0Var = (kv0) obj;
        if (kv0Var.v()) {
            ku0 ku0Var2 = this.f3599b;
            String r13 = kv0Var.r();
            this.f3598a = 2;
            wi.g gVar = ku0.I;
            if (ku0Var2.a((nm.u) null, r13, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
