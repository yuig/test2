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
public abstract class q extends d {
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
        m mVar = (m) this;
        x8 x8Var = (x8) ((n) generatedComponent());
        oa oaVar = x8Var.f114707a;
        mVar.f91283h = oaVar.Ec;
        mVar.f91284i = (x2) oaVar.f113800m3.get();
        mVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        mVar.f91286k = r70.b.f106349i.k0();
        mVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        mVar.f91288m = (bz.i) oaVar.C9.get();
        mVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        mVar.f91290o = (ac2.m) oaVar.C7.get();
        mVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        mVar.f91292q = (ku1.a) s8Var.f114402n.get();
        mVar.f91293r = s8Var.u6();
        mVar.f91294s = (ff0.f) s8Var.f114417o.get();
        mVar.f91295t = oaVar.T2();
        mVar.f91296u = (d1) oaVar.f113730i2.get();
        mVar.f91297v = (b60.b) oaVar.f113850p0.get();
        mVar.f91298w = (m60.w) oaVar.f113885r0.get();
        mVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        mVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        mVar.f91301z = (a80.a) oaVar.Wc.get();
        mVar.A = (z70.f) oaVar.f113764k2.get();
        mVar.f114986u0 = oaVar.v2();
        mVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        mVar.f114988w0 = s8Var.X5();
        mVar.f114989x0 = s8Var.h6();
        mVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(mVar);
        g3.n1(mVar, (b0) s8Var.H0.get());
        el.a.s1(mVar, (i2) oaVar.F3.get());
        el.a.G1(mVar, (uk1.e) oaVar.f113702ga.get());
        el.a.b1(mVar, (s3) s8Var.J0.get());
        m60.f0 f0Var = vb0.j.f125466a;
        dl2.b.I(f0Var);
        el.a.D0(mVar, f0Var);
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
