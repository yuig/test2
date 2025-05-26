package g41;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import m60.d0;
import m60.g0;
import m60.w;
import nx.d1;
import nx.f0;
import nx.o0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import yq0.a0;
import yq0.b0;

/* loaded from: classes2.dex */
public abstract class h<D extends a0> extends b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f63507u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f63508v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f63509w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f63510x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f63511y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f63509w0 == null) {
            synchronized (this.f63510x0) {
                try {
                    if (this.f63509w0 == null) {
                        this.f63509w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f63509w0;
    }

    public final void S8() {
        if (this.f63507u0 == null) {
            this.f63507u0 = new ye2.m(super.getContext(), this);
            this.f63508v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f63511y0) {
            return;
        }
        this.f63511y0 = true;
        c cVar = (c) this;
        x8 x8Var = (x8) ((d) generatedComponent());
        oa oaVar = x8Var.f114707a;
        cVar.f91283h = oaVar.Ec;
        cVar.f91284i = (x2) oaVar.f113800m3.get();
        cVar.f91285j = (f0) oaVar.f113747j2.get();
        cVar.f91286k = r70.b.f106349i.k0();
        cVar.f91287l = (hs1.q) oaVar.f113875q7.get();
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
        kh2.j.r1(cVar, (g0) oaVar.f113590a4.get());
        kh2.j.J1(cVar, (uk1.e) oaVar.f113702ga.get());
        kh2.j.d1(cVar, (d0) s8Var.T0.get());
        kh2.j.a1(cVar, oaVar.j2());
        kh2.j.F0(cVar, (pb0.a) oaVar.f113834o1.get());
        kh2.j.y1(cVar, (o0) oaVar.T1.get());
        kh2.j.z0(cVar, s8Var.e5());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f63508v0) {
            return null;
        }
        S8();
        return this.f63507u0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        S8();
        T8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f63507u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
