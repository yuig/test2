package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import oj.b;
import oj.f;
import oj.g;

/* loaded from: classes3.dex */
public class CircularRevealCardView extends MaterialCardView implements g {

    /* renamed from: p, reason: collision with root package name */
    public final b f32469p;

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32469p = new b(this);
    }

    @Override // oj.a
    public final boolean C() {
        return super.isOpaque();
    }

    @Override // oj.g
    public final f a() {
        return this.f32469p.b();
    }

    @Override // oj.g
    public final void b() {
        this.f32469p.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        b bVar = this.f32469p;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // oj.g
    public final void e(Drawable drawable) {
        this.f32469p.d(drawable);
    }

    @Override // oj.g
    public final int g() {
        return this.f32469p.f95347c.getColor();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        b bVar = this.f32469p;
        return bVar != null ? bVar.c() : super.isOpaque();
    }

    @Override // oj.g
    public final void j() {
        this.f32469p.getClass();
    }

    @Override // oj.a
    public final void m(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // oj.g
    public final void n(int i13) {
        this.f32469p.e(i13);
    }

    @Override // oj.g
    public final void q(f fVar) {
        this.f32469p.f(fVar);
    }
}
