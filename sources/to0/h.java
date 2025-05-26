package to0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import com.pinterest.feature.browser.view.InAppBrowserFragment;
import kh2.j1;
import nx.d1;
import nx.f0;
import ro0.e;
import so.l0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class h<T extends ro0.e> extends g<T> implements af2.c {
    public ye2.m H0;
    public boolean I0;
    public volatile ye2.h J0;
    public final Object K0 = new Object();
    public boolean L0 = false;

    @Override // af2.c
    /* renamed from: f8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.J0 == null) {
            synchronized (this.K0) {
                try {
                    if (this.J0 == null) {
                        this.J0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.J0;
    }

    public final void g8() {
        if (this.H0 == null) {
            this.H0 = new ye2.m(super.getContext(), this);
            this.I0 = ue.c.x(super.getContext());
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.I0) {
            return null;
        }
        g8();
        return this.H0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    public void h8() {
        if (this.L0) {
            return;
        }
        this.L0 = true;
        InAppBrowserFragment inAppBrowserFragment = (InAppBrowserFragment) this;
        x8 x8Var = (x8) ((n) generatedComponent());
        oa oaVar = x8Var.f114707a;
        inAppBrowserFragment.f91283h = oaVar.Ec;
        inAppBrowserFragment.f91284i = (x2) oaVar.f113800m3.get();
        inAppBrowserFragment.f91285j = (f0) oaVar.f113747j2.get();
        inAppBrowserFragment.f91286k = r70.b.f106349i.k0();
        inAppBrowserFragment.f91287l = (hs1.q) oaVar.f113875q7.get();
        inAppBrowserFragment.f91288m = (bz.i) oaVar.C9.get();
        inAppBrowserFragment.f91289n = (lu1.d) oaVar.f113782l2.get();
        inAppBrowserFragment.f91290o = (ac2.m) oaVar.C7.get();
        inAppBrowserFragment.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        inAppBrowserFragment.f91292q = (ku1.a) s8Var.f114402n.get();
        inAppBrowserFragment.f91293r = s8Var.u6();
        inAppBrowserFragment.f91294s = (ff0.f) s8Var.f114417o.get();
        inAppBrowserFragment.f91295t = oaVar.T2();
        inAppBrowserFragment.f91296u = (d1) oaVar.f113730i2.get();
        inAppBrowserFragment.f91297v = (b60.b) oaVar.f113850p0.get();
        inAppBrowserFragment.f91298w = (m60.w) oaVar.f113885r0.get();
        inAppBrowserFragment.f91299x = (tb0.h) oaVar.f113797m0.get();
        inAppBrowserFragment.f91300y = (uj2.q) oaVar.f113947u9.get();
        inAppBrowserFragment.f91301z = (a80.a) oaVar.Wc.get();
        inAppBrowserFragment.A = (z70.f) oaVar.f113764k2.get();
        el.a.d0(inAppBrowserFragment, (lu1.b) oaVar.f113961v5.get());
        el.a.e2(inAppBrowserFragment, (d1) oaVar.f113730i2.get());
        el.a.a2(inAppBrowserFragment, (lu1.d) oaVar.f113782l2.get());
        el.a.X0(inAppBrowserFragment, (so.v) s8Var.L5.get());
        el.a.H0(inAppBrowserFragment, (m60.w) oaVar.f113885r0.get());
        el.a.Z1(inAppBrowserFragment, s8Var.O6());
        el.a.S1(inAppBrowserFragment);
        el.a.n0(inAppBrowserFragment, s8Var.f114387m);
        el.a.d2(inAppBrowserFragment, (a80.a) oaVar.Wc.get());
        el.a.A1(inAppBrowserFragment, (lb0.q) oaVar.O0.get());
        s8Var.N5();
        el.a.N0(inAppBrowserFragment);
        el.a.b2(inAppBrowserFragment, (f30.b) oaVar.V1.get());
        el.a.c2(inAppBrowserFragment, s8Var.r5());
        el.a.L1(inAppBrowserFragment, s8Var.D6());
        kh2.n.O(inAppBrowserFragment, (f0) oaVar.f113747j2.get());
        kh2.n.P(inAppBrowserFragment, (l0) s8Var.A6.get());
        kh2.n.C(inAppBrowserFragment, (ad0.b) s8Var.B6.get());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        g8();
        h8();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.H0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g8();
        h8();
    }
}
