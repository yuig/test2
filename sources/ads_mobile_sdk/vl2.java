package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class vl2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jj2 f12562b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl2(jj2 jj2Var, bl2.c cVar) {
        super(2, cVar);
        this.f12562b = jj2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new vl2(this.f12562b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new vl2(this.f12562b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12561a;
        if (i13 == 0) {
            ue.c.H(obj);
            a.t5 b13 = this.f12562b.b();
            this.f12561a = 1;
            obj = b13.a(this);
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
