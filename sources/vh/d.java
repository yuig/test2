package vh;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import df.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ua.m0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f125820a;

    /* renamed from: b, reason: collision with root package name */
    public Object f125821b;

    /* renamed from: c, reason: collision with root package name */
    public Object f125822c;

    /* renamed from: d, reason: collision with root package name */
    public Object f125823d;

    /* renamed from: e, reason: collision with root package name */
    public Object f125824e;

    /* renamed from: f, reason: collision with root package name */
    public Object f125825f;

    /* renamed from: g, reason: collision with root package name */
    public Object f125826g;

    /* renamed from: h, reason: collision with root package name */
    public Object f125827h;

    /* renamed from: i, reason: collision with root package name */
    public Object f125828i;

    /* renamed from: j, reason: collision with root package name */
    public PathInterpolator f125829j;

    public final ImageView a(int i13) {
        ImageView imageView = new ImageView((Context) this.f125820a);
        Context context = imageView.getContext();
        int i14 = eo1.d.red_dot_no_padding;
        Object obj = d5.a.f53679a;
        imageView.setImageDrawable(context.getDrawable(i14));
        imageView.setColorFilter(imageView.getContext().getColor(i13));
        int p13 = kh2.d.p(6);
        int p14 = kh2.d.p(6);
        int d2 = d();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(p13, p14);
        if (j1.Y0((Context) this.f125820a)) {
            layoutParams.gravity = 8388613;
        } else {
            layoutParams.gravity = 8388611;
        }
        layoutParams.topMargin = d2;
        imageView.setLayoutParams(layoutParams);
        imageView.setX(((Number) ((Function1) this.f125825f).invoke(Integer.valueOf(layoutParams.width))).floatValue());
        ((FrameLayout) this.f125826g).addView(imageView);
        return imageView;
    }

    public final AnimatorSet b(ImageView imageView, int i13, int i14, float f13, Interpolator interpolator, long j13) {
        return g(imageView, i13, i14, j13, f13, interpolator, 870L, ((Number) ((Function1) this.f125825f).invoke(Integer.valueOf(kh2.d.p(6)))).floatValue());
    }

    public final int d() {
        LinearLayout view;
        Rect rect = new Rect();
        r70.a aVar = (r70.a) this.f125822c;
        if (aVar != null && (view = aVar.getView()) != null) {
            view.getGlobalVisibleRect(rect);
        }
        int i13 = rect.top;
        int[] iArr = new int[2];
        ((View) this.f125821b).getLocationOnScreen(iArr);
        return i13 - iArr[1];
    }

    public final float e(float f13) {
        return j1.Y0((Context) this.f125820a) ? f13 * (-1) : f13;
    }

    public final AnimatorSet f(View view, int i13, int i14, float f13, float f14, long j13) {
        float floatValue = ((Number) ((Function1) this.f125825f).invoke(Integer.valueOf(view.getLayoutParams().width))).floatValue();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION, 0.0f, f13);
        ofFloat.setDuration(660L);
        ofFloat.setInterpolator((Interpolator) this.f125828i);
        ofFloat.setStartDelay(j13);
        AnimatorSet g13 = g(view, i13, i14, j13, f14, (Interpolator) this.f125828i, 660L, floatValue);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, g13);
        animatorSet.addListener(new m0(view, this, 11));
        return animatorSet;
    }

    public final AnimatorSet g(View view, int i13, int i14, long j13, float f13, Interpolator interpolator, long j14, float f14) {
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Intrinsics.checkNotNullParameter(resources, "<this>");
        AnimatorSet E = kg.a.E(1.0f, f13, resources.getInteger(R.integer.config_shortAnimTime), view);
        E.setInterpolator((Interpolator) this.f125827h);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f14, f14 + kh2.d.p(i13));
        Property property = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, kh2.d.p(i14));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        animatorSet2.setInterpolator(interpolator);
        animatorSet.playTogether(animatorSet2, E);
        animatorSet.setStartDelay(j13);
        animatorSet.setDuration(j14);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, kh2.d.p(i14), kh2.d.p(i14) - 50);
        AnimatorSet A = kg.a.A(1.0f, 0.0f, 480L, view);
        A.setDuration(480L);
        PathInterpolator pathInterpolator = this.f125829j;
        A.setInterpolator(pathInterpolator);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ofFloat3, A);
        animatorSet3.setDuration(480L);
        animatorSet3.setInterpolator(pathInterpolator);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(animatorSet, animatorSet3);
        return animatorSet4;
    }
}
