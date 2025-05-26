package com.google.android.material.slider;

import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseSlider f33104a;

    public b(BaseSlider baseSlider) {
        this.f33104a = baseSlider;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseSlider baseSlider = this.f33104a;
        Iterator it = baseSlider.f33071l.iterator();
        while (it.hasNext()) {
            gk.a aVar = (gk.a) it.next();
            aVar.N = 1.2f;
            aVar.L = floatValue;
            aVar.M = floatValue;
            aVar.O = gj.a.b(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
            aVar.invalidateSelf();
        }
        WeakHashMap weakHashMap = v0.f102521a;
        baseSlider.postInvalidateOnAnimation();
    }
}
