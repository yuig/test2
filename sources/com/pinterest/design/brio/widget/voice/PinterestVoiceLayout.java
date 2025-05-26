package com.pinterest.design.brio.widget.voice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import le0.i;
import ve0.b;
import ve0.f;

@SuppressLint({"SetPaddingUsageIssue"})
/* loaded from: classes.dex */
public abstract class PinterestVoiceLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Rect f44909a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f44910b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f44911c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44912d;

    /* renamed from: e, reason: collision with root package name */
    public b f44913e;

    public PinterestVoiceLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abstract f d();

    public void e(Context context, b bVar) {
        this.f44909a = new Rect();
        this.f44910b = new Rect();
        this.f44911c = new Rect(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        setWillNotDraw(false);
        this.f44912d = true;
    }

    public void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.PinterestVoiceLayout);
        int i13 = i.PinterestVoiceLayout_anchorPosition;
        b bVar = b.TOP_LEFT;
        int integer = obtainStyledAttributes.getInteger(i13, bVar.getValue());
        if (integer != 1) {
            bVar = integer != 2 ? integer != 3 ? integer != 4 ? b.NONE : b.BOTTOM_RIGHT : b.BOTTOM_LEFT : b.TOP_RIGHT;
        }
        this.f44913e = bVar;
        obtainStyledAttributes.recycle();
    }

    public final void g(b bVar) {
        f d2 = d();
        if (d2.f125690d != bVar) {
            d2.c(bVar);
            Rect rect = this.f44909a;
            if (rect.right > 0 && rect.bottom > 0) {
                d2.setBounds(rect);
                d2.getPadding(this.f44910b);
                Rect rect2 = this.f44911c;
                setPaddingRelative(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
            d2.invalidateSelf();
            invalidate();
        }
    }

    public void h(Context context) {
        this.f44913e = b.TOP_LEFT;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        d().draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i14);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            d().getPadding(this.f44910b);
            Rect rect = this.f44911c;
            setPaddingRelative(rect.left, rect.top, rect.right, rect.bottom);
        }
        super.onMeasure(i13, i14);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        f d2 = d();
        this.f44909a.set(0, 0, i13, i14);
        d2.setBounds(this.f44909a);
        d2.getPadding(this.f44910b);
        Rect rect = this.f44911c;
        setPaddingRelative(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        setPaddingRelative(i13, i14, i15, i16);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
        if (!this.f44912d) {
            super.setPaddingRelative(i13, i14, i15, i16);
            return;
        }
        this.f44911c.set(i13, i14, i15, i16);
        Rect rect = this.f44910b;
        super.setPaddingRelative(i13 + rect.left, i14 + rect.top, i15 + rect.right, i16 + rect.bottom);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        f d2 = d();
        return d2 == drawable || d2.a(drawable) || super.verifyDrawable(drawable);
    }

    public PinterestVoiceLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f44912d = false;
        h(context);
        if (attributeSet != null) {
            f(context, attributeSet);
        }
        e(context, this.f44913e);
    }
}
