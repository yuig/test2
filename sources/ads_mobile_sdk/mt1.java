package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class mt1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pt1 f8377a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt1(pt1 pt1Var, bl2.c cVar) {
        super(2, cVar);
        this.f8377a = pt1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new mt1(this.f8377a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mt1(this.f8377a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        pt1 pt1Var = this.f8377a;
        f03 f03Var = pt1Var.P;
        if (f03Var == null) {
            return null;
        }
        ((ym0) pt1Var.F.getValue()).f14326l.set(false);
        if (f03Var.f4999c.indexOfChild(pt1Var.e()) == -1) {
            f03Var.f4999c.addView(pt1Var.e(), f03Var.f4998b, f03Var.f4997a);
        }
        return Unit.f80348a;
    }
}
