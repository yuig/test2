package u91;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import com.pinterest.api.model.deserializer.UserDeserializer;
import hs1.q;
import kh2.j1;
import kh2.u2;
import m60.w;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import ye2.m;
import yq0.a0;
import yq0.b0;

/* loaded from: classes2.dex */
public abstract class c<D extends a0> extends b0<D> implements af2.c {

    /* renamed from: u0, reason: collision with root package name */
    public m f121208u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f121209v0;

    /* renamed from: w0, reason: collision with root package name */
    public volatile ye2.h f121210w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f121211x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f121212y0 = false;

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f121210w0 == null) {
            synchronized (this.f121211x0) {
                try {
                    if (this.f121210w0 == null) {
                        this.f121210w0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f121210w0;
    }

    public final void S8() {
        if (this.f121208u0 == null) {
            this.f121208u0 = new m(super.getContext(), this);
            this.f121209v0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.f121212y0) {
            return;
        }
        this.f121212y0 = true;
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
        u2.q0(hVar, s8Var.z6());
        u2.z0(hVar, (uk1.e) oaVar.f113702ga.get());
        u2.A0(hVar, (x10.d) oaVar.f113997x5.get());
        u2.C0(hVar, (UserDeserializer) oaVar.f113905s3.get());
        u2.e0(hVar, s8Var.Y4());
        u2.j0(hVar, (lu1.b) oaVar.f113961v5.get());
        u2.x0(hVar, (lb0.q) oaVar.O0.get());
        u2.n0(hVar, (fr1.c) oaVar.f113821n6.get());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f121209v0) {
            return null;
        }
        S8();
        return this.f121208u0;
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
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f121208u0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
