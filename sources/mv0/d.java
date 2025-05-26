package mv0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.g3;
import kh2.j1;
import nx.d1;
import nx.f0;
import so.c6;
import so.oa;
import so.p8;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class d extends jd1.d implements af2.c {

    /* renamed from: c1, reason: collision with root package name */
    public ye2.m f88332c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f88333d1;

    /* renamed from: e1, reason: collision with root package name */
    public volatile ye2.h f88334e1;

    /* renamed from: f1, reason: collision with root package name */
    public final Object f88335f1 = new Object();

    /* renamed from: g1, reason: collision with root package name */
    public boolean f88336g1 = false;

    public final void A9() {
        if (this.f88332c1 == null) {
            this.f88332c1 = new ye2.m(super.getContext(), this);
            this.f88333d1 = ue.c.x(super.getContext());
        }
    }

    public final void B9() {
        if (this.f88336g1) {
            return;
        }
        this.f88336g1 = true;
        r rVar = (r) this;
        x8 x8Var = (x8) ((s) generatedComponent());
        oa oaVar = x8Var.f114707a;
        rVar.f91283h = oaVar.Ec;
        rVar.f91284i = (x2) oaVar.f113800m3.get();
        rVar.f91285j = (f0) oaVar.f113747j2.get();
        rVar.f91286k = r70.b.f106349i.k0();
        rVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        rVar.f91288m = (bz.i) oaVar.C9.get();
        rVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        rVar.f91290o = (ac2.m) oaVar.C7.get();
        rVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        rVar.f91292q = (ku1.a) s8Var.f114402n.get();
        rVar.f91293r = s8Var.u6();
        rVar.f91294s = (ff0.f) s8Var.f114417o.get();
        rVar.f91295t = oaVar.T2();
        rVar.f91296u = (d1) oaVar.f113730i2.get();
        rVar.f91297v = (b60.b) oaVar.f113850p0.get();
        rVar.f91298w = (m60.w) oaVar.f113885r0.get();
        rVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        rVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        rVar.f91301z = (a80.a) oaVar.Wc.get();
        rVar.A = (z70.f) oaVar.f113764k2.get();
        rVar.f114986u0 = oaVar.v2();
        rVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        rVar.f114988w0 = s8Var.X5();
        rVar.f114989x0 = s8Var.h6();
        rVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        kg.o.x(rVar);
        ig1.b.x0(rVar, (jd1.e) s8Var.f114465r2.get());
        g3.A1(rVar, (p8) s8Var.f114290f5.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f88333d1) {
            return null;
        }
        A9();
        return this.f88332c1;
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
        if (this.f88334e1 == null) {
            synchronized (this.f88335f1) {
                try {
                    if (this.f88334e1 == null) {
                        this.f88334e1 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f88334e1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f88332c1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A9();
        B9();
    }
}
