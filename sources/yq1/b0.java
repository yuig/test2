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
public abstract class b0 extends yk1.k implements af2.c {

    /* renamed from: e0, reason: collision with root package name */
    public ye2.m f139777e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f139778f0;

    /* renamed from: g0, reason: collision with root package name */
    public volatile ye2.h f139779g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Object f139780h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public boolean f139781i0 = false;

    @Override // af2.c
    /* renamed from: Y7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f139779g0 == null) {
            synchronized (this.f139780h0) {
                try {
                    if (this.f139779g0 == null) {
                        this.f139779g0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f139779g0;
    }

    public final void Z7() {
        if (this.f139777e0 == null) {
            this.f139777e0 = new ye2.m(super.getContext(), this);
            this.f139778f0 = ue.c.x(super.getContext());
        }
    }

    public final void a8() {
        if (this.f139781i0) {
            return;
        }
        this.f139781i0 = true;
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
        kVar.f91296u = (nx.d1) oaVar.f113730i2.get();
        kVar.f91297v = (b60.b) oaVar.f113850p0.get();
        kVar.f91298w = (m60.w) oaVar.f113885r0.get();
        kVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        kVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        kVar.f91301z = (a80.a) oaVar.Wc.get();
        kVar.A = (z70.f) oaVar.f113764k2.get();
        kVar.f139876j0 = (uk1.e) oaVar.f113702ga.get();
        kVar.f139877k0 = oaVar.a2();
        kVar.f139878l0 = (m60.e) oaVar.f113920t0.get();
        kVar.f139879m0 = (dy.a) oaVar.f113943u5.get();
        kVar.f139880n0 = new b20.c((gz1.b) s8Var.f114255d.C1.get());
        kVar.f139881o0 = (mr1.a) oaVar.B6.get();
        kVar.f139882p0 = (il1.a) s8Var.f114581z.get();
        kVar.f139883q0 = s8Var.Y5;
        kVar.f139884r0 = s8Var.Z5;
        kVar.f139885s0 = s8Var.f114261d6;
        kVar.f139886t0 = (vy.m) oaVar.M1.get();
        kVar.f139887u0 = s8Var.b5();
        kVar.f139888v0 = s8Var.M5();
        kVar.f139889w0 = (cr1.b) oaVar.Z5.get();
        kVar.f139890x0 = s8Var.K6();
        kVar.f139891y0 = (so.d0) s8Var.f114276e6.get();
        kVar.f139892z0 = (lb0.q) oaVar.O0.get();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f139778f0) {
            return null;
        }
        Z7();
        return this.f139777e0;
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
        ye2.m mVar = this.f139777e0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
