package com.google.android.material.internal;

import android.view.View;
import java.util.WeakHashMap;
import q5.k0;
import q5.v0;

/* loaded from: classes3.dex */
public final class g0 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = v0.f102521a;
        k0.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
