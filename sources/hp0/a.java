package hp0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import kh2.g3;
import nx.d1;
import so.o1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a extends mm1.l {

    /* renamed from: d0, reason: collision with root package name */
    public ye2.m f69818d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f69819e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f69820f0 = false;

    @Override // mm1.o
    public final void X7() {
        if (this.f69820f0) {
            return;
        }
        this.f69820f0 = true;
        t tVar = (t) this;
        x8 x8Var = (x8) ((u) generatedComponent());
        oa oaVar = x8Var.f114707a;
        tVar.f91283h = oaVar.Ec;
        tVar.f91284i = (x2) oaVar.f113800m3.get();
        tVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        tVar.f91286k = r70.b.f106349i.k0();
        tVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        tVar.f91288m = (bz.i) oaVar.C9.get();
        tVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        tVar.f91290o = (ac2.m) oaVar.C7.get();
        tVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        tVar.f91292q = (ku1.a) s8Var.f114402n.get();
        tVar.f91293r = s8Var.u6();
        tVar.f91294s = (ff0.f) s8Var.f114417o.get();
        tVar.f91295t = oaVar.T2();
        tVar.f91296u = (d1) oaVar.f113730i2.get();
        tVar.f91297v = (b60.b) oaVar.f113850p0.get();
        tVar.f91298w = (m60.w) oaVar.f113885r0.get();
        tVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        tVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        tVar.f91301z = (a80.a) oaVar.Wc.get();
        tVar.A = (z70.f) oaVar.f113764k2.get();
        g3.D1(tVar, (uk1.e) oaVar.f113702ga.get());
        g3.L1(tVar, (o1) s8Var.f114345j0.get());
        g3.k1(tVar, (yk1.j) oaVar.Qc.get());
        g3.i1(tVar, s8Var.a6());
    }

    public final void c8() {
        if (this.f69818d0 == null) {
            this.f69818d0 = new ye2.m(super.getContext(), this);
            this.f69819e0 = ue.c.x(super.getContext());
        }
    }

    @Override // mm1.o, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f69819e0) {
            return null;
        }
        c8();
        return this.f69818d0;
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
        ye2.m mVar = this.f69818d0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c8();
        X7();
    }
}
