package ws;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import nx.d1;
import nx.f0;
import pu.j0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class b0 extends j0 {

    /* renamed from: v0, reason: collision with root package name */
    public ye2.m f131048v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f131049w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f131050x0 = false;

    @Override // pu.c0, mu.b0
    public final void X7() {
        if (this.f131050x0) {
            return;
        }
        this.f131050x0 = true;
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
        el.a.n1(oVar, oaVar.w2());
        kh2.d.S(oVar, (z70.m) s8Var.f114387m.get());
        kh2.d.U(oVar);
        el.a.v1(oVar);
        s8Var.h5();
        el.a.q0(oVar);
        el.a.m0(oVar, (zs.a) oaVar.f113792ld.get());
    }

    public final void g8() {
        if (this.f131048v0 == null) {
            this.f131048v0 = new ye2.m(super.getContext(), this);
            this.f131049w0 = ue.c.x(super.getContext());
        }
    }

    @Override // pu.c0, mu.b0, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f131049w0) {
            return null;
        }
        g8();
        return this.f131048v0;
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
        ye2.m mVar = this.f131048v0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g8();
        X7();
    }
}
