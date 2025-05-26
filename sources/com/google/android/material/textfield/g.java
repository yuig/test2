package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class g extends bk.h {

    /* renamed from: v, reason: collision with root package name */
    public final RectF f33231v;

    public g(bk.o oVar, RectF rectF) {
        super(oVar);
        this.f33231v = rectF;
    }

    @Override // bk.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f33231v = gVar.f33231v;
    }
}
