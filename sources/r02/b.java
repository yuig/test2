package r02;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import nx.d1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class b extends mm1.l {

    /* renamed from: d0, reason: collision with root package name */
    public ye2.m f105718d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f105719e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f105720f0 = false;

    @Override // mm1.o
    public final void X7() {
        if (this.f105720f0) {
            return;
        }
        this.f105720f0 = true;
        j jVar = (j) this;
        x8 x8Var = (x8) ((k) generatedComponent());
        oa oaVar = x8Var.f114707a;
        jVar.f91283h = oaVar.Ec;
        jVar.f91284i = (x2) oaVar.f113800m3.get();
        jVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        jVar.f91286k = r70.b.f106349i.k0();
        jVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        jVar.f91288m = (bz.i) oaVar.C9.get();
        jVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        jVar.f91290o = (ac2.m) oaVar.C7.get();
        jVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        jVar.f91292q = (ku1.a) s8Var.f114402n.get();
        jVar.f91293r = s8Var.u6();
        jVar.f91294s = (ff0.f) s8Var.f114417o.get();
        jVar.f91295t = oaVar.T2();
        jVar.f91296u = (d1) oaVar.f113730i2.get();
        jVar.f91297v = (b60.b) oaVar.f113850p0.get();
        jVar.f91298w = (m60.w) oaVar.f113885r0.get();
        jVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        jVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        jVar.f91301z = (a80.a) oaVar.Wc.get();
        jVar.A = (z70.f) oaVar.f113764k2.get();
        c0.d.Z0(jVar, (mo1.d) oaVar.D5.get());
    }

    public final void c8() {
        if (this.f105718d0 == null) {
            this.f105718d0 = new ye2.m(super.getContext(), this);
            this.f105719e0 = ue.c.x(super.getContext());
        }
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f105719e0) {
            return null;
        }
        c8();
        return this.f105718d0;
    }

    @Override // mm1.o, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        c8();
        X7();
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f105718d0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c8();
        X7();
    }
}
