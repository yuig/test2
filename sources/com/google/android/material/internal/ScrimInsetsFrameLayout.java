package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;
import oi.u6;
import q5.a2;
import q5.m0;
import q5.v0;

/* loaded from: classes3.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f32684a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f32685b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f32686c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32687d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32688e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32689f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32690g;

    public ScrimInsetsFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(a2 a2Var) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f32685b == null || (drawable = this.f32684a) == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z13 = this.f32687d;
        Rect rect = this.f32686c;
        if (z13) {
            rect.set(0, 0, width, this.f32685b.top);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
        if (this.f32688e) {
            rect.set(0, height - this.f32685b.bottom, width, height);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
        if (this.f32689f) {
            Rect rect2 = this.f32685b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
        if (this.f32690g) {
            Rect rect3 = this.f32685b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f32684a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f32684a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32686c = new Rect();
        this.f32687d = true;
        this.f32688e = true;
        this.f32689f = true;
        this.f32690g = true;
        TypedArray f13 = d0.f(context, attributeSet, fj.m.ScrimInsetsFrameLayout, i13, fj.l.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f32684a = f13.getDrawable(fj.m.ScrimInsetsFrameLayout_insetForeground);
        f13.recycle();
        setWillNotDraw(true);
        u6 u6Var = new u6(this, 13);
        WeakHashMap weakHashMap = v0.f102521a;
        m0.n(this, u6Var);
    }
}
