package kl0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.g3;
import kh2.j1;
import nx.d1;
import so.c6;
import so.d4;
import so.k5;
import so.oa;
import so.s8;
import so.x8;
import so.z4;
import x02.i2;
import x02.x0;
import x02.x2;
import x02.z0;

/* loaded from: classes.dex */
public abstract class h0<T> extends wk1.k<T> implements af2.c {
    public ye2.m M0;
    public boolean N0;
    public volatile ye2.h O0;
    public final Object P0 = new Object();
    public boolean Q0 = false;

    @Override // af2.c
    /* renamed from: g9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.O0 == null) {
            synchronized (this.P0) {
                try {
                    if (this.O0 == null) {
                        this.O0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.O0;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.N0) {
            return null;
        }
        h9();
        return this.M0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h9() {
        if (this.M0 == null) {
            this.M0 = new ye2.m(super.getContext(), this);
            this.N0 = ue.c.x(super.getContext());
        }
    }

    public final void i9() {
        if (this.Q0) {
            return;
        }
        this.Q0 = true;
        z zVar = (z) this;
        x8 x8Var = (x8) ((a0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        zVar.f91283h = oaVar.Ec;
        zVar.f91284i = (x2) oaVar.f113800m3.get();
        zVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        zVar.f91286k = r70.b.f106349i.k0();
        zVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        zVar.f91288m = (bz.i) oaVar.C9.get();
        zVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        zVar.f91290o = (ac2.m) oaVar.C7.get();
        zVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        zVar.f91292q = (ku1.a) s8Var.f114402n.get();
        zVar.f91293r = s8Var.u6();
        zVar.f91294s = (ff0.f) s8Var.f114417o.get();
        zVar.f91295t = oaVar.T2();
        zVar.f91296u = (d1) oaVar.f113730i2.get();
        zVar.f91297v = (b60.b) oaVar.f113850p0.get();
        zVar.f91298w = (m60.w) oaVar.f113885r0.get();
        zVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        zVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        zVar.f91301z = (a80.a) oaVar.Wc.get();
        zVar.A = (z70.f) oaVar.f113764k2.get();
        zVar.f114986u0 = oaVar.v2();
        zVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        zVar.f114988w0 = s8Var.X5();
        zVar.f114989x0 = s8Var.h6();
        zVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(zVar);
        g3.Q0(zVar, (x0) oaVar.f113765k3.get());
        g3.a1(zVar, new no1.d((oc.c) s8Var.f114255d.f113907s5.get(), 1));
        g3.R0(zVar, (z0) oaVar.B3.get());
        g3.X0(zVar, (zf0.f) oaVar.f113723hd.get());
        g3.p1(zVar, (i2) oaVar.F3.get());
        g3.P0(zVar, (d4) s8Var.S0.get());
        g3.l1(zVar, (yk1.j) oaVar.Qc.get());
        s8Var.x5();
        g3.L0(zVar);
        g3.b2(zVar);
        g3.u1(zVar, (nx.f0) oaVar.f113747j2.get());
        g3.F1(zVar, (uk1.e) oaVar.f113702ga.get());
        g3.b1(zVar, (m60.d0) s8Var.T0.get());
        a02.e.P1();
        g3.S0(zVar);
        g3.M0(zVar, (z4) s8Var.W0.get());
        g3.Z1(zVar, (i92.k) oaVar.f113921t1.get());
        g3.h1(zVar, (rw0.f) oaVar.f113987wd.get());
        g3.Z0(zVar, s8Var.d5());
        g3.O0(zVar, new gi2.b());
        g3.m1(zVar, (tj0.b0) s8Var.H0.get());
        g3.P1(zVar, s8Var.D6());
        a02.e.X3();
        r41.k kVar = r41.k.f106176a;
        g3.K1(zVar);
        g3.N0(zVar, s8Var.e5());
        g3.U0(zVar, bf2.b.a(s8Var.X0));
        g3.R1(zVar, (k5) s8Var.Z0.get());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        h9();
        i9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.M0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h9();
        i9();
    }
}
