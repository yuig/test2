package com.pinterest.ads.feature.owc.view.leadgen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kh2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/leadgen/GradientAlphaLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GradientAlphaLinearLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f35369f = {-16777216, 0};

    /* renamed from: a, reason: collision with root package name */
    public boolean f35370a;

    /* renamed from: b, reason: collision with root package name */
    public int f35371b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f35372c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f35373d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35374e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientAlphaLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35370a = true;
        a();
    }

    public final void a() {
        this.f35370a = true;
        this.f35371b = d.p(60);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Paint paint = new Paint(1);
        this.f35372c = paint;
        paint.setXfermode(porterDuffXfermode);
        this.f35373d = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int width = getWidth();
        int height = getHeight();
        if (getVisibility() == 8 || width == 0 || height == 0 || !this.f35370a) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f35374e) {
            this.f35374e = false;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int i13 = this.f35371b;
            if (i13 > height2) {
                i13 = height2;
            }
            int paddingStart = getPaddingStart();
            int paddingTop = (getPaddingTop() + height2) - i13;
            int width2 = getWidth() - getPaddingEnd();
            int i14 = i13 + paddingTop;
            Rect rect = this.f35373d;
            if (rect == null) {
                Intrinsics.r("gradientRectBottom");
                throw null;
            }
            rect.set(paddingStart, paddingTop, width2, i14);
            float f13 = paddingStart;
            LinearGradient linearGradient = new LinearGradient(f13, paddingTop, f13, i14, f35369f, (float[]) null, Shader.TileMode.CLAMP);
            Paint paint = this.f35372c;
            if (paint == null) {
                Intrinsics.r("gradientPaintBottom");
                throw null;
            }
            paint.setShader(linearGradient);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        if (this.f35370a && this.f35371b > 0) {
            Rect rect2 = this.f35373d;
            if (rect2 == null) {
                Intrinsics.r("gradientRectBottom");
                throw null;
            }
            Paint paint2 = this.f35372c;
            if (paint2 == null) {
                Intrinsics.r("gradientPaintBottom");
                throw null;
            }
            canvas.drawRect(rect2, paint2);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i14 != i16) {
            this.f35374e = true;
        }
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
        if (getPaddingBottom() != i16 || getPaddingTop() != i14) {
            this.f35374e = true;
        }
        super.setPaddingRelative(i13, i14, i15, i16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientAlphaLinearLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35370a = true;
        a();
    }
}
