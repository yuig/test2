package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class h0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f18340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f18341b;

    public h0(i0 i0Var, d1 d1Var) {
        this.f18341b = i0Var;
        this.f18340a = d1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        d1 d1Var = this.f18340a;
        Fragment fragment = d1Var.f18305c;
        d1Var.l();
        k.m((ViewGroup) fragment.mView.getParent(), this.f18341b.f18350a).l();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
