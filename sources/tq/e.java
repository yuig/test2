package tq;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f118827b;

    public /* synthetic */ e(ViewGroup viewGroup, int i13) {
        this.f118826a = i13;
        this.f118827b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int i13 = this.f118826a;
        ViewGroup this_apply = this.f118827b;
        switch (i13) {
            case 0:
                int i14 = b.f118799j;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this_apply.setTranslationY(((Float) animatedValue).floatValue());
                return;
            case 1:
                int i15 = b.f118799j;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue2 = animation.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                this_apply.setTranslationY(((Float) animatedValue2).floatValue());
                this_apply.requestLayout();
                return;
            case 2:
                int i16 = n62.g.f89351o;
                Intrinsics.checkNotNullParameter(this_apply, "$controlsContainer");
                Intrinsics.checkNotNullParameter(animation, "animation");
                ViewGroup.LayoutParams layoutParams = this_apply.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Object animatedValue3 = animation.getAnimatedValue();
                Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                marginLayoutParams.setMargins(0, 0, 0, ((Integer) animatedValue3).intValue());
                this_apply.setLayoutParams(marginLayoutParams);
                return;
            default:
                int i17 = n62.g.f89351o;
                Intrinsics.checkNotNullParameter(this_apply, "$controlsContainer");
                Intrinsics.checkNotNullParameter(animation, "animation");
                ViewGroup.LayoutParams layoutParams2 = this_apply.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                Object animatedValue4 = animation.getAnimatedValue();
                Intrinsics.g(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                marginLayoutParams2.setMargins(0, 0, 0, ((Integer) animatedValue4).intValue());
                this_apply.setLayoutParams(marginLayoutParams2);
                return;
        }
    }
}
