package e21;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f56981a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f56982b;

    /* renamed from: c, reason: collision with root package name */
    public final AnimatorSet f56983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams);
        Object obj = d5.a.f53679a;
        appCompatImageView.setImageDrawable(context.getDrawable(i13));
        appCompatImageView.setAlpha(0.0f);
        this.f56981a = appCompatImageView;
        this.f56982b = new AccelerateDecelerateInterpolator();
        AnimatorSet a13 = a(0.0f, 1.0f, 1.1f, 1.0f, 200L);
        AnimatorSet a14 = a(1.0f, 0.0f, 1.0f, 0.6f, 1000L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(a13, a14);
        this.f56983c = animatorSet;
        addView(appCompatImageView);
    }

    public final AnimatorSet a(float f13, float f14, float f15, float f16, long j13) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(this.f56982b);
        animatorSet.setStartDelay(j13);
        Property property = View.ALPHA;
        float[] fArr = {f13, f14};
        AppCompatImageView appCompatImageView = this.f56981a;
        animatorSet.playTogether(ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) property, fArr), ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) View.SCALE_X, f15, f16), ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) View.SCALE_Y, f15, f16));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    public final void b() {
        this.f56983c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f56981a.setAlpha(0.0f);
        this.f56983c.end();
        super.onDetachedFromWindow();
    }
}
