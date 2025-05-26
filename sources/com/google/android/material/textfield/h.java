package com.google.android.material.textfield;

import android.graphics.Canvas;

/* loaded from: classes3.dex */
public final class h extends i {
    @Override // bk.i
    public final void g(Canvas canvas) {
        if (this.f33232y.f33231v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f33232y.f33231v);
        super.g(canvas);
        canvas.restore();
    }
}
