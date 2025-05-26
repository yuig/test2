package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import bk.a0;
import bk.i;
import bk.o;
import bk.r;
import fj.l;

/* loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements a0 {

    /* renamed from: s, reason: collision with root package name */
    public static final int f32642s = l.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: a, reason: collision with root package name */
    public final r f32643a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f32644b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f32645c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f32646d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f32647e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f32648f;

    /* renamed from: g, reason: collision with root package name */
    public final ColorStateList f32649g;

    /* renamed from: h, reason: collision with root package name */
    public i f32650h;

    /* renamed from: i, reason: collision with root package name */
    public o f32651i;

    /* renamed from: j, reason: collision with root package name */
    public final float f32652j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f32653k;

    /* renamed from: l, reason: collision with root package name */
    public final int f32654l;

    /* renamed from: m, reason: collision with root package name */
    public final int f32655m;

    /* renamed from: n, reason: collision with root package name */
    public final int f32656n;

    /* renamed from: o, reason: collision with root package name */
    public final int f32657o;

    /* renamed from: p, reason: collision with root package name */
    public final int f32658p;

    /* renamed from: q, reason: collision with root package name */
    public final int f32659q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32660r;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // bk.a0
    public final void Y0(o oVar) {
        this.f32651i = oVar;
        i iVar = this.f32650h;
        if (iVar != null) {
            iVar.Y0(oVar);
        }
        k2(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public final int f2() {
        int i13;
        int i14;
        if (this.f32658p != Integer.MIN_VALUE || this.f32659q != Integer.MIN_VALUE) {
            if (i2() && (i14 = this.f32659q) != Integer.MIN_VALUE) {
                return i14;
            }
            if (!i2() && (i13 = this.f32658p) != Integer.MIN_VALUE) {
                return i13;
            }
        }
        return this.f32654l;
    }

    public final int g2() {
        int i13;
        int i14;
        if (this.f32658p != Integer.MIN_VALUE || this.f32659q != Integer.MIN_VALUE) {
            if (i2() && (i14 = this.f32658p) != Integer.MIN_VALUE) {
                return i14;
            }
            if (!i2() && (i13 = this.f32659q) != Integer.MIN_VALUE) {
                return i13;
            }
        }
        return this.f32656n;
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return super.getPaddingBottom() - this.f32657o;
    }

    @Override // android.view.View
    public final int getPaddingEnd() {
        int paddingEnd = super.getPaddingEnd();
        int i13 = this.f32659q;
        if (i13 == Integer.MIN_VALUE) {
            i13 = i2() ? this.f32654l : this.f32656n;
        }
        return paddingEnd - i13;
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return super.getPaddingLeft() - f2();
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return super.getPaddingRight() - g2();
    }

    @Override // android.view.View
    public final int getPaddingStart() {
        int paddingStart = super.getPaddingStart();
        int i13 = this.f32658p;
        if (i13 == Integer.MIN_VALUE) {
            i13 = i2() ? this.f32656n : this.f32654l;
        }
        return paddingStart - i13;
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return super.getPaddingTop() - this.f32655m;
    }

    public final boolean i2() {
        return getLayoutDirection() == 1;
    }

    public final void k2(int i13, int i14) {
        RectF rectF = this.f32644b;
        rectF.set(getPaddingLeft(), getPaddingTop(), i13 - getPaddingRight(), i14 - getPaddingBottom());
        o oVar = this.f32651i;
        Path path = this.f32648f;
        this.f32643a.a(oVar, 1.0f, rectF, null, path);
        Path path2 = this.f32653k;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f32645c;
        rectF2.set(0.0f, 0.0f, i13, i14);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f32653k, this.f32647e);
        ColorStateList colorStateList = this.f32649g;
        if (colorStateList == null) {
            return;
        }
        Paint paint = this.f32646d;
        float f13 = this.f32652j;
        paint.setStrokeWidth(f13);
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        if (f13 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f32648f, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (!this.f32660r && isLayoutDirectionResolved()) {
            this.f32660r = true;
            if (!isPaddingRelative() && this.f32658p == Integer.MIN_VALUE && this.f32659q == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        k2(i13, i14);
    }

    @Override // android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        super.setPadding(f2() + i13, i14 + this.f32655m, g2() + i15, i16 + this.f32657o);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
        int i17 = this.f32658p;
        if (i17 == Integer.MIN_VALUE) {
            i17 = i2() ? this.f32656n : this.f32654l;
        }
        int i18 = i17 + i13;
        int i19 = i14 + this.f32655m;
        int i23 = this.f32659q;
        if (i23 == Integer.MIN_VALUE) {
            i23 = i2() ? this.f32654l : this.f32656n;
        }
        super.setPaddingRelative(i18, i19, i23 + i15, i16 + this.f32657o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.f32642s
            android.content.Context r7 = fk.a.a(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            bk.r r7 = bk.p.f23103a
            r6.f32643a = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f32648f = r7
            r7 = 0
            r6.f32660r = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f32647e = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f32644b = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f32645c = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f32653k = r2
            int[] r2 = fj.m.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            r4 = 2
            r5 = 0
            r6.setLayerType(r4, r5)
            int r4 = fj.m.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = com.bumptech.glide.d.H(r1, r2, r4)
            r6.f32649g = r4
            int r4 = fj.m.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f32652j = r4
            int r4 = fj.m.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f32654l = r7
            r6.f32655m = r7
            r6.f32656n = r7
            r6.f32657o = r7
            int r4 = fj.m.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f32654l = r4
            int r4 = fj.m.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f32655m = r4
            int r4 = fj.m.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f32656n = r4
            int r4 = fj.m.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f32657o = r7
            int r7 = fj.m.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f32658p = r7
            int r7 = fj.m.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f32659q = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f32646d = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            bk.m r7 = bk.o.b(r9, r0, r1, r8)
            bk.o r7 = r7.a()
            r6.f32651i = r7
            uj.a r7 = new uj.a
            r7.<init>(r6)
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
