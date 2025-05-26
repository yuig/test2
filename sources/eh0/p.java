package eh0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import nx.f0;
import so.x8;

/* loaded from: classes5.dex */
public abstract class p extends mf0.f {

    /* renamed from: c0, reason: collision with root package name */
    public ye2.m f58946c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f58947d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f58948e0 = false;

    @Override // mf0.f
    public final void Y6() {
        if (this.f58948e0) {
            return;
        }
        this.f58948e0 = true;
        x8 x8Var = (x8) ((j) generatedComponent());
        ((i) this).Z = (f0) x8Var.f114707a.f113747j2.get();
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f58947d0) {
            return null;
        }
        p7();
        return this.f58946c0;
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
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    public final void p7() {
        if (this.f58946c0 == null) {
            this.f58946c0 = new ye2.m(super.getContext(), this);
            this.f58947d0 = ue.c.x(super.getContext());
        }
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f58946c0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p7();
        Y6();
    }
}
