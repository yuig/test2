package b11;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import kh2.j1;
import nx.d1;
import so.c6;
import so.l6;
import so.o6;
import so.oa;
import so.s8;
import so.x8;
import so.y5;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class f<T> extends wk1.k<T> implements af2.c {
    public ye2.m M0;
    public boolean N0;
    public volatile ye2.h O0;
    public final Object P0 = new Object();
    public boolean Q0 = false;

    @Override // af2.c
    /* renamed from: g9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.O0 == null) {
            synchronized (this.P0) {
                try {
                    if (this.O0 == null) {
                        this.O0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.O0;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.N0) {
            return null;
        }
        h9();
        return this.M0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h9() {
        if (this.M0 == null) {
            this.M0 = new ye2.m(super.getContext(), this);
            this.N0 = ue.c.x(super.getContext());
        }
    }

    public final void i9() {
        if (this.Q0) {
            return;
        }
        this.Q0 = true;
        PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this;
        x8 x8Var = (x8) ((c0) generatedComponent());
        oa oaVar = x8Var.f114707a;
        pinCloseupFragment.f91283h = oaVar.Ec;
        pinCloseupFragment.f91284i = (x2) oaVar.f113800m3.get();
        pinCloseupFragment.f91285j = (nx.f0) oaVar.f113747j2.get();
        pinCloseupFragment.f91286k = r70.b.f106349i.k0();
        pinCloseupFragment.f91287l = (hs1.q) oaVar.f113875q7.get();
        pinCloseupFragment.f91288m = (bz.i) oaVar.C9.get();
        pinCloseupFragment.f91289n = (lu1.d) oaVar.f113782l2.get();
        pinCloseupFragment.f91290o = (ac2.m) oaVar.C7.get();
        pinCloseupFragment.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        pinCloseupFragment.f91292q = (ku1.a) s8Var.f114402n.get();
        pinCloseupFragment.f91293r = s8Var.u6();
        pinCloseupFragment.f91294s = (ff0.f) s8Var.f114417o.get();
        pinCloseupFragment.f91295t = oaVar.T2();
        pinCloseupFragment.f91296u = (d1) oaVar.f113730i2.get();
        pinCloseupFragment.f91297v = (b60.b) oaVar.f113850p0.get();
        pinCloseupFragment.f91298w = (m60.w) oaVar.f113885r0.get();
        pinCloseupFragment.f91299x = (tb0.h) oaVar.f113797m0.get();
        pinCloseupFragment.f91300y = (uj2.q) oaVar.f113947u9.get();
        pinCloseupFragment.f91301z = (a80.a) oaVar.Wc.get();
        pinCloseupFragment.A = (z70.f) oaVar.f113764k2.get();
        pinCloseupFragment.f114986u0 = oaVar.v2();
        pinCloseupFragment.f114987v0 = (jq.c) s8Var.f114432p.get();
        pinCloseupFragment.f114988w0 = s8Var.X5();
        pinCloseupFragment.f114989x0 = s8Var.h6();
        pinCloseupFragment.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(pinCloseupFragment);
        oe.f.Q(pinCloseupFragment, bf2.b.a(oaVar.f113723hd));
        oe.f.l0(pinCloseupFragment, (m60.g0) oaVar.f113590a4.get());
        oe.f.o0(pinCloseupFragment, (y5) s8Var.f114228b2.get());
        oe.f.G0(pinCloseupFragment, (l6) s8Var.d2.get());
        oe.f.D(pinCloseupFragment, (o6) s8Var.f114272e2.get());
        oe.f.G(pinCloseupFragment, (yk1.a) s8Var.B.get());
        oe.f.q0(pinCloseupFragment, (i2) oaVar.F3.get());
        oe.f.t0(pinCloseupFragment, (nx.f0) oaVar.f113747j2.get());
        oe.f.K0(pinCloseupFragment, bf2.b.a(oaVar.f113921t1));
        oe.f.S(pinCloseupFragment, s8Var.j5());
        oe.f.U(pinCloseupFragment);
        oe.f.Y(pinCloseupFragment, s8Var.D5());
        oe.f.A(pinCloseupFragment, oa.g0(oaVar));
        oe.f.h0(pinCloseupFragment, s8Var.e6());
        oe.f.V(pinCloseupFragment);
        oe.f.O(pinCloseupFragment, oaVar.E9);
        oe.f.g0(pinCloseupFragment, (c91.e) s8Var.f114211a0.get());
        oe.f.E(pinCloseupFragment, bf2.b.a(oaVar.M1));
        oe.f.Z(pinCloseupFragment, s8Var.f114287f2);
        oe.f.a0(pinCloseupFragment, s8Var.f114302g2);
        oe.f.W(pinCloseupFragment, oaVar.j2());
        bf2.b.a(oaVar.f113757jd);
        oe.f.K(pinCloseupFragment);
        oe.f.w0(pinCloseupFragment, new b20.c((cb) null));
        oe.f.p0(pinCloseupFragment, bf2.b.a(s8Var.f114317h2));
        oe.f.N(pinCloseupFragment, bf2.b.a(s8Var.P1));
        oe.f.e0(pinCloseupFragment, (yk1.j) oaVar.Qc.get());
        oe.f.F0(pinCloseupFragment, bf2.b.a(oaVar.f113741id));
        oe.f.x0(pinCloseupFragment, bf2.b.a(oaVar.O0));
        com.pinterest.widget.configuration.k.x2(oaVar.f113638d);
        ac2.f fVar = ac2.f.f1945a;
        oe.f.O0(pinCloseupFragment);
        oe.f.P(pinCloseupFragment, s8Var.v5());
        oe.f.d0(pinCloseupFragment, (bc2.e) oaVar.F7.get());
        oe.f.E0(pinCloseupFragment, bf2.b.a(oaVar.f113724he));
        oe.f.w(pinCloseupFragment, (es.a) oaVar.P6.get());
        oe.f.v0(pinCloseupFragment, (i91.z) oaVar.f113742ie.get());
        oe.f.n0(pinCloseupFragment, (nx.b0) oaVar.R8.get());
        oe.f.M(pinCloseupFragment, (is1.f) oaVar.f113758je.get());
        oe.f.H(pinCloseupFragment, (cz.e) oaVar.V9.get());
        oe.f.I(pinCloseupFragment, (dz.a) s8Var.f114388m0.get());
        oe.f.C(pinCloseupFragment, (ax.a) oaVar.f113688fe.get());
        oe.f.B(pinCloseupFragment, a02.e.x1((es.a) oaVar.P6.get(), (es.h) oaVar.f113735i7.get()));
        oe.f.z(pinCloseupFragment, (es.h) oaVar.f113735i7.get());
        oe.f.c0(pinCloseupFragment, s8Var.a6());
        oe.f.y(pinCloseupFragment, (kv.a) oaVar.Db.get());
        oe.f.k0(pinCloseupFragment, (kv.c) oaVar.f113776ke.get());
        oe.f.N0(pinCloseupFragment, (r01.d) s8Var.f114332i2.get());
        oe.f.J0(pinCloseupFragment, (c82.d) oaVar.f113648da.get());
        oe.f.x(pinCloseupFragment, (ur.a) oaVar.Kb.get());
        oe.f.I0(pinCloseupFragment, s8Var.D6());
        oe.f.R(pinCloseupFragment, (rg0.s) oaVar.Q5.get());
        oe.f.b0(pinCloseupFragment, bf2.b.a(oaVar.R6));
        oe.f.M0(pinCloseupFragment, bf2.b.a(oaVar.f113633cc));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        h9();
        i9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.M0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h9();
        i9();
    }
}
