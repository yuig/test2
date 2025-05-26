package x81;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import nx.d1;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes2.dex */
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
        f0 f0Var = (f0) this;
        x8 x8Var = (x8) ((g0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        f0Var.f91283h = oaVar.Ec;
        f0Var.f91284i = (x2) oaVar.f113800m3.get();
        f0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        f0Var.f91286k = r70.b.f106349i.k0();
        f0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        f0Var.f91288m = (bz.i) oaVar.C9.get();
        f0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        f0Var.f91290o = (ac2.m) oaVar.C7.get();
        f0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        f0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        f0Var.f91293r = s8Var.u6();
        f0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        f0Var.f91295t = oaVar.T2();
        f0Var.f91296u = (d1) oaVar.f113730i2.get();
        f0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        f0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        f0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        f0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        f0Var.f91301z = (a80.a) oaVar.Wc.get();
        f0Var.A = (z70.f) oaVar.f113764k2.get();
        f0Var.f114986u0 = oaVar.v2();
        f0Var.f114987v0 = (jq.c) s8Var.f114432p.get();
        f0Var.f114988w0 = s8Var.X5();
        f0Var.f114989x0 = s8Var.h6();
        f0Var.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(f0Var);
        c0.d.G0(f0Var, (ContextWrapper) oaVar.f113902s0.get());
        c0.d.S1(f0Var, (x20.a) s8Var.f114445pc.get());
        c0.d.C0(f0Var, (a11.d) oaVar.f113668ec.get());
        c0.d.p1(f0Var, (i2) oaVar.F3.get());
        c0.d.r1(f0Var, (nx.f0) oaVar.f113747j2.get());
        c0.d.F1(f0Var, (uk1.e) oaVar.f113702ga.get());
        c0.d.x0(f0Var, (yk1.a) s8Var.B.get());
        c0.d.e1(f0Var, (c91.e) s8Var.f114211a0.get());
        c0.d.K0(f0Var, (nr0.m) s8Var.f114506u.get());
        c0.d.k1(f0Var, s8Var.A5());
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
