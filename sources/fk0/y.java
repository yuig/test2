package fk0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.a1;
import kh2.j1;
import nx.d1;
import nx.f0;
import so.g3;
import so.k2;
import so.oa;
import so.s8;
import so.v2;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class y extends yk1.k implements af2.c {

    /* renamed from: e0, reason: collision with root package name */
    public ye2.m f62333e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f62334f0;

    /* renamed from: g0, reason: collision with root package name */
    public volatile ye2.h f62335g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Object f62336h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public boolean f62337i0 = false;

    @Override // af2.c
    /* renamed from: Y7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f62335g0 == null) {
            synchronized (this.f62336h0) {
                try {
                    if (this.f62335g0 == null) {
                        this.f62335g0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f62335g0;
    }

    public final void Z7() {
        if (this.f62333e0 == null) {
            this.f62333e0 = new ye2.m(super.getContext(), this);
            this.f62334f0 = ue.c.x(super.getContext());
        }
    }

    public final void a8() {
        if (this.f62337i0) {
            return;
        }
        this.f62337i0 = true;
        k kVar = (k) this;
        x8 x8Var = (x8) ((l) generatedComponent());
        oa oaVar = x8Var.f114707a;
        kVar.f91283h = oaVar.Ec;
        kVar.f91284i = (x2) oaVar.f113800m3.get();
        kVar.f91285j = (f0) oaVar.f113747j2.get();
        kVar.f91286k = r70.b.f106349i.k0();
        kVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        kVar.f91288m = (bz.i) oaVar.C9.get();
        kVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        kVar.f91290o = (ac2.m) oaVar.C7.get();
        kVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        kVar.f91292q = (ku1.a) s8Var.f114402n.get();
        kVar.f91293r = s8Var.u6();
        kVar.f91294s = (ff0.f) s8Var.f114417o.get();
        kVar.f91295t = oaVar.T2();
        kVar.f91296u = (d1) oaVar.f113730i2.get();
        kVar.f91297v = (b60.b) oaVar.f113850p0.get();
        kVar.f91298w = (m60.w) oaVar.f113885r0.get();
        kVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        kVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        kVar.f91301z = (a80.a) oaVar.Wc.get();
        kVar.A = (z70.f) oaVar.f113764k2.get();
        a1.J(kVar, (k2) s8Var.C0.get());
        a1.I(kVar, (v2) s8Var.D0.get());
        a1.f0(kVar, (i92.k) oaVar.f113921t1.get());
        a1.N(kVar, (g3) s8Var.E0.get());
        a1.U(kVar, (yk1.j) oaVar.Qc.get());
        a1.H(kVar, (oc.c) oaVar.f113907s5.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f62334f0) {
            return null;
        }
        Z7();
        return this.f62333e0;
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
        ye2.m mVar = this.f62333e0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
