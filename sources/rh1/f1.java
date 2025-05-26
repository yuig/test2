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
public abstract class f1 extends k {

    /* renamed from: i1, reason: collision with root package name */
    public ye2.m f108148i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f108149j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f108150k1 = false;

    @Override // rh1.w0
    public void T8() {
        if (this.f108150k1) {
            return;
        }
        this.f108150k1 = true;
        h2 h2Var = (h2) this;
        x8 x8Var = (x8) ((i2) generatedComponent());
        oa oaVar = x8Var.f114707a;
        h2Var.f91283h = oaVar.Ec;
        h2Var.f91284i = (x2) oaVar.f113800m3.get();
        h2Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        h2Var.f91286k = r70.b.f106349i.k0();
        h2Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        h2Var.f91288m = (bz.i) oaVar.C9.get();
        h2Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        h2Var.f91290o = (ac2.m) oaVar.C7.get();
        h2Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        h2Var.f91292q = (ku1.a) s8Var.f114402n.get();
        h2Var.f91293r = s8Var.u6();
        h2Var.f91294s = (ff0.f) s8Var.f114417o.get();
        h2Var.f91295t = oaVar.T2();
        h2Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        h2Var.f91297v = (b60.b) oaVar.f113850p0.get();
        h2Var.f91298w = (m60.w) oaVar.f113885r0.get();
        h2Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        h2Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        h2Var.f91301z = (a80.a) oaVar.Wc.get();
        h2Var.A = (z70.f) oaVar.f113764k2.get();
        kh2.d.f0(h2Var, oaVar.j2());
        kh2.d.x0(h2Var, (up0.l) oaVar.Rc.get());
        kh2.d.n0(h2Var);
        kh2.d.d0(h2Var, s8Var.o5());
        kh2.d.i0(h2Var, (d21.a) s8Var.f114317h2.get());
        kh2.d.k0(h2Var, (x02.i2) oaVar.F3.get());
        kh2.d.V(h2Var, (qh1.e) s8Var.P1.get());
        kh2.d.y0(h2Var, s8Var.L6());
        kh2.d.q0(h2Var, (lb0.r) oaVar.f113622c1.get());
        ve.h.T(h2Var, (t6) s8Var.Q2.get());
        ve.h.E(h2Var, (e6) s8Var.Q1.get());
    }

    @Override // rh1.w0, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f108149j1) {
            return null;
        }
        k9();
        return this.f108148i1;
    }

    public final void k9() {
        if (this.f108148i1 == null) {
            this.f108148i1 = new ye2.m(super.getContext(), this);
            this.f108149j1 = ue.c.x(super.getContext());
        }
    }

    @Override // rh1.w0, nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        k9();
        T8();
    }

    @Override // rh1.w0, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // rh1.w0, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f108148i1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k9();
        T8();
    }
}
