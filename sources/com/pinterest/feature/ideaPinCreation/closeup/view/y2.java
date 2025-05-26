package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y2 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46381a;

    /* renamed from: b, reason: collision with root package name */
    public float f46382b;

    /* renamed from: c, reason: collision with root package name */
    public float f46383c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.k f46384d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.k f46385e;

    public y2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46381a = context;
        xk2.n nVar = xk2.n.NONE;
        this.f46384d = xk2.m.a(nVar, new x2(this, 1));
        this.f46385e = xk2.m.a(nVar, new x2(this, 0));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f13 = this.f46383c;
        float f14 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
        float f15 = IdeaPinCreationCameraVideoSegmentsView.f45929k;
        float f16 = f13 + f15;
        float f17 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
        canvas.drawRoundRect(getBounds().left, this.f46383c, getBounds().left + getBounds().width(), f16, f17, f17, (Paint) this.f46385e.getValue());
        canvas.drawRoundRect(getBounds().left, this.f46383c, (getBounds().width() * this.f46382b) + getBounds().left, this.f46383c + f15, f17, f17, (Paint) this.f46384d.getValue());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        super.setBounds(i13, i14, i15, i16);
        float f13 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
        this.f46383c = ((getBounds().height() / 2.0f) - (IdeaPinCreationCameraVideoSegmentsView.f45929k / 2.0f)) + getBounds().top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
