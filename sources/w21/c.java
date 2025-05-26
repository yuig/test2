package w21;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes2.dex */
public abstract class c extends mm1.l {

    /* renamed from: d0, reason: collision with root package name */
    public ye2.m f127653d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f127654e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f127655f0 = false;

    @Override // mm1.o
    public final void X7() {
        if (this.f127655f0) {
            return;
        }
        this.f127655f0 = true;
        i iVar = (i) this;
        x8 x8Var = (x8) ((j) generatedComponent());
        oa oaVar = x8Var.f114707a;
        iVar.f91283h = oaVar.Ec;
        iVar.f91284i = (x2) oaVar.f113800m3.get();
        iVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        iVar.f91286k = r70.b.f106349i.k0();
        iVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        iVar.f91288m = (bz.i) oaVar.C9.get();
        iVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        iVar.f91290o = (ac2.m) oaVar.C7.get();
        iVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        iVar.f91292q = (ku1.a) s8Var.f114402n.get();
        iVar.f91293r = s8Var.u6();
        iVar.f91294s = (ff0.f) s8Var.f114417o.get();
        iVar.f91295t = oaVar.T2();
        iVar.f91296u = (nx.d1) oaVar.f113730i2.get();
        iVar.f91297v = (b60.b) oaVar.f113850p0.get();
        iVar.f91298w = (m60.w) oaVar.f113885r0.get();
        iVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        iVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        iVar.f91301z = (a80.a) oaVar.Wc.get();
        iVar.A = (z70.f) oaVar.f113764k2.get();
    }

    public final void c8() {
        if (this.f127653d0 == null) {
            this.f127653d0 = new ye2.m(super.getContext(), this);
            this.f127654e0 = ue.c.x(super.getContext());
        }
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f127654e0) {
            return null;
        }
        c8();
        return this.f127653d0;
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
        ye2.m mVar = this.f127653d0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c8();
        X7();
    }
}
