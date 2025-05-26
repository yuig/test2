package it0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import bz.i;
import ff0.f;
import hs1.q;
import kg.o;
import kh2.j1;
import kotlin.jvm.internal.r;
import m60.g0;
import m60.w;
import ni1.d0;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import wk1.k;
import x02.i2;
import x02.x2;
import ye2.h;
import ye2.m;

/* loaded from: classes.dex */
public abstract class e<T> extends k<T> implements af2.c {
    public m M0;
    public boolean N0;
    public volatile h O0;
    public final Object P0 = new Object();
    public boolean Q0 = false;

    @Override // af2.c
    /* renamed from: g9, reason: merged with bridge method [inline-methods] */
    public final h componentManager() {
        if (this.O0 == null) {
            synchronized (this.P0) {
                try {
                    if (this.O0 == null) {
                        this.O0 = new h(this);
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
        c cVar = (c) this;
        x8 x8Var = (x8) ((d) generatedComponent());
        oa oaVar = x8Var.f114707a;
        cVar.f91283h = oaVar.Ec;
        cVar.f91284i = (x2) oaVar.f113800m3.get();
        cVar.f91285j = (f0) oaVar.f113747j2.get();
        cVar.f91286k = r70.b.f106349i.k0();
        cVar.f91287l = (q) oaVar.f113875q7.get();
        cVar.f91288m = (i) oaVar.C9.get();
        cVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        cVar.f91290o = (ac2.m) oaVar.C7.get();
        cVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        cVar.f91292q = (ku1.a) s8Var.f114402n.get();
        cVar.f91293r = s8Var.u6();
        cVar.f91294s = (f) s8Var.f114417o.get();
        cVar.f91295t = oaVar.T2();
        cVar.f91296u = (d1) oaVar.f113730i2.get();
        cVar.f91297v = (b60.b) oaVar.f113850p0.get();
        cVar.f91298w = (w) oaVar.f113885r0.get();
        cVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        cVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        cVar.f91301z = (a80.a) oaVar.Wc.get();
        cVar.A = (z70.f) oaVar.f113764k2.get();
        cVar.f114986u0 = oaVar.v2();
        cVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        cVar.f114988w0 = s8Var.X5();
        cVar.f114989x0 = s8Var.h6();
        cVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(cVar);
        r.R(cVar, (i2) oaVar.F3.get());
        r.F(cVar, s8Var.H5());
        r.S(cVar, (uk1.e) oaVar.f113702ga.get());
        r.N(cVar, (g0) oaVar.f113590a4.get());
        r.D(cVar, (nr0.m) s8Var.f114506u.get());
        r.P(cVar, s8Var.s6());
        r.Q(cVar, (d0) oaVar.Gb.get());
        r.y(cVar);
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
        d7.b.q(mVar == null || h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h9();
        i9();
    }
}
