package yq1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class d0 extends yk1.k implements af2.c {

    /* renamed from: e0, reason: collision with root package name */
    public ye2.m f139826e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f139827f0;

    /* renamed from: g0, reason: collision with root package name */
    public volatile ye2.h f139828g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Object f139829h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public boolean f139830i0 = false;

    @Override // af2.c
    /* renamed from: Y7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f139828g0 == null) {
            synchronized (this.f139829h0) {
                try {
                    if (this.f139828g0 == null) {
                        this.f139828g0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f139828g0;
    }

    public final void Z7() {
        if (this.f139826e0 == null) {
            this.f139826e0 = new ye2.m(super.getContext(), this);
            this.f139827f0 = ue.c.x(super.getContext());
        }
    }

    public final void a8() {
        if (this.f139830i0) {
            return;
        }
        this.f139830i0 = true;
        u uVar = (u) this;
        x8 x8Var = (x8) ((v) generatedComponent());
        oa oaVar = x8Var.f114707a;
        uVar.f91283h = oaVar.Ec;
        uVar.f91284i = (x2) oaVar.f113800m3.get();
        uVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        uVar.f91286k = r70.b.f106349i.k0();
        uVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        uVar.f91288m = (bz.i) oaVar.C9.get();
        uVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        uVar.f91290o = (ac2.m) oaVar.C7.get();
        uVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        uVar.f91292q = (ku1.a) s8Var.f114402n.get();
        uVar.f91293r = s8Var.u6();
        uVar.f91294s = (ff0.f) s8Var.f114417o.get();
        uVar.f91295t = oaVar.T2();
        uVar.f91296u = (nx.d1) oaVar.f113730i2.get();
        uVar.f91297v = (b60.b) oaVar.f113850p0.get();
        uVar.f91298w = (m60.w) oaVar.f113885r0.get();
        uVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        uVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        uVar.f91301z = (a80.a) oaVar.Wc.get();
        uVar.A = (z70.f) oaVar.f113764k2.get();
        pp2.a.B0(uVar, (i92.k) oaVar.f113921t1.get());
        pp2.a.H(uVar, oaVar.a2());
        pp2.a.I(uVar, s8Var.b5());
        pp2.a.r0(uVar, (uk1.e) oaVar.f113702ga.get());
        pp2.a.B(uVar, (cr1.a) oaVar.B2.get());
        pp2.a.C(uVar, (mr1.a) oaVar.B6.get());
        pp2.a.U(uVar, s8Var.M5());
        pp2.a.h0(uVar, oaVar.U2());
        pp2.a.G(uVar, (or1.i) oaVar.f114015y5.get());
        pp2.a.E(uVar, (ox.b) oaVar.M1.get());
        pp2.a.e0(uVar, (rr1.g) s8Var.f114321h6.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f139827f0) {
            return null;
        }
        Z7();
        return this.f139826e0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        ye2.m mVar = this.f139826e0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
