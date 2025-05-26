package ms;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import bz.i;
import hs1.q;
import i92.k;
import kh2.j1;
import lh0.z0;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import sq0.n;
import x02.i2;
import x02.x0;
import x02.x2;
import ye2.h;
import ye2.m;
import yk1.j;

/* loaded from: classes.dex */
public abstract class a extends n implements af2.c {
    public m J0;
    public boolean K0;
    public volatile h L0;
    public final Object M0 = new Object();
    public boolean N0 = false;

    @Override // af2.c
    /* renamed from: d9, reason: merged with bridge method [inline-methods] */
    public final h componentManager() {
        if (this.L0 == null) {
            synchronized (this.M0) {
                try {
                    if (this.L0 == null) {
                        this.L0 = new h(this);
                    }
                } finally {
                }
            }
        }
        return this.L0;
    }

    public final void e9() {
        if (this.J0 == null) {
            this.J0 = new m(super.getContext(), this);
            this.K0 = ue.c.x(super.getContext());
        }
    }

    public final void f9() {
        if (this.N0) {
            return;
        }
        this.N0 = true;
        e eVar = (e) this;
        x8 x8Var = (x8) ((f) generatedComponent());
        oa oaVar = x8Var.f114707a;
        eVar.f91283h = oaVar.Ec;
        eVar.f91284i = (x2) oaVar.f113800m3.get();
        eVar.f91285j = (f0) oaVar.f113747j2.get();
        eVar.f91286k = r70.b.f106349i.k0();
        eVar.f91287l = (q) oaVar.f113875q7.get();
        eVar.f91288m = (i) oaVar.C9.get();
        eVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        eVar.f91290o = (ac2.m) oaVar.C7.get();
        eVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        eVar.f91292q = (ku1.a) s8Var.f114402n.get();
        eVar.f91293r = s8Var.u6();
        eVar.f91294s = (ff0.f) s8Var.f114417o.get();
        eVar.f91295t = oaVar.T2();
        eVar.f91296u = (d1) oaVar.f113730i2.get();
        eVar.f91297v = (b60.b) oaVar.f113850p0.get();
        eVar.f91298w = (w) oaVar.f113885r0.get();
        eVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        eVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        eVar.f91301z = (a80.a) oaVar.Wc.get();
        eVar.A = (z70.f) oaVar.f113764k2.get();
        eVar.f114986u0 = oaVar.v2();
        eVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        eVar.f114988w0 = s8Var.X5();
        eVar.f114989x0 = s8Var.h6();
        eVar.f114990y0 = (c6) s8Var.f114447q.get();
        el.a.E0(eVar, (nr0.m) s8Var.f114506u.get());
        el.a.r1(eVar, (i2) oaVar.F3.get());
        el.a.g0(eVar, (x0) oaVar.f113765k3.get());
        el.a.e1(eVar, (j) oaVar.Qc.get());
        el.a.L0(eVar, new lh0.e((z0) s8Var.f114255d.D0.get()));
        el.a.T(eVar, (z02.a) s8Var.f114521v.get());
        el.a.P1(eVar, (k) oaVar.f113921t1.get());
        el.a.U(eVar, oa.d0(oaVar));
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
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.J0;
        d7.b.q(mVar == null || h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e9();
        f9();
    }
}
