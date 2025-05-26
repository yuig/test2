package zv0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import hs1.q;
import kh2.j1;
import lh0.s1;
import m60.w;
import nx.d1;
import nx.f0;
import so.n;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import ye2.m;
import yq0.a0;
import yq0.b0;

/* loaded from: classes.dex */
public abstract class a<D extends a0> extends b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public m f142844u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f142845v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f142846w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f142847x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f142848y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f142846w0 == null) {
            synchronized (this.f142847x0) {
                try {
                    if (this.f142846w0 == null) {
                        this.f142846w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f142846w0;
    }

    public final void S8() {
        if (this.f142844u0 == null) {
            this.f142844u0 = new m(super.getContext(), this);
            this.f142845v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f142848y0) {
            return;
        }
        this.f142848y0 = true;
        j jVar = (j) this;
        x8 x8Var = (x8) ((k) generatedComponent());
        oa oaVar = x8Var.f114707a;
        jVar.f91283h = oaVar.Ec;
        jVar.f91284i = (x2) oaVar.f113800m3.get();
        jVar.f91285j = (f0) oaVar.f113747j2.get();
        jVar.f91286k = r70.b.f106349i.k0();
        jVar.f91287l = (q) oaVar.f113875q7.get();
        jVar.f91288m = (bz.i) oaVar.C9.get();
        jVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        jVar.f91290o = (ac2.m) oaVar.C7.get();
        jVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        jVar.f91292q = (ku1.a) s8Var.f114402n.get();
        jVar.f91293r = s8Var.u6();
        jVar.f91294s = (ff0.f) s8Var.f114417o.get();
        jVar.f91295t = oaVar.T2();
        jVar.f91296u = (d1) oaVar.f113730i2.get();
        jVar.f91297v = (b60.b) oaVar.f113850p0.get();
        jVar.f91298w = (w) oaVar.f113885r0.get();
        jVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        jVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        jVar.f91301z = (a80.a) oaVar.Wc.get();
        jVar.A = (z70.f) oaVar.f113764k2.get();
        j1.R0(jVar, (n) s8Var.A5.get());
        j1.B0(jVar, (s1) oaVar.f113718h8.get());
        j1.F0(jVar, (ag1.h) oaVar.K8.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f142845v0) {
            return null;
        }
        S8();
        return this.f142844u0;
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
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f142844u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
