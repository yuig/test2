package pu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import mu.p0;
import nx.d1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class c0 extends p0 {

    /* renamed from: o0, reason: collision with root package name */
    public ye2.m f101333o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f101334p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f101335q0 = false;

    @Override // mu.b0
    public void X7() {
        if (this.f101335q0) {
            return;
        }
        this.f101335q0 = true;
        j0 j0Var = (j0) this;
        x8 x8Var = (x8) ((k0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        j0Var.f91283h = oaVar.Ec;
        j0Var.f91284i = (x2) oaVar.f113800m3.get();
        j0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        j0Var.f91286k = r70.b.f106349i.k0();
        j0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        j0Var.f91288m = (bz.i) oaVar.C9.get();
        j0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        j0Var.f91290o = (ac2.m) oaVar.C7.get();
        j0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        j0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        j0Var.f91293r = s8Var.u6();
        j0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        j0Var.f91295t = oaVar.T2();
        j0Var.f91296u = (d1) oaVar.f113730i2.get();
        j0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        j0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        j0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        j0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        j0Var.f91301z = (a80.a) oaVar.Wc.get();
        j0Var.A = (z70.f) oaVar.f113764k2.get();
        el.a.n1(j0Var, oaVar.w2());
        kh2.d.S(j0Var, (z70.m) s8Var.f114387m.get());
        kh2.d.U(j0Var);
    }

    public final void d8() {
        if (this.f101333o0 == null) {
            this.f101333o0 = new ye2.m(super.getContext(), this);
            this.f101334p0 = ue.c.x(super.getContext());
        }
    }

    @Override // mu.b0, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f101334p0) {
            return null;
        }
        d8();
        return this.f101333o0;
    }

    @Override // mu.p0, mu.b0, nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        d8();
        X7();
    }

    @Override // mu.p0, mu.b0, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // mu.b0, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f101333o0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d8();
        X7();
    }
}
