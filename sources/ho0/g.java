package ho0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import hs1.q;
import kg.o;
import kh2.j1;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.m2;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class g extends d implements af2.c {

    /* renamed from: b1, reason: collision with root package name */
    public ye2.m f69691b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f69692c1;

    /* renamed from: d1, reason: collision with root package name */
    public volatile ye2.h f69693d1;

    /* renamed from: e1, reason: collision with root package name */
    public final Object f69694e1 = new Object();

    /* renamed from: f1, reason: collision with root package name */
    public boolean f69695f1 = false;

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f69692c1) {
            return null;
        }
        k9();
        return this.f69691b1;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // af2.c
    /* renamed from: j9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f69693d1 == null) {
            synchronized (this.f69694e1) {
                try {
                    if (this.f69693d1 == null) {
                        this.f69693d1 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f69693d1;
    }

    public final void k9() {
        if (this.f69691b1 == null) {
            this.f69691b1 = new ye2.m(super.getContext(), this);
            this.f69692c1 = ue.c.x(super.getContext());
        }
    }

    public final void l9() {
        if (this.f69695f1) {
            return;
        }
        this.f69695f1 = true;
        k kVar = (k) this;
        x8 x8Var = (x8) ((l) generatedComponent());
        oa oaVar = x8Var.f114707a;
        kVar.f91283h = oaVar.Ec;
        kVar.f91284i = (x2) oaVar.f113800m3.get();
        kVar.f91285j = (f0) oaVar.f113747j2.get();
        kVar.f91286k = r70.b.f106349i.k0();
        kVar.f91287l = (q) oaVar.f113875q7.get();
        kVar.f91288m = (bz.i) oaVar.C9.get();
        kVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        kVar.f91290o = (ac2.m) oaVar.C7.get();
        kVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        kVar.f91292q = (ku1.a) s8Var.f114402n.get();
        kVar.f91293r = s8Var.u6();
        kVar.f91294s = (ff0.f) s8Var.f114417o.get();
        kVar.f91295t = oaVar.T2();
        kVar.f91296u = (d1) oaVar.f113730i2.get();
        kVar.f91297v = (b60.b) oaVar.f113850p0.get();
        kVar.f91298w = (w) oaVar.f113885r0.get();
        kVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        kVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        kVar.f91301z = (a80.a) oaVar.Wc.get();
        kVar.A = (z70.f) oaVar.f113764k2.get();
        kVar.f114986u0 = oaVar.v2();
        kVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        kVar.f114988w0 = s8Var.X5();
        kVar.f114989x0 = s8Var.h6();
        kVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(kVar);
        dn.c.Q(kVar, (i2) oaVar.F3.get());
        dn.c.U(kVar, (uk1.e) oaVar.f113702ga.get());
        dn.c.N(kVar, (m2) s8Var.V8.get());
        m60.f0 f0Var = vb0.j.f125466a;
        dl2.b.I(f0Var);
        dn.c.G(kVar, f0Var);
        dn.c.a0(kVar, (i92.k) oaVar.f113921t1.get());
        dn.c.E(kVar, (g11.a) s8Var.A.get());
        s8Var.l6();
        dn.c.I(kVar);
        dn.c.D(kVar, s8Var.e5());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        k9();
        l9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f69691b1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k9();
        l9();
    }
}
