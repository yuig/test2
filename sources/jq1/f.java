package jq1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import h32.a4;
import h32.g0;
import hs1.q;
import kh2.j1;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.p;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class f extends jd1.d implements af2.c {

    /* renamed from: c1, reason: collision with root package name */
    public ye2.m f77477c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f77478d1;

    /* renamed from: e1, reason: collision with root package name */
    public volatile ye2.h f77479e1;

    /* renamed from: f1, reason: collision with root package name */
    public final Object f77480f1 = new Object();

    /* renamed from: g1, reason: collision with root package name */
    public boolean f77481g1 = false;

    public final void A9() {
        if (this.f77477c1 == null) {
            this.f77477c1 = new ye2.m(super.getContext(), this);
            this.f77478d1 = ue.c.x(super.getContext());
        }
    }

    public final void B9() {
        if (this.f77481g1) {
            return;
        }
        this.f77481g1 = true;
        n nVar = (n) this;
        x8 x8Var = (x8) ((o) generatedComponent());
        oa oaVar = x8Var.f114707a;
        nVar.f91283h = oaVar.Ec;
        nVar.f91284i = (x2) oaVar.f113800m3.get();
        nVar.f91285j = (f0) oaVar.f113747j2.get();
        nVar.f91286k = r70.b.f106349i.k0();
        nVar.f91287l = (q) oaVar.f113875q7.get();
        nVar.f91288m = (bz.i) oaVar.C9.get();
        nVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        nVar.f91290o = (ac2.m) oaVar.C7.get();
        nVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        nVar.f91292q = (ku1.a) s8Var.f114402n.get();
        nVar.f91293r = s8Var.u6();
        nVar.f91294s = (ff0.f) s8Var.f114417o.get();
        nVar.f91295t = oaVar.T2();
        nVar.f91296u = (d1) oaVar.f113730i2.get();
        nVar.f91297v = (b60.b) oaVar.f113850p0.get();
        nVar.f91298w = (w) oaVar.f113885r0.get();
        nVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        nVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        nVar.f91301z = (a80.a) oaVar.Wc.get();
        nVar.A = (z70.f) oaVar.f113764k2.get();
        nVar.f114986u0 = oaVar.v2();
        nVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        nVar.f114988w0 = s8Var.X5();
        nVar.f114989x0 = s8Var.h6();
        nVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(nVar);
        ig1.b.x0(nVar, (jd1.e) s8Var.f114465r2.get());
        ve.h.H(nVar, (hf0.c) oaVar.f113717h7.get());
        ve.h.F(nVar);
        m60.f0 f0Var = vb0.j.f125466a;
        dl2.b.I(f0Var);
        ve.h.G(nVar, f0Var);
        ve.h.K(nVar, (p) s8Var.E5.get());
        ve.h.J(nVar, s8Var.J5());
        ve.h.I(nVar, (so.q) s8Var.F5.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f77478d1) {
            return null;
        }
        A9();
        return this.f77477c1;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // jd1.d
    public g0 k9() {
        return getF73409e1();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        A9();
        B9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // jd1.d
    public a4 x9() {
        return getF140468f0();
    }

    @Override // af2.c
    /* renamed from: z9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f77479e1 == null) {
            synchronized (this.f77480f1) {
                try {
                    if (this.f77479e1 == null) {
                        this.f77479e1 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f77479e1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f77477c1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A9();
        B9();
    }
}
