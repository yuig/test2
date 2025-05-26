package a41;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import jr.a;
import kh2.j1;
import nx.d1;
import so.a2;
import so.oa;
import so.s8;
import so.w1;
import so.x1;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class a<T extends jr.a> extends MvpViewPagerFragment<T> implements af2.c {

    /* renamed from: m0, reason: collision with root package name */
    public ye2.m f542m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f543n0;

    /* renamed from: o0, reason: collision with root package name */
    public volatile ye2.h f544o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Object f545p0 = new Object();

    /* renamed from: q0, reason: collision with root package name */
    public boolean f546q0 = false;

    @Override // af2.c
    /* renamed from: g8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f544o0 == null) {
            synchronized (this.f545p0) {
                try {
                    if (this.f544o0 == null) {
                        this.f544o0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f544o0;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f543n0) {
            return null;
        }
        h8();
        return this.f542m0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h8() {
        if (this.f542m0 == null) {
            this.f542m0 = new ye2.m(super.getContext(), this);
            this.f543n0 = ue.c.x(super.getContext());
        }
    }

    public final void i8() {
        if (this.f546q0) {
            return;
        }
        this.f546q0 = true;
        r rVar = (r) this;
        x8 x8Var = (x8) ((s) generatedComponent());
        oa oaVar = x8Var.f114707a;
        rVar.f91283h = oaVar.Ec;
        rVar.f91284i = (x2) oaVar.f113800m3.get();
        rVar.f91285j = (nx.f0) oaVar.f113747j2.get();
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
        kh2.j.n2(rVar, (yk1.v) s8Var.C.get());
        kh2.j.l1(rVar, (yk1.j) oaVar.Qc.get());
        kh2.j.f2(rVar, (i92.k) oaVar.f113921t1.get());
        kh2.j.M0(rVar, (zf0.f) oaVar.f113723hd.get());
        kh2.j.K0(rVar, (hf0.c) oaVar.f113717h7.get());
        kh2.j.E0(rVar, (a11.d) oaVar.f113668ec.get());
        kh2.j.I1(rVar, (uk1.e) oaVar.f113702ga.get());
        kh2.j.Q1(rVar, (w1) s8Var.f114500t8.get());
        kh2.j.P1(rVar, (x1) s8Var.f114530v8.get());
        kh2.j.j1(rVar, (so.v) s8Var.L5.get());
        kh2.j.T0(rVar, oaVar.W2());
        kh2.j.b1(rVar, (zp.j) s8Var.U2.get());
        kh2.j.R1(rVar, (a2) s8Var.f114545w8.get());
        kh2.j.D1(rVar, (lb0.r) oaVar.f113622c1.get());
        kh2.j.Z1(rVar, s8Var.D6());
        kh2.j.Q0(rVar, (rg0.s) oaVar.Q5.get());
        kh2.j.y0(rVar, s8Var.e5());
        s8Var.C5();
        kh2.j.I0(rVar);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        h8();
        i8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f542m0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h8();
        i8();
    }
}
