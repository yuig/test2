package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w2 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46360a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f46361b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f46362c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f46363d;

    public w2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46361b = context;
        this.f46362c = xk2.m.a(xk2.n.NONE, new au0.a(this, 3));
        this.f46363d = new RectF();
    }

    public final void a(float f13) {
        ((Paint) this.f46362c).setStrokeWidth(f13);
        invalidateSelf();
    }

    public final void b(float f13) {
        ((Paint) this.f46361b).setStrokeWidth(f13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object obj = this.f46362c;
        int i13 = this.f46360a;
        Object obj2 = this.f46363d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                float f13 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
                canvas.drawRoundRect((RectF) obj2, f13, f13, (Paint) ((xk2.k) obj).getValue());
                break;
            default:
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Paint paint = (Paint) obj;
                float f14 = 2;
                float strokeWidth = paint.getStrokeWidth() * f14;
                float strokeWidth2 = paint.getStrokeWidth() * 1.5f;
                Rect bounds = getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                RectF rectF = new RectF(bounds);
                float f15 = (-paint.getStrokeWidth()) / f14;
                Object obj3 = this.f46361b;
                rectF.inset(((Paint) obj3).getStrokeWidth() + f15, ((Paint) obj3).getStrokeWidth() + ((-paint.getStrokeWidth()) / f14));
                Path path = (Path) obj2;
                path.reset();
                path.moveTo(rectF.left, rectF.top + strokeWidth2);
                path.lineTo(rectF.left, rectF.top + strokeWidth);
                float f16 = rectF.left;
                float f17 = rectF.top;
                path.arcTo(f16, f17, f16 + strokeWidth, f17 + strokeWidth, 180.0f, 90.0f, false);
                path.lineTo(rectF.left + strokeWidth2, rectF.top);
                path.moveTo(rectF.right - strokeWidth2, rectF.top);
                path.lineTo(rectF.right - strokeWidth, rectF.top);
                float f18 = rectF.right;
                float f19 = rectF.top;
                path.arcTo(f18 - strokeWidth, f19, f18, f19 + strokeWidth, 270.0f, 90.0f, false);
                path.lineTo(rectF.right, rectF.top + strokeWidth2);
                path.moveTo(rectF.left + strokeWidth2, rectF.bottom);
                path.lineTo(rectF.left + strokeWidth, rectF.bottom);
                float f23 = rectF.left;
                float f24 = rectF.bottom;
                path.arcTo(f23, f24 - strokeWidth, f23 + strokeWidth, f24, 90.0f, 90.0f, false);
                path.lineTo(rectF.left, rectF.bottom - strokeWidth2);
                path.moveTo(rectF.right, rectF.bottom - strokeWidth2);
                path.lineTo(rectF.right, rectF.bottom - strokeWidth);
                float f25 = rectF.right;
                float f26 = rectF.bottom;
                path.arcTo(f25 - strokeWidth, f26 - strokeWidth, f25, f26, 0.0f, 90.0f, false);
                path.lineTo(rectF.right - strokeWidth2, rectF.bottom);
                canvas.drawPath(path, paint);
                Paint paint2 = (Paint) obj3;
                float strokeWidth3 = paint2.getStrokeWidth() / f14;
                Rect bounds2 = getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds2, "getBounds(...)");
                RectF rectF2 = new RectF(bounds2);
                rectF2.inset(strokeWidth3, strokeWidth3);
                canvas.drawRoundRect(rectF2, 16.0f, 16.0f, paint2);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.f46360a) {
            case 0:
                return ml2.c.c(32.0f * hf0.b.f69001a);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.f46360a) {
            case 0:
                return ml2.c.c(32.0f * hf0.b.f69001a);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f46360a) {
            case 0:
                return ((Paint) ((xk2.k) this.f46362c).getValue()).getAlpha() == 255 ? -1 : -3;
            default:
                return ((Paint) this.f46361b).getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        int i14 = this.f46360a;
        Object obj = this.f46362c;
        switch (i14) {
            case 0:
                ((Paint) ((xk2.k) obj).getValue()).setAlpha(i13);
                break;
            default:
                ((Paint) this.f46361b).setAlpha(i13);
                ((Paint) obj).setAlpha(i13);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        switch (this.f46360a) {
            case 0:
                super.setBounds(i13, i14, i15, i16);
                RectF rectF = (RectF) this.f46363d;
                int width = getBounds().width();
                int height = getBounds().height();
                float f13 = getBounds().left;
                float f14 = IdeaPinCreationCameraVideoSegmentsView.f45927i;
                float f15 = ((width / 2.0f) - (f14 / 2.0f)) + f13;
                float f16 = getBounds().top;
                float f17 = IdeaPinCreationCameraVideoSegmentsView.f45928j;
                float f18 = ((height / 2.0f) - (f17 / 2.0f)) + f16;
                rectF.set(f15, f18, f14 + f15, f17 + f18);
                break;
            default:
                super.setBounds(i13, i14, i15, i16);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f46360a) {
            case 0:
                break;
            default:
                ((Paint) this.f46361b).setColorFilter(colorFilter);
                ((Paint) this.f46362c).setColorFilter(colorFilter);
                break;
        }
    }

    public w2() {
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        paint.setStrokeWidth(8.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f46361b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(-1);
        paint2.setAlpha(255);
        paint2.setStrokeWidth(32.0f);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setShadowLayer(5.0f, 0.0f, 0.0f, Color.argb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, 0, 0, 0));
        this.f46362c = paint2;
        this.f46363d = new Path();
    }
}
