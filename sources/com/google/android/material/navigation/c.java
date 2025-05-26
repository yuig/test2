package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f32849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f32850b;

    public c(f fVar, float f13) {
        this.f32850b = fVar;
        this.f32849a = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f32850b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f32849a);
    }
}
