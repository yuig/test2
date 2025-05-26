package com.pinterest.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ef0.a;
import eo1.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le0.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/design/widget/RoundedCornersLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "xa0/j", "design_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class RoundedCornersLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f44940a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f44941b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f44942c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f44943d;

    /* renamed from: e, reason: collision with root package name */
    public a f44944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornersLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimension = (int) getResources().getDimension(c.lego_corner_radius_small);
        this.f44944e = new a(0.0f, 7);
        float f13 = dimension;
        float[] fArr = {f13, f13, f13, f13, f13, f13, f13, f13};
        this.f44940a = fArr;
        this.f44942c = new RectF();
        this.f44941b = new Path();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.RoundedCornersLayout);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            if (obtainStyledAttributes.hasValue(i.RoundedCornersLayout_allCornerRadius)) {
                int dimension2 = (int) obtainStyledAttributes.getDimension(i.RoundedCornersLayout_allCornerRadius, f13);
                g(dimension2, dimension2, dimension2, dimension2);
            }
            if (obtainStyledAttributes.hasValue(i.RoundedCornersLayout_topLeftCornerRadius)) {
                float dimension3 = (int) obtainStyledAttributes.getDimension(i.RoundedCornersLayout_topLeftCornerRadius, f13);
                fArr[0] = dimension3;
                fArr[1] = dimension3;
                invalidate();
            }
            if (obtainStyledAttributes.hasValue(i.RoundedCornersLayout_topRightCornerRadius)) {
                float dimension4 = (int) obtainStyledAttributes.getDimension(i.RoundedCornersLayout_topRightCornerRadius, f13);
                fArr[2] = dimension4;
                fArr[3] = dimension4;
                invalidate();
            }
            if (obtainStyledAttributes.hasValue(i.RoundedCornersLayout_bottomRightCornerRadius)) {
                float dimension5 = (int) obtainStyledAttributes.getDimension(i.RoundedCornersLayout_bottomRightCornerRadius, f13);
                fArr[4] = dimension5;
                fArr[5] = dimension5;
                invalidate();
            }
            if (obtainStyledAttributes.hasValue(i.RoundedCornersLayout_bottomLeftCornerRadius)) {
                float dimension6 = (int) obtainStyledAttributes.getDimension(i.RoundedCornersLayout_bottomLeftCornerRadius, f13);
                fArr[6] = dimension6;
                fArr[7] = dimension6;
                invalidate();
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(int i13) {
        this.f44943d = Integer.valueOf(i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        Integer num = this.f44943d;
        if (num != null) {
            int intValue = num.intValue();
            a aVar = this.f44944e;
            Paint paint = new Paint();
            paint.setColor(intValue);
            Unit unit = Unit.f80348a;
            RectF rectF = this.f44942c;
            float f13 = aVar.f58828a;
            canvas.drawRoundRect(rectF, f13, f13, paint);
            boolean z13 = aVar.f58829b;
            float f14 = aVar.f58828a;
            if (z13) {
                RectF rectF2 = new RectF();
                rectF2.top = rectF.top;
                rectF2.bottom = rectF.top + f14;
                rectF2.right = rectF.right;
                canvas.drawRect(rectF2, paint);
            }
            if (aVar.f58830c) {
                RectF rectF3 = new RectF();
                rectF3.top = rectF.top + f14;
                rectF3.bottom = rectF.bottom;
                rectF3.right = rectF.right;
                canvas.drawRect(rectF3, paint);
            }
        }
        float[] fArr = this.f44940a;
        int length = fArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            if (((int) fArr[i13]) != 0) {
                canvas.clipPath(this.f44941b);
                break;
            }
            i13++;
        }
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public final void e(int i13) {
        g(i13, i13, i13, i13);
    }

    public final void g(int i13, int i14, int i15, int i16) {
        float f13 = i13;
        float[] fArr = this.f44940a;
        fArr[0] = f13;
        fArr[1] = f13;
        invalidate();
        float f14 = i14;
        fArr[2] = f14;
        fArr[3] = f14;
        invalidate();
        float f15 = i15;
        fArr[4] = f15;
        fArr[5] = f15;
        invalidate();
        float f16 = i16;
        fArr[6] = f16;
        fArr[7] = f16;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        Path path = this.f44941b;
        path.reset();
        RectF rectF = this.f44942c;
        rectF.set(0.0f, 0.0f, i13, i14);
        path.addRoundRect(rectF, this.f44940a, Path.Direction.CW);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedCornersLayout(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedCornersLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
