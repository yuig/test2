package sx1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import bz.i;
import ff0.f;
import hs1.q;
import kh2.j1;
import lu1.d;
import m60.e;
import m60.w;
import nx.d1;
import nx.f0;
import so.f1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import ye2.h;
import ye2.m;

/* loaded from: classes2.dex */
public abstract class a extends qx1.c implements af2.c {

    /* renamed from: r0, reason: collision with root package name */
    public m f115625r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f115626s0;

    /* renamed from: t0, reason: collision with root package name */
    public volatile h f115627t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Object f115628u0 = new Object();

    /* renamed from: v0, reason: collision with root package name */
    public boolean f115629v0 = false;

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f115626s0) {
            return null;
        }
        k8();
        return this.f115625r0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // af2.c
    /* renamed from: j8, reason: merged with bridge method [inline-methods] */
    public final h componentManager() {
        if (this.f115627t0 == null) {
            synchronized (this.f115628u0) {
                try {
                    if (this.f115627t0 == null) {
                        this.f115627t0 = new h(this);
                    }
                } finally {
                }
            }
        }
        return this.f115627t0;
    }

    public final void k8() {
        if (this.f115625r0 == null) {
            this.f115625r0 = new m(super.getContext(), this);
            this.f115626s0 = ue.c.x(super.getContext());
        }
    }

    public final void l8() {
        if (this.f115629v0) {
            return;
        }
        this.f115629v0 = true;
        b bVar = (b) this;
        x8 x8Var = (x8) ((c) generatedComponent());
        oa oaVar = x8Var.f114707a;
        bVar.f91283h = oaVar.Ec;
        bVar.f91284i = (x2) oaVar.f113800m3.get();
        bVar.f91285j = (f0) oaVar.f113747j2.get();
        bVar.f91286k = r70.b.f106349i.k0();
        bVar.f91287l = (q) oaVar.f113875q7.get();
        bVar.f91288m = (i) oaVar.C9.get();
        bVar.f91289n = (d) oaVar.f113782l2.get();
        bVar.f91290o = (ac2.m) oaVar.C7.get();
        bVar.f91291p = (e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        bVar.f91292q = (ku1.a) s8Var.f114402n.get();
        bVar.f91293r = s8Var.u6();
        bVar.f91294s = (f) s8Var.f114417o.get();
        bVar.f91295t = oaVar.T2();
        bVar.f91296u = (d1) oaVar.f113730i2.get();
        bVar.f91297v = (b60.b) oaVar.f113850p0.get();
        bVar.f91298w = (w) oaVar.f113885r0.get();
        bVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        bVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        bVar.f91301z = (a80.a) oaVar.Wc.get();
        bVar.A = (z70.f) oaVar.f113764k2.get();
        pe.i.k0(bVar, (f1) s8Var.A7.get());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        k8();
        l8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f115625r0;
        d7.b.q(mVar == null || h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k8();
        l8();
    }
}
