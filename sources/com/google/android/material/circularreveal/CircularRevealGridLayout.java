package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import oj.b;
import oj.f;
import oj.g;

/* loaded from: classes3.dex */
public class CircularRevealGridLayout extends GridLayout implements g {

    /* renamed from: a, reason: collision with root package name */
    public final b f32466a;

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32466a = new b(this);
    }

    @Override // oj.a
    public final boolean C() {
        return super.isOpaque();
    }

    @Override // oj.g
    public final f a() {
        return this.f32466a.b();
    }

    @Override // oj.g
    public final void b() {
        this.f32466a.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        b bVar = this.f32466a;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // oj.g
    public final void e(Drawable drawable) {
        this.f32466a.d(drawable);
    }

    @Override // oj.g
    public final int g() {
        return this.f32466a.f95347c.getColor();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        b bVar = this.f32466a;
        return bVar != null ? bVar.c() : super.isOpaque();
    }

    @Override // oj.g
    public final void j() {
        this.f32466a.getClass();
    }

    @Override // oj.a
    public final void m(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // oj.g
    public final void n(int i13) {
        this.f32466a.e(i13);
    }

    @Override // oj.g
    public final void q(f fVar) {
        this.f32466a.f(fVar);
    }
}
