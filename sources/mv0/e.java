package mv0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import jr.a;
import kh2.j1;
import kh2.k3;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class e<T extends jr.a> extends MvpViewPagerFragment<T> implements af2.c {

    /* renamed from: m0, reason: collision with root package name */
    public ye2.m f88337m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f88338n0;

    /* renamed from: o0, reason: collision with root package name */
    public volatile ye2.h f88339o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Object f88340p0 = new Object();

    /* renamed from: q0, reason: collision with root package name */
    public boolean f88341q0 = false;

    @Override // af2.c
    /* renamed from: g8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f88339o0 == null) {
            synchronized (this.f88340p0) {
                try {
                    if (this.f88339o0 == null) {
                        this.f88339o0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f88339o0;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f88338n0) {
            return null;
        }
        h8();
        return this.f88337m0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h8() {
        if (this.f88337m0 == null) {
            this.f88337m0 = new ye2.m(super.getContext(), this);
            this.f88338n0 = ue.c.x(super.getContext());
        }
    }

    public final void i8() {
        if (this.f88341q0) {
            return;
        }
        this.f88341q0 = true;
        t tVar = (t) this;
        x8 x8Var = (x8) ((u) generatedComponent());
        oa oaVar = x8Var.f114707a;
        tVar.f91283h = oaVar.Ec;
        tVar.f91284i = (x2) oaVar.f113800m3.get();
        tVar.f91285j = (f0) oaVar.f113747j2.get();
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
        k3.d1(tVar, (uk1.e) oaVar.f113702ga.get());
        k3.Q0(tVar, (so.b) s8Var.f114320h5.get());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        h8();
        i8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f88337m0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h8();
        i8();
    }
}
