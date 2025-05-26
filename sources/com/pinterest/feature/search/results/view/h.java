package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f47798a;

    /* renamed from: b, reason: collision with root package name */
    public final float f47799b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47800c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f47801d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f47802e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f47803f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f47804g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i13, int i14, int i15, float f13, float f14, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47798a = f13;
        this.f47799b = f14;
        this.f47800c = z13;
        RectF rectF = new RectF(getLeft(), getTop(), i13, i14);
        this.f47801d = rectF;
        Paint paint = new Paint(1);
        this.f47802e = paint;
        RectF rectF2 = new RectF(rectF.left + f13, rectF.top + f13, rectF.right - f13, rectF.bottom - f13);
        this.f47803f = rectF2;
        Paint paint2 = new Paint(1);
        this.f47804g = paint2;
        paint.setColor(i15);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f13);
        float f15 = 2;
        rectF.inset(f13 / f15, f13 / f15);
        if (z13) {
            paint2.setColor(dl2.b.y0(this, eo1.a.sema_color_background_default));
            paint2.setStyle(style);
            paint2.setStrokeWidth(f13 / f15);
            float f16 = 4;
            rectF2.inset(f13 / f16, f13 / f16);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        boolean z13 = this.f47800c;
        float f13 = this.f47798a;
        float f14 = this.f47799b;
        if (z13) {
            float f15 = 2;
            canvas.drawRoundRect(this.f47803f, (f13 / f15) + f14, (f13 / f15) + f14, this.f47804g);
        }
        float f16 = 2;
        canvas.drawRoundRect(this.f47801d, (f13 / f16) + f14, (f13 / f16) + f14, this.f47802e);
    }
}
