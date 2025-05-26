package k90;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import hs1.q;
import jk.v;
import kg.o;
import kh2.j1;
import m60.d0;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.q6;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class m extends jd1.d implements af2.c {

    /* renamed from: c1, reason: collision with root package name */
    public ye2.m f78798c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f78799d1;

    /* renamed from: e1, reason: collision with root package name */
    public volatile ye2.h f78800e1;

    /* renamed from: f1, reason: collision with root package name */
    public final Object f78801f1 = new Object();

    /* renamed from: g1, reason: collision with root package name */
    public boolean f78802g1 = false;

    public final void A9() {
        if (this.f78798c1 == null) {
            this.f78798c1 = new ye2.m(super.getContext(), this);
            this.f78799d1 = ue.c.x(super.getContext());
        }
    }

    public final void B9() {
        if (this.f78802g1) {
            return;
        }
        this.f78802g1 = true;
        c cVar = (c) this;
        x8 x8Var = (x8) ((d) generatedComponent());
        oa oaVar = x8Var.f114707a;
        cVar.f91283h = oaVar.Ec;
        cVar.f91284i = (x2) oaVar.f113800m3.get();
        cVar.f91285j = (f0) oaVar.f113747j2.get();
        cVar.f91286k = r70.b.f106349i.k0();
        cVar.f91287l = (q) oaVar.f113875q7.get();
        cVar.f91288m = (bz.i) oaVar.C9.get();
        cVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        cVar.f91290o = (ac2.m) oaVar.C7.get();
        cVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        cVar.f91292q = (ku1.a) s8Var.f114402n.get();
        cVar.f91293r = s8Var.u6();
        cVar.f91294s = (ff0.f) s8Var.f114417o.get();
        cVar.f91295t = oaVar.T2();
        cVar.f91296u = (d1) oaVar.f113730i2.get();
        cVar.f91297v = (b60.b) oaVar.f113850p0.get();
        cVar.f91298w = (w) oaVar.f113885r0.get();
        cVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        cVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        cVar.f91301z = (a80.a) oaVar.Wc.get();
        cVar.A = (z70.f) oaVar.f113764k2.get();
        cVar.f114986u0 = oaVar.v2();
        cVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        cVar.f114988w0 = s8Var.X5();
        cVar.f114989x0 = s8Var.h6();
        cVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(cVar);
        ig1.b.x0(cVar, (jd1.e) s8Var.f114465r2.get());
        v.H(cVar, (d0) s8Var.T0.get());
        v.x(cVar, (q6) s8Var.f114479s2.get());
        v.T(cVar, s8Var.h6());
        v.u(cVar, (pb0.a) oaVar.f113834o1.get());
        v.v(cVar, s8Var.h5());
        v.w(cVar, s8Var.l5());
        v.y(cVar, s8Var.m5());
        v.L(cVar, s8Var.a6());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f78799d1) {
            return null;
        }
        A9();
        return this.f78798c1;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        A9();
        B9();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // af2.c
    /* renamed from: z9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f78800e1 == null) {
            synchronized (this.f78801f1) {
                try {
                    if (this.f78800e1 == null) {
                        this.f78800e1 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f78800e1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f78798c1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A9();
        B9();
    }
}
