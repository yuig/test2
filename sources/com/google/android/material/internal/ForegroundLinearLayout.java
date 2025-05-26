package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f32673p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f32674q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f32675r;

    /* renamed from: s, reason: collision with root package name */
    public int f32676s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f32677t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f32678u;

    public ForegroundLinearLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f32673p;
        if (drawable != null) {
            if (this.f32678u) {
                this.f32678u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z13 = this.f32677t;
                Rect rect = this.f32674q;
                if (z13) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i13 = this.f32676s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f32675r;
                Gravity.apply(i13, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        Drawable drawable = this.f32673p;
        if (drawable != null) {
            drawable.setHotspot(f13, f14);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f32673p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f32673p.setState(getDrawableState());
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.f32673p;
    }

    @Override // android.view.View
    public final int getForegroundGravity() {
        return this.f32676s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f32673p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        this.f32678u = z13 | this.f32678u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f32678u = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f32673p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f32673p);
            }
            this.f32673p = drawable;
            this.f32678u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f32676s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setForegroundGravity(int i13) {
        if (this.f32676s != i13) {
            if ((8388615 & i13) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
                i13 |= 48;
            }
            this.f32676s = i13;
            if (i13 == 119 && this.f32673p != null) {
                this.f32673p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32673p;
    }

    public ForegroundLinearLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32674q = new Rect();
        this.f32675r = new Rect();
        this.f32676s = RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;
        this.f32677t = true;
        this.f32678u = false;
        TypedArray f13 = d0.f(context, attributeSet, fj.m.ForegroundLinearLayout, i13, 0, new int[0]);
        this.f32676s = f13.getInt(fj.m.ForegroundLinearLayout_android_foregroundGravity, this.f32676s);
        Drawable drawable = f13.getDrawable(fj.m.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f32677t = f13.getBoolean(fj.m.ForegroundLinearLayout_foregroundInsidePadding, true);
        f13.recycle();
    }
}
