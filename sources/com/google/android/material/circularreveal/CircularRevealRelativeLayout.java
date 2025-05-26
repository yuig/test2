package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import oj.b;
import oj.f;
import oj.g;

/* loaded from: classes3.dex */
public class CircularRevealRelativeLayout extends RelativeLayout implements g {

    /* renamed from: a, reason: collision with root package name */
    public final b f32468a;

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32468a = new b(this);
    }

    @Override // oj.a
    public final boolean C() {
        return super.isOpaque();
    }

    @Override // oj.g
    public final f a() {
        return this.f32468a.b();
    }

    @Override // oj.g
    public final void b() {
        this.f32468a.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        b bVar = this.f32468a;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // oj.g
    public final void e(Drawable drawable) {
        this.f32468a.d(drawable);
    }

    @Override // oj.g
    public final int g() {
        return this.f32468a.f95347c.getColor();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        b bVar = this.f32468a;
        return bVar != null ? bVar.c() : super.isOpaque();
    }

    @Override // oj.g
    public final void j() {
        this.f32468a.getClass();
    }

    @Override // oj.a
    public final void m(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // oj.g
    public final void n(int i13) {
        this.f32468a.e(i13);
    }

    @Override // oj.g
    public final void q(f fVar) {
        this.f32468a.f(fVar);
    }
}
