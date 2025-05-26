package com.pinterest.design.brio.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import le0.i;
import ne0.c;
import pe0.a;

@Deprecated
/* loaded from: classes5.dex */
public class LegacyLinearLayout extends LinearLayout implements a {

    /* renamed from: a */
    public c f44832a;

    /* renamed from: b */
    public boolean f44833b;

    public LegacyLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z13 = false;
        this.f44833b = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.PinterestAnimationLayout, 0, 0);
            z13 = obtainStyledAttributes.getBoolean(i.PinterestAnimationLayout_disableParentScaling, false);
            obtainStyledAttributes.recycle();
        }
        a(z13);
    }

    public final void a(boolean z13) {
        setWillNotDraw(false);
        Resources resources = getResources();
        ne0.a shapeType = ne0.a.DEFAULT;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(shapeType, "shapeType");
        this.f44832a = new c(resources, z13, shapeType);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c cVar = this.f44832a;
        if (cVar.f90455i) {
            return;
        }
        cVar.f90456j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.f44833b) {
            this.f44832a.onTouch(this, motionEvent);
        }
        this.f44833b = false;
        return dispatchTouchEvent;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        c cVar = this.f44832a;
        if (cVar.f90447a != null && cVar.f90456j) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            ne0.a aVar = ne0.a.ROUND;
            Paint paint = cVar.f90448b;
            ne0.a aVar2 = cVar.f90457k;
            int i13 = cVar.f90454h;
            if (aVar2 == aVar) {
                float f13 = width / 2;
                canvas.drawCircle(f13, height / 2, i13 + f13, paint);
            } else {
                RectF rectF = cVar.f90452f;
                float f14 = -i13;
                rectF.set(f14, f14, width + i13, height + i13);
                rectF.set(rectF);
                float f15 = cVar.f90451e;
                canvas.drawRoundRect(rectF, f15, f15, paint);
            }
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f44832a;
        cVar.f90447a = this;
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) cVar.f90447a.getParent()).setClipChildren(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c cVar = this.f44832a;
        cVar.f90448b.setColor(cVar.f90449c);
        cVar.f90447a = null;
        super.onDetachedFromWindow();
    }

    public LegacyLinearLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        boolean z13 = false;
        this.f44833b = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.PinterestAnimationLayout, 0, 0);
            z13 = obtainStyledAttributes.getBoolean(i.PinterestAnimationLayout_disableParentScaling, false);
            obtainStyledAttributes.recycle();
        }
        a(z13);
    }
}
