package ps0;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import kh2.j1;
import nx.d1;
import so.c6;
import so.oa;
import so.r7;
import so.s8;
import so.x8;
import x02.i2;
import x02.x0;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a extends sq0.n implements af2.c {
    public ye2.m J0;
    public boolean K0;
    public volatile ye2.h L0;
    public final Object M0 = new Object();
    public boolean N0 = false;

    @Override // af2.c
    /* renamed from: d9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.L0 == null) {
            synchronized (this.M0) {
                try {
                    if (this.L0 == null) {
                        this.L0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.L0;
    }

    public final void e9() {
        if (this.J0 == null) {
            this.J0 = new ye2.m(super.getContext(), this);
            this.K0 = ue.c.x(super.getContext());
        }
    }

    public final void f9() {
        if (this.N0) {
            return;
        }
        this.N0 = true;
        HomeFeedFragment homeFeedFragment = (HomeFeedFragment) this;
        x8 x8Var = (x8) ((w) generatedComponent());
        oa oaVar = x8Var.f114707a;
        homeFeedFragment.f91283h = oaVar.Ec;
        homeFeedFragment.f91284i = (x2) oaVar.f113800m3.get();
        homeFeedFragment.f91285j = (nx.f0) oaVar.f113747j2.get();
        homeFeedFragment.f91286k = r70.b.f106349i.k0();
        homeFeedFragment.f91287l = (hs1.q) oaVar.f113875q7.get();
        homeFeedFragment.f91288m = (bz.i) oaVar.C9.get();
        homeFeedFragment.f91289n = (lu1.d) oaVar.f113782l2.get();
        homeFeedFragment.f91290o = (ac2.m) oaVar.C7.get();
        homeFeedFragment.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        homeFeedFragment.f91292q = (ku1.a) s8Var.f114402n.get();
        homeFeedFragment.f91293r = s8Var.u6();
        homeFeedFragment.f91294s = (ff0.f) s8Var.f114417o.get();
        homeFeedFragment.f91295t = oaVar.T2();
        homeFeedFragment.f91296u = (d1) oaVar.f113730i2.get();
        homeFeedFragment.f91297v = (b60.b) oaVar.f113850p0.get();
        homeFeedFragment.f91298w = (m60.w) oaVar.f113885r0.get();
        homeFeedFragment.f91299x = (tb0.h) oaVar.f113797m0.get();
        homeFeedFragment.f91300y = (uj2.q) oaVar.f113947u9.get();
        homeFeedFragment.f91301z = (a80.a) oaVar.Wc.get();
        homeFeedFragment.A = (z70.f) oaVar.f113764k2.get();
        homeFeedFragment.f114986u0 = oaVar.v2();
        homeFeedFragment.f114987v0 = (jq.c) s8Var.f114432p.get();
        homeFeedFragment.f114988w0 = s8Var.X5();
        homeFeedFragment.f114989x0 = s8Var.h6();
        homeFeedFragment.f114990y0 = (c6) s8Var.f114447q.get();
        homeFeedFragment.O0 = bf2.b.a(oaVar.Me);
        homeFeedFragment.P0 = bf2.b.a(oaVar.f113723hd);
        homeFeedFragment.Q0 = (x0) oaVar.f113765k3.get();
        homeFeedFragment.R0 = (com.pinterest.feature.home.model.f) oaVar.f113911s9.get();
        homeFeedFragment.S0 = (m60.h0) oaVar.f113806m9.get();
        homeFeedFragment.T0 = (i2) oaVar.F3.get();
        homeFeedFragment.U0 = (pb0.a) oaVar.f113834o1.get();
        homeFeedFragment.V0 = (yk1.j) oaVar.Qc.get();
        homeFeedFragment.W0 = (uk1.e) oaVar.f113702ga.get();
        homeFeedFragment.X0 = bf2.b.a(oaVar.Q5);
        homeFeedFragment.Y0 = bf2.b.a(s8Var.Y3);
        homeFeedFragment.Z0 = (nr0.m) s8Var.f114506u.get();
        homeFeedFragment.f45745a1 = bf2.b.a(oaVar.f113769k7);
        homeFeedFragment.f45746b1 = bf2.b.a(s8Var.Z3);
        homeFeedFragment.f45747c1 = (bv1.a) oaVar.f113596aa.get();
        homeFeedFragment.f45748d1 = bf2.b.a(oaVar.D0);
        homeFeedFragment.f45749e1 = s8Var.E5();
        homeFeedFragment.f45750f1 = s8Var.F5();
        homeFeedFragment.f45751g1 = s8Var.O6();
        homeFeedFragment.f45752h1 = new b20.c((cb) null);
        homeFeedFragment.f45753i1 = (d21.a) s8Var.f114317h2.get();
        homeFeedFragment.f45754j1 = oa.g0(oaVar);
        homeFeedFragment.f45755k1 = bf2.b.a(s8Var.f114215a4);
        com.pinterest.widget.configuration.k.x2(oaVar.f113638d);
        homeFeedFragment.f45756l1 = ac2.f.f1945a;
        homeFeedFragment.f45757m1 = s8Var.v5();
        homeFeedFragment.f45758n1 = (bc2.e) oaVar.F7.get();
        homeFeedFragment.f45759o1 = (es.h) oaVar.f113735i7.get();
        homeFeedFragment.f45760p1 = (es.a) oaVar.P6.get();
        homeFeedFragment.f45761q1 = (cz.e) oaVar.V9.get();
        homeFeedFragment.f45762r1 = (dz.a) s8Var.f114388m0.get();
        homeFeedFragment.f45763s1 = (r7) s8Var.f114245c4.get();
        homeFeedFragment.f45764t1 = (kv.a) oaVar.Db.get();
        homeFeedFragment.f45765u1 = (kv.c) oaVar.f113776ke.get();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.K0) {
            return null;
        }
        e9();
        return this.J0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        e9();
        f9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.J0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e9();
        f9();
    }
}
