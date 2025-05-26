package ys0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import m60.w;
import nx.d1;
import nx.f0;
import o82.i3;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a extends i3 implements af2.c {
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
        h hVar = (h) this;
        x8 x8Var = (x8) ((i) generatedComponent());
        oa oaVar = x8Var.f114707a;
        hVar.f91283h = oaVar.Ec;
        hVar.f91284i = (x2) oaVar.f113800m3.get();
        hVar.f91285j = (f0) oaVar.f113747j2.get();
        hVar.f91286k = r70.b.f106349i.k0();
        hVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        hVar.f91288m = (bz.i) oaVar.C9.get();
        hVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        hVar.f91290o = (ac2.m) oaVar.C7.get();
        hVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        hVar.f91292q = (ku1.a) s8Var.f114402n.get();
        hVar.f91293r = s8Var.u6();
        hVar.f91294s = (ff0.f) s8Var.f114417o.get();
        hVar.f91295t = oaVar.T2();
        hVar.f91296u = (d1) oaVar.f113730i2.get();
        hVar.f91297v = (b60.b) oaVar.f113850p0.get();
        hVar.f91298w = (w) oaVar.f113885r0.get();
        hVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        hVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        hVar.f91301z = (a80.a) oaVar.Wc.get();
        hVar.A = (z70.f) oaVar.f113764k2.get();
        kh2.w.W(hVar, new m60.f0());
        kh2.w.Z(hVar, (c6) s8Var.f114447q.get());
        f0.h.W(hVar, s8Var.H5());
        f0.h.Z(hVar, s8Var.r6());
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
