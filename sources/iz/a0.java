package iz;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import kh2.a1;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a0 extends hz.d {

    /* renamed from: s0, reason: collision with root package name */
    public ye2.m f73825s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f73826t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f73827u0 = false;

    @Override // hz.j
    public final void a8() {
        if (this.f73827u0) {
            return;
        }
        this.f73827u0 = true;
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
        a1.G(oVar, (cz.e) oaVar.V9.get());
        a1.R(oVar, s8Var.Z4());
    }

    @Override // hz.j, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f73826t0) {
            return null;
        }
        i8();
        return this.f73825s0;
    }

    public final void i8() {
        if (this.f73825s0 == null) {
            this.f73825s0 = new ye2.m(super.getContext(), this);
            this.f73826t0 = ue.c.x(super.getContext());
        }
    }

    @Override // hz.j, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i8();
        a8();
    }

    @Override // hz.j, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // hz.j, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f73825s0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        i8();
        a8();
    }
}
