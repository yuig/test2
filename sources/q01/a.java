package q01;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import kh2.m0;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import yq0.a0;

/* loaded from: classes.dex */
public abstract class a<D extends yq0.a0> extends yq0.b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f101766u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f101767v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f101768w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f101769x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f101770y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f101768w0 == null) {
            synchronized (this.f101769x0) {
                try {
                    if (this.f101768w0 == null) {
                        this.f101768w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f101768w0;
    }

    public final void S8() {
        if (this.f101766u0 == null) {
            this.f101766u0 = new ye2.m(super.getContext(), this);
            this.f101767v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f101770y0) {
            return;
        }
        this.f101770y0 = true;
        p pVar = (p) this;
        x8 x8Var = (x8) ((q) generatedComponent());
        oa oaVar = x8Var.f114707a;
        pVar.f91283h = oaVar.Ec;
        pVar.f91284i = (x2) oaVar.f113800m3.get();
        pVar.f91285j = (f0) oaVar.f113747j2.get();
        pVar.f91286k = r70.b.f106349i.k0();
        pVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        pVar.f91288m = (bz.i) oaVar.C9.get();
        pVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        pVar.f91290o = (ac2.m) oaVar.C7.get();
        pVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        pVar.f91292q = (ku1.a) s8Var.f114402n.get();
        pVar.f91293r = s8Var.u6();
        pVar.f91294s = (ff0.f) s8Var.f114417o.get();
        pVar.f91295t = oaVar.T2();
        pVar.f91296u = (d1) oaVar.f113730i2.get();
        pVar.f91297v = (b60.b) oaVar.f113850p0.get();
        pVar.f91298w = (m60.w) oaVar.f113885r0.get();
        pVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        pVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        pVar.f91301z = (a80.a) oaVar.Wc.get();
        pVar.A = (z70.f) oaVar.f113764k2.get();
        m0.j0(pVar, (uk1.e) oaVar.f113702ga.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f101767v0) {
            return null;
        }
        S8();
        return this.f101766u0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        ye2.m mVar = this.f101766u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
