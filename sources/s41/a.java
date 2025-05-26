package s41;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import bz.i;
import e0.t;
import hs1.q;
import i92.k;
import kg.o;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.x8;
import tb0.h;
import vb0.j;
import x02.i2;
import x02.x2;
import ye2.m;
import yk1.v;

/* loaded from: classes2.dex */
public abstract class a extends v42.c {
    public m V0;
    public boolean W0;
    public boolean X0 = false;

    @Override // v42.e, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.W0) {
            return null;
        }
        m9();
        return this.V0;
    }

    @Override // v42.e
    public final void i9() {
        if (this.X0) {
            return;
        }
        this.X0 = true;
        f fVar = (f) this;
        x8 x8Var = (x8) ((g) generatedComponent());
        oa oaVar = x8Var.f114707a;
        fVar.f91283h = oaVar.Ec;
        fVar.f91284i = (x2) oaVar.f113800m3.get();
        fVar.f91285j = (f0) oaVar.f113747j2.get();
        fVar.f91286k = r70.b.f106349i.k0();
        fVar.f91287l = (q) oaVar.f113875q7.get();
        fVar.f91288m = (i) oaVar.C9.get();
        fVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        fVar.f91290o = (ac2.m) oaVar.C7.get();
        fVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        fVar.f91292q = (ku1.a) s8Var.f114402n.get();
        fVar.f91293r = s8Var.u6();
        fVar.f91294s = (ff0.f) s8Var.f114417o.get();
        fVar.f91295t = oaVar.T2();
        fVar.f91296u = (d1) oaVar.f113730i2.get();
        fVar.f91297v = (b60.b) oaVar.f113850p0.get();
        fVar.f91298w = (w) oaVar.f113885r0.get();
        fVar.f91299x = (h) oaVar.f113797m0.get();
        fVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        fVar.f91301z = (a80.a) oaVar.Wc.get();
        fVar.A = (z70.f) oaVar.f113764k2.get();
        fVar.f114986u0 = oaVar.v2();
        fVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        fVar.f114988w0 = s8Var.X5();
        fVar.f114989x0 = s8Var.h6();
        fVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(fVar);
        t.h0(fVar, (i2) oaVar.F3.get());
        t.p0(fVar, (uk1.e) oaVar.f113702ga.get());
        t.C0(fVar, (k) oaVar.f113921t1.get());
        t.I0(fVar, (v) s8Var.C.get());
        m60.f0 f0Var = j.f125466a;
        dl2.b.I(f0Var);
        t.P(fVar, f0Var);
        t.Q(fVar, (nr0.m) s8Var.f114506u.get());
    }

    public final void m9() {
        if (this.V0 == null) {
            this.V0 = new m(super.getContext(), this);
            this.W0 = ue.c.x(super.getContext());
        }
    }

    @Override // v42.e, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        m9();
        i9();
    }

    @Override // v42.e, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // v42.e, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.V0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9();
        i9();
    }
}
