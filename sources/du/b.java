package du;

import es.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import m60.w;
import nx.b0;
import nx.d1;
import ps.l;
import so.j7;
import so.oa;
import so.r8;
import so.s8;
import uj2.q;
import x02.i2;
import x02.x0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends p implements Function2 {
    public b(j7 j7Var) {
        super(2, j7Var, j7.class, "create", "create(Ljava/lang/String;Lcom/pinterest/ads/OneTapPinalytics;)Lcom/pinterest/ads/feature/owc/presenter/board/AdsBoardPresenter;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l p13 = (l) obj2;
        Intrinsics.checkNotNullParameter(p13, "p1");
        r8 r8Var = ((j7) this.receiver).f113479a;
        w wVar = (w) r8Var.f114090a.f113885r0.get();
        oa oaVar = r8Var.f114090a;
        return new rt.b((String) obj, p13, wVar, (i2) oaVar.F3.get(), (q) oaVar.f113947u9.get(), (ro1.c) oaVar.f113666ea.get(), (j80.b) oaVar.O6.get(), (x0) oaVar.f113765k3.get(), (d1) oaVar.f113730i2.get(), oaVar.p2(), (xr.a) oaVar.f113756jc.get(), s8.c(r8Var.f114091b), (es.a) oaVar.P6.get(), (b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), (h) oaVar.f113735i7.get());
    }
}
