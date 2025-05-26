package wr0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import kh2.c3;
import nx.d1;
import nx.f0;
import so.o7;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class c0 extends rh1.k {

    /* renamed from: i1, reason: collision with root package name */
    public ye2.m f130880i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f130881j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f130882k1 = false;

    @Override // rh1.w0
    public final void T8() {
        if (this.f130882k1) {
            return;
        }
        this.f130882k1 = true;
        j jVar = (j) this;
        x8 x8Var = (x8) ((k) generatedComponent());
        oa oaVar = x8Var.f114707a;
        jVar.f91283h = oaVar.Ec;
        jVar.f91284i = (x2) oaVar.f113800m3.get();
        jVar.f91285j = (f0) oaVar.f113747j2.get();
        jVar.f91286k = r70.b.f106349i.k0();
        jVar.f91287l = (hs1.q) oaVar.f113875q7.get();
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
        jVar.f91298w = (m60.w) oaVar.f113885r0.get();
        jVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        jVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        jVar.f91301z = (a80.a) oaVar.Wc.get();
        jVar.A = (z70.f) oaVar.f113764k2.get();
        kh2.d.f0(jVar, oaVar.j2());
        kh2.d.x0(jVar, (up0.l) oaVar.Rc.get());
        kh2.d.n0(jVar);
        kh2.d.d0(jVar, s8Var.o5());
        kh2.d.i0(jVar, (d21.a) s8Var.f114317h2.get());
        kh2.d.k0(jVar, (i2) oaVar.F3.get());
        kh2.d.V(jVar, (qh1.e) s8Var.P1.get());
        kh2.d.y0(jVar, s8Var.L6());
        kh2.d.q0(jVar, (lb0.r) oaVar.f113622c1.get());
        c3.S(jVar, (o7) s8Var.O3.get());
        c3.R(jVar, (q11.a) s8Var.P3.get());
    }

    @Override // rh1.w0, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f130881j1) {
            return null;
        }
        k9();
        return this.f130880i1;
    }

    public final void k9() {
        if (this.f130880i1 == null) {
            this.f130880i1 = new ye2.m(super.getContext(), this);
            this.f130881j1 = ue.c.x(super.getContext());
        }
    }

    @Override // rh1.w0, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        k9();
        T8();
    }

    @Override // rh1.w0, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // rh1.w0, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f130880i1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k9();
        T8();
    }
}
