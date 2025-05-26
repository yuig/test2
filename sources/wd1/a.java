package wd1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import bz.i;
import ff0.f;
import hs1.q;
import jd1.d;
import kg.o;
import kh2.j1;
import kh2.m0;
import m60.e;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.v3;
import so.x8;
import x02.x2;
import ye2.h;
import ye2.m;

/* loaded from: classes2.dex */
public abstract class a extends d implements af2.c {

    /* renamed from: c1, reason: collision with root package name */
    public m f129226c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f129227d1;

    /* renamed from: e1, reason: collision with root package name */
    public volatile h f129228e1;

    /* renamed from: f1, reason: collision with root package name */
    public final Object f129229f1 = new Object();

    /* renamed from: g1, reason: collision with root package name */
    public boolean f129230g1 = false;

    public final void A9() {
        if (this.f129226c1 == null) {
            this.f129226c1 = new m(super.getContext(), this);
            this.f129227d1 = ue.c.x(super.getContext());
        }
    }

    public final void B9() {
        if (this.f129230g1) {
            return;
        }
        this.f129230g1 = true;
        b bVar = (b) this;
        x8 x8Var = (x8) ((c) generatedComponent());
        oa oaVar = x8Var.f114707a;
        bVar.f91283h = oaVar.Ec;
        bVar.f91284i = (x2) oaVar.f113800m3.get();
        bVar.f91285j = (f0) oaVar.f113747j2.get();
        bVar.f91286k = r70.b.f106349i.k0();
        bVar.f91287l = (q) oaVar.f113875q7.get();
        bVar.f91288m = (i) oaVar.C9.get();
        bVar.f91289n = (lu1.d) oaVar.f113782l2.get();
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
        bVar.f114986u0 = oaVar.v2();
        bVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        bVar.f114988w0 = s8Var.X5();
        bVar.f114989x0 = s8Var.h6();
        bVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(bVar);
        ig1.b.x0(bVar, (jd1.e) s8Var.f114465r2.get());
        m0.t0(bVar, (v3) s8Var.Jb.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f129227d1) {
            return null;
        }
        A9();
        return this.f129226c1;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
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
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // af2.c
    /* renamed from: z9, reason: merged with bridge method [inline-methods] */
    public final h componentManager() {
        if (this.f129228e1 == null) {
            synchronized (this.f129229f1) {
                try {
                    if (this.f129228e1 == null) {
                        this.f129228e1 = new h(this);
                    }
                } finally {
                }
            }
        }
        return this.f129228e1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f129226c1;
        d7.b.q(mVar == null || h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A9();
        B9();
    }
}
