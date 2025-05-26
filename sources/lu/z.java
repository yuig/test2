package lu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.g3;
import kh2.j1;
import kh2.p2;
import kh2.u2;
import nx.d1;
import so.oa;
import so.s8;
import so.u7;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class z extends fu.h implements af2.c {
    public ye2.m M0;
    public boolean N0;
    public volatile ye2.h O0;
    public final Object P0 = new Object();
    public boolean Q0 = false;

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.N0) {
            return null;
        }
        s8();
        return this.M0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // cu.m, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        s8();
        t8();
    }

    @Override // cu.m, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // af2.c
    /* renamed from: r8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.O0 == null) {
            synchronized (this.P0) {
                try {
                    if (this.O0 == null) {
                        this.O0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.O0;
    }

    public final void s8() {
        if (this.M0 == null) {
            this.M0 = new ye2.m(super.getContext(), this);
            this.N0 = ue.c.x(super.getContext());
        }
    }

    public final void t8() {
        if (this.Q0) {
            return;
        }
        this.Q0 = true;
        k kVar = (k) this;
        x8 x8Var = (x8) ((l) generatedComponent());
        oa oaVar = x8Var.f114707a;
        kVar.f91283h = oaVar.Ec;
        kVar.f91284i = (x2) oaVar.f113800m3.get();
        kVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        kVar.f91286k = r70.b.f106349i.k0();
        kVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        kVar.f91288m = (bz.i) oaVar.C9.get();
        kVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        kVar.f91290o = (ac2.m) oaVar.C7.get();
        kVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        kVar.f91292q = (ku1.a) s8Var.f114402n.get();
        kVar.f91293r = s8Var.u6();
        kVar.f91294s = (ff0.f) s8Var.f114417o.get();
        kVar.f91295t = oaVar.T2();
        kVar.f91296u = (d1) oaVar.f113730i2.get();
        kVar.f91297v = (b60.b) oaVar.f113850p0.get();
        kVar.f91298w = (m60.w) oaVar.f113885r0.get();
        kVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        kVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        kVar.f91301z = (a80.a) oaVar.Wc.get();
        kVar.A = (z70.f) oaVar.f113764k2.get();
        p2.r0(kVar, (jo1.c) oaVar.f113810md.get());
        p2.D0(kVar, oaVar.w2());
        u2.g0(kVar, (u7) s8Var.O.get());
        u2.l0(kVar, (z70.m) s8Var.f114387m.get());
        u2.m0(kVar, (a11.d) oaVar.f113668ec.get());
        u2.o0(kVar, (ni1.d) s8Var.f114551x.get());
        u2.p0(kVar, oaVar.p2());
        u2.B0(kVar, (nx.d0) oaVar.f113817n2.get());
        g3.G0(kVar, (so.l) s8Var.V.get());
        g3.z0(kVar, (es.a) oaVar.P6.get());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.M0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s8();
        t8();
    }
}
