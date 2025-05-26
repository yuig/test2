package com.pinterest.ui.components.placeholder;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.e0;
import bs1.c;
import com.google.android.material.navigation.b;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import df.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import tu1.u;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ui/components/placeholder/BasePlaceholderLoadingLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BasePlaceholderLoadingLayout extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f52288h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Path f52289a;

    /* renamed from: b, reason: collision with root package name */
    public final float f52290b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f52291c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f52292d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f52293e;

    /* renamed from: f, reason: collision with root package name */
    public Animator f52294f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlaceholderLoadingLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52289a = new Path();
        this.f52290b = c.W(this, r0.grid_placeholder_loading_shimmer_width);
        v b13 = m.b(new u(this, 7));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader((LinearGradient) b13.getValue());
        this.f52291c = paint;
        this.f52292d = new Rect();
        this.f52293e = new Matrix();
    }

    public final void a(int i13, int i14, int i15, int i16, int i17) {
        Path path = new Path();
        float f52379k = f() ? i13 - getF52379k() : i13 + getF52379k();
        float f13 = i17;
        path.addRoundRect(f52379k, i14, f() ? f52379k - i16 : i16 + f52379k, i14 + i15, f13, f13, Path.Direction.CCW);
        this.f52289a.addPath(path);
    }

    /* renamed from: b */
    public abstract int getF52379k();

    /* renamed from: c */
    public abstract int getF52380l();

    public final float d() {
        boolean f13 = f();
        float f14 = this.f52290b;
        return f13 ? getWidth() + f14 : -f14;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f52295g) {
            canvas.save();
            canvas.clipPath(this.f52289a);
            canvas.drawRect(this.f52292d, this.f52291c);
            canvas.restore();
        }
    }

    public abstract View e();

    public final boolean f() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return j1.Y0(context);
    }

    public final void g() {
        Animator animator;
        Animator animator2 = this.f52294f;
        if (animator2 != null && animator2.isRunning() && (animator = this.f52294f) != null) {
            animator.cancel();
        }
        this.f52295g = false;
    }

    public abstract void h();

    public final void i() {
        View e13 = e();
        if (e13 != null) {
            c.U1(e13);
        }
        View e14 = e();
        if (e14 != null) {
            e14.setAlpha(1.0f);
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new b(this, 29));
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(d(), f() ? -this.f52290b : getWidth());
        ofFloat.setStartDelay(300L);
        ofFloat.setDuration(BaseRecyclerCellView.AUTOSCROLL_DELAY);
        ofFloat.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 0.1f));
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new ir.b(this, 10));
        ofFloat.addUpdateListener(new e0(this, 8));
        ofFloat.start();
        this.f52294f = ofFloat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        h();
        this.f52292d.set((int) d(), 0, (int) this.f52290b, getHeight());
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        if (i13 != 0) {
            g();
        }
    }
}
