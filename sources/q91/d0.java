package q91;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class d0 extends u {
    public ye2.m L0;
    public boolean M0;
    public boolean N0 = false;

    @Override // q91.y
    public final void T8() {
        if (this.N0) {
            return;
        }
        this.N0 = true;
        u0 u0Var = (u0) this;
        x8 x8Var = (x8) ((v0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        u0Var.f91283h = oaVar.Ec;
        u0Var.f91284i = (x2) oaVar.f113800m3.get();
        u0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        u0Var.f91286k = r70.b.f106349i.k0();
        u0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        u0Var.f91288m = (bz.i) oaVar.C9.get();
        u0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        u0Var.f91290o = (ac2.m) oaVar.C7.get();
        u0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        u0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        u0Var.f91293r = s8Var.u6();
        u0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        u0Var.f91295t = oaVar.T2();
        u0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        u0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        u0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        u0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        u0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        u0Var.f91301z = (a80.a) oaVar.Wc.get();
        u0Var.A = (z70.f) oaVar.f113764k2.get();
        ph.a.s0(u0Var, (i92.k) oaVar.f113921t1.get());
        ph.a.o0(u0Var, (uk1.e) oaVar.f113702ga.get());
        ph.a.i0(u0Var, (lb2.n) oaVar.B6.get());
        ph.a.l0(u0Var);
        ph.a.u0(u0Var, (k22.m) oaVar.Y4.get());
        ph.a.k0(u0Var, s8Var.z6());
    }

    public final void Y8() {
        if (this.L0 == null) {
            this.L0 = new ye2.m(super.getContext(), this);
            this.M0 = ue.c.x(super.getContext());
        }
    }

    @Override // q91.y, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.M0) {
            return null;
        }
        Y8();
        return this.L0;
    }

    @Override // q91.u, q91.y, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Y8();
        T8();
    }

    @Override // q91.y, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // q91.y, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.L0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Y8();
        T8();
    }
}
