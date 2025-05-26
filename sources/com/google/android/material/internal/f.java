package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes3.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32759a;

    /* renamed from: b, reason: collision with root package name */
    public final View f32760b;

    /* renamed from: c, reason: collision with root package name */
    public final View f32761c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f32762d;

    public f(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.f32759a = 0;
        this.f32760b = actionMenuView;
        this.f32761c = actionMenuView2;
        this.f32762d = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i13 = this.f32759a;
        View view = this.f32761c;
        View view2 = this.f32760b;
        Object obj = this.f32762d;
        switch (i13) {
            case 0:
                float[] fArr = (float[]) obj;
                kh2.j.u(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr);
                if (view2 != null) {
                    view2.setAlpha(fArr[0]);
                }
                if (view != null) {
                    view.setAlpha(fArr[1]);
                    break;
                }
                break;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i14 = ek.d.f59121c;
                ((ek.d) obj).b(view2, view, animatedFraction);
                break;
        }
    }

    public f(ek.d dVar, View view, View view2) {
        this.f32759a = 1;
        this.f32762d = dVar;
        this.f32760b = view;
        this.f32761c = view2;
    }
}
