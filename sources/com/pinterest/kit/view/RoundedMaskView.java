package com.pinterest.kit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import aq1.i;
import eo1.c;
import hf0.b;

/* loaded from: classes4.dex */
public class RoundedMaskView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f49875a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f49876b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f49877c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f49878d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f49879e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f49880f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f49881g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f49882h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f49883i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f49884j;

    public RoundedMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i13, int i14) {
        RectF rectF = new RectF();
        int i15 = this.f49875a * 2;
        float f13 = i15;
        rectF.set(0.0f, 0.0f, f13, f13);
        Path path = this.f49877c;
        path.reset();
        path.moveTo(0.0f, this.f49875a);
        path.arcTo(rectF, 180.0f, 90.0f, false);
        path.lineTo(0.0f, 0.0f);
        path.close();
        float f14 = i13 - i15;
        float f15 = i13;
        rectF.set(f14, 0.0f, f15, f13);
        Path path2 = this.f49878d;
        path2.reset();
        path2.moveTo(i13 - this.f49875a, 0.0f);
        path2.arcTo(rectF, 270.0f, 90.0f, false);
        path2.lineTo(f15, 0.0f);
        path2.close();
        float f16 = i14 - i15;
        float f17 = i14;
        rectF.set(f14, f16, f15, f17);
        Path path3 = this.f49879e;
        path3.reset();
        path3.moveTo(f15, i14 - this.f49875a);
        path3.arcTo(rectF, 0.0f, 90.0f, false);
        path3.lineTo(f15, f17);
        path3.close();
        rectF.set(0.0f, f16, f13, f17);
        Path path4 = this.f49880f;
        path4.reset();
        path4.moveTo(this.f49875a, f17);
        path4.arcTo(rectF, 90.0f, 90.0f, false);
        path4.lineTo(0.0f, f17);
        path4.close();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f49877c;
        if (path.isEmpty()) {
            return;
        }
        Path path2 = this.f49878d;
        if (path2.isEmpty()) {
            return;
        }
        Path path3 = this.f49879e;
        if (path3.isEmpty()) {
            return;
        }
        Path path4 = this.f49880f;
        if (path4.isEmpty()) {
            return;
        }
        boolean z13 = this.f49881g;
        Paint paint = this.f49876b;
        if (z13) {
            canvas.drawPath(path, paint);
        }
        if (this.f49882h) {
            canvas.drawPath(path2, paint);
        }
        if (this.f49883i) {
            canvas.drawPath(path3, paint);
        }
        if (this.f49884j) {
            canvas.drawPath(path4, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        a(i13, i14);
    }

    public RoundedMaskView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Paint paint = new Paint();
        this.f49876b = paint;
        this.f49877c = new Path();
        this.f49878d = new Path();
        this.f49879e = new Path();
        this.f49880f = new Path();
        this.f49881g = true;
        this.f49882h = true;
        this.f49883i = true;
        this.f49884j = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.RoundedMaskView, i13, 0);
        int color = obtainStyledAttributes.getColor(i.RoundedMaskView_rmv_color, -1);
        int dimension = (int) obtainStyledAttributes.getDimension(i.RoundedMaskView_rmv_corner_radius, getResources().getDimension(c.corner_radius));
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        this.f49875a = (int) (dimension * b.f69001a);
        a(getWidth(), getHeight());
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }
}
