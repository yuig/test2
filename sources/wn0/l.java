package wn0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import hs1.q;
import kg.o;
import kh2.j1;
import m60.d0;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s5;
import so.s8;
import so.x8;
import tj0.b0;
import x02.i2;
import x02.u2;
import x02.x0;
import x02.x2;
import ye2.m;

/* loaded from: classes.dex */
public abstract class l<T> extends wk1.k<T> implements af2.c {
    public m M0;
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
            this.M0 = new m(super.getContext(), this);
            this.N0 = ue.c.x(super.getContext());
        }
    }

    public final void i9() {
        if (this.Q0) {
            return;
        }
        this.Q0 = true;
        j jVar = (j) this;
        x8 x8Var = (x8) ((k) generatedComponent());
        oa oaVar = x8Var.f114707a;
        jVar.f91283h = oaVar.Ec;
        jVar.f91284i = (x2) oaVar.f113800m3.get();
        jVar.f91285j = (f0) oaVar.f113747j2.get();
        jVar.f91286k = r70.b.f106349i.k0();
        jVar.f91287l = (q) oaVar.f113875q7.get();
        jVar.f91288m = (bz.i) oaVar.C9.get();
        jVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        jVar.f91290o = (ac2.m) oaVar.C7.get();
        jVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        jVar.f91292q = (ku1.a) s8Var.f114402n.get();
        jVar.f91293r = s8Var.u6();
        jVar.f91294s = (ff0.f) s8Var.f114417o.get();
        jVar.f91295t = oaVar.T2();
        jVar.f91296u = (d1) oaVar.f113730i2.get();
        jVar.f91297v = (b60.b) oaVar.f113850p0.get();
        jVar.f91298w = (w) oaVar.f113885r0.get();
        jVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        jVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        jVar.f91301z = (a80.a) oaVar.Wc.get();
        jVar.A = (z70.f) oaVar.f113764k2.get();
        jVar.f114986u0 = oaVar.v2();
        jVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        jVar.f114988w0 = s8Var.X5();
        jVar.f114989x0 = s8Var.h6();
        jVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(jVar);
        el.a.k0(jVar, (s5) s8Var.f114419o1.get());
        el.a.i0(jVar, (x0) oaVar.f113765k3.get());
        el.a.u1(jVar, (i2) oaVar.F3.get());
        el.a.T1(jVar, (ap.o) s8Var.I0.get());
        el.a.J1(jVar, (uk1.e) oaVar.f113702ga.get());
        el.a.x1(jVar, (f0) oaVar.f113747j2.get());
        el.a.P0(jVar, (d0) s8Var.T0.get());
        el.a.l0(jVar, (j12.k) oaVar.A3.get());
        el.a.e0(jVar, s8Var.x5());
        el.a.b0(jVar, (oc.c) oaVar.f113907s5.get());
        el.a.j0(jVar, s8Var.f5());
        el.a.O0(jVar, oaVar.I2());
        el.a.G0(jVar, (zf0.f) oaVar.f113723hd.get());
        el.a.f1(jVar, (yk1.j) oaVar.Qc.get());
        el.a.X1(jVar, (u2) oaVar.Dd.get());
        el.a.g1(jVar, (b0) s8Var.H0.get());
        el.a.M1(jVar, s8Var.D6());
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
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.M0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h9();
        i9();
    }
}
