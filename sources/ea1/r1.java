package ea1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class r1 extends nl1.d implements af2.c {
    public ye2.m X;
    public boolean Y;
    public volatile ye2.h Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Object f58128a0 = new Object();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f58129b0 = false;

    @Override // af2.c
    /* renamed from: V7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.Z == null) {
            synchronized (this.f58128a0) {
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
        if (this.f58129b0) {
            return;
        }
        this.f58129b0 = true;
        v0 v0Var = (v0) this;
        x8 x8Var = (x8) ((w0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        v0Var.f91283h = oaVar.Ec;
        v0Var.f91284i = (x2) oaVar.f113800m3.get();
        v0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        v0Var.f91286k = r70.b.f106349i.k0();
        v0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        v0Var.f91288m = (bz.i) oaVar.C9.get();
        v0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        v0Var.f91290o = (ac2.m) oaVar.C7.get();
        v0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        v0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        v0Var.f91293r = s8Var.u6();
        v0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        v0Var.f91295t = oaVar.T2();
        v0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        v0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        v0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        v0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        v0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        v0Var.f91301z = (a80.a) oaVar.Wc.get();
        v0Var.A = (z70.f) oaVar.f113764k2.get();
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
