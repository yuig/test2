package kx0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import androidx.recyclerview.widget.v1;
import kh2.g3;
import kh2.j1;
import nx.d1;
import nx.f0;
import nx.o0;
import so.c6;
import so.n0;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a<T> extends wk1.k<T> implements af2.c {
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
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        o oVar = (o) this;
        x8 x8Var = (x8) ((p) generatedComponent());
        oa oaVar = x8Var.f114707a;
        oVar.f91283h = oaVar.Ec;
        oVar.f91284i = (x2) oaVar.f113800m3.get();
        oVar.f91285j = (f0) oaVar.f113747j2.get();
        oVar.f91286k = r70.b.f106349i.k0();
        oVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        oVar.f91288m = (bz.i) oaVar.C9.get();
        oVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        oVar.f91290o = (ac2.m) oaVar.C7.get();
        oVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        oVar.f91292q = (ku1.a) s8Var.f114402n.get();
        oVar.f91293r = s8Var.u6();
        oVar.f91294s = (ff0.f) s8Var.f114417o.get();
        oVar.f91295t = oaVar.T2();
        oVar.f91296u = (d1) oaVar.f113730i2.get();
        oVar.f91297v = (b60.b) oaVar.f113850p0.get();
        oVar.f91298w = (m60.w) oaVar.f113885r0.get();
        oVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        oVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        oVar.f91301z = (a80.a) oaVar.Wc.get();
        oVar.A = (z70.f) oaVar.f113764k2.get();
        oVar.f114986u0 = oaVar.v2();
        oVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        oVar.f114988w0 = s8Var.X5();
        oVar.f114989x0 = s8Var.h6();
        oVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(oVar);
        g3.j1(oVar, (n0) s8Var.M6.get());
        g3.G1(oVar, (uk1.e) oaVar.f113702ga.get());
        g3.q1(oVar, (i2) oaVar.F3.get());
        g3.T0(oVar, (pb0.a) oaVar.f113834o1.get());
        g3.w1(oVar, (o0) oaVar.T1.get());
        g3.Y0(oVar, (zf0.f) oaVar.f113723hd.get());
        g3.f1(oVar, new v1());
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
