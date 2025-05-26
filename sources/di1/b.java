package di1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import hs1.q;
import i92.k;
import kh2.b0;
import m60.w;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import so.z3;
import x02.x2;
import ye2.m;

/* loaded from: classes2.dex */
public abstract class b extends g {

    /* renamed from: v0, reason: collision with root package name */
    public m f55048v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f55049w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f55050x0 = false;

    @Override // di1.a
    public final void a8() {
        if (this.f55050x0) {
            return;
        }
        this.f55050x0 = true;
        i iVar = (i) this;
        x8 x8Var = (x8) ((j) generatedComponent());
        oa oaVar = x8Var.f114707a;
        iVar.f91283h = oaVar.Ec;
        iVar.f91284i = (x2) oaVar.f113800m3.get();
        iVar.f91285j = (f0) oaVar.f113747j2.get();
        iVar.f91286k = r70.b.f106349i.k0();
        iVar.f91287l = (q) oaVar.f113875q7.get();
        iVar.f91288m = (bz.i) oaVar.C9.get();
        iVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        iVar.f91290o = (ac2.m) oaVar.C7.get();
        iVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        iVar.f91292q = (ku1.a) s8Var.f114402n.get();
        iVar.f91293r = s8Var.u6();
        iVar.f91294s = (ff0.f) s8Var.f114417o.get();
        iVar.f91295t = oaVar.T2();
        iVar.f91296u = (d1) oaVar.f113730i2.get();
        iVar.f91297v = (b60.b) oaVar.f113850p0.get();
        iVar.f91298w = (w) oaVar.f113885r0.get();
        iVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        iVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        iVar.f91301z = (a80.a) oaVar.Wc.get();
        iVar.A = (z70.f) oaVar.f113764k2.get();
        b0.r1(iVar, (k) oaVar.f113921t1.get());
        b0.g1(iVar, (uk1.e) oaVar.f113702ga.get());
        b0.I0(iVar, (a11.d) oaVar.f113668ec.get());
        b0.v1(iVar, (z3) s8Var.f114238bc.get());
        b0.S0(iVar, s8Var.M6());
    }

    public final void c8() {
        if (this.f55048v0 == null) {
            this.f55048v0 = new m(super.getContext(), this);
            this.f55049w0 = ue.c.x(super.getContext());
        }
    }

    @Override // di1.a, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f55049w0) {
            return null;
        }
        c8();
        return this.f55048v0;
    }

    @Override // di1.a, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        c8();
        a8();
    }

    @Override // di1.a, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // di1.a, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f55048v0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c8();
        a8();
    }
}
