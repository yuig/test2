package com.pinterest.feature.unauth.sba;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import nx.d1;
import o82.i3;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class b extends i3 implements af2.c {
    public ye2.m A0;
    public boolean B0;
    public volatile ye2.h C0;
    public final Object D0 = new Object();
    public boolean E0 = false;

    @Override // af2.c
    /* renamed from: Y8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.C0 == null) {
            synchronized (this.D0) {
                try {
                    if (this.C0 == null) {
                        this.C0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.C0;
    }

    public final void Z8() {
        if (this.A0 == null) {
            this.A0 = new ye2.m(super.getContext(), this);
            this.B0 = ue.c.x(super.getContext());
        }
    }

    public final void a9() {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        w wVar = (w) this;
        x8 x8Var = (x8) ((x) generatedComponent());
        oa oaVar = x8Var.f114707a;
        wVar.f91283h = oaVar.Ec;
        wVar.f91284i = (x2) oaVar.f113800m3.get();
        wVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        wVar.f91286k = r70.b.f106349i.k0();
        wVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        wVar.f91288m = (bz.i) oaVar.C9.get();
        wVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        wVar.f91290o = (ac2.m) oaVar.C7.get();
        wVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        wVar.f91292q = (ku1.a) s8Var.f114402n.get();
        wVar.f91293r = s8Var.u6();
        wVar.f91294s = (ff0.f) s8Var.f114417o.get();
        wVar.f91295t = oaVar.T2();
        wVar.f91296u = (d1) oaVar.f113730i2.get();
        wVar.f91297v = (b60.b) oaVar.f113850p0.get();
        wVar.f91298w = (m60.w) oaVar.f113885r0.get();
        wVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        wVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        wVar.f91301z = (a80.a) oaVar.Wc.get();
        wVar.A = (z70.f) oaVar.f113764k2.get();
        kh2.w.W(wVar, new m60.f0());
        kh2.w.Z(wVar, (c6) s8Var.f114447q.get());
        pp2.a.V(wVar, (il1.a) s8Var.f114581z.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.B0) {
            return null;
        }
        Z8();
        return this.A0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Z8();
        a9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.A0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z8();
        a9();
    }
}
