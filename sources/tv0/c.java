package tv0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import dl1.t;
import hs1.q;
import kh2.j1;
import kh2.r;
import m60.w;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.l2;
import x02.x2;
import ye2.m;

/* loaded from: classes.dex */
public abstract class c extends e implements af2.c {

    /* renamed from: f0, reason: collision with root package name */
    public m f119509f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f119510g0;

    /* renamed from: h0, reason: collision with root package name */
    public volatile ye2.h f119511h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Object f119512i0 = new Object();

    /* renamed from: j0, reason: collision with root package name */
    public boolean f119513j0 = false;

    @Override // af2.c
    /* renamed from: a8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f119511h0 == null) {
            synchronized (this.f119512i0) {
                try {
                    if (this.f119511h0 == null) {
                        this.f119511h0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f119511h0;
    }

    public final void b8() {
        if (this.f119509f0 == null) {
            this.f119509f0 = new m(super.getContext(), this);
            this.f119510g0 = ue.c.x(super.getContext());
        }
    }

    public final void c8() {
        if (this.f119513j0) {
            return;
        }
        this.f119513j0 = true;
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
        el.a.I1(jVar, (uk1.e) oaVar.f113702ga.get());
        el.a.R1(jVar, (l2) oaVar.f113916se.get());
        r.Q0(jVar, (t) oaVar.Y7.get());
        r.h0(jVar, (ag1.b) oaVar.Z7.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f119510g0) {
            return null;
        }
        b8();
        return this.f119509f0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        b8();
        c8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f119509f0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b8();
        c8();
    }
}
