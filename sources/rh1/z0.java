package rh1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.e6;
import so.oa;
import so.s8;
import so.t6;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class z0 extends h2 {

    /* renamed from: q1, reason: collision with root package name */
    public ye2.m f108331q1;

    /* renamed from: r1, reason: collision with root package name */
    public boolean f108332r1;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f108333s1 = false;

    @Override // rh1.f1, rh1.w0
    public final void T8() {
        if (this.f108333s1) {
            return;
        }
        this.f108333s1 = true;
        q0 q0Var = (q0) this;
        x8 x8Var = (x8) ((r0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        q0Var.f91283h = oaVar.Ec;
        q0Var.f91284i = (x2) oaVar.f113800m3.get();
        q0Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        q0Var.f91286k = r70.b.f106349i.k0();
        q0Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        q0Var.f91288m = (bz.i) oaVar.C9.get();
        q0Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        q0Var.f91290o = (ac2.m) oaVar.C7.get();
        q0Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        q0Var.f91292q = (ku1.a) s8Var.f114402n.get();
        q0Var.f91293r = s8Var.u6();
        q0Var.f91294s = (ff0.f) s8Var.f114417o.get();
        q0Var.f91295t = oaVar.T2();
        q0Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        q0Var.f91297v = (b60.b) oaVar.f113850p0.get();
        q0Var.f91298w = (m60.w) oaVar.f113885r0.get();
        q0Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        q0Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        q0Var.f91301z = (a80.a) oaVar.Wc.get();
        q0Var.A = (z70.f) oaVar.f113764k2.get();
        kh2.d.f0(q0Var, oaVar.j2());
        kh2.d.x0(q0Var, (up0.l) oaVar.Rc.get());
        kh2.d.n0(q0Var);
        kh2.d.d0(q0Var, s8Var.o5());
        kh2.d.i0(q0Var, (d21.a) s8Var.f114317h2.get());
        kh2.d.k0(q0Var, (x02.i2) oaVar.F3.get());
        kh2.d.V(q0Var, (qh1.e) s8Var.P1.get());
        kh2.d.y0(q0Var, s8Var.L6());
        kh2.d.q0(q0Var, (lb0.r) oaVar.f113622c1.get());
        ve.h.T(q0Var, (t6) s8Var.Q2.get());
        ve.h.E(q0Var, (e6) s8Var.Q1.get());
        s8Var.n5();
        c0.d.F0(q0Var);
    }

    @Override // rh1.f1, rh1.w0, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f108332r1) {
            return null;
        }
        l9();
        return this.f108331q1;
    }

    public final void l9() {
        if (this.f108331q1 == null) {
            this.f108331q1 = new ye2.m(super.getContext(), this);
            this.f108332r1 = ue.c.x(super.getContext());
        }
    }

    @Override // rh1.f1, rh1.w0, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        l9();
        T8();
    }

    @Override // rh1.f1, rh1.w0, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // rh1.f1, rh1.w0, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f108331q1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l9();
        T8();
    }
}
