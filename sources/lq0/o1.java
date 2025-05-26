package lq0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.c6;
import so.g7;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class o1<T> extends wk1.k<T> implements af2.c {
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
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        r1 r1Var = (r1) this;
        x8 x8Var = (x8) ((s1) generatedComponent());
        oa oaVar = x8Var.f114707a;
        r1Var.f91283h = oaVar.Ec;
        r1Var.f91284i = (x2) oaVar.f113800m3.get();
        r1Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        r1Var.f91286k = r70.b.f106349i.k0();
        r1Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        r1Var.f91288m = (bz.i) oaVar.C9.get();
        r1Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        r1Var.f91290o = (ac2.m) oaVar.C7.get();
        r1Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        r1Var.f91292q = (ku1.a) s8Var.f114402n.get();
        r1Var.f91293r = s8Var.u6();
        r1Var.f91294s = (ff0.f) s8Var.f114417o.get();
        r1Var.f91295t = oaVar.T2();
        r1Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        r1Var.f91297v = (b60.b) oaVar.f113850p0.get();
        r1Var.f91298w = (m60.w) oaVar.f113885r0.get();
        r1Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        r1Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        r1Var.f91301z = (a80.a) oaVar.Wc.get();
        r1Var.A = (z70.f) oaVar.f113764k2.get();
        r1Var.f114986u0 = oaVar.v2();
        r1Var.f114987v0 = (jq.c) s8Var.f114432p.get();
        r1Var.f114988w0 = s8Var.X5();
        r1Var.f114989x0 = s8Var.h6();
        r1Var.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(r1Var);
        jk.v.F(r1Var, (g7) s8Var.f114510u3.get());
        jk.v.R(r1Var, (i2) oaVar.F3.get());
        jk.v.K(r1Var, s8Var.O5());
        jk.v.E(r1Var, s8Var.q5());
        jk.v.B(r1Var, (rg0.s) oaVar.Q5.get());
        jk.v.N(r1Var, (r20.a) s8Var.f114273e3.get());
        jk.v.M(r1Var, (yk1.j) oaVar.Qc.get());
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
