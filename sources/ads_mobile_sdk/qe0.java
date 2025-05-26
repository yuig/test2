package ads_mobile_sdk;

import a.d3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qe0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d3 f10055a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(d3 d3Var, bl2.c cVar) {
        super(2, cVar);
        this.f10055a = d3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new qe0(this.f10055a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qe0(this.f10055a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d3 d3Var = this.f10055a;
        Cdo closeReason = Cdo.f4380c;
        wi0 wi0Var = (wi0) d3Var;
        wi0Var.getClass();
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        wi0Var.f13062r = closeReason;
        androidx.activity.o oVar = wi0Var.f13055j;
        if (oVar != null) {
            oVar.finish();
        }
        return Unit.f80348a;
    }
}
