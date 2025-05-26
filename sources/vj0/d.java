package vj0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import bz.i;
import ff0.f;
import hs1.q;
import m60.e;
import m60.w;
import mm1.l;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import tb0.h;
import x02.x2;
import ye2.m;

/* loaded from: classes.dex */
public abstract class d extends l {

    /* renamed from: d0, reason: collision with root package name */
    public m f125920d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f125921e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f125922f0 = false;

    @Override // mm1.o
    public final void X7() {
        if (this.f125922f0) {
            return;
        }
        this.f125922f0 = true;
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
        bVar.f91299x = (h) oaVar.f113797m0.get();
        bVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        bVar.f91301z = (a80.a) oaVar.Wc.get();
        bVar.A = (z70.f) oaVar.f113764k2.get();
        el.a.W0(bVar);
    }

    public final void c8() {
        if (this.f125920d0 == null) {
            this.f125920d0 = new m(super.getContext(), this);
            this.f125921e0 = ue.c.x(super.getContext());
        }
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f125921e0) {
            return null;
        }
        c8();
        return this.f125920d0;
    }

    @Override // mm1.o, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        c8();
        X7();
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f125920d0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c8();
        X7();
    }
}
