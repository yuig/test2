package gb1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import com.pinterest.api.model.kz;
import kh2.j1;
import kotlin.Metadata;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgb1/s;", "Lgb1/c;", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class s extends c implements af2.c {
    public ye2.m A0;
    public boolean B0;
    public volatile ye2.h C0;
    public final Object D0;
    public boolean E0;

    public s() {
        super(kz.NOTIFICATION_SETTING_TYPE_PUSH);
        this.D0 = new Object();
        this.E0 = false;
    }

    @Override // af2.c
    /* renamed from: R8, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.C0 == null) {
            synchronized (this.D0) {
                try {
                    if (this.C0 == null) {
                        this.C0 = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.C0;
    }

    public final void S8() {
        if (this.A0 == null) {
            this.A0 = new ye2.m(super.getContext(), this);
            this.B0 = ue.c.x(super.getContext());
        }
    }

    public final void T8() {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        x8 x8Var = (x8) ((t) generatedComponent());
        oa oaVar = x8Var.f114707a;
        this.f91283h = oaVar.Ec;
        this.f91284i = (x2) oaVar.f113800m3.get();
        this.f91285j = (f0) oaVar.f113747j2.get();
        this.f91286k = r70.b.f106349i.k0();
        this.f91287l = (hs1.q) oaVar.f113875q7.get();
        this.f91288m = (bz.i) oaVar.C9.get();
        this.f91289n = (lu1.d) oaVar.f113782l2.get();
        this.f91290o = (ac2.m) oaVar.C7.get();
        this.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        this.f91292q = (ku1.a) s8Var.f114402n.get();
        this.f91293r = s8Var.u6();
        this.f91294s = (ff0.f) s8Var.f114417o.get();
        this.f91295t = oaVar.T2();
        this.f91296u = (d1) oaVar.f113730i2.get();
        this.f91297v = (b60.b) oaVar.f113850p0.get();
        this.f91298w = (m60.w) oaVar.f113885r0.get();
        this.f91299x = (tb0.h) oaVar.f113797m0.get();
        this.f91300y = (uj2.q) oaVar.f113947u9.get();
        this.f91301z = (a80.a) oaVar.Wc.get();
        this.A = (z70.f) oaVar.f113764k2.get();
        this.f64684v0 = (uk1.e) oaVar.f113702ga.get();
        this.f64685w0 = (r20.a) s8Var.f114273e3.get();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.B0) {
            return null;
        }
        S8();
        return this.A0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        S8();
        T8();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.A0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S8();
        T8();
    }
}
