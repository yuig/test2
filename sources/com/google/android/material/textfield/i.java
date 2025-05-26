package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public abstract class i extends bk.i {

    /* renamed from: y, reason: collision with root package name */
    public g f33232y;

    public i(g gVar) {
        super(gVar);
        this.f33232y = gVar;
    }

    public static h C(bk.o oVar) {
        if (oVar == null) {
            oVar = new bk.o();
        }
        return new h(new g(oVar, new RectF()));
    }

    public final boolean D() {
        return !this.f33232y.f33231v.isEmpty();
    }

    public final void E() {
        F(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void F(float f13, float f14, float f15, float f16) {
        RectF rectF = this.f33232y.f33231v;
        if (f13 == rectF.left && f14 == rectF.top && f15 == rectF.right && f16 == rectF.bottom) {
            return;
        }
        rectF.set(f13, f14, f15, f16);
        invalidateSelf();
    }

    public final void G(RectF rectF) {
        F(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f33232y = new g(this.f33232y);
        return this;
    }
}
