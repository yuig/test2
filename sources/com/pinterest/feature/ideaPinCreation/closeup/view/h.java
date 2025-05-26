package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Path f46190a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f46191b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f46192c;

    public h(Context context, String hexColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hexColor, "hexColor");
        float dimension = context.getResources().getDimension(dq1.a.story_pin_color_picker_item_border_width);
        float dimension2 = context.getResources().getDimension(aq1.b.idea_pin_color_eye_dropper_width);
        float f13 = 2;
        float f14 = dimension2 / f13;
        float f15 = dimension * f13;
        float dimension3 = context.getResources().getDimension(aq1.b.idea_pin_color_eye_dropper_height) - f15;
        float f16 = (dimension2 - f15) / f13;
        double asin = Math.asin(f16 / (dimension3 - f16));
        double degrees = Math.toDegrees(asin);
        Path path = new Path();
        this.f46190a = path;
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(hexColor));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f46191b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dimension);
        paint2.setAntiAlias(true);
        this.f46192c = paint2;
        float f17 = (f13 * f16) + dimension;
        RectF rectF = new RectF(dimension, dimension, f17, f17);
        double d2 = f16;
        double cos = Math.cos(asin) * d2;
        double sin = Math.sin(asin) * d2;
        double d13 = RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP;
        path.arcTo(rectF, (float) (d13 - degrees), (float) ((degrees * 2) + d13), true);
        double d14 = f14;
        float f18 = (float) (sin + d14);
        path.moveTo((float) (d14 - cos), f18);
        path.lineTo(f14, dimension3);
        path.lineTo((float) (d14 + cos), f18);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.f46190a;
        canvas.drawPath(path, this.f46191b);
        canvas.drawPath(path, this.f46192c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
