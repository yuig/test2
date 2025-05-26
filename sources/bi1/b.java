package bi1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.i2;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class b extends p {

    /* renamed from: m0, reason: collision with root package name */
    public ye2.m f22829m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f22830n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f22831o0 = false;

    @Override // bi1.a
    public final void X7() {
        if (this.f22831o0) {
            return;
        }
        this.f22831o0 = true;
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
        pe.i.p0(rVar, (i2) oaVar.F3.get());
        pe.i.E0(rVar, s8Var.p6());
        pe.i.T(rVar, (e02.a) oaVar.f113757jd.get());
        pe.i.a0(rVar, (il1.a) s8Var.f114581z.get());
        pe.i.i0(rVar, s8Var.M6());
    }

    public final void Z7() {
        if (this.f22829m0 == null) {
            this.f22829m0 = new ye2.m(super.getContext(), this);
            this.f22830n0 = ue.c.x(super.getContext());
        }
    }

    @Override // bi1.a, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f22830n0) {
            return null;
        }
        Z7();
        return this.f22829m0;
    }

    @Override // bi1.a, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Z7();
        X7();
    }

    @Override // bi1.a, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // bi1.a, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f22829m0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        X7();
    }
}
