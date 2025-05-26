package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class v extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f19111b;

    public /* synthetic */ v(x xVar, int i13) {
        this.f19110a = i13;
        this.f19111b = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f19110a;
        x xVar = this.f19111b;
        switch (i13) {
            case 0:
                View view = xVar.f19117b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = xVar.f19118c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = xVar.f19120e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                xVar.i(0);
                break;
            case 3:
                xVar.i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = xVar.f19121f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup4 = xVar.f19123h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f19110a;
        x xVar = this.f19111b;
        switch (i13) {
            case 0:
                View view = xVar.f19125j;
                if ((view instanceof DefaultTimeBar) && !xVar.A) {
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                    ValueAnimator valueAnimator = defaultTimeBar.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(defaultTimeBar.F, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = xVar.f19117b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = xVar.f19118c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = xVar.f19120e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(xVar.A ? 0 : 4);
                }
                View view3 = xVar.f19125j;
                if ((view3 instanceof DefaultTimeBar) && !xVar.A) {
                    DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                    ValueAnimator valueAnimator2 = defaultTimeBar2.E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    defaultTimeBar2.G = false;
                    valueAnimator2.setFloatValues(defaultTimeBar2.F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                xVar.i(4);
                break;
            case 3:
                xVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = xVar.f19123h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    ViewGroup viewGroup4 = xVar.f19123h;
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup5 = xVar.f19121f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
