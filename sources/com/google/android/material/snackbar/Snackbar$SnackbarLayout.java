package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b7.c;
import bk.i;
import bk.o;
import com.bumptech.glide.d;
import dk.b;
import fj.e;
import fj.m;
import fk.a;
import java.util.WeakHashMap;
import lb.l0;
import q5.k0;
import q5.m0;
import q5.v0;
import x4.a0;

/* loaded from: classes3.dex */
public final class Snackbar$SnackbarLayout extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f33112e = new a0(1);

    /* renamed from: a, reason: collision with root package name */
    public final o f33113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33114b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f33115c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f33116d;

    /* JADX WARN: Multi-variable type inference failed */
    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, m.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(m.SnackbarLayout_elevation)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(m.SnackbarLayout_elevation, 0);
            WeakHashMap weakHashMap = v0.f102521a;
            m0.l(this, dimensionPixelSize);
        }
        obtainStyledAttributes.getInt(m.SnackbarLayout_animationMode, 0);
        if (obtainStyledAttributes.hasValue(m.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(m.SnackbarLayout_shapeAppearanceOverlay)) {
            this.f33113a = o.b(0, 0, context2, attributeSet).a();
        }
        float f13 = obtainStyledAttributes.getFloat(m.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(d.H(context2, obtainStyledAttributes, m.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(l0.T0(obtainStyledAttributes.getInt(m.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        obtainStyledAttributes.getFloat(m.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.f33114b = obtainStyledAttributes.getDimensionPixelSize(m.SnackbarLayout_android_maxWidth, -1);
        obtainStyledAttributes.getDimensionPixelSize(m.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f33112e);
        setFocusable(true);
        if (getBackground() == null) {
            int F = c.F(c.u(this, fj.c.colorSurface), f13, c.u(this, fj.c.colorOnSurface));
            o oVar = this.f33113a;
            if (oVar != null) {
                int i13 = b.f55156a;
                i iVar = new i(oVar);
                iVar.t(ColorStateList.valueOf(F));
                gradientDrawable = iVar;
            } else {
                Resources resources = getResources();
                int i14 = b.f55156a;
                float dimension = resources.getDimension(e.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(F);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f33115c;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = v0.f102521a;
            setBackgroundDrawable(gradientDrawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = v0.f102521a;
        k0.c(this);
    }

    public final void b(int i13, int i14) {
        super.onMeasure(i13, i14);
        int i15 = this.f33114b;
        if (i15 <= 0 || getMeasuredWidth() <= i15) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), i14);
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f33115c != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f33115c);
            drawable.setTintMode(this.f33116d);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.f33115c = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f33116d);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f33116d = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f33112e);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        b(i13, i14);
        int childCount = getChildCount();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }
}
