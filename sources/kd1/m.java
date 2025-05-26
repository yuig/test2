package kd1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import hs1.q;
import kh2.j1;
import m60.w;
import ni1.d0;
import ni1.t2;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class m extends p82.b implements af2.c {
    public ye2.m F0;
    public boolean G0;
    public volatile ye2.h H0;
    public final Object I0 = new Object();
    public boolean J0 = false;

    @Override // af2.c
    /* renamed from: b9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.H0 == null) {
            synchronized (this.I0) {
                try {
                    if (this.H0 == null) {
                        this.H0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.H0;
    }

    public final void c9() {
        if (this.F0 == null) {
            this.F0 = new ye2.m(super.getContext(), this);
            this.G0 = ue.c.x(super.getContext());
        }
    }

    public final void d9() {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        k kVar = (k) this;
        x8 x8Var = (x8) ((l) generatedComponent());
        oa oaVar = x8Var.f114707a;
        kVar.f91283h = oaVar.Ec;
        kVar.f91284i = (x2) oaVar.f113800m3.get();
        kVar.f91285j = (f0) oaVar.f113747j2.get();
        kVar.f91286k = r70.b.f106349i.k0();
        kVar.f91287l = (q) oaVar.f113875q7.get();
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
        kVar.f91298w = (w) oaVar.f113885r0.get();
        kVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        kVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        kVar.f91301z = (a80.a) oaVar.Wc.get();
        kVar.A = (z70.f) oaVar.f113764k2.get();
        kh2.w.W(kVar, new m60.f0());
        kh2.w.Z(kVar, (c6) s8Var.f114447q.get());
        pe.i.m0(kVar, oaVar.v2());
        pe.i.d0(kVar, new m60.f0());
        pe.i.n0(kVar);
        pe.i.o0(kVar, (t2) oaVar.f113950uc.get());
        pe.i.l0(kVar, (d0) oaVar.Gb.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.G0) {
            return null;
        }
        c9();
        return this.F0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        c9();
        d9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.F0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c9();
        d9();
    }
}
