package lu;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f84900b;

    public /* synthetic */ h(k kVar, int i13) {
        this.f84899a = i13;
        this.f84900b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int i13 = this.f84899a;
        k this$0 = this.f84900b;
        switch (i13) {
            case 0:
                int i14 = k.Y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                float f13 = 1000;
                float f14 = (floatValue / f13) + 0.92f;
                this$0.w8().setScaleX(f14);
                this$0.w8().setScaleY(f14);
                this$0.e8().setScaleX(f14);
                this$0.e8().setScaleY(f14);
                this$0.e8().setTranslationY(((this$0.w8().getHeight() * 32.0f) / f13) - (((floatValue * 0.4f) * this$0.w8().getHeight()) / f13));
                break;
            default:
                int i15 = k.Y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue2 = animation.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue2).floatValue();
                float f15 = 1000;
                float f16 = 1.0f - (floatValue2 / f15);
                this$0.w8().setScaleX(f16);
                this$0.w8().setScaleY(f16);
                this$0.e8().setScaleX(f16);
                this$0.e8().setScaleY(f16);
                this$0.e8().setTranslationY(((floatValue2 * 0.4f) * this$0.w8().getHeight()) / f15);
                break;
        }
    }
}
