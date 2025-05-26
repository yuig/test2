package lq0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.c6;
import so.f7;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class n1<T> extends wk1.k<T> implements af2.c {
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
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        v0 v0Var = (v0) this;
        x8 x8Var = (x8) ((w0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        v0Var.f91283h = oaVar.Ec;
        v0Var.f91284i = (x2) oaVar.f113800m3.get();
        v0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        v0Var.f91286k = r70.b.f106349i.k0();
        v0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        v0Var.f91288m = (bz.i) oaVar.C9.get();
        v0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        v0Var.f91290o = (ac2.m) oaVar.C7.get();
        v0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        v0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        v0Var.f91293r = s8Var.u6();
        v0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        v0Var.f91295t = oaVar.T2();
        v0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        v0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        v0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        v0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        v0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        v0Var.f91301z = (a80.a) oaVar.Wc.get();
        v0Var.A = (z70.f) oaVar.f113764k2.get();
        v0Var.f114986u0 = oaVar.v2();
        v0Var.f114987v0 = (jq.c) s8Var.f114432p.get();
        v0Var.f114988w0 = s8Var.X5();
        v0Var.f114989x0 = s8Var.h6();
        v0Var.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(v0Var);
        kh2.s0.c0(v0Var, (f7) s8Var.f114480s3.get());
        kh2.s0.k0(v0Var, (i2) oaVar.F3.get());
        kh2.s0.U(v0Var, s8Var.C5());
        kh2.s0.V(v0Var, (q12.b) oaVar.f113750j5.get());
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
