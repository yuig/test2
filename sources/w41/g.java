package w41;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import o82.v2;
import so.c6;
import so.n5;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class g extends v2 implements af2.c {
    public ye2.m G0;
    public boolean H0;
    public volatile ye2.h I0;
    public final Object J0 = new Object();
    public boolean K0 = false;

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.H0) {
            return null;
        }
        i9();
        return this.G0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // af2.c
    /* renamed from: h9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.I0 == null) {
            synchronized (this.J0) {
                try {
                    if (this.I0 == null) {
                        this.I0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.I0;
    }

    public final void i9() {
        if (this.G0 == null) {
            this.G0 = new ye2.m(super.getContext(), this);
            this.H0 = ue.c.x(super.getContext());
        }
    }

    public final void j9() {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        n0 n0Var = (n0) this;
        x8 x8Var = (x8) ((o0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        n0Var.f91283h = oaVar.Ec;
        n0Var.f91284i = (x2) oaVar.f113800m3.get();
        n0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        n0Var.f91286k = r70.b.f106349i.k0();
        n0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        n0Var.f91288m = (bz.i) oaVar.C9.get();
        n0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        n0Var.f91290o = (ac2.m) oaVar.C7.get();
        n0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        n0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        n0Var.f91293r = s8Var.u6();
        n0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        n0Var.f91295t = oaVar.T2();
        n0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        n0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        n0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        n0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        n0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        n0Var.f91301z = (a80.a) oaVar.Wc.get();
        n0Var.A = (z70.f) oaVar.f113764k2.get();
        kh2.w.W(n0Var, new m60.f0());
        kh2.w.Z(n0Var, (c6) s8Var.f114447q.get());
        oaVar.T2();
        c0.d.H1(n0Var);
        c0.d.N0(n0Var);
        c0.d.O1(n0Var, s8Var.h6());
        kh2.m0.O(n0Var, (zf0.f) oaVar.f113723hd.get());
        kh2.m0.U(n0Var, (n5) s8Var.f114271e1.get());
        kh2.m0.W(n0Var, a02.e.Z2());
        kh2.m0.R(n0Var, oaVar.W2());
        kh2.m0.p0(n0Var, s8Var.w6());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i9();
        j9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.G0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        i9();
        j9();
    }
}
