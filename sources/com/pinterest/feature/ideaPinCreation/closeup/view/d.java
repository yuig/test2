package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import kh2.n3;
import so.oa;
import so.s8;
import so.x8;
import so.z7;
import yq0.a0;

/* loaded from: classes.dex */
public abstract class d<D extends yq0.a0> extends yq0.b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f46119u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f46120v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f46121w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f46122x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f46123y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f46121w0 == null) {
            synchronized (this.f46122x0) {
                try {
                    if (this.f46121w0 == null) {
                        this.f46121w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f46121w0;
    }

    public final void S8() {
        if (this.f46119u0 == null) {
            this.f46119u0 = new ye2.m(super.getContext(), this);
            this.f46120v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f46123y0) {
            return;
        }
        this.f46123y0 = true;
        q qVar = (q) this;
        x8 x8Var = (x8) ((r) generatedComponent());
        oa oaVar = x8Var.f114707a;
        qVar.f91283h = oaVar.Ec;
        qVar.f91284i = (x02.x2) oaVar.f113800m3.get();
        qVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        qVar.f91286k = r70.b.f106349i.k0();
        qVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        qVar.f91288m = (bz.i) oaVar.C9.get();
        qVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        qVar.f91290o = (ac2.m) oaVar.C7.get();
        qVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        qVar.f91292q = (ku1.a) s8Var.f114402n.get();
        qVar.f91293r = s8Var.u6();
        qVar.f91294s = (ff0.f) s8Var.f114417o.get();
        qVar.f91295t = oaVar.T2();
        qVar.f91296u = (nx.d1) oaVar.f113730i2.get();
        qVar.f91297v = (b60.b) oaVar.f113850p0.get();
        qVar.f91298w = (m60.w) oaVar.f113885r0.get();
        qVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        qVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        qVar.f91301z = (a80.a) oaVar.Wc.get();
        qVar.A = (z70.f) oaVar.f113764k2.get();
        n3.Q(qVar, (z7) s8Var.C4.get());
        n3.a0(qVar, (nx.f0) oaVar.f113747j2.get());
        n3.b0(qVar, oaVar.f113997x5);
        n3.I(qVar, (zf0.f) oaVar.f113723hd.get());
        n3.c0(qVar, (i92.k) oaVar.f113921t1.get());
        n3.U(qVar, (ag1.h) oaVar.K8.get());
        n3.F(qVar, s8Var.e5());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f46120v0) {
            return null;
        }
        S8();
        return this.f46119u0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        ye2.m mVar = this.f46119u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
