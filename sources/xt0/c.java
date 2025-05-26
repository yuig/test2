package xt0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import bz.i;
import hs1.q;
import kh2.j1;
import kh2.k3;
import m60.w;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import so.y7;
import x02.x2;
import ye2.m;

/* loaded from: classes.dex */
public abstract class c extends fu0.d implements af2.c {

    /* renamed from: w0, reason: collision with root package name */
    public m f135903w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f135904x0;

    /* renamed from: y0, reason: collision with root package name */
    public volatile ye2.h f135905y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Object f135906z0 = new Object();
    public boolean A0 = false;

    @Override // af2.c
    /* renamed from: a8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f135905y0 == null) {
            synchronized (this.f135906z0) {
                try {
                    if (this.f135905y0 == null) {
                        this.f135905y0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f135905y0;
    }

    public final void b8() {
        if (this.f135903w0 == null) {
            this.f135903w0 = new m(super.getContext(), this);
            this.f135904x0 = ue.c.x(super.getContext());
        }
    }

    public final void c8() {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        g gVar = (g) this;
        x8 x8Var = (x8) ((h) generatedComponent());
        oa oaVar = x8Var.f114707a;
        gVar.f91283h = oaVar.Ec;
        gVar.f91284i = (x2) oaVar.f113800m3.get();
        gVar.f91285j = (f0) oaVar.f113747j2.get();
        gVar.f91286k = r70.b.f106349i.k0();
        gVar.f91287l = (q) oaVar.f113875q7.get();
        gVar.f91288m = (i) oaVar.C9.get();
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
        gVar.f91298w = (w) oaVar.f113885r0.get();
        gVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        gVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        gVar.f91301z = (a80.a) oaVar.Wc.get();
        gVar.A = (z70.f) oaVar.f113764k2.get();
        dn.c.T(gVar, (uk1.e) oaVar.f113702ga.get());
        k3.Z0(gVar, (y7) s8Var.A4.get());
        k3.K0(gVar, (ag1.h) oaVar.K8.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f135904x0) {
            return null;
        }
        b8();
        return this.f135903w0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        b8();
        c8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f135903w0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b8();
        c8();
    }
}
