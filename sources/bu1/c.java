package bu1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import bz.i;
import com.pinterest.nav.fragment.DeepLinkFragment;
import ff0.f;
import hs1.q;
import kh2.j1;
import m60.e;
import m60.w;
import nl1.d;
import nx.d1;
import nx.f0;
import rd.j;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;
import ye2.h;
import ye2.m;

/* loaded from: classes4.dex */
public abstract class c extends d implements af2.c {
    public m X;
    public boolean Y;
    public volatile h Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Object f23903a0 = new Object();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f23904b0 = false;

    @Override // af2.c
    /* renamed from: V7, reason: merged with bridge method [inline-methods] */
    public final h componentManager() {
        if (this.Z == null) {
            synchronized (this.f23903a0) {
                try {
                    if (this.Z == null) {
                        this.Z = new h(this);
                    }
                } finally {
                }
            }
        }
        return this.Z;
    }

    public final void W7() {
        if (this.X == null) {
            this.X = new m(super.getContext(), this);
            this.Y = ue.c.x(super.getContext());
        }
    }

    public final void X7() {
        if (this.f23904b0) {
            return;
        }
        this.f23904b0 = true;
        DeepLinkFragment deepLinkFragment = (DeepLinkFragment) this;
        x8 x8Var = (x8) ((b) generatedComponent());
        oa oaVar = x8Var.f114707a;
        deepLinkFragment.f91283h = oaVar.Ec;
        deepLinkFragment.f91284i = (x2) oaVar.f113800m3.get();
        deepLinkFragment.f91285j = (f0) oaVar.f113747j2.get();
        deepLinkFragment.f91286k = r70.b.f106349i.k0();
        deepLinkFragment.f91287l = (q) oaVar.f113875q7.get();
        deepLinkFragment.f91288m = (i) oaVar.C9.get();
        deepLinkFragment.f91289n = (lu1.d) oaVar.f113782l2.get();
        deepLinkFragment.f91290o = (ac2.m) oaVar.C7.get();
        deepLinkFragment.f91291p = (e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        deepLinkFragment.f91292q = (ku1.a) s8Var.f114402n.get();
        deepLinkFragment.f91293r = s8Var.u6();
        deepLinkFragment.f91294s = (f) s8Var.f114417o.get();
        deepLinkFragment.f91295t = oaVar.T2();
        deepLinkFragment.f91296u = (d1) oaVar.f113730i2.get();
        deepLinkFragment.f91297v = (b60.b) oaVar.f113850p0.get();
        deepLinkFragment.f91298w = (w) oaVar.f113885r0.get();
        deepLinkFragment.f91299x = (tb0.h) oaVar.f113797m0.get();
        deepLinkFragment.f91300y = (uj2.q) oaVar.f113947u9.get();
        deepLinkFragment.f91301z = (a80.a) oaVar.Wc.get();
        deepLinkFragment.A = (z70.f) oaVar.f113764k2.get();
        deepLinkFragment.f49893d0 = oaVar.H2();
        deepLinkFragment.f49894e0 = oaVar.C2();
        deepLinkFragment.f49895f0 = (tb0.h) oaVar.f113797m0.get();
        deepLinkFragment.f49896g0 = oaVar.d2();
        deepLinkFragment.f49897h0 = (vy.m) oaVar.M1.get();
        deepLinkFragment.f49898i0 = s8Var.u5();
        deepLinkFragment.f49899j0 = new j(bf2.b.a(s8Var.f114255d.f113907s5));
        deepLinkFragment.f49900k0 = (lu1.b) oaVar.f113961v5.get();
        deepLinkFragment.f49901l0 = (qr.m) s8Var.f114298fd.get();
        deepLinkFragment.f49902m0 = (dy.a) oaVar.f113943u5.get();
        deepLinkFragment.f49903n0 = (dy.d) oaVar.f113925t5.get();
        deepLinkFragment.f49904o0 = bf2.b.a(oaVar.Tc);
        deepLinkFragment.f49905p0 = oa.I0(oaVar);
        deepLinkFragment.f49906q0 = (lb0.q) oaVar.O0.get();
        deepLinkFragment.f49907r0 = oaVar.k2();
        deepLinkFragment.f49908s0 = oa.f1(oaVar);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.Y) {
            return null;
        }
        W7();
        return this.X;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        W7();
        X7();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.X;
        d7.b.q(mVar == null || h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W7();
        X7();
    }
}
