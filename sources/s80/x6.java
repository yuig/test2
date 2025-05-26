package s80;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;

/* loaded from: classes.dex */
public abstract class x6 extends nl1.d implements af2.c {
    public ye2.m X;
    public boolean Y;
    public volatile ye2.h Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Object f111849a0 = new Object();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f111850b0 = false;

    @Override // af2.c
    /* renamed from: V7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.Z == null) {
            synchronized (this.f111849a0) {
                try {
                    if (this.Z == null) {
                        this.Z = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.Z;
    }

    public final void W7() {
        if (this.X == null) {
            this.X = new ye2.m(super.getContext(), this);
            this.Y = ue.c.x(super.getContext());
        }
    }

    public final void X7() {
        if (this.f111850b0) {
            return;
        }
        this.f111850b0 = true;
        e2 e2Var = (e2) this;
        x8 x8Var = (x8) ((f2) generatedComponent());
        oa oaVar = x8Var.f114707a;
        e2Var.f91283h = oaVar.Ec;
        e2Var.f91284i = (x02.x2) oaVar.f113800m3.get();
        e2Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        e2Var.f91286k = r70.b.f106349i.k0();
        e2Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        e2Var.f91288m = (bz.i) oaVar.C9.get();
        e2Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        e2Var.f91290o = (ac2.m) oaVar.C7.get();
        e2Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        e2Var.f91292q = (ku1.a) s8Var.f114402n.get();
        e2Var.f91293r = s8Var.u6();
        e2Var.f91294s = (ff0.f) s8Var.f114417o.get();
        e2Var.f91295t = oaVar.T2();
        e2Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        e2Var.f91297v = (b60.b) oaVar.f113850p0.get();
        e2Var.f91298w = (m60.w) oaVar.f113885r0.get();
        e2Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        e2Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        e2Var.f91301z = (a80.a) oaVar.Wc.get();
        e2Var.A = (z70.f) oaVar.f113764k2.get();
        kotlin.jvm.internal.r.H(e2Var, (n72.b) oaVar.f113881qd.get());
        kotlin.jvm.internal.r.J(e2Var, oaVar.a3());
        kotlin.jvm.internal.r.V(e2Var, oaVar.A2());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.Y) {
            return null;
        }
        W7();
        return this.X;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        W7();
        X7();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.X;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W7();
        X7();
    }
}
