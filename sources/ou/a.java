package ou;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import hs1.q;
import m60.w;
import nx.d1;
import nx.f0;
import pu.j0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a extends j0 {

    /* renamed from: v0, reason: collision with root package name */
    public ye2.m f97680v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f97681w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f97682x0 = false;

    @Override // pu.c0, mu.b0
    public final void X7() {
        if (this.f97682x0) {
            return;
        }
        this.f97682x0 = true;
        h hVar = (h) this;
        x8 x8Var = (x8) ((i) generatedComponent());
        oa oaVar = x8Var.f114707a;
        hVar.f91283h = oaVar.Ec;
        hVar.f91284i = (x2) oaVar.f113800m3.get();
        hVar.f91285j = (f0) oaVar.f113747j2.get();
        hVar.f91286k = r70.b.f106349i.k0();
        hVar.f91287l = (q) oaVar.f113875q7.get();
        hVar.f91288m = (bz.i) oaVar.C9.get();
        hVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        hVar.f91290o = (ac2.m) oaVar.C7.get();
        hVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        hVar.f91292q = (ku1.a) s8Var.f114402n.get();
        hVar.f91293r = s8Var.u6();
        hVar.f91294s = (ff0.f) s8Var.f114417o.get();
        hVar.f91295t = oaVar.T2();
        hVar.f91296u = (d1) oaVar.f113730i2.get();
        hVar.f91297v = (b60.b) oaVar.f113850p0.get();
        hVar.f91298w = (w) oaVar.f113885r0.get();
        hVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        hVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        hVar.f91301z = (a80.a) oaVar.Wc.get();
        hVar.A = (z70.f) oaVar.f113764k2.get();
        el.a.n1(hVar, oaVar.w2());
        kh2.d.S(hVar, (z70.m) s8Var.f114387m.get());
        kh2.d.U(hVar);
    }

    public final void g8() {
        if (this.f97680v0 == null) {
            this.f97680v0 = new ye2.m(super.getContext(), this);
            this.f97681w0 = ue.c.x(super.getContext());
        }
    }

    @Override // pu.c0, mu.b0, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f97681w0) {
            return null;
        }
        g8();
        return this.f97680v0;
    }

    @Override // pu.c0, mu.p0, mu.b0, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        g8();
        X7();
    }

    @Override // pu.c0, mu.p0, mu.b0, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // pu.c0, mu.b0, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f97680v0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g8();
        X7();
    }
}
