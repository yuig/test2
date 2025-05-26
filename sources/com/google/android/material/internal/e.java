package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f32753a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f32754b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f32755c;

    /* renamed from: d, reason: collision with root package name */
    public float f32756d;

    public e(Drawable drawable, Drawable drawable2) {
        this.f32753a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f32754b = mutate;
        mutate.setAlpha(0);
        this.f32755c = new float[2];
    }

    public final void a(float f13) {
        if (this.f32756d != f13) {
            this.f32756d = f13;
            float[] fArr = this.f32755c;
            kh2.j.u(f13, fArr);
            this.f32753a.setAlpha((int) (fArr[0] * 255.0f));
            this.f32754b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f32753a.draw(canvas);
        this.f32754b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f32753a.getIntrinsicHeight(), this.f32754b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f32753a.getIntrinsicWidth(), this.f32754b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.f32753a.getMinimumHeight(), this.f32754b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.f32753a.getMinimumWidth(), this.f32754b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f32753a.isStateful() || this.f32754b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        float f13 = this.f32756d;
        Drawable drawable = this.f32754b;
        Drawable drawable2 = this.f32753a;
        if (f13 <= 0.5f) {
            drawable2.setAlpha(i13);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i13);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        super.setBounds(i13, i14, i15, i16);
        this.f32753a.setBounds(i13, i14, i15, i16);
        this.f32754b.setBounds(i13, i14, i15, i16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32753a.setColorFilter(colorFilter);
        this.f32754b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.f32753a.setState(iArr) || this.f32754b.setState(iArr);
    }
}
