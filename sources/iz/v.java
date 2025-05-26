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
public abstract class v extends hz.d {

    /* renamed from: s0, reason: collision with root package name */
    public ye2.m f73882s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f73883t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f73884u0 = false;

    @Override // hz.j
    public final void a8() {
        if (this.f73884u0) {
            return;
        }
        this.f73884u0 = true;
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
        cVar.f91298w = (m60.w) oaVar.f113885r0.get();
        cVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        cVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        cVar.f91301z = (a80.a) oaVar.Wc.get();
        cVar.A = (z70.f) oaVar.f113764k2.get();
        a1.G(cVar, (cz.e) oaVar.V9.get());
        a1.R(cVar, s8Var.Z4());
    }

    @Override // hz.j, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f73883t0) {
            return null;
        }
        i8();
        return this.f73882s0;
    }

    public final void i8() {
        if (this.f73882s0 == null) {
            this.f73882s0 = new ye2.m(super.getContext(), this);
            this.f73883t0 = ue.c.x(super.getContext());
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
        ye2.m mVar = this.f73882s0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        i8();
        a8();
    }
}
