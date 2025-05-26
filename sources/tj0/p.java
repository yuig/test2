package tj0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import kh2.g3;
import nx.d1;
import so.c6;
import so.oa;
import so.s3;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class p extends d {
    public ye2.m V0;
    public boolean W0;
    public boolean X0 = false;

    @Override // tj0.o, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.W0) {
            return null;
        }
        k9();
        return this.V0;
    }

    @Override // tj0.o
    public final void i9() {
        if (this.X0) {
            return;
        }
        this.X0 = true;
        k kVar = (k) this;
        x8 x8Var = (x8) ((l) generatedComponent());
        oa oaVar = x8Var.f114707a;
        kVar.f91283h = oaVar.Ec;
        kVar.f91284i = (x2) oaVar.f113800m3.get();
        kVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        kVar.f91286k = r70.b.f106349i.k0();
        kVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        kVar.f91288m = (bz.i) oaVar.C9.get();
        kVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        kVar.f91290o = (ac2.m) oaVar.C7.get();
        kVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        kVar.f91292q = (ku1.a) s8Var.f114402n.get();
        kVar.f91293r = s8Var.u6();
        kVar.f91294s = (ff0.f) s8Var.f114417o.get();
        kVar.f91295t = oaVar.T2();
        kVar.f91296u = (d1) oaVar.f113730i2.get();
        kVar.f91297v = (b60.b) oaVar.f113850p0.get();
        kVar.f91298w = (m60.w) oaVar.f113885r0.get();
        kVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        kVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        kVar.f91301z = (a80.a) oaVar.Wc.get();
        kVar.A = (z70.f) oaVar.f113764k2.get();
        kVar.f114986u0 = oaVar.v2();
        kVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        kVar.f114988w0 = s8Var.X5();
        kVar.f114989x0 = s8Var.h6();
        kVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(kVar);
        g3.n1(kVar, (b0) s8Var.H0.get());
        kg.t.H0(kVar, (i92.k) oaVar.f113921t1.get());
        kg.t.e0(kVar, (rg0.s) oaVar.Q5.get());
        kg.t.d0(kVar, (zf0.f) oaVar.f113723hd.get());
        m60.f0 f0Var = vb0.j.f125466a;
        dl2.b.I(f0Var);
        kg.t.b0(kVar, f0Var);
        kg.t.s0(kVar, (i2) oaVar.F3.get());
        kg.t.A0(kVar, (uk1.e) oaVar.f113702ga.get());
        kg.t.n0(kVar, (s3) s8Var.J0.get());
        s8Var.c5();
        kg.t.X(kVar);
    }

    public final void k9() {
        if (this.V0 == null) {
            this.V0 = new ye2.m(super.getContext(), this);
            this.W0 = ue.c.x(super.getContext());
        }
    }

    @Override // tj0.o, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        k9();
        i9();
    }

    @Override // tj0.o, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // tj0.o, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.V0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k9();
        i9();
    }
}
