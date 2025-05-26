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
public abstract class p0 extends yk1.k implements af2.c {

    /* renamed from: e0, reason: collision with root package name */
    public ye2.m f139936e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f139937f0;

    /* renamed from: g0, reason: collision with root package name */
    public volatile ye2.h f139938g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Object f139939h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public boolean f139940i0 = false;

    @Override // af2.c
    /* renamed from: Y7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f139938g0 == null) {
            synchronized (this.f139939h0) {
                try {
                    if (this.f139938g0 == null) {
                        this.f139938g0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f139938g0;
    }

    public final void Z7() {
        if (this.f139936e0 == null) {
            this.f139936e0 = new ye2.m(super.getContext(), this);
            this.f139937f0 = ue.c.x(super.getContext());
        }
    }

    public void a8() {
        if (this.f139940i0) {
            return;
        }
        this.f139940i0 = true;
        l2 l2Var = (l2) this;
        x8 x8Var = (x8) ((m2) generatedComponent());
        oa oaVar = x8Var.f114707a;
        l2Var.f91283h = oaVar.Ec;
        l2Var.f91284i = (x2) oaVar.f113800m3.get();
        l2Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        l2Var.f91286k = r70.b.f106349i.k0();
        l2Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        l2Var.f91288m = (bz.i) oaVar.C9.get();
        l2Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        l2Var.f91290o = (ac2.m) oaVar.C7.get();
        l2Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        l2Var.f91292q = (ku1.a) s8Var.f114402n.get();
        l2Var.f91293r = s8Var.u6();
        l2Var.f91294s = (ff0.f) s8Var.f114417o.get();
        l2Var.f91295t = oaVar.T2();
        l2Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        l2Var.f91297v = (b60.b) oaVar.f113850p0.get();
        l2Var.f91298w = (m60.w) oaVar.f113885r0.get();
        l2Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        l2Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        l2Var.f91301z = (a80.a) oaVar.Wc.get();
        l2Var.A = (z70.f) oaVar.f113764k2.get();
        kh2.r.I0(l2Var, (so.k0) s8Var.f114483s6.get());
        kh2.r.N0(l2Var, (uk1.e) oaVar.f113702ga.get());
        kh2.r.o0(l2Var, s8Var.M5());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f139937f0) {
            return null;
        }
        Z7();
        return this.f139936e0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Z7();
        a8();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f139936e0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
