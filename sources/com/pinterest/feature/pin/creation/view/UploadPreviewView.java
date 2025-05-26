package com.pinterest.feature.pin.creation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.ui.imageview.WebImageView;
import d5.a;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import sm1.b;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/pin/creation/view/UploadPreviewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UploadPreviewView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public String f47116a;

    /* renamed from: b, reason: collision with root package name */
    public final float f47117b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47118c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f47119d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47120e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f47121f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f47122g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f47123h;

    /* renamed from: i, reason: collision with root package name */
    public final v f47124i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadPreviewView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.f47121f;
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.drawPath(path, this.f47123h);
        if (!this.f47120e || (drawable = this.f47119d) == null) {
            return;
        }
        drawable.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i14, i14);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        int i17 = i13 / 2;
        int i18 = i14 / 2;
        Drawable drawable = this.f47119d;
        if (drawable != null) {
            int i19 = this.f47118c;
            drawable.setBounds(i17 - i19, i18 - i19, i17 + i19, i18 + i19);
        }
        Path path = this.f47121f;
        path.reset();
        RectF rectF = this.f47122g;
        rectF.set(0.0f, 0.0f, i13, i14);
        float f13 = this.f47117b;
        path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        path.close();
    }

    public /* synthetic */ UploadPreviewView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadPreviewView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47117b = getResources().getDimensionPixelSize(c.corner_radius);
        this.f47118c = getResources().getDimensionPixelSize(r0.margin_quarter);
        this.f47119d = bs1.c.k2(context, b.ic_play_gestalt, eo1.b.color_white_0);
        this.f47121f = new Path();
        this.f47122g = new RectF();
        Paint paint = new Paint();
        int i14 = eo1.b.color_themed_background_dark_opacity_200;
        Object obj = a.f53679a;
        paint.setColor(context.getColor(i14));
        this.f47123h = paint;
        v b13 = m.b(new l5.a(context, 3));
        this.f47124i = b13;
        WebImageView webImageView = (WebImageView) b13.getValue();
        Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
        addView(webImageView);
    }
}
