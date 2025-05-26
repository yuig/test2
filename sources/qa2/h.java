package qa2;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.repository.pin.PinService;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import ey.g3;
import ey.j3;
import so.fa;
import so.jb;
import so.oa;
import so.s8;
import x02.i2;

/* loaded from: classes4.dex */
public abstract class h extends LegoPinGridCell implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f103268a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f103269b;

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f103268a == null) {
            this.f103268a = new ye2.o(this);
        }
        return this.f103268a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f103268a == null) {
            this.f103268a = new ye2.o(this);
        }
        return this.f103268a.generatedComponent();
    }

    public final void inject() {
        if (this.f103269b) {
            return;
        }
        this.f103269b = true;
        LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) this;
        jb jbVar = (jb) ((b0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        legoPinGridCellImpl.V0 = (pi1.b) oaVar.Pb.get();
        legoPinGridCellImpl.W0 = (tb0.h) oaVar.f113797m0.get();
        legoPinGridCellImpl.X0 = (fa) oaVar.f113704gc.get();
        legoPinGridCellImpl.Y0 = (aa2.a) oaVar.f113686fc.get();
        legoPinGridCellImpl.Z0 = (m60.w) oaVar.f113885r0.get();
        legoPinGridCellImpl.f52391a1 = (g3) oaVar.f113683f9.get();
        j3 j3Var = j3.f60510a;
        legoPinGridCellImpl.f52394b1 = (nx.d1) oaVar.f113730i2.get();
        legoPinGridCellImpl.f52398c1 = (m60.q) oaVar.Q1.get();
        legoPinGridCellImpl.f52402d1 = oa.x1(oaVar);
        legoPinGridCellImpl.f52405e1 = (lh0.d) oaVar.Q6.get();
        legoPinGridCellImpl.f52409f1 = oa.g0(oaVar);
        legoPinGridCellImpl.f52413g1 = (ip1.b) oaVar.H7.get();
        legoPinGridCellImpl.f52417h1 = (a11.d) oaVar.f113668ec.get();
        legoPinGridCellImpl.f52421i1 = (i2) oaVar.F3.get();
        legoPinGridCellImpl.f52425j1 = (m60.g0) oaVar.f113590a4.get();
        s8 s8Var = jbVar.f113485c;
        legoPinGridCellImpl.f52429k1 = (jq.c) s8Var.f114432p.get();
        legoPinGridCellImpl.f52433l1 = (jo1.c) oaVar.f113810md.get();
        legoPinGridCellImpl.f52437m1 = (PinService) oaVar.f113713h3.get();
        legoPinGridCellImpl.f52441n1 = (i92.k) oaVar.f113921t1.get();
        legoPinGridCellImpl.f52445o1 = oaVar.c2();
        legoPinGridCellImpl.f52449p1 = (fv.d) oaVar.Mb.get();
        legoPinGridCellImpl.f52453q1 = com.pinterest.widget.configuration.k.y2(oaVar.f113638d);
        legoPinGridCellImpl.f52457r1 = (ni1.d) s8Var.f114551x.get();
        legoPinGridCellImpl.f52461s1 = (q12.b) oaVar.f113750j5.get();
        legoPinGridCellImpl.f52465t1 = (ac2.m) oaVar.C7.get();
        a02.e.Z2();
        legoPinGridCellImpl.f52469u1 = (j80.b) oaVar.O6.get();
        legoPinGridCellImpl.f52473v1 = (b60.b) oaVar.f113850p0.get();
        legoPinGridCellImpl.f52477w1 = (oc.c) oaVar.f113907s5.get();
        legoPinGridCellImpl.f52481x1 = (bc2.e) oaVar.F7.get();
        legoPinGridCellImpl.f52485y1 = (xr.a) oaVar.f113756jc.get();
        legoPinGridCellImpl.f52489z1 = ac2.f.f1945a;
        legoPinGridCellImpl.A1 = new m60.f0();
        legoPinGridCellImpl.B1 = (bs.b) oaVar.f113650dc.get();
        legoPinGridCellImpl.C1 = (es.h) oaVar.f113735i7.get();
        legoPinGridCellImpl.D1 = oa.h0(oaVar);
        legoPinGridCellImpl.E1 = (lh0.z0) oaVar.D0.get();
        legoPinGridCellImpl.F1 = (es.a) oaVar.P6.get();
        legoPinGridCellImpl.G1 = (vr.a) oaVar.Q8.get();
        oaVar.S2();
        oaVar.e2();
        legoPinGridCellImpl.H1 = (jv.a) oaVar.f113932tc.get();
        legoPinGridCellImpl.I1 = (kv.a) oaVar.Db.get();
        legoPinGridCellImpl.J1 = (yr.a) oaVar.Eb.get();
        legoPinGridCellImpl.K1 = (nx.b0) oaVar.R8.get();
        legoPinGridCellImpl.L1 = (ur.a) oaVar.Kb.get();
        legoPinGridCellImpl.M1 = (hs1.q) oaVar.f113875q7.get();
        legoPinGridCellImpl.N1 = (hs.e) oaVar.Fb.get();
        legoPinGridCellImpl.O1 = (nm.o) oaVar.f113833o0.get();
    }

    public h(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        inject();
    }
}
