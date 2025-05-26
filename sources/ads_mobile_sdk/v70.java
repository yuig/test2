package ads_mobile_sdk;

import gw.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class v70 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f80 f12382a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(f80 f80Var, bl2.c cVar) {
        super(2, cVar);
        this.f12382a = f80Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new v70(this.f12382a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v70(this.f12382a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        wi.e a13 = this.f12382a.a();
        if (a13 != null) {
            gw.a aVar2 = (gw.a) a13;
            int i13 = aVar2.f66173a;
            Function0 function0 = aVar2.f66176d;
            f fVar = aVar2.f66174b;
            switch (i13) {
                case 0:
                    fVar.getClass();
                    function0.invoke();
                    break;
                default:
                    fVar.getClass();
                    function0.invoke();
                    break;
            }
        }
        return Unit.f80348a;
    }
}
