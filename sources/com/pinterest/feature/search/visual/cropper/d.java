package com.pinterest.feature.search.visual.cropper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import s71.o;

/* loaded from: classes5.dex */
public final class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Path f48013a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f48014b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f48015c;

    /* renamed from: d, reason: collision with root package name */
    public final FlashlightCropperDrawable$SlopRectF f48016d;

    /* renamed from: e, reason: collision with root package name */
    public final FlashlightCropperDrawable$SlopRectF f48017e;

    /* renamed from: f, reason: collision with root package name */
    public final FlashlightCropperDrawable$SlopRectF f48018f;

    /* renamed from: g, reason: collision with root package name */
    public final FlashlightCropperDrawable$SlopRectF f48019g;

    /* renamed from: h, reason: collision with root package name */
    public int f48020h;

    /* renamed from: i, reason: collision with root package name */
    public final int f48021i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f48022j;

    /* renamed from: k, reason: collision with root package name */
    public final float f48023k;

    /* renamed from: l, reason: collision with root package name */
    public final float f48024l;

    /* renamed from: m, reason: collision with root package name */
    public final s71.m f48025m;

    /* renamed from: n, reason: collision with root package name */
    public final int f48026n;

    /* renamed from: o, reason: collision with root package name */
    public final int f48027o;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f48013a = path;
        this.f48014b = new RectF();
        this.f48015c = new RectF();
        this.f48016d = new FlashlightCropperDrawable$SlopRectF();
        this.f48017e = new FlashlightCropperDrawable$SlopRectF();
        this.f48018f = new FlashlightCropperDrawable$SlopRectF();
        this.f48019g = new FlashlightCropperDrawable$SlopRectF();
        this.f48020h = 255;
        int x03 = dl2.b.x0(context, eo1.a.base_color_grayscale_0);
        this.f48021i = x03;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(x03);
        this.f48022j = paint;
        Intrinsics.checkNotNullExpressionValue(context.getResources(), "getResources(...)");
        this.f48023k = a0.K(12, r0);
        Intrinsics.checkNotNullExpressionValue(context.getResources(), "getResources(...)");
        this.f48024l = a0.K(8, r0);
        this.f48025m = new s71.m(new Rect(), new Rect(), new Rect(), new Rect());
        this.f48026n = context.getResources().getDimensionPixelSize(uc2.b.flashlight_corner_size);
        this.f48027o = context.getResources().getDimensionPixelSize(uc2.b.flashlight_corner_padding);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f48020h == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        RectF rectF = this.f48014b;
        rectF.set(bounds);
        RectF rectF2 = this.f48015c;
        float f13 = bounds.left;
        float f14 = this.f48024l;
        rectF2.set(f13 + f14, bounds.top + f14, bounds.right - f14, bounds.bottom - f14);
        int i13 = this.f48026n;
        int i14 = this.f48027o;
        s71.m mVar = this.f48025m;
        o.l(i13, i14, rectF, mVar);
        this.f48016d.set(mVar.f111395a);
        this.f48017e.set(mVar.f111396b);
        this.f48018f.set(mVar.f111397c);
        this.f48019g.set(mVar.f111398d);
        Path path = this.f48013a;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        float f15 = this.f48023k;
        path.addRoundRect(rectF, f15, f15, direction);
        float f16 = f15 - f14;
        path.addRoundRect(rectF2, f16, f16, direction);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f48020h = i13;
        this.f48022j.setAlpha((int) (Color.alpha(this.f48021i) * (i13 / 255.0f)));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.o("setColorFilter() is not supported.", new IllegalAccessError());
    }
}
