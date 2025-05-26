package q91;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import kh2.g3;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class x extends m {
    public ye2.m D0;
    public boolean E0;
    public boolean F0 = false;

    @Override // q91.w
    public final void T8() {
        if (this.F0) {
            return;
        }
        this.F0 = true;
        p pVar = (p) this;
        x8 x8Var = (x8) ((q) generatedComponent());
        oa oaVar = x8Var.f114707a;
        pVar.f91283h = oaVar.Ec;
        pVar.f91284i = (x2) oaVar.f113800m3.get();
        pVar.f91285j = (nx.f0) oaVar.f113747j2.get();
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
        pVar.f91296u = (nx.d1) oaVar.f113730i2.get();
        pVar.f91297v = (b60.b) oaVar.f113850p0.get();
        pVar.f91298w = (m60.w) oaVar.f113885r0.get();
        pVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        pVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        pVar.f91301z = (a80.a) oaVar.Wc.get();
        pVar.A = (z70.f) oaVar.f113764k2.get();
        g3.V0(pVar, (so.o0) s8Var.U6.get());
    }

    public final void U8() {
        if (this.D0 == null) {
            this.D0 = new ye2.m(super.getContext(), this);
            this.E0 = ue.c.x(super.getContext());
        }
    }

    @Override // q91.w, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.E0) {
            return null;
        }
        U8();
        return this.D0;
    }

    @Override // q91.m, q91.w, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        U8();
        T8();
    }

    @Override // q91.w, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // q91.w, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.D0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        U8();
        T8();
    }
}
