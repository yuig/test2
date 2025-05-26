package vj;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class g extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f125901g;

    /* renamed from: h, reason: collision with root package name */
    public final float f125902h;

    public g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f125901g = resources.getDimension(fj.e.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f125902h = resources.getDimension(fj.e.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet b() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f125890b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i13), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new q6.b());
        return animatorSet;
    }

    public final void c(float f13) {
        float interpolation = this.f125889a.getInterpolation(f13);
        View view = this.f125890b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f14 = this.f125901g / width;
        float f15 = this.f125902h / height;
        float a13 = 1.0f - gj.a.a(0.0f, f14, interpolation);
        float a14 = 1.0f - gj.a.a(0.0f, f15, interpolation);
        view.setScaleX(a13);
        view.setPivotY(height);
        view.setScaleY(a14);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a14 != 0.0f ? a13 / a14 : 1.0f);
            }
        }
    }
}
