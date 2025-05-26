package vj;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class j extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f125912g;

    /* renamed from: h, reason: collision with root package name */
    public final float f125913h;

    /* renamed from: i, reason: collision with root package name */
    public final float f125914i;

    public j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f125912g = resources.getDimension(fj.e.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f125913h = resources.getDimension(fj.e.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f125914i = resources.getDimension(fj.e.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void b() {
        if (a() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f125890b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i13), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f125893e);
        animatorSet.start();
    }

    public final void c(androidx.activity.b bVar, int i13, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i14;
        boolean z13 = bVar.f15876d == 0;
        WeakHashMap weakHashMap = v0.f102521a;
        View view = this.f125890b;
        boolean z14 = (Gravity.getAbsoluteGravity(i13, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i14 = z14 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i14 = 0;
        }
        float f13 = scaleX + i14;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (z14) {
            f13 = -f13;
        }
        fArr[0] = f13;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new q6.b());
        ofFloat.setDuration(gj.a.c(this.f125891c, bVar.f15875c, this.f125892d));
        ofFloat.addListener(new i(this, z13, i13));
        ofFloat.addListener(animatorListenerAdapter);
        ofFloat.start();
    }

    public final void d(float f13, int i13, boolean z13) {
        float interpolation = this.f125889a.getInterpolation(f13);
        WeakHashMap weakHashMap = v0.f102521a;
        View view = this.f125890b;
        boolean z14 = (Gravity.getAbsoluteGravity(i13, view.getLayoutDirection()) & 3) == 3;
        boolean z15 = z13 == z14;
        int width = view.getWidth();
        int height = view.getHeight();
        float f14 = width;
        if (f14 > 0.0f) {
            float f15 = height;
            if (f15 <= 0.0f) {
                return;
            }
            float f16 = this.f125912g / f14;
            float f17 = this.f125913h / f14;
            float f18 = this.f125914i / f15;
            if (z14) {
                f14 = 0.0f;
            }
            view.setPivotX(f14);
            if (!z15) {
                f17 = -f16;
            }
            float a13 = gj.a.a(0.0f, f17, interpolation);
            float f19 = a13 + 1.0f;
            view.setScaleX(f19);
            float a14 = 1.0f - gj.a.a(0.0f, f18, interpolation);
            view.setScaleY(a14);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    childAt.setPivotX(z14 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f23 = z15 ? 1.0f - a13 : 1.0f;
                    float f24 = a14 != 0.0f ? (f19 / a14) * f23 : 1.0f;
                    childAt.setScaleX(f23);
                    childAt.setScaleY(f24);
                }
            }
        }
    }
}
