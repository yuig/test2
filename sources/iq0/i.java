package iq0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import hs1.q;
import kg.o;
import kg.t;
import kh2.j1;
import kh2.n3;
import m60.d0;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.x6;
import so.x8;
import x02.i2;
import x02.x2;
import ye2.m;

/* loaded from: classes.dex */
public abstract class i extends gq0.d implements af2.c {
    public m S0;
    public boolean T0;
    public volatile ye2.h U0;
    public final Object V0 = new Object();
    public boolean W0 = false;

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.T0) {
            return null;
        }
        j9();
        return this.S0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // af2.c
    /* renamed from: i9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.U0 == null) {
            synchronized (this.V0) {
                try {
                    if (this.U0 == null) {
                        this.U0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.U0;
    }

    public final void j9() {
        if (this.S0 == null) {
            this.S0 = new m(super.getContext(), this);
            this.T0 = ue.c.x(super.getContext());
        }
    }

    public final void k9() {
        if (this.W0) {
            return;
        }
        this.W0 = true;
        a aVar = (a) this;
        x8 x8Var = (x8) ((b) generatedComponent());
        oa oaVar = x8Var.f114707a;
        aVar.f91283h = oaVar.Ec;
        aVar.f91284i = (x2) oaVar.f113800m3.get();
        aVar.f91285j = (f0) oaVar.f113747j2.get();
        aVar.f91286k = r70.b.f106349i.k0();
        aVar.f91287l = (q) oaVar.f113875q7.get();
        aVar.f91288m = (bz.i) oaVar.C9.get();
        aVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        aVar.f91290o = (ac2.m) oaVar.C7.get();
        aVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        aVar.f91292q = (ku1.a) s8Var.f114402n.get();
        aVar.f91293r = s8Var.u6();
        aVar.f91294s = (ff0.f) s8Var.f114417o.get();
        aVar.f91295t = oaVar.T2();
        aVar.f91296u = (d1) oaVar.f113730i2.get();
        aVar.f91297v = (b60.b) oaVar.f113850p0.get();
        aVar.f91298w = (w) oaVar.f113885r0.get();
        aVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        aVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        aVar.f91301z = (a80.a) oaVar.Wc.get();
        aVar.A = (z70.f) oaVar.f113764k2.get();
        aVar.f114986u0 = oaVar.v2();
        aVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        aVar.f114988w0 = s8Var.X5();
        aVar.f114989x0 = s8Var.h6();
        aVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(aVar);
        n3.P(aVar, (d0) s8Var.T0.get());
        t.z0(aVar, (uk1.e) oaVar.f113702ga.get());
        t.q0(aVar, (i2) oaVar.F3.get());
        t.Z(aVar, (x6) s8Var.f114303g3.get());
        t.l0(aVar, (w) oaVar.f113885r0.get());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        j9();
        k9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.S0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j9();
        k9();
    }
}
