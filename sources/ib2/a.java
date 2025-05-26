package ib2;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f72026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f72027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f72028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f72029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f72030f;

    public /* synthetic */ a(float f13, float f14, float f15, float f16, int i13, Object obj) {
        this.f72025a = i13;
        this.f72026b = f13;
        this.f72027c = f14;
        this.f72028d = f15;
        this.f72029e = f16;
        this.f72030f = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int i13 = this.f72025a;
        float f13 = this.f72029e;
        float f14 = this.f72028d;
        float f15 = this.f72027c;
        float f16 = this.f72026b;
        Object obj = this.f72030f;
        switch (i13) {
            case 0:
                c this$0 = (c) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                this$0.f72039g = new RectF(Math.abs(f14 - (f16 * floatValue)), Math.abs(f13 - (f15 * floatValue)), f14, f13);
                this$0.invalidateSelf();
                break;
            case 1:
                c this$02 = (c) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue2 = animation.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue2).floatValue();
                float f17 = f16 * floatValue2;
                float f18 = f15 * floatValue2;
                this$02.f72039g = new RectF(f14 - f17, f13 - f18, f14 + f17, f13 + f18);
                this$02.invalidateSelf();
                break;
            default:
                com.pinterest.feature.search.visual.cropper.c this$03 = (com.pinterest.feature.search.visual.cropper.c) obj;
                int i14 = com.pinterest.feature.search.visual.cropper.c.f47989x;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue3 = animation.getAnimatedValue();
                Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float floatValue3 = ((Float) animatedValue3).floatValue();
                float f19 = f15 * floatValue3;
                this$03.f47997h.s(Math.abs(f14 - (f16 * floatValue3)), Math.abs(f13 - f19), f14, f13);
                this$03.invalidate();
                break;
        }
    }
}
