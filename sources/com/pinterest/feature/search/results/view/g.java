package com.pinterest.feature.search.results.view;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import lh0.c4;
import lh0.i3;
import lh0.z0;
import nx.d1;
import nx.o0;
import so.c6;
import so.l3;
import so.l6;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class g<T> extends wk1.k<T> implements af2.c {
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
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) this;
        x8 x8Var = (x8) ((c0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        searchGridMultiSectionFragment.f91283h = oaVar.Ec;
        searchGridMultiSectionFragment.f91284i = (x2) oaVar.f113800m3.get();
        searchGridMultiSectionFragment.f91285j = (nx.f0) oaVar.f113747j2.get();
        searchGridMultiSectionFragment.f91286k = r70.b.f106349i.k0();
        searchGridMultiSectionFragment.f91287l = (hs1.q) oaVar.f113875q7.get();
        searchGridMultiSectionFragment.f91288m = (bz.i) oaVar.C9.get();
        searchGridMultiSectionFragment.f91289n = (lu1.d) oaVar.f113782l2.get();
        searchGridMultiSectionFragment.f91290o = (ac2.m) oaVar.C7.get();
        searchGridMultiSectionFragment.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        searchGridMultiSectionFragment.f91292q = (ku1.a) s8Var.f114402n.get();
        searchGridMultiSectionFragment.f91293r = s8Var.u6();
        searchGridMultiSectionFragment.f91294s = (ff0.f) s8Var.f114417o.get();
        searchGridMultiSectionFragment.f91295t = oaVar.T2();
        searchGridMultiSectionFragment.f91296u = (d1) oaVar.f113730i2.get();
        searchGridMultiSectionFragment.f91297v = (b60.b) oaVar.f113850p0.get();
        searchGridMultiSectionFragment.f91298w = (m60.w) oaVar.f113885r0.get();
        searchGridMultiSectionFragment.f91299x = (tb0.h) oaVar.f113797m0.get();
        searchGridMultiSectionFragment.f91300y = (uj2.q) oaVar.f113947u9.get();
        searchGridMultiSectionFragment.f91301z = (a80.a) oaVar.Wc.get();
        searchGridMultiSectionFragment.A = (z70.f) oaVar.f113764k2.get();
        searchGridMultiSectionFragment.f114986u0 = oaVar.v2();
        searchGridMultiSectionFragment.f114987v0 = (jq.c) s8Var.f114432p.get();
        searchGridMultiSectionFragment.f114988w0 = s8Var.X5();
        searchGridMultiSectionFragment.f114989x0 = s8Var.h6();
        searchGridMultiSectionFragment.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(searchGridMultiSectionFragment);
        c0.d.S0(searchGridMultiSectionFragment, s8Var.x6());
        c0.d.f1(searchGridMultiSectionFragment, s8Var.e6());
        c0.d.J1(searchGridMultiSectionFragment, s8Var.w6());
        oa oaVar2 = s8Var.f114255d;
        c0.d.N1(searchGridMultiSectionFragment, new c4((z0) oaVar2.D0.get()));
        c0.d.u0(searchGridMultiSectionFragment, oa.g0(oaVar));
        com.pinterest.widget.configuration.k.x2(oaVar.f113638d);
        ac2.f fVar = ac2.f.f1945a;
        c0.d.U1(searchGridMultiSectionFragment);
        c0.d.I1(searchGridMultiSectionFragment, (l3) s8Var.T9.get());
        c0.d.q1(searchGridMultiSectionFragment, (nx.f0) oaVar.f113747j2.get());
        c0.d.m1(searchGridMultiSectionFragment, (i2) oaVar.F3.get());
        c0.d.i1(searchGridMultiSectionFragment, (m60.g0) oaVar.f113590a4.get());
        c0.d.g1(searchGridMultiSectionFragment, s8Var.f6());
        c0.d.d1(searchGridMultiSectionFragment, (c91.e) s8Var.f114211a0.get());
        c0.d.P0(searchGridMultiSectionFragment, (rg0.s) oaVar.Q5.get());
        c0.d.L0(searchGridMultiSectionFragment, (zf0.f) oaVar.f113723hd.get());
        c0.d.b1(searchGridMultiSectionFragment, (yk1.j) oaVar.Qc.get());
        c0.d.V1(searchGridMultiSectionFragment, (yk1.v) s8Var.C.get());
        c0.d.D0(searchGridMultiSectionFragment, (pb0.a) oaVar.f113834o1.get());
        c0.d.s1(searchGridMultiSectionFragment, (o0) oaVar.T1.get());
        c0.d.v1(searchGridMultiSectionFragment, new b20.c((cb) null));
        c0.d.u1(searchGridMultiSectionFragment);
        c0.d.K1(searchGridMultiSectionFragment, new i3((z0) oaVar2.D0.get()));
        c0.d.z0(searchGridMultiSectionFragment, (dz.a) s8Var.f114388m0.get());
        c0.d.y0(searchGridMultiSectionFragment, (cz.e) oaVar.V9.get());
        c0.d.v0(searchGridMultiSectionFragment, (vy.m) oaVar.M1.get());
        c0.d.Q1(searchGridMultiSectionFragment, (i92.k) oaVar.f113921t1.get());
        c0.d.w1(searchGridMultiSectionFragment, (lb0.q) oaVar.O0.get());
        c0.d.L1(searchGridMultiSectionFragment, (l6) s8Var.d2.get());
        c0.d.J0(searchGridMultiSectionFragment, s8Var.v5());
        c0.d.a1(searchGridMultiSectionFragment, (bc2.e) oaVar.F7.get());
        c0.d.q0(searchGridMultiSectionFragment, (es.a) oaVar.P6.get());
        c0.d.s0(searchGridMultiSectionFragment, (kv.a) oaVar.Db.get());
        c0.d.h1(searchGridMultiSectionFragment, (kv.c) oaVar.f113776ke.get());
        c0.d.t0(searchGridMultiSectionFragment, (es.h) oaVar.f113735i7.get());
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
