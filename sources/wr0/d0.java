package wr0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import nx.d1;
import nx.f0;
import so.oa;
import so.p7;
import so.s8;
import so.x8;
import x02.x2;
import yq0.a0;

/* loaded from: classes.dex */
public abstract class d0<D extends yq0.a0> extends yq0.b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f130885u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f130886v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f130887w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f130888x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f130889y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f130887w0 == null) {
            synchronized (this.f130888x0) {
                try {
                    if (this.f130887w0 == null) {
                        this.f130887w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f130887w0;
    }

    public final void S8() {
        if (this.f130885u0 == null) {
            this.f130885u0 = new ye2.m(super.getContext(), this);
            this.f130886v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f130889y0) {
            return;
        }
        this.f130889y0 = true;
        s sVar = (s) this;
        x8 x8Var = (x8) ((t) generatedComponent());
        oa oaVar = x8Var.f114707a;
        sVar.f91283h = oaVar.Ec;
        sVar.f91284i = (x2) oaVar.f113800m3.get();
        sVar.f91285j = (f0) oaVar.f113747j2.get();
        sVar.f91286k = r70.b.f106349i.k0();
        sVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        sVar.f91288m = (bz.i) oaVar.C9.get();
        sVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        sVar.f91290o = (ac2.m) oaVar.C7.get();
        sVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        sVar.f91292q = (ku1.a) s8Var.f114402n.get();
        sVar.f91293r = s8Var.u6();
        sVar.f91294s = (ff0.f) s8Var.f114417o.get();
        sVar.f91295t = oaVar.T2();
        sVar.f91296u = (d1) oaVar.f113730i2.get();
        sVar.f91297v = (b60.b) oaVar.f113850p0.get();
        sVar.f91298w = (m60.w) oaVar.f113885r0.get();
        sVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        sVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        sVar.f91301z = (a80.a) oaVar.Wc.get();
        sVar.A = (z70.f) oaVar.f113764k2.get();
        j1.w0(sVar, (p7) s8Var.U3.get());
        j1.W0(sVar, (i92.k) oaVar.f113921t1.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f130886v0) {
            return null;
        }
        S8();
        return this.f130885u0;
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
        ye2.m mVar = this.f130885u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
