package sw0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import nx.d1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import yq0.a0;

/* loaded from: classes.dex */
public abstract class g<D extends yq0.a0> extends yq0.b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f115440u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f115441v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f115442w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f115443x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f115444y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f115442w0 == null) {
            synchronized (this.f115443x0) {
                try {
                    if (this.f115442w0 == null) {
                        this.f115442w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f115442w0;
    }

    public final void S8() {
        if (this.f115440u0 == null) {
            this.f115440u0 = new ye2.m(super.getContext(), this);
            this.f115441v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f115444y0) {
            return;
        }
        this.f115444y0 = true;
        j0 j0Var = (j0) this;
        x8 x8Var = (x8) ((k0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        j0Var.f91283h = oaVar.Ec;
        j0Var.f91284i = (x2) oaVar.f113800m3.get();
        j0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        j0Var.f91286k = r70.b.f106349i.k0();
        j0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        j0Var.f91288m = (bz.i) oaVar.C9.get();
        j0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        j0Var.f91290o = (ac2.m) oaVar.C7.get();
        j0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        j0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        j0Var.f91293r = s8Var.u6();
        j0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        j0Var.f91295t = oaVar.T2();
        j0Var.f91296u = (d1) oaVar.f113730i2.get();
        j0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        j0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        j0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        j0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        j0Var.f91301z = (a80.a) oaVar.Wc.get();
        j0Var.A = (z70.f) oaVar.f113764k2.get();
        kh2.j.k1(j0Var, s8Var.K6);
        kh2.j.B1(j0Var, (dc2.e) oaVar.f113675f1.get());
        kh2.j.e1(j0Var, oaVar.Z7);
        kh2.j.b2(j0Var, (dl1.t) oaVar.Y7.get());
        kh2.j.m2(j0Var, (k22.m) oaVar.Y4.get());
        kh2.j.W0(j0Var, oaVar.t2());
        kh2.j.L0(j0Var, (de0.d) oaVar.S7.get());
        kh2.j.x1(j0Var, (nx.f0) oaVar.f113747j2.get());
        kh2.j.S0(j0Var, (rg0.s) oaVar.Q5.get());
        kh2.j.u1(j0Var, s8Var.A5());
        kh2.j.N0(j0Var, (zf0.f) oaVar.f113723hd.get());
        kh2.j.g1(j0Var, (nu1.a) s8Var.f114462r.get());
        kh2.j.P0(j0Var, a02.e.d4());
        kh2.j.f1(j0Var, (ag1.h) oaVar.K8.get());
        kh2.j.F1(j0Var, (lb0.r) oaVar.f113622c1.get());
        kh2.j.A0(j0Var, s8Var.e5());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f115441v0) {
            return null;
        }
        S8();
        return this.f115440u0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        S8();
        T8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f115440u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
