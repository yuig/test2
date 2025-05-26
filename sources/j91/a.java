package j91;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f75103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Drawable f75104d;

    public /* synthetic */ a(int i13, d dVar, Drawable drawable, int i14) {
        this.f75101a = i14;
        this.f75102b = i13;
        this.f75103c = dVar;
        this.f75104d = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator value) {
        int i13 = this.f75101a;
        int i14 = this.f75102b;
        Drawable drawable = this.f75104d;
        d this$0 = this.f75103c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(drawable, "$drawable");
                Intrinsics.checkNotNullParameter(value, "value");
                int animatedFraction = (int) ((1 - value.getAnimatedFraction()) * i14);
                this$0.getClass();
                d.d(drawable, animatedFraction);
                this$0.invalidate();
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(drawable, "$drawable");
                Intrinsics.checkNotNullParameter(value, "value");
                int animatedFraction2 = (int) (value.getAnimatedFraction() * i14);
                this$0.getClass();
                d.d(drawable, animatedFraction2);
                float min = Math.min(1.0f, value.getAnimatedFraction()) * 255;
                drawable.setAlpha((int) min);
                View view = this$0.f75112b;
                if (view != null) {
                    view.setAlpha(1 - min);
                }
                this$0.invalidate();
                break;
        }
    }
}
