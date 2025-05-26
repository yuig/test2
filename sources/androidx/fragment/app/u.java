package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f18438a;

    public u(Fragment fragment) {
        this.f18438a = fragment;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z zVar, androidx.lifecycle.q qVar) {
        View view;
        if (qVar != androidx.lifecycle.q.ON_STOP || (view = this.f18438a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
