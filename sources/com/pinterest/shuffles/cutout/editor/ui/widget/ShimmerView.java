package com.pinterest.shuffles.cutout.editor.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/shuffles/cutout/editor/ui/widget/ShimmerView;", "Landroid/view/View;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "org/chromium/net/y", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ShimmerView extends View implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public static final int f51985d = Color.argb(12, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE);

    /* renamed from: e, reason: collision with root package name */
    public static final int f51986e = Color.argb(100, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE);

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f51987a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f51988b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f51989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a();
    }

    public final void a() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.f(displayMetrics);
        TypedValue.applyDimension(1, 2, displayMetrics);
        TypedValue.applyDimension(1, 12, displayMetrics);
        TypedValue.applyDimension(1, 16, displayMetrics);
        TypedValue.applyDimension(2, 15, displayMetrics);
        TypedValue.applyDimension(1, 50, displayMetrics);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 2.0f);
        this.f51987a = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(BaseRecyclerCellView.AUTOSCROLL_DELAY);
        }
        ValueAnimator valueAnimator = this.f51987a;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator2 = this.f51987a;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator3 = this.f51987a;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(this);
        }
        new Paint();
        Paint paint = new Paint();
        this.f51988b = paint;
        paint.setAntiAlias(true);
        int i13 = f51985d;
        this.f51989c = new int[]{i13, f51986e, i13};
    }

    public final void b(float f13, float f14) {
        float f15 = f13 * f14;
        int[] iArr = this.f51989c;
        Intrinsics.f(iArr);
        LinearGradient linearGradient = new LinearGradient(f15, 0.0f, f15 + f13, 0.0f, iArr, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = this.f51988b;
        if (paint == null) {
            return;
        }
        paint.setShader(linearGradient);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (isAttachedToWindow()) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            b(getWidth(), ((Float) animatedValue).floatValue());
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f51987a;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.f51987a = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawColor(f51985d);
        float width = getWidth();
        float height = getHeight();
        Paint paint = this.f51988b;
        Intrinsics.f(paint);
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        b(i13, -1.0f);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i13) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i13);
        if (i13 == 0) {
            if (!isEnabled() || (valueAnimator = this.f51987a) == null) {
                return;
            }
            valueAnimator.start();
            return;
        }
        if ((i13 == 4 || i13 == 8) && (valueAnimator2 = this.f51987a) != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z13) {
        boolean z14 = isEnabled() != z13;
        super.setEnabled(z13);
        if (z14) {
            if (z13) {
                ValueAnimator valueAnimator = this.f51987a;
                if (valueAnimator != null) {
                    valueAnimator.start();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f51987a;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator3 = this.f51987a;
            if (valueAnimator3 != null) {
                valueAnimator3.setCurrentFraction(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a();
    }
}
