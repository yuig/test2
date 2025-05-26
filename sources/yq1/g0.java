package yq1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class g0 extends yk1.k implements af2.c {

    /* renamed from: e0, reason: collision with root package name */
    public ye2.m f139846e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f139847f0;

    /* renamed from: g0, reason: collision with root package name */
    public volatile ye2.h f139848g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Object f139849h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public boolean f139850i0 = false;

    @Override // af2.c
    /* renamed from: Y7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f139848g0 == null) {
            synchronized (this.f139849h0) {
                try {
                    if (this.f139848g0 == null) {
                        this.f139848g0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f139848g0;
    }

    public final void Z7() {
        if (this.f139846e0 == null) {
            this.f139846e0 = new ye2.m(super.getContext(), this);
            this.f139847f0 = ue.c.x(super.getContext());
        }
    }

    public final void a8() {
        if (this.f139850i0) {
            return;
        }
        this.f139850i0 = true;
        y0 y0Var = (y0) this;
        x8 x8Var = (x8) ((z0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        y0Var.f91283h = oaVar.Ec;
        y0Var.f91284i = (x2) oaVar.f113800m3.get();
        y0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        y0Var.f91286k = r70.b.f106349i.k0();
        y0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        y0Var.f91288m = (bz.i) oaVar.C9.get();
        y0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        y0Var.f91290o = (ac2.m) oaVar.C7.get();
        y0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        y0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        y0Var.f91293r = s8Var.u6();
        y0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        y0Var.f91295t = oaVar.T2();
        y0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        y0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        y0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        y0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        y0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        y0Var.f91301z = (a80.a) oaVar.Wc.get();
        y0Var.A = (z70.f) oaVar.f113764k2.get();
        pp2.a.c0(y0Var, (so.f0) s8Var.f114409n6.get());
        pp2.a.J(y0Var, s8Var.b5());
        pp2.a.s0(y0Var, (uk1.e) oaVar.f113702ga.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f139847f0) {
            return null;
        }
        Z7();
        return this.f139846e0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f139846e0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
