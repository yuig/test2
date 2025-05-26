package q91;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class e0 extends nl1.d implements af2.c {
    public ye2.m X;
    public boolean Y;
    public volatile ye2.h Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Object f103094a0 = new Object();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f103095b0 = false;

    @Override // af2.c
    /* renamed from: V7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.Z == null) {
            synchronized (this.f103094a0) {
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
        if (this.f103095b0) {
            return;
        }
        this.f103095b0 = true;
        a1 a1Var = (a1) this;
        x8 x8Var = (x8) ((b1) generatedComponent());
        oa oaVar = x8Var.f114707a;
        a1Var.f91283h = oaVar.Ec;
        a1Var.f91284i = (x2) oaVar.f113800m3.get();
        a1Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        a1Var.f91286k = r70.b.f106349i.k0();
        a1Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        a1Var.f91288m = (bz.i) oaVar.C9.get();
        a1Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        a1Var.f91290o = (ac2.m) oaVar.C7.get();
        a1Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        a1Var.f91292q = (ku1.a) s8Var.f114402n.get();
        a1Var.f91293r = s8Var.u6();
        a1Var.f91294s = (ff0.f) s8Var.f114417o.get();
        a1Var.f91295t = oaVar.T2();
        a1Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        a1Var.f91297v = (b60.b) oaVar.f113850p0.get();
        a1Var.f91298w = (m60.w) oaVar.f113885r0.get();
        a1Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        a1Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        a1Var.f91301z = (a80.a) oaVar.Wc.get();
        a1Var.A = (z70.f) oaVar.f113764k2.get();
        kg.a.M(a1Var, s8Var.C6());
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
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
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
