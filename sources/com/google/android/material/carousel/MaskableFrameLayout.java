package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import bk.a0;
import bk.b0;
import bk.c0;
import bk.d0;
import bk.o;
import gj.a;
import mj.l;
import mj.m;

/* loaded from: classes3.dex */
public class MaskableFrameLayout extends FrameLayout implements l, a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32411e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f32412a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f32413b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f32414c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f32415d;

    public MaskableFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // bk.a0
    public final void Y0(o oVar) {
        o i13 = oVar.i(new m(0));
        b0 b0Var = this.f32414c;
        b0Var.f23023c = i13;
        b0Var.c();
        b0Var.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b0 b0Var = this.f32414c;
        if (b0Var.b()) {
            Path path = (Path) b0Var.f23025e;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.f32413b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f32415d;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            b0 b0Var = this.f32414c;
            if (booleanValue != b0Var.f23021a) {
                b0Var.f23021a = booleanValue;
                b0Var.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b0 b0Var = this.f32414c;
        this.f32415d = Boolean.valueOf(b0Var.f23021a);
        if (true != b0Var.f23021a) {
            b0Var.f23021a = true;
            b0Var.a(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        float f13 = this.f32412a;
        if (f13 == -1.0f || f13 == -1.0f) {
            return;
        }
        float b13 = a.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, f13);
        RectF rectF = new RectF(b13, 0.0f, getWidth() - b13, getHeight());
        RectF rectF2 = this.f32413b;
        rectF2.set(rectF);
        b0 b0Var = this.f32414c;
        b0Var.f23024d = rectF2;
        b0Var.c();
        b0Var.a(this);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f32413b;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public MaskableFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32412a = -1.0f;
        this.f32413b = new RectF();
        this.f32414c = Build.VERSION.SDK_INT >= 33 ? new d0(this) : new c0(this);
        this.f32415d = null;
        Y0(o.b(i13, 0, context, attributeSet).a());
    }
}
