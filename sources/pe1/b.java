package pe1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import m60.w;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.s8;
import so.w3;
import so.x8;
import tj0.b0;
import x02.x2;
import yk1.v;

/* loaded from: classes2.dex */
public abstract class b extends jd1.d implements af2.c {

    /* renamed from: c1, reason: collision with root package name */
    public ye2.m f99932c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f99933d1;

    /* renamed from: e1, reason: collision with root package name */
    public volatile ye2.h f99934e1;

    /* renamed from: f1, reason: collision with root package name */
    public final Object f99935f1 = new Object();

    /* renamed from: g1, reason: collision with root package name */
    public boolean f99936g1 = false;

    public final void A9() {
        if (this.f99932c1 == null) {
            this.f99932c1 = new ye2.m(super.getContext(), this);
            this.f99933d1 = ue.c.x(super.getContext());
        }
    }

    public void B9() {
        if (this.f99936g1) {
            return;
        }
        this.f99936g1 = true;
        p pVar = (p) this;
        x8 x8Var = (x8) ((q) generatedComponent());
        oa oaVar = x8Var.f114707a;
        pVar.f91283h = oaVar.Ec;
        pVar.f91284i = (x2) oaVar.f113800m3.get();
        pVar.f91285j = (f0) oaVar.f113747j2.get();
        pVar.f91286k = r70.b.f106349i.k0();
        pVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        pVar.f91288m = (bz.i) oaVar.C9.get();
        pVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        pVar.f91290o = (ac2.m) oaVar.C7.get();
        pVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        pVar.f91292q = (ku1.a) s8Var.f114402n.get();
        pVar.f91293r = s8Var.u6();
        pVar.f91294s = (ff0.f) s8Var.f114417o.get();
        pVar.f91295t = oaVar.T2();
        pVar.f91296u = (d1) oaVar.f113730i2.get();
        pVar.f91297v = (b60.b) oaVar.f113850p0.get();
        pVar.f91298w = (w) oaVar.f113885r0.get();
        pVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        pVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        pVar.f91301z = (a80.a) oaVar.Wc.get();
        pVar.A = (z70.f) oaVar.f113764k2.get();
        pVar.f114986u0 = oaVar.v2();
        pVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        pVar.f114988w0 = s8Var.X5();
        pVar.f114989x0 = s8Var.h6();
        pVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(pVar);
        ig1.b.x0(pVar, (jd1.e) s8Var.f114465r2.get());
        kh2.j.q1(pVar, (b0) s8Var.H0.get());
        kh2.j.G1(pVar, (w3) s8Var.Lb.get());
        kh2.j.C0(pVar, (e02.a) oaVar.f113757jd.get());
        kh2.j.v1(pVar, (com.pinterest.feature.pin.j) s8Var.E.get());
        kh2.j.E1(pVar, (lb0.r) oaVar.f113622c1.get());
        kh2.j.c2(pVar, s8Var.J6());
        s8Var.E6();
        kh2.j.a2(pVar);
        kh2.j.p1(pVar, s8Var.e6());
        kh2.j.p0(pVar, (vy.m) oaVar.M1.get());
        kh2.j.C1(pVar, (lb0.q) oaVar.O0.get());
        kh2.j.o2(pVar, (v) s8Var.C.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f99933d1) {
            return null;
        }
        A9();
        return this.f99932c1;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        A9();
        B9();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // af2.c
    /* renamed from: z9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f99934e1 == null) {
            synchronized (this.f99935f1) {
                try {
                    if (this.f99934e1 == null) {
                        this.f99934e1 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f99934e1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f99932c1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A9();
        B9();
    }
}
