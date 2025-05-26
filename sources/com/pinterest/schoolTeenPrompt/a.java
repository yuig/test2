package com.pinterest.schoolTeenPrompt;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import hs1.q;
import kh2.s0;
import m60.w;
import mm1.l;
import nx.d1;
import nx.f0;
import rg0.s;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import ye2.m;

/* loaded from: classes2.dex */
public abstract class a extends l {

    /* renamed from: d0, reason: collision with root package name */
    public m f50460d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f50461e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f50462f0 = false;

    @Override // mm1.o
    public final void X7() {
        if (this.f50462f0) {
            return;
        }
        this.f50462f0 = true;
        g gVar = (g) this;
        x8 x8Var = (x8) ((h) generatedComponent());
        oa oaVar = x8Var.f114707a;
        gVar.f91283h = oaVar.Ec;
        gVar.f91284i = (x2) oaVar.f113800m3.get();
        gVar.f91285j = (f0) oaVar.f113747j2.get();
        gVar.f91286k = r70.b.f106349i.k0();
        gVar.f91287l = (q) oaVar.f113875q7.get();
        gVar.f91288m = (bz.i) oaVar.C9.get();
        gVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        gVar.f91290o = (ac2.m) oaVar.C7.get();
        gVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        gVar.f91292q = (ku1.a) s8Var.f114402n.get();
        gVar.f91293r = s8Var.u6();
        gVar.f91294s = (ff0.f) s8Var.f114417o.get();
        gVar.f91295t = oaVar.T2();
        gVar.f91296u = (d1) oaVar.f113730i2.get();
        gVar.f91297v = (b60.b) oaVar.f113850p0.get();
        gVar.f91298w = (w) oaVar.f113885r0.get();
        gVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        gVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        gVar.f91301z = (a80.a) oaVar.Wc.get();
        gVar.A = (z70.f) oaVar.f113764k2.get();
        s0.d0(gVar, (nu1.a) s8Var.f114462r.get());
        s0.X(gVar, (s) oaVar.Q5.get());
    }

    public final void c8() {
        if (this.f50460d0 == null) {
            this.f50460d0 = new m(super.getContext(), this);
            this.f50461e0 = ue.c.x(super.getContext());
        }
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f50461e0) {
            return null;
        }
        c8();
        return this.f50460d0;
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
        m mVar = this.f50460d0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c8();
        X7();
    }
}
