package to0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.pinterest.feature.browser.view.InAppBrowserFragment;
import nx.d1;
import nx.f0;
import so.l0;
import so.m0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class i extends InAppBrowserFragment {
    public ye2.m U0;
    public boolean V0;
    public boolean W0 = false;

    @Override // to0.h, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.V0) {
            return null;
        }
        k8();
        return this.U0;
    }

    @Override // to0.h
    public final void h8() {
        if (this.W0) {
            return;
        }
        this.W0 = true;
        o oVar = (o) this;
        x8 x8Var = (x8) ((p) generatedComponent());
        oa oaVar = x8Var.f114707a;
        oVar.f91283h = oaVar.Ec;
        oVar.f91284i = (x2) oaVar.f113800m3.get();
        oVar.f91285j = (f0) oaVar.f113747j2.get();
        oVar.f91286k = r70.b.f106349i.k0();
        oVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        oVar.f91288m = (bz.i) oaVar.C9.get();
        oVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        oVar.f91290o = (ac2.m) oaVar.C7.get();
        oVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        oVar.f91292q = (ku1.a) s8Var.f114402n.get();
        oVar.f91293r = s8Var.u6();
        oVar.f91294s = (ff0.f) s8Var.f114417o.get();
        oVar.f91295t = oaVar.T2();
        oVar.f91296u = (d1) oaVar.f113730i2.get();
        oVar.f91297v = (b60.b) oaVar.f113850p0.get();
        oVar.f91298w = (m60.w) oaVar.f113885r0.get();
        oVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        oVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        oVar.f91301z = (a80.a) oaVar.Wc.get();
        oVar.A = (z70.f) oaVar.f113764k2.get();
        el.a.d0(oVar, (lu1.b) oaVar.f113961v5.get());
        el.a.e2(oVar, (d1) oaVar.f113730i2.get());
        el.a.a2(oVar, (lu1.d) oaVar.f113782l2.get());
        el.a.X0(oVar, (so.v) s8Var.L5.get());
        el.a.H0(oVar, (m60.w) oaVar.f113885r0.get());
        el.a.Z1(oVar, s8Var.O6());
        el.a.S1(oVar);
        el.a.n0(oVar, s8Var.f114387m);
        el.a.d2(oVar, (a80.a) oaVar.Wc.get());
        el.a.A1(oVar, (lb0.q) oaVar.O0.get());
        s8Var.N5();
        el.a.N0(oVar);
        el.a.b2(oVar, (f30.b) oaVar.V1.get());
        el.a.c2(oVar, s8Var.r5());
        el.a.L1(oVar, s8Var.D6());
        kh2.n.O(oVar, (f0) oaVar.f113747j2.get());
        kh2.n.P(oVar, (l0) s8Var.A6.get());
        kh2.n.C(oVar, (ad0.b) s8Var.B6.get());
        kh2.r.u0(oVar, (m0) s8Var.D6.get());
    }

    public final void k8() {
        if (this.U0 == null) {
            this.U0 = new ye2.m(super.getContext(), this);
            this.V0 = ue.c.x(super.getContext());
        }
    }

    @Override // to0.h, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        k8();
        h8();
    }

    @Override // to0.h, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // to0.h, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.U0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k8();
        h8();
    }
}
