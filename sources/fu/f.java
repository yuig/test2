package fu;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import m60.w;
import nx.b0;
import nx.d1;
import nx.o0;
import rg0.s;
import so.oa;
import so.r8;
import so.s8;
import so.u7;
import uj2.q;
import x02.i2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f extends p implements Function2 {
    public f(u7 u7Var) {
        super(2, u7Var, u7.class, "create", "create(Ljava/lang/String;Lcom/pinterest/ads/OneTapPinalytics;)Lcom/pinterest/ads/feature/owc/presenter/core/AdsCorePresenter;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ps.l p13 = (ps.l) obj2;
        Intrinsics.checkNotNullParameter(p13, "p1");
        r8 r8Var = ((u7) this.receiver).f114650a;
        s8 s8Var = r8Var.f114091b;
        oa oaVar = r8Var.f114090a;
        tt.b bVar = new tt.b((String) obj, p13, (w) oaVar.f113885r0.get(), (i2) oaVar.F3.get(), (q) oaVar.f113947u9.get(), (j80.b) oaVar.O6.get(), (ro1.c) oaVar.f113666ea.get(), (d1) oaVar.f113730i2.get(), oaVar.p2(), (xr.a) oaVar.f113756jc.get(), (s) oaVar.Q5.get(), s8.c(r8Var.f114091b), (es.a) oaVar.P6.get(), (b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), (es.h) oaVar.f113735i7.get(), (qs.a) oaVar.Lb.get());
        bVar.f119049z = (o0) s8Var.f114255d.T1.get();
        return bVar;
    }
}
