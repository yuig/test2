package xo0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.a1;
import kh2.j1;
import m60.g0;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.v5;
import so.x8;
import x02.i2;
import x02.x0;
import x02.x2;

/* loaded from: classes.dex */
public abstract class t extends sq0.n implements af2.c {
    public ye2.m J0;
    public boolean K0;
    public volatile ye2.h L0;
    public final Object M0 = new Object();
    public boolean N0 = false;

    @Override // af2.c
    /* renamed from: d9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.L0 == null) {
            synchronized (this.M0) {
                try {
                    if (this.L0 == null) {
                        this.L0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.L0;
    }

    public final void e9() {
        if (this.J0 == null) {
            this.J0 = new ye2.m(super.getContext(), this);
            this.K0 = ue.c.x(super.getContext());
        }
    }

    public final void f9() {
        if (this.N0) {
            return;
        }
        this.N0 = true;
        k kVar = (k) this;
        x8 x8Var = (x8) ((l) generatedComponent());
        oa oaVar = x8Var.f114707a;
        kVar.f91283h = oaVar.Ec;
        kVar.f91284i = (x2) oaVar.f113800m3.get();
        kVar.f91285j = (f0) oaVar.f113747j2.get();
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
        a1.K(kVar, (x0) oaVar.f113765k3.get());
        a1.a0(kVar, (i2) oaVar.F3.get());
        a1.X(kVar, (g0) oaVar.f113590a4.get());
        a1.S(kVar, (l12.b) oaVar.Jd.get());
        a1.O(kVar, (rr0.a) s8Var.f114508u1.get());
        a1.Q(kVar, (nr0.m) s8Var.f114506u.get());
        a1.V(kVar, (yk1.j) oaVar.Qc.get());
        a1.b0(kVar, (f0) oaVar.f113747j2.get());
        a1.Y(kVar, oa.t1(oaVar));
        a1.M(kVar, s8Var.g5());
        a1.L(kVar, (v5) s8Var.f114583z1.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.K0) {
            return null;
        }
        e9();
        return this.J0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        e9();
        f9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.J0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e9();
        f9();
    }
}
