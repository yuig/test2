package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import wi.n;

/* loaded from: classes2.dex */
public final class pp2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rp2 f9771b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp2(rp2 rp2Var, bl2.c cVar) {
        super(2, cVar);
        this.f9771b = rp2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new pp2(this.f9771b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pp2(this.f9771b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9770a;
        if (i13 == 0) {
            ue.c.H(obj);
            n1 n1Var = this.f9771b.f10744b;
            wi.o oVar = new wi.o(n.MEDIATION_SHOW_ERROR, "Mediation adapter failed to show Ad.");
            this.f9770a = 1;
            if (n1Var.a(oVar, this) == aVar) {
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
