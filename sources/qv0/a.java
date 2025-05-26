package qv0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import yq0.a0;

/* loaded from: classes.dex */
public abstract class a<D extends yq0.a0> extends yq0.b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f105147u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f105148v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f105149w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f105150x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f105151y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f105149w0 == null) {
            synchronized (this.f105150x0) {
                try {
                    if (this.f105149w0 == null) {
                        this.f105149w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f105149w0;
    }

    public final void S8() {
        if (this.f105147u0 == null) {
            this.f105147u0 = new ye2.m(super.getContext(), this);
            this.f105148v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f105151y0) {
            return;
        }
        this.f105151y0 = true;
        g gVar = (g) this;
        x8 x8Var = (x8) ((h) generatedComponent());
        oa oaVar = x8Var.f114707a;
        gVar.f91283h = oaVar.Ec;
        gVar.f91284i = (x2) oaVar.f113800m3.get();
        gVar.f91285j = (f0) oaVar.f113747j2.get();
        gVar.f91286k = r70.b.f106349i.k0();
        gVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        gVar.f91288m = (bz.i) oaVar.C9.get();
        gVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        gVar.f91290o = (ac2.m) oaVar.C7.get();
        gVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        gVar.f91292q = (ku1.a) s8Var.f114402n.get();
        gVar.f91293r = s8Var.u6();
        gVar.f91294s = (ff0.f) s8Var.f114417o.get();
        gVar.f91295t = oaVar.T2();
        gVar.f91296u = (d1) oaVar.f113730i2.get();
        gVar.f91297v = (b60.b) oaVar.f113850p0.get();
        gVar.f91298w = (m60.w) oaVar.f113885r0.get();
        gVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        gVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        gVar.f91301z = (a80.a) oaVar.Wc.get();
        gVar.A = (z70.f) oaVar.f113764k2.get();
        kg.t.v0(gVar, (so.k) s8Var.f114512u5.get());
        kg.t.C0(gVar, oaVar.f113997x5);
        kg.t.i0(gVar, (ag1.h) oaVar.K8.get());
        kg.t.h0(gVar, (zp.j) s8Var.U2.get());
        kg.t.a0(gVar, (ag1.b) oaVar.Z7.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f105148v0) {
            return null;
        }
        S8();
        return this.f105147u0;
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
        ye2.m mVar = this.f105147u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
