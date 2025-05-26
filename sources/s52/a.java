package s52;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import kh2.m0;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class a extends p82.a implements af2.c {
    public ye2.m L0;
    public boolean M0;
    public volatile ye2.h N0;
    public final Object O0 = new Object();
    public boolean P0 = false;

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.M0) {
            return null;
        }
        l9();
        return this.L0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // af2.c
    /* renamed from: k9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.N0 == null) {
            synchronized (this.O0) {
                try {
                    if (this.N0 == null) {
                        this.N0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.N0;
    }

    public final void l9() {
        if (this.L0 == null) {
            this.L0 = new ye2.m(super.getContext(), this);
            this.M0 = ue.c.x(super.getContext());
        }
    }

    public final void m9() {
        if (this.P0) {
            return;
        }
        this.P0 = true;
        n nVar = (n) this;
        x8 x8Var = (x8) ((o) generatedComponent());
        oa oaVar = x8Var.f114707a;
        nVar.f91283h = oaVar.Ec;
        nVar.f91284i = (x2) oaVar.f113800m3.get();
        nVar.f91285j = (f0) oaVar.f113747j2.get();
        nVar.f91286k = r70.b.f106349i.k0();
        nVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        nVar.f91288m = (bz.i) oaVar.C9.get();
        nVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        nVar.f91290o = (ac2.m) oaVar.C7.get();
        nVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        nVar.f91292q = (ku1.a) s8Var.f114402n.get();
        nVar.f91293r = s8Var.u6();
        nVar.f91294s = (ff0.f) s8Var.f114417o.get();
        nVar.f91295t = oaVar.T2();
        nVar.f91296u = (d1) oaVar.f113730i2.get();
        nVar.f91297v = (b60.b) oaVar.f113850p0.get();
        nVar.f91298w = (w) oaVar.f113885r0.get();
        nVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        nVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        nVar.f91301z = (a80.a) oaVar.Wc.get();
        nVar.A = (z70.f) oaVar.f113764k2.get();
        kh2.w.W(nVar, new m60.f0());
        kh2.w.Z(nVar, (c6) s8Var.f114447q.get());
        oaVar.T2();
        c0.d.H1(nVar);
        c0.d.N0(nVar);
        c0.d.O1(nVar, s8Var.h6());
        m0.V(nVar);
        m0.N(nVar, (hf0.b) oaVar.f113717h7.get());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        l9();
        m9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.L0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l9();
        m9();
    }
}
