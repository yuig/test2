package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import lb.l0;
import oi.u6;

/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseSlider f33105a;

    public c(BaseSlider baseSlider) {
        this.f33105a = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        BaseSlider baseSlider = this.f33105a;
        u6 r03 = l0.r0(baseSlider);
        Iterator it = baseSlider.f33071l.iterator();
        while (it.hasNext()) {
            r03.m((gk.a) it.next());
        }
    }
}
