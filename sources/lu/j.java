package lu;

import com.pinterest.repository.pin.PinService;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import nx.o0;
import so.oa;
import so.r8;
import so.s8;
import x02.i2;

/* loaded from: classes3.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.p implements Function2 {
    public j(so.l lVar) {
        super(2, lVar, so.l.class, "create", "create(Ljava/lang/String;Lcom/pinterest/ads/OneTapPinalytics;)Lcom/pinterest/ads/feature/owc/presenter/quiz/AdsQuizPresenter;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ps.l p13 = (ps.l) obj2;
        Intrinsics.checkNotNullParameter(p13, "p1");
        r8 r8Var = ((so.l) this.receiver).f113527a;
        s8 s8Var = r8Var.f114091b;
        oa oaVar = r8Var.f114090a;
        vt.g gVar = new vt.g((String) obj, p13, (i2) oaVar.F3.get(), (m60.w) oaVar.f113885r0.get(), (uj2.q) oaVar.f113947u9.get(), (j80.b) oaVar.O6.get(), (ro1.c) oaVar.f113666ea.get(), (d1) oaVar.f113730i2.get(), (PinService) oaVar.f113713h3.get(), oaVar.p2(), (xr.a) oaVar.f113756jc.get(), (rg0.s) oaVar.Q5.get(), s8.c(r8Var.f114091b), (es.a) oaVar.P6.get(), (nx.b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), (es.h) oaVar.f113735i7.get());
        gVar.f119049z = (o0) s8Var.f114255d.T1.get();
        return gVar;
    }
}
