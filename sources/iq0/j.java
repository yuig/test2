package iq0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import hs1.q;
import jr.a;
import kh2.j1;
import lh0.n1;
import m60.w;
import nx.d1;
import nx.f0;
import so.a7;
import so.oa;
import so.s8;
import so.x8;
import so.z6;
import x02.x2;
import ye2.m;

/* loaded from: classes.dex */
public abstract class j<T extends jr.a> extends MvpViewPagerFragment<T> implements af2.c {

    /* renamed from: m0, reason: collision with root package name */
    public m f73410m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f73411n0;

    /* renamed from: o0, reason: collision with root package name */
    public volatile ye2.h f73412o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Object f73413p0 = new Object();

    /* renamed from: q0, reason: collision with root package name */
    public boolean f73414q0 = false;

    @Override // af2.c
    /* renamed from: g8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f73412o0 == null) {
            synchronized (this.f73413p0) {
                try {
                    if (this.f73412o0 == null) {
                        this.f73412o0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f73412o0;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f73411n0) {
            return null;
        }
        h8();
        return this.f73410m0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h8() {
        if (this.f73410m0 == null) {
            this.f73410m0 = new m(super.getContext(), this);
            this.f73411n0 = ue.c.x(super.getContext());
        }
    }

    public final void i8() {
        if (this.f73414q0) {
            return;
        }
        this.f73414q0 = true;
        e eVar = (e) this;
        x8 x8Var = (x8) ((f) generatedComponent());
        oa oaVar = x8Var.f114707a;
        eVar.f91283h = oaVar.Ec;
        eVar.f91284i = (x2) oaVar.f113800m3.get();
        eVar.f91285j = (f0) oaVar.f113747j2.get();
        eVar.f91286k = r70.b.f106349i.k0();
        eVar.f91287l = (q) oaVar.f113875q7.get();
        eVar.f91288m = (bz.i) oaVar.C9.get();
        eVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        eVar.f91290o = (ac2.m) oaVar.C7.get();
        eVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        eVar.f91292q = (ku1.a) s8Var.f114402n.get();
        eVar.f91293r = s8Var.u6();
        eVar.f91294s = (ff0.f) s8Var.f114417o.get();
        eVar.f91295t = oaVar.T2();
        eVar.f91296u = (d1) oaVar.f113730i2.get();
        eVar.f91297v = (b60.b) oaVar.f113850p0.get();
        eVar.f91298w = (w) oaVar.f113885r0.get();
        eVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        eVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        eVar.f91301z = (a80.a) oaVar.Wc.get();
        eVar.A = (z70.f) oaVar.f113764k2.get();
        el.a.t0(eVar, (z6) s8Var.f114333i3.get());
        el.a.u0(eVar, (a7) s8Var.f114348j3.get());
        el.a.D1(eVar, (uk1.e) oaVar.f113702ga.get());
        el.a.z1(eVar, (ip1.b) oaVar.H7.get());
        el.a.R0(eVar, (n1) oaVar.E0.get());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        h8();
        i8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f73410m0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h8();
        i8();
    }
}
