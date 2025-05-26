package hc1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import hs1.q;
import kh2.j1;
import lh0.s3;
import lh0.z0;
import m60.w;
import n00.s;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import yq0.a0;
import yq0.b0;

/* loaded from: classes2.dex */
public abstract class c<D extends a0> extends b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f68708u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f68709v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f68710w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f68711x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f68712y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f68710w0 == null) {
            synchronized (this.f68711x0) {
                try {
                    if (this.f68710w0 == null) {
                        this.f68710w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f68710w0;
    }

    public final void S8() {
        if (this.f68708u0 == null) {
            this.f68708u0 = new ye2.m(super.getContext(), this);
            this.f68709v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f68712y0) {
            return;
        }
        this.f68712y0 = true;
        n nVar = (n) this;
        x8 x8Var = (x8) ((o) generatedComponent());
        oa oaVar = x8Var.f114707a;
        nVar.f91283h = oaVar.Ec;
        nVar.f91284i = (x2) oaVar.f113800m3.get();
        nVar.f91285j = (f0) oaVar.f113747j2.get();
        nVar.f91286k = r70.b.f106349i.k0();
        nVar.f91287l = (q) oaVar.f113875q7.get();
        nVar.f91288m = (bz.i) oaVar.C9.get();
        nVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        nVar.f91290o = (ac2.m) oaVar.C7.get();
        nVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        nVar.f91292q = (ku1.a) s8Var.f114402n.get();
        nVar.f91293r = s8Var.u6();
        nVar.f91294s = (ff0.f) s8Var.f114417o.get();
        nVar.f91295t = oaVar.T2();
        nVar.f91296u = (d1) oaVar.f113730i2.get();
        nVar.f91297v = (b60.b) oaVar.f113850p0.get();
        nVar.f91298w = (w) oaVar.f113885r0.get();
        nVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        nVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        nVar.f91301z = (a80.a) oaVar.Wc.get();
        nVar.A = (z70.f) oaVar.f113764k2.get();
        pp2.a.F(nVar, (oc.c) oaVar.f113907s5.get());
        pp2.a.M(nVar, a02.e.O1());
        pp2.a.m0(nVar, (uk1.e) oaVar.f113702ga.get());
        pp2.a.K(nVar, (lu1.b) oaVar.f113961v5.get());
        pp2.a.v0(nVar, (s) oaVar.of.get());
        pp2.a.y0(nVar, s8Var.D6());
        pp2.a.T(nVar, new s3((z0) s8Var.f114255d.D0.get()));
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f68709v0) {
            return null;
        }
        S8();
        return this.f68708u0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
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
        ye2.m mVar = this.f68708u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
