package vt;

import jk2.j1;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import uj2.a0;
import x02.a2;

/* loaded from: classes3.dex */
public final class b extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public e f126564a;

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        clearDisposables();
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(ft.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        lu.f fVar = (lu.f) view;
        Intrinsics.checkNotNullParameter(this, "presenter");
        e eVar = this.f126564a;
        eVar.getClass();
        a0 a13 = wj2.c.a();
        uk2.f fVar2 = eVar.f126589p;
        x H = fVar2.A(a13).H(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        zt.b bVar = new zt.b(7, new lu.c(fVar, 0));
        zt.b bVar2 = new zt.b(8, lu.a.f84845l);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        xj2.c F = H.F(bVar, bVar2, cVar, a2Var);
        xj2.b bVar3 = fVar.I;
        bVar3.a(F);
        com.pinterest.framework.multisection.datasource.pagedlist.h hVar = new com.pinterest.framework.multisection.datasource.pagedlist.h(6, a.f126553l);
        uk2.d dVar = eVar.f126588o;
        dVar.getClass();
        x H2 = new j1(uj2.q.h(new x(dVar, hVar, 2), fVar2, new ep.g(4, d.f126573i)), new ep.a(15, a.f126552k), 0).I(1L).A(wj2.c.a()).H(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(H2, "subscribeOn(...)");
        bVar3.a(H2.F(new zt.b(9, new lu.c(fVar, 1)), new zt.b(10, lu.a.f84846m), cVar, a2Var));
        addDisposable(eVar.f126582i.F(new st.c(3, new tq.a0(view, 26)), new st.c(4, a.f126551j), cVar, a2Var));
    }
}
