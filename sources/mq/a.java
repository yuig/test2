package mq;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import jr.a;
import kh2.j1;
import nx.d1;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a<T extends jr.a> extends kr.a<T> implements af2.c {

    /* renamed from: b0, reason: collision with root package name */
    public ye2.m f87945b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f87946c0;

    /* renamed from: d0, reason: collision with root package name */
    public volatile ye2.h f87947d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Object f87948e0 = new Object();

    /* renamed from: f0, reason: collision with root package name */
    public boolean f87949f0 = false;

    @Override // af2.c
    /* renamed from: Y7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f87947d0 == null) {
            synchronized (this.f87948e0) {
                try {
                    if (this.f87947d0 == null) {
                        this.f87947d0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f87947d0;
    }

    public final void Z7() {
        if (this.f87945b0 == null) {
            this.f87945b0 = new ye2.m(super.getContext(), this);
            this.f87946c0 = ue.c.x(super.getContext());
        }
    }

    public final void a8() {
        if (this.f87949f0) {
            return;
        }
        this.f87949f0 = true;
        u uVar = (u) this;
        x8 x8Var = (x8) ((v) generatedComponent());
        oa oaVar = x8Var.f114707a;
        uVar.f91283h = oaVar.Ec;
        uVar.f91284i = (x2) oaVar.f113800m3.get();
        uVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        uVar.f91286k = r70.b.f106349i.k0();
        uVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        uVar.f91288m = (bz.i) oaVar.C9.get();
        uVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        uVar.f91290o = (ac2.m) oaVar.C7.get();
        uVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        uVar.f91292q = (ku1.a) s8Var.f114402n.get();
        uVar.f91293r = s8Var.u6();
        uVar.f91294s = (ff0.f) s8Var.f114417o.get();
        uVar.f91295t = oaVar.T2();
        uVar.f91296u = (d1) oaVar.f113730i2.get();
        uVar.f91297v = (b60.b) oaVar.f113850p0.get();
        uVar.f91298w = (m60.w) oaVar.f113885r0.get();
        uVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        uVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        uVar.f91301z = (a80.a) oaVar.Wc.get();
        uVar.A = (z70.f) oaVar.f113764k2.get();
        el.a.q1(uVar, (i2) oaVar.F3.get());
        el.a.Z0(uVar, bf2.b.a(oaVar.f113987wd));
        el.a.X(uVar, s8Var.C1);
        el.a.K0(uVar, s8Var.j5());
        el.a.k1(uVar, bf2.b.a(oaVar.Rd));
        el.a.W1(uVar, bf2.b.a(oaVar.f113633cc));
        el.a.r0(uVar, bf2.b.a(s8Var.X0));
        el.a.I0(uVar, (rg0.s) oaVar.Q5.get());
        el.a.i1(uVar, (nx.b0) oaVar.R8.get());
        el.a.O1(uVar, (is1.h) oaVar.Qd.get());
        el.a.Y0(uVar, bf2.b.a(oaVar.R6));
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f87946c0) {
            return null;
        }
        Z7();
        return this.f87945b0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        ye2.m mVar = this.f87945b0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
