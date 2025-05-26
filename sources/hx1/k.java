package hx1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import hs1.q;
import kh2.j1;
import m60.w;
import nx.d1;
import nx.f0;
import so.c1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import ye2.m;

/* loaded from: classes2.dex */
public abstract class k extends yk1.k implements af2.c {

    /* renamed from: e0, reason: collision with root package name */
    public m f70553e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f70554f0;

    /* renamed from: g0, reason: collision with root package name */
    public volatile ye2.h f70555g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Object f70556h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public boolean f70557i0 = false;

    @Override // af2.c
    /* renamed from: Y7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f70555g0 == null) {
            synchronized (this.f70556h0) {
                try {
                    if (this.f70555g0 == null) {
                        this.f70555g0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f70555g0;
    }

    public final void Z7() {
        if (this.f70553e0 == null) {
            this.f70553e0 = new m(super.getContext(), this);
            this.f70554f0 = ue.c.x(super.getContext());
        }
    }

    public final void a8() {
        if (this.f70557i0) {
            return;
        }
        this.f70557i0 = true;
        f fVar = (f) this;
        x8 x8Var = (x8) ((g) generatedComponent());
        oa oaVar = x8Var.f114707a;
        fVar.f91283h = oaVar.Ec;
        fVar.f91284i = (x2) oaVar.f113800m3.get();
        fVar.f91285j = (f0) oaVar.f113747j2.get();
        fVar.f91286k = r70.b.f106349i.k0();
        fVar.f91287l = (q) oaVar.f113875q7.get();
        fVar.f91288m = (bz.i) oaVar.C9.get();
        fVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        fVar.f91290o = (ac2.m) oaVar.C7.get();
        fVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        fVar.f91292q = (ku1.a) s8Var.f114402n.get();
        fVar.f91293r = s8Var.u6();
        fVar.f91294s = (ff0.f) s8Var.f114417o.get();
        fVar.f91295t = oaVar.T2();
        fVar.f91296u = (d1) oaVar.f113730i2.get();
        fVar.f91297v = (b60.b) oaVar.f113850p0.get();
        fVar.f91298w = (w) oaVar.f113885r0.get();
        fVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        fVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        fVar.f91301z = (a80.a) oaVar.Wc.get();
        fVar.A = (z70.f) oaVar.f113764k2.get();
        kh2.w.c0(fVar, (uk1.e) oaVar.f113702ga.get());
        kh2.w.a0(fVar, (c1) s8Var.f114529v7.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f70554f0) {
            return null;
        }
        Z7();
        return this.f70553e0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Z7();
        a8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f70553e0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
