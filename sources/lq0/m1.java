package lq0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.d7;
import so.e7;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;
import yq0.a0;

/* loaded from: classes.dex */
public abstract class m1<D extends yq0.a0> extends yq0.b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f84363u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f84364v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f84365w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f84366x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f84367y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f84365w0 == null) {
            synchronized (this.f84366x0) {
                try {
                    if (this.f84365w0 == null) {
                        this.f84365w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f84365w0;
    }

    public final void S8() {
        if (this.f84363u0 == null) {
            this.f84363u0 = new ye2.m(super.getContext(), this);
            this.f84364v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f84367y0) {
            return;
        }
        this.f84367y0 = true;
        o0 o0Var = (o0) this;
        x8 x8Var = (x8) ((p0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        o0Var.f91283h = oaVar.Ec;
        o0Var.f91284i = (x2) oaVar.f113800m3.get();
        o0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        o0Var.f91286k = r70.b.f106349i.k0();
        o0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        o0Var.f91288m = (bz.i) oaVar.C9.get();
        o0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        o0Var.f91290o = (ac2.m) oaVar.C7.get();
        o0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        o0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        o0Var.f91293r = s8Var.u6();
        o0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        o0Var.f91295t = oaVar.T2();
        o0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        o0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        o0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        o0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        o0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        o0Var.f91301z = (a80.a) oaVar.Wc.get();
        o0Var.A = (z70.f) oaVar.f113764k2.get();
        kh2.r.E0(o0Var, (i2) oaVar.F3.get());
        kh2.r.v0(o0Var, (yk1.j) oaVar.Qc.get());
        kh2.r.f0(o0Var, (d7) s8Var.f114436p3.get());
        kh2.r.U0(o0Var, (e7) s8Var.f114451q3.get());
        kh2.r.g0(o0Var, (q12.b) oaVar.f113750j5.get());
        s8Var.q5();
        kh2.r.d0(o0Var);
        kh2.r.x0(o0Var, s8Var.A5());
        kh2.r.c0(o0Var, s8Var.C5());
        kh2.r.U(o0Var, (e12.d) oaVar.V3.get());
        kh2.r.F0(o0Var, (lb0.q) oaVar.O0.get());
        kh2.r.m0(o0Var, s8Var.q5());
        kh2.r.r0(o0Var, (cp.a0) oaVar.Ge.get());
        kh2.r.T(o0Var, s8Var.e5());
        kh2.r.e0(o0Var, (r12.a) oaVar.f114024ye.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f84364v0) {
            return null;
        }
        S8();
        return this.f84363u0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        S8();
        T8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f84363u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
