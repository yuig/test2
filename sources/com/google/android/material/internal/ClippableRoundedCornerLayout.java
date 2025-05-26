package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Path f32667a;

    /* renamed from: b, reason: collision with root package name */
    public float f32668b;

    public ClippableRoundedCornerLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(float f13, float f14, float f15, float f16, float f17) {
        RectF rectF = new RectF(f13, f14, f15, f16);
        if (this.f32667a == null) {
            this.f32667a = new Path();
        }
        this.f32668b = f17;
        this.f32667a.reset();
        this.f32667a.addRoundRect(rectF, f17, f17, Path.Direction.CW);
        this.f32667a.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f32667a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f32667a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
