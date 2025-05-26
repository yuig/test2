package ku;

import es.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import m60.w;
import nx.b0;
import nx.d1;
import ps.l;
import so.oa;
import so.q8;
import so.r8;
import so.s8;
import uj2.q;
import x02.i2;
import x02.x2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends p implements Function2 {
    public b(q8 q8Var) {
        super(2, q8Var, q8.class, "create", "create(Ljava/lang/String;Lcom/pinterest/ads/OneTapPinalytics;)Lcom/pinterest/ads/feature/owc/presenter/profile/AdsProfilePresenter;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l p13 = (l) obj2;
        Intrinsics.checkNotNullParameter(p13, "p1");
        r8 r8Var = ((q8) this.receiver).f114073a;
        w wVar = (w) r8Var.f114090a.f113885r0.get();
        oa oaVar = r8Var.f114090a;
        return new ut.b((String) obj, p13, wVar, (i2) oaVar.F3.get(), (q) oaVar.f113947u9.get(), (j80.b) oaVar.O6.get(), (ro1.c) oaVar.f113666ea.get(), (x2) oaVar.f113800m3.get(), (d1) oaVar.f113730i2.get(), oaVar.p2(), (xr.a) oaVar.f113756jc.get(), s8.c(r8Var.f114091b), (es.a) oaVar.P6.get(), (b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), (h) oaVar.f113735i7.get());
    }
}
