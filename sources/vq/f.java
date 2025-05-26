package vq;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import ye2.m;

/* loaded from: classes3.dex */
public abstract class f extends mf0.f {

    /* renamed from: c0, reason: collision with root package name */
    public m f126413c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f126414d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f126415e0 = false;

    @Override // mf0.f
    public final void Y6() {
        if (this.f126415e0) {
            return;
        }
        this.f126415e0 = true;
        c cVar = (c) this;
        x8 x8Var = (x8) ((d) generatedComponent());
        oa oaVar = x8Var.f114707a;
        cVar.Z = (f0) oaVar.f113747j2.get();
        s8 s8Var = x8Var.f114708b;
        cVar.f126406m0 = (k22.m) oaVar.Y4.get();
        cVar.f126407n0 = s8Var.p5();
        cVar.f126408o0 = (i92.k) oaVar.f113921t1.get();
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f126414d0) {
            return null;
        }
        p7();
        return this.f126413c0;
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p7();
        Y6();
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    public final void p7() {
        if (this.f126413c0 == null) {
            this.f126413c0 = new m(super.getContext(), this);
            this.f126414d0 = ue.c.x(super.getContext());
        }
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f126413c0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p7();
        Y6();
    }
}
