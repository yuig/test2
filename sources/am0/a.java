package am0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import bz.i;
import ff0.f;
import hs1.q;
import kg.o;
import kh2.g3;
import kh2.r;
import m60.e;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.p5;
import so.s8;
import so.x8;
import tb0.h;
import tj0.b0;
import tj0.d;
import vb0.j;
import x02.i2;
import x02.x2;
import ye2.m;

/* loaded from: classes.dex */
public abstract class a extends d {
    public m V0;
    public boolean W0;
    public boolean X0 = false;

    @Override // tj0.o, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.W0) {
            return null;
        }
        k9();
        return this.V0;
    }

    @Override // tj0.o
    public final void i9() {
        if (this.X0) {
            return;
        }
        this.X0 = true;
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
        bVar.f114986u0 = oaVar.v2();
        bVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        bVar.f114988w0 = s8Var.X5();
        bVar.f114989x0 = s8Var.h6();
        bVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(bVar);
        g3.n1(bVar, (b0) s8Var.H0.get());
        m60.f0 f0Var = j.f125466a;
        dl2.b.I(f0Var);
        r.j0(bVar, f0Var);
        r.B0(bVar, (i2) oaVar.F3.get());
        r.J0(bVar, (uk1.e) oaVar.f113702ga.get());
        r.t0(bVar, (p5) s8Var.f114331i1.get());
    }

    public final void k9() {
        if (this.V0 == null) {
            this.V0 = new m(super.getContext(), this);
            this.W0 = ue.c.x(super.getContext());
        }
    }

    @Override // tj0.o, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        k9();
        i9();
    }

    @Override // tj0.o, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // tj0.o, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.V0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k9();
        i9();
    }
}
