package se0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public View f112388a;

    /* renamed from: b, reason: collision with root package name */
    public View f112389b;

    /* renamed from: c, reason: collision with root package name */
    public float f112390c;

    /* renamed from: d, reason: collision with root package name */
    public float f112391d;

    /* renamed from: e, reason: collision with root package name */
    public float f112392e;

    /* renamed from: f, reason: collision with root package name */
    public final PropertyValuesHolder f112393f;

    /* renamed from: g, reason: collision with root package name */
    public final PropertyValuesHolder f112394g;

    /* renamed from: h, reason: collision with root package name */
    public final PropertyValuesHolder f112395h;

    /* renamed from: i, reason: collision with root package name */
    public final PropertyValuesHolder f112396i;

    /* renamed from: j, reason: collision with root package name */
    public final ObjectAnimator f112397j;

    /* renamed from: k, reason: collision with root package name */
    public final ObjectAnimator f112398k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f112399l;

    /* renamed from: m, reason: collision with root package name */
    public final DecelerateInterpolator f112400m;

    /* renamed from: n, reason: collision with root package name */
    public final OvershootInterpolator f112401n;

    /* renamed from: o, reason: collision with root package name */
    public final l f112402o;

    public m(b20.c cVar) {
        this.f112402o = new l(cVar);
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, 0.0f);
        this.f112393f = ofFloat;
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f);
        this.f112394g = ofFloat2;
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f);
        this.f112395h = ofFloat3;
        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f);
        this.f112396i = ofFloat4;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f112388a, ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.f112397j = ofPropertyValuesHolder;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f112389b, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
        this.f112398k = ofFloat5;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f112399l = animatorSet;
        animatorSet.playTogether(ofPropertyValuesHolder, ofFloat5);
        this.f112400m = new DecelerateInterpolator(2.0f);
        this.f112401n = new OvershootInterpolator(1.2f);
    }

    public final void a(float f13, float f14, float f15, float f16, BaseInterpolator baseInterpolator, long j13, l lVar) {
        if (this.f112388a == null || this.f112389b == null) {
            throw new IllegalStateException("Must call SpinnerTargetAnimator.initViews()");
        }
        AnimatorSet animatorSet = this.f112399l;
        if (animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        this.f112393f.setFloatValues(this.f112388a.getY(), f13);
        this.f112394g.setFloatValues(this.f112388a.getScaleX(), f14);
        this.f112395h.setFloatValues(this.f112388a.getScaleY(), f14);
        this.f112396i.setFloatValues(this.f112388a.getAlpha(), f15);
        this.f112398k.setFloatValues(this.f112389b.getTranslationY(), f16);
        animatorSet.setInterpolator(baseInterpolator);
        animatorSet.setDuration(j13);
        if (lVar != null) {
            animatorSet.addListener(lVar);
        }
        animatorSet.start();
    }
}
