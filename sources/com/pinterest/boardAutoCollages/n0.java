package com.pinterest.boardAutoCollages;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import kh2.k3;
import nx.d1;
import o82.v2;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class n0 extends v2 implements af2.c {
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
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        q qVar = (q) this;
        x8 x8Var = (x8) ((r) generatedComponent());
        oa oaVar = x8Var.f114707a;
        qVar.f91283h = oaVar.Ec;
        qVar.f91284i = (x2) oaVar.f113800m3.get();
        qVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        qVar.f91286k = r70.b.f106349i.k0();
        qVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        qVar.f91288m = (bz.i) oaVar.C9.get();
        qVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        qVar.f91290o = (ac2.m) oaVar.C7.get();
        qVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        qVar.f91292q = (ku1.a) s8Var.f114402n.get();
        qVar.f91293r = s8Var.u6();
        qVar.f91294s = (ff0.f) s8Var.f114417o.get();
        qVar.f91295t = oaVar.T2();
        qVar.f91296u = (d1) oaVar.f113730i2.get();
        qVar.f91297v = (b60.b) oaVar.f113850p0.get();
        qVar.f91298w = (m60.w) oaVar.f113885r0.get();
        qVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        qVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        qVar.f91301z = (a80.a) oaVar.Wc.get();
        qVar.A = (z70.f) oaVar.f113764k2.get();
        kh2.w.W(qVar, new m60.f0());
        kh2.w.Z(qVar, (c6) s8Var.f114447q.get());
        oaVar.T2();
        c0.d.H1(qVar);
        c0.d.N0(qVar);
        c0.d.O1(qVar, s8Var.h6());
        k3.O0(qVar, (a82.b) s8Var.A0.get());
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
