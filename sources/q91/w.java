package q91;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.g3;
import kh2.j1;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import yq0.a0;

/* loaded from: classes2.dex */
public abstract class w<D extends yq0.a0> extends yq0.b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public ye2.m f103175u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f103176v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f103177w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f103178x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f103179y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f103177w0 == null) {
            synchronized (this.f103178x0) {
                try {
                    if (this.f103177w0 == null) {
                        this.f103177w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f103177w0;
    }

    public final void S8() {
        if (this.f103175u0 == null) {
            this.f103175u0 = new ye2.m(super.getContext(), this);
            this.f103176v0 = ue.c.x(super.getContext());
        }
    }

    public void T8() {
        if (this.f103179y0) {
            return;
        }
        this.f103179y0 = true;
        m mVar = (m) this;
        x8 x8Var = (x8) ((n) generatedComponent());
        oa oaVar = x8Var.f114707a;
        mVar.f91283h = oaVar.Ec;
        mVar.f91284i = (x2) oaVar.f113800m3.get();
        mVar.f91285j = (nx.f0) oaVar.f113747j2.get();
        mVar.f91286k = r70.b.f106349i.k0();
        mVar.f91287l = (hs1.q) oaVar.f113875q7.get();
        mVar.f91288m = (bz.i) oaVar.C9.get();
        mVar.f91289n = (lu1.d) oaVar.f113782l2.get();
        mVar.f91290o = (ac2.m) oaVar.C7.get();
        mVar.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        mVar.f91292q = (ku1.a) s8Var.f114402n.get();
        mVar.f91293r = s8Var.u6();
        mVar.f91294s = (ff0.f) s8Var.f114417o.get();
        mVar.f91295t = oaVar.T2();
        mVar.f91296u = (nx.d1) oaVar.f113730i2.get();
        mVar.f91297v = (b60.b) oaVar.f113850p0.get();
        mVar.f91298w = (m60.w) oaVar.f113885r0.get();
        mVar.f91299x = (tb0.h) oaVar.f113797m0.get();
        mVar.f91300y = (uj2.q) oaVar.f113947u9.get();
        mVar.f91301z = (a80.a) oaVar.Wc.get();
        mVar.A = (z70.f) oaVar.f113764k2.get();
        g3.V0(mVar, (so.o0) s8Var.U6.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f103176v0) {
            return null;
        }
        S8();
        return this.f103175u0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        S8();
        T8();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f103175u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
