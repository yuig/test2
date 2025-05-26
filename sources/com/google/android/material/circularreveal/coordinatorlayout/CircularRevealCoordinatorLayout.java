package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import oj.b;
import oj.f;
import oj.g;

/* loaded from: classes3.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements g {

    /* renamed from: x, reason: collision with root package name */
    public final b f32470x;

    public CircularRevealCoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32470x = new b(this);
    }

    @Override // oj.a
    public final boolean C() {
        return super.isOpaque();
    }

    @Override // oj.g
    public final f a() {
        return this.f32470x.b();
    }

    @Override // oj.g
    public final void b() {
        this.f32470x.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        b bVar = this.f32470x;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // oj.g
    public final void e(Drawable drawable) {
        this.f32470x.d(drawable);
    }

    @Override // oj.g
    public final int g() {
        return this.f32470x.f95347c.getColor();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        b bVar = this.f32470x;
        return bVar != null ? bVar.c() : super.isOpaque();
    }

    @Override // oj.g
    public final void j() {
        this.f32470x.getClass();
    }

    @Override // oj.a
    public final void m(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // oj.g
    public final void n(int i13) {
        this.f32470x.e(i13);
    }

    @Override // oj.g
    public final void q(f fVar) {
        this.f32470x.f(fVar);
    }
}
