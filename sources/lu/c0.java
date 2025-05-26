package lu;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f84866b;

    public /* synthetic */ c0(d0 d0Var, int i13) {
        this.f84865a = i13;
        this.f84866b = d0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i13 = this.f84865a;
        d0 this$0 = this.f84866b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Drawable background = this$0.f84873a.getBackground();
                Object animatedValue = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                d7.b.A0(background, ((Integer) animatedValue).intValue());
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Drawable background2 = this$0.f84873a.getBackground();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                d7.b.A0(background2, ((Integer) animatedValue2).intValue());
                break;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Drawable background3 = this$0.f84873a.getBackground();
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                d7.b.A0(background3, ((Integer) animatedValue3).intValue());
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Drawable background4 = this$0.f84873a.getBackground();
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                d7.b.A0(background4, ((Integer) animatedValue4).intValue());
                break;
        }
    }
}
