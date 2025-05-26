package ku;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import cu.i;
import cu.m;
import ff0.f;
import hs1.q;
import kh2.c3;
import kh2.j1;
import kh2.p2;
import m60.w;
import nx.d1;
import nx.f0;
import qt.g;
import so.oa;
import so.q8;
import so.s8;
import so.x8;
import x02.x2;
import ye2.h;

/* loaded from: classes.dex */
public abstract class e<Presenter extends g, Sheet extends i> extends m<Presenter, Sheet> implements af2.c {

    /* renamed from: v0, reason: collision with root package name */
    public ye2.m f80883v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f80884w0;

    /* renamed from: x0, reason: collision with root package name */
    public volatile h f80885x0;

    /* renamed from: y0, reason: collision with root package name */
    public final Object f80886y0 = new Object();

    /* renamed from: z0, reason: collision with root package name */
    public boolean f80887z0 = false;

    @Override // yk1.k
    public /* bridge */ /* synthetic */ yk1.m V7() {
        return super.Z7();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f80884w0) {
            return null;
        }
        j8();
        return this.f80883v0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // af2.c
    /* renamed from: i8, reason: merged with bridge method [inline-methods] */
    public final h componentManager() {
        if (this.f80885x0 == null) {
            synchronized (this.f80886y0) {
                try {
                    if (this.f80885x0 == null) {
                        this.f80885x0 = new h(this);
                    }
                } finally {
                }
            }
        }
        return this.f80885x0;
    }

    public final void j8() {
        if (this.f80883v0 == null) {
            this.f80883v0 = new ye2.m(super.getContext(), this);
            this.f80884w0 = ue.c.x(super.getContext());
        }
    }

    public final void k8() {
        if (this.f80887z0) {
            return;
        }
        this.f80887z0 = true;
        c cVar = (c) this;
        x8 x8Var = (x8) ((d) generatedComponent());
        oa oaVar = x8Var.f114707a;
        cVar.f91283h = oaVar.Ec;
        cVar.f91284i = (x2) oaVar.f113800m3.get();
        cVar.f91285j = (f0) oaVar.f113747j2.get();
        cVar.f91286k = r70.b.f106349i.k0();
        cVar.f91287l = (q) oaVar.f113875q7.get();
        cVar.f91288m = (bz.i) oaVar.C9.get();
        cVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        cVar.f91290o = (ac2.m) oaVar.C7.get();
        cVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        cVar.f91292q = (ku1.a) s8Var.f114402n.get();
        cVar.f91293r = s8Var.u6();
        cVar.f91294s = (f) s8Var.f114417o.get();
        cVar.f91295t = oaVar.T2();
        cVar.f91296u = (d1) oaVar.f113730i2.get();
        cVar.f91297v = (b60.b) oaVar.f113850p0.get();
        cVar.f91298w = (w) oaVar.f113885r0.get();
        cVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        cVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        cVar.f91301z = (a80.a) oaVar.Wc.get();
        cVar.A = (z70.f) oaVar.f113764k2.get();
        p2.r0(cVar, (jo1.c) oaVar.f113810md.get());
        p2.D0(cVar, oaVar.w2());
        c3.O(cVar, (q8) s8Var.T.get());
        c3.Y(cVar, (kt.a) s8Var.M.get());
    }

    @Override // cu.m, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        j8();
        k8();
    }

    @Override // cu.m, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f80883v0;
        d7.b.q(mVar == null || h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j8();
        k8();
    }
}
