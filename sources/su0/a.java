package su0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import m60.w;
import nx.d1;
import nx.f0;
import so.c8;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a extends fu0.d implements af2.c {

    /* renamed from: w0, reason: collision with root package name */
    public ye2.m f115178w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f115179x0;

    /* renamed from: y0, reason: collision with root package name */
    public volatile ye2.h f115180y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Object f115181z0 = new Object();
    public boolean A0 = false;

    @Override // af2.c
    /* renamed from: a8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f115180y0 == null) {
            synchronized (this.f115181z0) {
                try {
                    if (this.f115180y0 == null) {
                        this.f115180y0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f115180y0;
    }

    public final void b8() {
        if (this.f115178w0 == null) {
            this.f115178w0 = new ye2.m(super.getContext(), this);
            this.f115179x0 = ue.c.x(super.getContext());
        }
    }

    public final void c8() {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        i iVar = (i) this;
        x8 x8Var = (x8) ((j) generatedComponent());
        oa oaVar = x8Var.f114707a;
        iVar.f91283h = oaVar.Ec;
        iVar.f91284i = (x2) oaVar.f113800m3.get();
        iVar.f91285j = (f0) oaVar.f113747j2.get();
        iVar.f91286k = r70.b.f106349i.k0();
        iVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        iVar.f91288m = (bz.i) oaVar.C9.get();
        iVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        iVar.f91290o = (ac2.m) oaVar.C7.get();
        iVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        iVar.f91292q = (ku1.a) s8Var.f114402n.get();
        iVar.f91293r = s8Var.u6();
        iVar.f91294s = (ff0.f) s8Var.f114417o.get();
        iVar.f91295t = oaVar.T2();
        iVar.f91296u = (d1) oaVar.f113730i2.get();
        iVar.f91297v = (b60.b) oaVar.f113850p0.get();
        iVar.f91298w = (w) oaVar.f113885r0.get();
        iVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        iVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        iVar.f91301z = (a80.a) oaVar.Wc.get();
        iVar.A = (z70.f) oaVar.f113764k2.get();
        dn.c.T(iVar, (uk1.e) oaVar.f113702ga.get());
        kh2.r.H0(iVar, (c8) s8Var.I4.get());
        kh2.r.s0(iVar, (ag1.h) oaVar.K8.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f115179x0) {
            return null;
        }
        b8();
        return this.f115178w0;
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
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f115178w0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b8();
        c8();
    }
}
