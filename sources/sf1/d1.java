package sf1;

import java.util.Map;

/* loaded from: classes5.dex */
public final class d1 implements ac2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f112540a;

    public d1(e1 e1Var) {
        this.f112540a = e1Var;
    }

    @Override // ac2.j
    public final void a(int i13) {
        rf1.p0 p0Var;
        qf1.o oVar;
        qf1.i iVar;
        j1 j1Var = this.f112540a.G;
        if (j1Var == null || (oVar = (p0Var = (rf1.p0) j1Var).f107846j0) == null) {
            return;
        }
        Map b13 = oVar.b();
        if (b13 == null || (iVar = (qf1.i) b13.get(Integer.valueOf(p0Var.f107842h0))) == null || !iVar.f103689b) {
            nc2.h hVar = nc2.h.f90405a;
            nc2.h.f90406b = i13 == 0;
            k1 x33 = p0Var.x3();
            if (x33 != null) {
                ((e1) x33).H0();
            }
        }
    }
}
