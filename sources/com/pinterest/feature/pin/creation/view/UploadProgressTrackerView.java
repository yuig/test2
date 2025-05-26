package com.pinterest.feature.pin.creation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.c;
import d5.a;
import eo1.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/pin/creation/view/UploadProgressTrackerView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UploadProgressTrackerView extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f47136h = 0;

    /* renamed from: a, reason: collision with root package name */
    public float f47137a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f47138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47139c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47140d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47141e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f47142f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f47143g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadProgressTrackerView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static ValueAnimator b(UploadProgressTrackerView uploadProgressTrackerView, float f13, int i13) {
        float f14 = uploadProgressTrackerView.f47137a;
        if ((i13 & 2) != 0) {
            f13 = 1.0f;
        }
        uploadProgressTrackerView.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f13);
        ofFloat.addUpdateListener(new c(uploadProgressTrackerView, 14));
        ofFloat.setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final void a(Animator... anims) {
        Intrinsics.checkNotNullParameter(anims, "anims");
        c(this.f47139c, z.d(anims));
    }

    public final void c(int i13, List list) {
        this.f47143g.setColor(i13);
        AnimatorSet animatorSet = this.f47138b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f47138b = animatorSet2;
        animatorSet2.playSequentially((List<Animator>) list);
        AnimatorSet animatorSet3 = this.f47138b;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.f47138b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f47138b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.f47143g;
        int color = paint.getColor();
        paint.setColor(this.f47141e);
        RectF rectF = this.f47142f;
        canvas.drawRect(rectF, paint);
        paint.setColor(color);
        canvas.drawRect(rectF.left, rectF.top, this.f47137a * rectF.right, rectF.bottom, paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f47142f.set(0.0f, 0.0f, i13, i14);
    }

    public /* synthetic */ UploadProgressTrackerView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProgressTrackerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = b.color_themed_base_red_300;
        Object obj = a.f53679a;
        int color = context.getColor(i14);
        this.f47139c = color;
        this.f47140d = context.getColor(b.color_themed_base_red_300);
        this.f47141e = context.getColor(b.color_themed_light_gray);
        this.f47142f = new RectF();
        Paint paint = new Paint();
        paint.setColor(color);
        this.f47143g = paint;
        setWillNotDraw(false);
    }
}
