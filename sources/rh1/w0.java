package rh1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import yq0.a0;

/* loaded from: classes2.dex */
public abstract class w0<D extends yq0.a0> extends yq0.b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f108324u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f108325v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f108326w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f108327x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f108328y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f108326w0 == null) {
            synchronized (this.f108327x0) {
                try {
                    if (this.f108326w0 == null) {
                        this.f108326w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f108326w0;
    }

    public final void S8() {
        if (this.f108324u0 == null) {
            this.f108324u0 = new ye2.m(super.getContext(), this);
            this.f108325v0 = ue.c.x(super.getContext());
        }
    }

    public void T8() {
        if (this.f108328y0) {
            return;
        }
        this.f108328y0 = true;
        k kVar = (k) this;
        x8 x8Var = (x8) ((l) generatedComponent());
        oa oaVar = x8Var.f114707a;
        kVar.f91283h = oaVar.Ec;
        kVar.f91284i = (x2) oaVar.f113800m3.get();
        kVar.f91285j = (nx.f0) oaVar.f113747j2.get();
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
        kVar.f91296u = (nx.d1) oaVar.f113730i2.get();
        kVar.f91297v = (b60.b) oaVar.f113850p0.get();
        kVar.f91298w = (m60.w) oaVar.f113885r0.get();
        kVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        kVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        kVar.f91301z = (a80.a) oaVar.Wc.get();
        kVar.A = (z70.f) oaVar.f113764k2.get();
        kh2.d.f0(kVar, oaVar.j2());
        kh2.d.x0(kVar, (up0.l) oaVar.Rc.get());
        kh2.d.n0(kVar);
        kh2.d.d0(kVar, s8Var.o5());
        kh2.d.i0(kVar, (d21.a) s8Var.f114317h2.get());
        kh2.d.k0(kVar, (x02.i2) oaVar.F3.get());
        kh2.d.V(kVar, (qh1.e) s8Var.P1.get());
        kh2.d.y0(kVar, s8Var.L6());
        kh2.d.q0(kVar, (lb0.r) oaVar.f113622c1.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f108325v0) {
            return null;
        }
        S8();
        return this.f108324u0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        S8();
        T8();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f108324u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
