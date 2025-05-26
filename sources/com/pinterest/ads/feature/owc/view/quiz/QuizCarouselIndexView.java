package com.pinterest.ads.feature.owc.view.quiz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import bs1.c;
import d5.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.q0;
import m60.r0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/quiz/QuizCarouselIndexView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class QuizCarouselIndexView extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f35381a;

    /* renamed from: b, reason: collision with root package name */
    public int f35382b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f35383c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f35384d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f35385e;

    /* renamed from: f, reason: collision with root package name */
    public float f35386f;

    /* renamed from: g, reason: collision with root package name */
    public float f35387g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuizCarouselIndexView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i13) {
        if (c.l1(this)) {
            i13 = (this.f35382b - i13) - 1;
        }
        this.f35381a = i13;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f13;
        float f14;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f15 = 2;
        float paddingStart = getPaddingStart() / f15;
        float f16 = this.f35387g;
        int i13 = this.f35382b;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = this.f35381a;
            if (i14 == i15) {
                float f17 = this.f35387g - 6;
                canvas.drawCircle(paddingStart + f17, f16, f17, this.f35385e);
                f13 = f17 * f15;
                f14 = this.f35386f;
            } else if (i14 < i15) {
                float f18 = this.f35387g - 6;
                canvas.drawCircle(paddingStart + f18, f16, f18, this.f35383c);
                f13 = f18 * f15;
                f14 = this.f35386f;
            } else {
                float f19 = this.f35387g - 6;
                canvas.drawCircle(paddingStart + f19, f16, f19, this.f35384d);
                f13 = f19 * f15;
                f14 = this.f35386f;
            }
            paddingStart = f13 + f14 + paddingStart;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        if (this.f35387g <= 0.0f) {
            int size = View.MeasureSpec.getSize(i14);
            this.f35386f = getResources().getDimension(r0.ad_quiz_carousel_horizontal_spacing);
            this.f35387g = size / 2.0f;
        }
        int i15 = this.f35382b;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < i15; i16++) {
            f13 += (this.f35387g * 2) + this.f35386f;
        }
        if (f13 > 0.0f) {
            f13 -= this.f35386f;
        }
        setMeasuredDimension((int) f13, View.getDefaultSize(getSuggestedMinimumHeight(), i14));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        this.f35386f = getResources().getDimension(r0.ad_quiz_carousel_horizontal_spacing);
        this.f35387g = i14 / 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizCarouselIndexView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int color;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35381a = -1;
        Paint paint = new Paint(1);
        if (c.l1(this)) {
            int i14 = q0.carousel_unselected_pager_dot;
            Object obj = a.f53679a;
            color = context.getColor(i14);
        } else {
            int i15 = q0.new_in_following_background;
            Object obj2 = a.f53679a;
            color = context.getColor(i15);
        }
        paint.setColor(color);
        this.f35383c = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(c.l1(this) ? context.getColor(q0.new_in_following_background) : context.getColor(q0.carousel_unselected_pager_dot));
        this.f35384d = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(context.getColor(q0.new_in_following_background));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(6.0f);
        this.f35385e = paint3;
    }
}
