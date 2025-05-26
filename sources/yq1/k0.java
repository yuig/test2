package yq1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class k0 extends l2 {
    public boolean A0;
    public boolean B0 = false;

    /* renamed from: z0, reason: collision with root package name */
    public ye2.m f139893z0;

    @Override // yq1.p0
    public final void a8() {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        v1 v1Var = (v1) this;
        x8 x8Var = (x8) ((w1) generatedComponent());
        oa oaVar = x8Var.f114707a;
        v1Var.f91283h = oaVar.Ec;
        v1Var.f91284i = (x2) oaVar.f113800m3.get();
        v1Var.f91285j = (nx.f0) oaVar.f113747j2.get();
        v1Var.f91286k = r70.b.f106349i.k0();
        v1Var.f91287l = (hs1.q) oaVar.f113875q7.get();
        v1Var.f91288m = (bz.i) oaVar.C9.get();
        v1Var.f91289n = (lu1.d) oaVar.f113782l2.get();
        v1Var.f91290o = (ac2.m) oaVar.C7.get();
        v1Var.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        v1Var.f91292q = (ku1.a) s8Var.f114402n.get();
        v1Var.f91293r = s8Var.u6();
        v1Var.f91294s = (ff0.f) s8Var.f114417o.get();
        v1Var.f91295t = oaVar.T2();
        v1Var.f91296u = (nx.d1) oaVar.f113730i2.get();
        v1Var.f91297v = (b60.b) oaVar.f113850p0.get();
        v1Var.f91298w = (m60.w) oaVar.f113885r0.get();
        v1Var.f91299x = (tb0.h) oaVar.f113797m0.get();
        v1Var.f91300y = (uj2.q) oaVar.f113947u9.get();
        v1Var.f91301z = (a80.a) oaVar.Wc.get();
        v1Var.A = (z70.f) oaVar.f113764k2.get();
        kh2.r.I0(v1Var, (so.k0) s8Var.f114483s6.get());
        kh2.r.N0(v1Var, (uk1.e) oaVar.f113702ga.get());
        kh2.r.o0(v1Var, s8Var.M5());
    }

    @Override // yq1.p0, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.A0) {
            return null;
        }
        m8();
        return this.f139893z0;
    }

    public final void m8() {
        if (this.f139893z0 == null) {
            this.f139893z0 = new ye2.m(super.getContext(), this);
            this.A0 = ue.c.x(super.getContext());
        }
    }

    @Override // yq1.p0, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        m8();
        a8();
    }

    @Override // yq1.p0, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // yq1.p0, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f139893z0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8();
        a8();
    }
}
