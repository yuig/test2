package pe1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.w3;
import so.x3;
import so.x8;
import tj0.b0;
import x02.x2;
import yk1.v;

/* loaded from: classes2.dex */
public abstract class a extends p {
    public ye2.m I1;
    public boolean J1;
    public boolean K1 = false;

    @Override // pe1.b
    public final void B9() {
        if (this.K1) {
            return;
        }
        this.K1 = true;
        d dVar = (d) this;
        x8 x8Var = (x8) ((e) generatedComponent());
        oa oaVar = x8Var.f114707a;
        dVar.f91283h = oaVar.Ec;
        dVar.f91284i = (x2) oaVar.f113800m3.get();
        dVar.f91285j = (f0) oaVar.f113747j2.get();
        dVar.f91286k = r70.b.f106349i.k0();
        dVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        dVar.f91288m = (bz.i) oaVar.C9.get();
        dVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        dVar.f91290o = (ac2.m) oaVar.C7.get();
        dVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        dVar.f91292q = (ku1.a) s8Var.f114402n.get();
        dVar.f91293r = s8Var.u6();
        dVar.f91294s = (ff0.f) s8Var.f114417o.get();
        dVar.f91295t = oaVar.T2();
        dVar.f91296u = (d1) oaVar.f113730i2.get();
        dVar.f91297v = (b60.b) oaVar.f113850p0.get();
        dVar.f91298w = (w) oaVar.f113885r0.get();
        dVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        dVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        dVar.f91301z = (a80.a) oaVar.Wc.get();
        dVar.A = (z70.f) oaVar.f113764k2.get();
        dVar.f114986u0 = oaVar.v2();
        dVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        dVar.f114988w0 = s8Var.X5();
        dVar.f114989x0 = s8Var.h6();
        dVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(dVar);
        ig1.b.x0(dVar, (jd1.e) s8Var.f114465r2.get());
        kh2.j.q1(dVar, (b0) s8Var.H0.get());
        kh2.j.G1(dVar, (w3) s8Var.Lb.get());
        kh2.j.C0(dVar, (e02.a) oaVar.f113757jd.get());
        kh2.j.v1(dVar, (com.pinterest.feature.pin.j) s8Var.E.get());
        kh2.j.E1(dVar, (lb0.r) oaVar.f113622c1.get());
        kh2.j.c2(dVar, s8Var.J6());
        s8Var.E6();
        kh2.j.a2(dVar);
        kh2.j.p1(dVar, s8Var.e6());
        kh2.j.p0(dVar, (vy.m) oaVar.M1.get());
        kh2.j.C1(dVar, (lb0.q) oaVar.O0.get());
        kh2.j.o2(dVar, (v) s8Var.C.get());
        kh2.b0.b1(dVar, (x3) s8Var.Mb.get());
    }

    public final void N9() {
        if (this.I1 == null) {
            this.I1 = new ye2.m(super.getContext(), this);
            this.J1 = ue.c.x(super.getContext());
        }
    }

    @Override // pe1.b, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.J1) {
            return null;
        }
        N9();
        return this.I1;
    }

    @Override // pe1.b, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        N9();
        B9();
    }

    @Override // pe1.b, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // pe1.b, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.I1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        N9();
        B9();
    }
}
