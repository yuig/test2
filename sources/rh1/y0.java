package rh1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class y0<T> extends mm1.n<T> implements af2.c {
    public ye2.m R0;
    public boolean S0;
    public volatile ye2.h T0;
    public final Object U0 = new Object();
    public boolean V0 = false;

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.S0) {
            return null;
        }
        n9();
        return this.R0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // af2.c
    /* renamed from: m9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.T0 == null) {
            synchronized (this.U0) {
                try {
                    if (this.T0 == null) {
                        this.T0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.T0;
    }

    public final void n9() {
        if (this.R0 == null) {
            this.R0 = new ye2.m(super.getContext(), this);
            this.S0 = ue.c.x(super.getContext());
        }
    }

    public final void o9() {
        if (this.V0) {
            return;
        }
        this.V0 = true;
        b0 b0Var = (b0) this;
        x8 x8Var = (x8) ((c0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        b0Var.f91283h = oaVar.Ec;
        b0Var.f91284i = (x2) oaVar.f113800m3.get();
        b0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        b0Var.f91286k = r70.b.f106349i.k0();
        b0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        b0Var.f91288m = (bz.i) oaVar.C9.get();
        b0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        b0Var.f91290o = (ac2.m) oaVar.C7.get();
        b0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        b0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        b0Var.f91293r = s8Var.u6();
        b0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        b0Var.f91295t = oaVar.T2();
        b0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        b0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        b0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        b0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        b0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        b0Var.f91301z = (a80.a) oaVar.Wc.get();
        b0Var.A = (z70.f) oaVar.f113764k2.get();
        b0Var.f114986u0 = oaVar.v2();
        b0Var.f114987v0 = (jq.c) s8Var.f114432p.get();
        b0Var.f114988w0 = s8Var.X5();
        b0Var.f114989x0 = s8Var.h6();
        b0Var.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(b0Var);
        kh2.g0.V(b0Var, (uk1.e) oaVar.f113702ga.get());
        kh2.g0.I(b0Var, (nr0.m) s8Var.f114506u.get());
        kh2.g0.Q(b0Var, (x02.i2) oaVar.F3.get());
        kh2.g0.F(b0Var, (qh1.e) s8Var.P1.get());
        kh2.g0.K(b0Var, s8Var.n5());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        n9();
        o9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.R0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        n9();
        o9();
    }
}
