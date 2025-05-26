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
import so.n2;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes.dex */
public abstract class h extends d implements af2.c {

    /* renamed from: b1, reason: collision with root package name */
    public ye2.m f69696b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f69697c1;

    /* renamed from: d1, reason: collision with root package name */
    public volatile ye2.h f69698d1;

    /* renamed from: e1, reason: collision with root package name */
    public final Object f69699e1 = new Object();

    /* renamed from: f1, reason: collision with root package name */
    public boolean f69700f1 = false;

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f69697c1) {
            return null;
        }
        k9();
        return this.f69696b1;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // af2.c
    /* renamed from: j9, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f69698d1 == null) {
            synchronized (this.f69699e1) {
                try {
                    if (this.f69698d1 == null) {
                        this.f69698d1 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f69698d1;
    }

    public final void k9() {
        if (this.f69696b1 == null) {
            this.f69696b1 = new ye2.m(super.getContext(), this);
            this.f69697c1 = ue.c.x(super.getContext());
        }
    }

    public final void l9() {
        if (this.f69700f1) {
            return;
        }
        this.f69700f1 = true;
        m mVar = (m) this;
        x8 x8Var = (x8) ((n) generatedComponent());
        oa oaVar = x8Var.f114707a;
        mVar.f91283h = oaVar.Ec;
        mVar.f91284i = (x2) oaVar.f113800m3.get();
        mVar.f91285j = (f0) oaVar.f113747j2.get();
        mVar.f91286k = r70.b.f106349i.k0();
        mVar.f91287l = (q) oaVar.f113875q7.get();
        mVar.f91288m = (bz.i) oaVar.C9.get();
        mVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        mVar.f91290o = (ac2.m) oaVar.C7.get();
        mVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        mVar.f91292q = (ku1.a) s8Var.f114402n.get();
        mVar.f91293r = s8Var.u6();
        mVar.f91294s = (ff0.f) s8Var.f114417o.get();
        mVar.f91295t = oaVar.T2();
        mVar.f91296u = (d1) oaVar.f113730i2.get();
        mVar.f91297v = (b60.b) oaVar.f113850p0.get();
        mVar.f91298w = (w) oaVar.f113885r0.get();
        mVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        mVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        mVar.f91301z = (a80.a) oaVar.Wc.get();
        mVar.A = (z70.f) oaVar.f113764k2.get();
        mVar.f114986u0 = oaVar.v2();
        mVar.f114987v0 = (jq.c) s8Var.f114432p.get();
        mVar.f114988w0 = s8Var.X5();
        mVar.f114989x0 = s8Var.h6();
        mVar.f114990y0 = (c6) s8Var.f114447q.get();
        a02.e.H2();
        o.x(mVar);
        kh2.j.T1(mVar, (w) oaVar.f113885r0.get());
        kh2.j.S1(mVar, (b60.b) oaVar.f113850p0.get());
        kh2.j.w1(mVar, (i2) oaVar.F3.get());
        kh2.j.B0(mVar, oaVar.i2());
        kh2.j.U1(mVar, (n2) s8Var.X8.get());
        kh2.j.Z0(mVar, (il1.a) s8Var.f114581z.get());
        kh2.j.x0(mVar, (lu1.b) oaVar.f113961v5.get());
        kh2.j.D0(mVar, (z70.m) s8Var.f114387m.get());
        kh2.j.h2(mVar, (i92.k) oaVar.f113921t1.get());
        m60.f0 f0Var = vb0.j.f125466a;
        dl2.b.I(f0Var);
        kh2.j.J0(mVar, f0Var);
        s8Var.l6();
        kh2.j.W1(mVar);
        kh2.j.V1(mVar, (ac2.m) oaVar.C7.get());
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
        ye2.m mVar = this.f69696b1;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k9();
        l9();
    }
}
