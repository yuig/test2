package q91;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class g0 extends yk1.k implements af2.c {

    /* renamed from: e0, reason: collision with root package name */
    public ye2.m f103103e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f103104f0;

    /* renamed from: g0, reason: collision with root package name */
    public volatile ye2.h f103105g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Object f103106h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public boolean f103107i0 = false;

    @Override // af2.c
    /* renamed from: Y7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f103105g0 == null) {
            synchronized (this.f103106h0) {
                try {
                    if (this.f103105g0 == null) {
                        this.f103105g0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f103105g0;
    }

    public final void Z7() {
        if (this.f103103e0 == null) {
            this.f103103e0 = new ye2.m(super.getContext(), this);
            this.f103104f0 = ue.c.x(super.getContext());
        }
    }

    public final void a8() {
        if (this.f103107i0) {
            return;
        }
        this.f103107i0 = true;
        g1 g1Var = (g1) this;
        x8 x8Var = (x8) ((h1) generatedComponent());
        oa oaVar = x8Var.f114707a;
        g1Var.f91283h = oaVar.Ec;
        g1Var.f91284i = (x2) oaVar.f113800m3.get();
        g1Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        g1Var.f91286k = r70.b.f106349i.k0();
        g1Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        g1Var.f91288m = (bz.i) oaVar.C9.get();
        g1Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        g1Var.f91290o = (ac2.m) oaVar.C7.get();
        g1Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        g1Var.f91292q = (ku1.a) s8Var.f114402n.get();
        g1Var.f91293r = s8Var.u6();
        g1Var.f91294s = (ff0.f) s8Var.f114417o.get();
        g1Var.f91295t = oaVar.T2();
        g1Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        g1Var.f91297v = (b60.b) oaVar.f113850p0.get();
        g1Var.f91298w = (m60.w) oaVar.f113885r0.get();
        g1Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        g1Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        g1Var.f91301z = (a80.a) oaVar.Wc.get();
        g1Var.A = (z70.f) oaVar.f113764k2.get();
        kh2.j.N1(g1Var, (uk1.e) oaVar.f113702ga.get());
        kh2.j.i0(g1Var, (cr1.a) oaVar.A2.get());
        kh2.j.j2(g1Var, (i92.k) oaVar.f113921t1.get());
        kh2.j.V0(g1Var, s8Var.z6());
        kh2.j.z1(g1Var, oaVar.U2());
        kh2.j.t0(g1Var, (or1.i) oaVar.f114015y5.get());
        kh2.j.q0(g1Var, (ox.b) oaVar.M1.get());
        kh2.j.s1(g1Var, (rr1.g) s8Var.f114321h6.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f103104f0) {
            return null;
        }
        Z7();
        return this.f103103e0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Z7();
        a8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f103103e0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
