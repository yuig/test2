package ki1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;
import ye2.h;
import ye2.m;

/* loaded from: classes2.dex */
public abstract class a extends jl1.a implements af2.c {

    /* renamed from: h, reason: collision with root package name */
    public m f79798h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f79799i;

    /* renamed from: j, reason: collision with root package name */
    public volatile h f79800j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f79801k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public boolean f79802l = false;

    @Override // af2.c
    /* renamed from: Q6, reason: merged with bridge method [inline-methods] */
    public final h componentManager() {
        if (this.f79800j == null) {
            synchronized (this.f79801k) {
                try {
                    if (this.f79800j == null) {
                        this.f79800j = new h(this);
                    }
                } finally {
                }
            }
        }
        return this.f79800j;
    }

    public final void R6() {
        if (this.f79798h == null) {
            this.f79798h = new m(super.getContext(), this);
            this.f79799i = ue.c.x(super.getContext());
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f79799i) {
            return null;
        }
        R6();
        return this.f79798h;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        R6();
        if (this.f79802l) {
            return;
        }
        this.f79802l = true;
        ((c) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f79798h;
        d7.b.q(mVar == null || h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        R6();
        if (this.f79802l) {
            return;
        }
        this.f79802l = true;
        ((c) generatedComponent()).getClass();
    }
}
