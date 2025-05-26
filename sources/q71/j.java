package q71;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class j extends x {
    public ye2.m P0;
    public boolean Q0;
    public boolean R0 = false;

    @Override // q71.i
    public final void T8() {
        if (this.R0) {
            return;
        }
        this.R0 = true;
        g0 g0Var = (g0) this;
        x8 x8Var = (x8) ((h0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        g0Var.f91283h = oaVar.Ec;
        g0Var.f91284i = (x2) oaVar.f113800m3.get();
        g0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        g0Var.f91286k = r70.b.f106349i.k0();
        g0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        g0Var.f91288m = (bz.i) oaVar.C9.get();
        g0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        g0Var.f91290o = (ac2.m) oaVar.C7.get();
        g0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        g0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        g0Var.f91293r = s8Var.u6();
        g0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        g0Var.f91295t = oaVar.T2();
        g0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        g0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        g0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        g0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        g0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        g0Var.f91301z = (a80.a) oaVar.Wc.get();
        g0Var.A = (z70.f) oaVar.f113764k2.get();
        c0.d.j1(g0Var, s8Var.A5());
        c0.d.X0(g0Var, (nu1.a) s8Var.f114462r.get());
        c0.d.U0(g0Var, s8Var.w6());
        pe.i.H0(g0Var);
        pe.i.F0(g0Var, (j22.b) oaVar.U3.get());
        pe.i.A0(g0Var, (uk1.e) oaVar.f113702ga.get());
        pe.i.Q(g0Var, (vy.m) oaVar.M1.get());
        pe.i.r0(g0Var, (ip1.b) oaVar.H7.get());
        pe.i.G0(g0Var, (gp1.l) oaVar.L7.get());
        pe.i.L0(g0Var, s8Var.y6());
    }

    public final void b9() {
        if (this.P0 == null) {
            this.P0 = new ye2.m(super.getContext(), this);
            this.Q0 = ue.c.x(super.getContext());
        }
    }

    @Override // q71.i, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.Q0) {
            return null;
        }
        b9();
        return this.P0;
    }

    @Override // q71.i, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        b9();
        T8();
    }

    @Override // q71.i, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // q71.i, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.P0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b9();
        T8();
    }
}
