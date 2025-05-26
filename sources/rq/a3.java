package rq;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f109101b;

    public /* synthetic */ a3(e3 e3Var, int i13) {
        this.f109100a = i13;
        this.f109101b = e3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i13 = this.f109100a;
        e3 this$0 = this.f109101b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this$0.A = ((Float) animatedValue).floatValue();
                this$0.requestLayout();
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                this$0.A = ((Float) animatedValue2).floatValue();
                this$0.requestLayout();
                break;
        }
    }
}
