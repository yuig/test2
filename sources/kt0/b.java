package kt0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.p1;
import kh2.j1;

/* loaded from: classes.dex */
public abstract class b extends jl1.a implements af2.c {

    /* renamed from: h, reason: collision with root package name */
    public ye2.m f80797h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f80798i;

    /* renamed from: j, reason: collision with root package name */
    public volatile ye2.h f80799j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f80800k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public boolean f80801l = false;

    @Override // af2.c
    /* renamed from: Q6, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f80799j == null) {
            synchronized (this.f80800k) {
                try {
                    if (this.f80799j == null) {
                        this.f80799j = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f80799j;
    }

    public final void R6() {
        if (this.f80797h == null) {
            this.f80797h = new ye2.m(super.getContext(), this);
            this.f80798i = ue.c.x(super.getContext());
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f80798i) {
            return null;
        }
        R6();
        return this.f80797h;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        R6();
        if (this.f80801l) {
            return;
        }
        this.f80801l = true;
        ((f0) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f80797h;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        R6();
        if (this.f80801l) {
            return;
        }
        this.f80801l = true;
        ((f0) generatedComponent()).getClass();
    }
}
