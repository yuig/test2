package tt0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import lh0.s1;
import nx.d1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class m extends l implements af2.c {
    public ye2.m X;
    public boolean Y;
    public volatile ye2.h Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Object f119191a0 = new Object();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f119192b0 = false;

    @Override // af2.c
    /* renamed from: V7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.Z == null) {
            synchronized (this.f119191a0) {
                try {
                    if (this.Z == null) {
                        this.Z = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.Z;
    }

    public final void W7() {
        if (this.X == null) {
            this.X = new ye2.m(super.getContext(), this);
            this.Y = ue.c.x(super.getContext());
        }
    }

    public final void X7() {
        if (this.f119192b0) {
            return;
        }
        this.f119192b0 = true;
        l0 l0Var = (l0) this;
        x8 x8Var = (x8) ((m0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        l0Var.f91283h = oaVar.Ec;
        l0Var.f91284i = (x2) oaVar.f113800m3.get();
        l0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        l0Var.f91286k = r70.b.f106349i.k0();
        l0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        l0Var.f91288m = (bz.i) oaVar.C9.get();
        l0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        l0Var.f91290o = (ac2.m) oaVar.C7.get();
        l0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        l0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        l0Var.f91293r = s8Var.u6();
        l0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        l0Var.f91295t = oaVar.T2();
        l0Var.f91296u = (d1) oaVar.f113730i2.get();
        l0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        l0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        l0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        l0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        l0Var.f91301z = (a80.a) oaVar.Wc.get();
        l0Var.A = (z70.f) oaVar.f113764k2.get();
        j1.A0(l0Var, (s1) oaVar.f113718h8.get());
        j1.J0(l0Var, (nx.f0) oaVar.f113747j2.get());
        j1.D0(l0Var, (ag1.b) oaVar.Z7.get());
        j1.v0(l0Var, (de0.d) oaVar.S7.get());
        j1.V0(l0Var, (i92.k) oaVar.f113921t1.get());
        j1.P0(l0Var, (dl1.t) oaVar.Y7.get());
        j1.x0(l0Var, (rg0.s) oaVar.Q5.get());
        j1.I0(l0Var, s8Var.A5());
        j1.E0(l0Var, (ag1.h) oaVar.K8.get());
        j1.K0(l0Var, (lb0.r) oaVar.f113622c1.get());
        j1.s0(l0Var, s8Var.e5());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.Y) {
            return null;
        }
        W7();
        return this.X;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // tt0.l, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        W7();
        X7();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.X;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W7();
        X7();
    }
}
