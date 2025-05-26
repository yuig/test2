package com.pinterest.feature.ideaPinCreation.camera.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import dl2.b;
import eo1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/CircleProgressBar;", "Landroid/widget/ProgressBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CircleProgressBar extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public final float f45901a;

    /* renamed from: b, reason: collision with root package name */
    public final float f45902b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f45903c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f45904d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f45905e;

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45901a = 28.0f / 2;
        this.f45902b = 270.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(28.0f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(b.y0(this, a.base_color_grayscale_0));
        paint.setAlpha(60);
        this.f45904d = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setStrokeWidth(28.0f);
        paint2.setStrokeCap(cap);
        paint2.setColor(b.y0(this, a.base_color_grayscale_0));
        this.f45905e = paint2;
        setProgressDrawable(null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        if (this.f45903c == null) {
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            this.f45903c = rectF;
            float f13 = this.f45901a;
            rectF.inset(f13, f13);
        }
        RectF rectF2 = this.f45903c;
        Intrinsics.f(rectF2);
        canvas.drawArc(rectF2, this.f45902b, 360.0f, false, this.f45904d);
        RectF rectF3 = this.f45903c;
        Intrinsics.f(rectF3);
        canvas.drawArc(rectF3, this.f45902b, getProgress() * 3.6f, false, this.f45905e);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f45901a = 28.0f / 2;
        this.f45902b = 270.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(28.0f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(b.y0(this, a.base_color_grayscale_0));
        paint.setAlpha(60);
        this.f45904d = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setStrokeWidth(28.0f);
        paint2.setStrokeCap(cap);
        paint2.setColor(b.y0(this, a.base_color_grayscale_0));
        this.f45905e = paint2;
        setProgressDrawable(null);
    }
}
